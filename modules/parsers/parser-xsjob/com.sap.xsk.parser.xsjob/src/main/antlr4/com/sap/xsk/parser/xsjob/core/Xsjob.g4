grammar Xsjob;

xsjobsequence: LCB property+ RCB ;
property: description
        | action
        | schedules ;

description: '"description"' COL STRING CM;
action: '"action"' COL STRING CM;
schedules: '"schedules"' COL LB schedule+ RB;

schedule: LCB items+ RCB CM?;
items: item_description
     | xscron
     | parameter ;

item_description: '"description"' COL STRING CM;
xscron: '"xscron"' COL STRING CM;
parameter: '"parameter"' COL LCB param+ RCB;
param: STRING COL STRING CM?;

STRING: '"' (~["\\\r\n] | EscapeSequence)* '"';

WS  :   [ \t\\\r\n]+ -> skip ; // toss out whitespace
LCB: '{';
RCB: '}';
LB: '[';
RB: ']';
COL: ':';
CM: ',';

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;
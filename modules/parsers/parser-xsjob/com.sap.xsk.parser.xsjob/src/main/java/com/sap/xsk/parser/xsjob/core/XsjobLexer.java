// Generated from Xsjob.g4 by ANTLR 4.3
package com.sap.xsk.parser.xsjob.core;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XsjobLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, STRING=6, WS=7, LCB=8, RCB=9, 
		LB=10, RB=11, COL=12, CM=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "STRING", "WS", "LCB", "RCB", 
		"LB", "RB", "COL", "CM", "EscapeSequence", "HexDigits", "HexDigit"
	};


	public XsjobLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xsjob.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7\3\7\3\b\6\bg\n\b\r\b"+
		"\16\bh\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\5\17}\n\17\3\17\5\17\u0080\n\17\3\17\3\17\3\17\6\17\u0085"+
		"\n\17\r\17\16\17\u0086\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n\17\3\20\3"+
		"\20\3\20\7\20\u0093\n\20\f\20\16\20\u0096\13\20\3\20\5\20\u0099\n\20\3"+
		"\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\2\37\2!\2\3\2\b\6\2\f\f\17\17$$^^\6\2\13\f\17\17\"\"^^\n"+
		"\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62;CHch\u00a3\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\3#\3\2\2\2\5/\3\2\2\2\7;\3\2\2\2\tD\3\2\2\2\13M\3\2\2\2\r[\3"+
		"\2\2\2\17f\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31"+
		"t\3\2\2\2\33v\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u009a\3\2\2\2"+
		"#$\7$\2\2$%\7r\2\2%&\7c\2\2&\'\7t\2\2\'(\7c\2\2()\7o\2\2)*\7g\2\2*+\7"+
		"v\2\2+,\7g\2\2,-\7t\2\2-.\7$\2\2.\4\3\2\2\2/\60\7$\2\2\60\61\7u\2\2\61"+
		"\62\7e\2\2\62\63\7j\2\2\63\64\7g\2\2\64\65\7f\2\2\65\66\7w\2\2\66\67\7"+
		"n\2\2\678\7g\2\289\7u\2\29:\7$\2\2:\6\3\2\2\2;<\7$\2\2<=\7c\2\2=>\7e\2"+
		"\2>?\7v\2\2?@\7k\2\2@A\7q\2\2AB\7p\2\2BC\7$\2\2C\b\3\2\2\2DE\7$\2\2EF"+
		"\7z\2\2FG\7u\2\2GH\7e\2\2HI\7t\2\2IJ\7q\2\2JK\7p\2\2KL\7$\2\2L\n\3\2\2"+
		"\2MN\7$\2\2NO\7f\2\2OP\7g\2\2PQ\7u\2\2QR\7e\2\2RS\7t\2\2ST\7k\2\2TU\7"+
		"r\2\2UV\7v\2\2VW\7k\2\2WX\7q\2\2XY\7p\2\2YZ\7$\2\2Z\f\3\2\2\2[`\7$\2\2"+
		"\\_\n\2\2\2]_\5\35\17\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2ac\3\2\2\2b`\3\2\2\2cd\7$\2\2d\16\3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\b\2\2k\20\3\2\2\2lm\7}\2\2m\22"+
		"\3\2\2\2no\7\177\2\2o\24\3\2\2\2pq\7]\2\2q\26\3\2\2\2rs\7_\2\2s\30\3\2"+
		"\2\2tu\7<\2\2u\32\3\2\2\2vw\7.\2\2w\34\3\2\2\2xy\7^\2\2y\u008e\t\4\2\2"+
		"z\177\7^\2\2{}\t\5\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\t\6\2\2\177"+
		"|\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008e\t\6\2\2\u0082"+
		"\u0084\7^\2\2\u0083\u0085\7w\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\5!\21\2\u0089\u008a\5!\21\2\u008a\u008b\5!\21\2\u008b\u008c\5!\21\2\u008c"+
		"\u008e\3\2\2\2\u008dx\3\2\2\2\u008dz\3\2\2\2\u008d\u0082\3\2\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0098\5!\21\2\u0090\u0093\5!\21\2\u0091\u0093\7a\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0099\5!\21\2\u0098\u0094\3\2\2\2\u0098\u0099\3\2\2\2\u0099 \3\2\2\2"+
		"\u009a\u009b\t\7\2\2\u009b\"\3\2\2\2\r\2^`h|\177\u0086\u008d\u0092\u0094"+
		"\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
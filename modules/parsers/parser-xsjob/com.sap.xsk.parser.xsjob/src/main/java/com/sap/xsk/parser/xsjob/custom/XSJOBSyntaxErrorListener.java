package com.sap.xsk.parser.xsjob.custom;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class XSJOBSyntaxErrorListener extends BaseErrorListener {

    private String errorMessage;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg,
                            RecognitionException e) {
        this.errorMessage = "line " + line + ":" + charPositionInLine + " at " +
                offendingSymbol + ": " + msg;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

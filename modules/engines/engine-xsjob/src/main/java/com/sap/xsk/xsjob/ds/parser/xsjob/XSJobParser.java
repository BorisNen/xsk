package  com.sap.xsk.xsjob.ds.parser.xsjob;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.sap.xsk.parser.xsjob.core.XsjobBaseVisitor;
import com.sap.xsk.parser.xsjob.core.XsjobLexer;
import com.sap.xsk.parser.xsjob.core.XsjobParser;
import com.sap.xsk.parser.xsjob.custom.XSJOBSyntaxErrorListener;
import com.sap.xsk.parser.xsjob.custom.XsjobVisitor;
import com.sap.xsk.parser.xsjob.models.XSJOBModel;
import com.sap.xsk.xsjob.ds.api.XSJobDataStructuresException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class XSJobParser {

    public static void parseContent(String content) throws IOException, XSJobDataStructuresException {
        ByteArrayInputStream is = new ByteArrayInputStream(content.getBytes());
        ANTLRInputStream inputStream = new ANTLRInputStream(is);
        XsjobLexer lexer = new XsjobLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        XsjobParser parser = new XsjobParser(tokenStream);
        parser.setBuildParseTree(true);
        parser.removeErrorListeners();
        XSJOBSyntaxErrorListener errorListener = new XSJOBSyntaxErrorListener();
        parser.addErrorListener(errorListener);

        ParseTree parseTree = parser.xsjobsequence();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            throw new XSJobDataStructuresException(errorListener.getErrorMessage());
        }

        XsjobBaseVisitor<JsonElement> visitor = new XsjobVisitor();
        JsonElement parsedResult = visitor.visit(parseTree);
        Gson gson = new Gson();
        XSJOBModel antlr4Model = gson.fromJson(parsedResult, XSJOBModel.class);
    }
}

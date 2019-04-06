import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {

    public static void main(String[] args)
    {
        try{
            /*
            Scanner sc = new Scanner(new File("main.pas"));
            String code = "";
            while(sc.hasNextLine()) {
                code += sc.nextLine();
            }
            */

            CharStream cs = fromFileName("D:\\DLSU\\TERM 2 2018-2019\\CMPILER\\PascalMP\\src\\main.pas");
            PascalGrammarLexer lexer = new PascalGrammarLexer(cs);

            lexer.removeErrorListeners();
            lexer.addErrorListener(AntlrErrorListener.INSTANCE);

            CommonTokenStream token = new CommonTokenStream(lexer);

            PascalGrammarParser parser = new PascalGrammarParser(token);

            parser.removeErrorListeners();
            parser.addErrorListener(AntlrErrorListener.INSTANCE);

            ParseTree tree = parser.program();

            PascalGrammarBaseVisitor visitor = new PascalGrammarBaseVisitor();
            visitor.visit(tree);

            List ruleNames = new ArrayList();
            Collections.addAll(ruleNames, parser.getRuleNames());
            String sParseTree = ((PascalGrammarParser.ProgramContext) tree).toStringTree(ruleNames);
            System.out.println(sParseTree);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

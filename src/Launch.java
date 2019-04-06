import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {

    public static void main(String[] args)
    {
        try{
            File source = new File("input.txt");
            Scanner sc = new Scanner(source);
            Scanner enter = new Scanner(System.in);
            while(sc.hasNextLine()) {
                String input = sc.nextLine();
                BufferedWriter writer = new BufferedWriter(new FileWriter("line.txt"));
                writer.write(input);
                writer.close();

                System.out.print(">>Please press enter to continue");
                enter.nextLine();

                CharStream cs = fromFileName("line.txt");
                PascalGrammarLexer lexer = new PascalGrammarLexer(cs);

                lexer.removeErrorListeners();
                lexer.addErrorListener(AntlrErrorListener.INSTANCE);

                CommonTokenStream token = new CommonTokenStream(lexer);

                PascalGrammarParser parser = new PascalGrammarParser(token);

                parser.removeErrorListeners();
                parser.addErrorListener(AntlrErrorListener.INSTANCE);

                //ParseTree tree = parser.prule();

                MyVisitor visitor = new MyVisitor();
                //visitor.visit(tree);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


import java.io.FileOutputStream;
import java.io.IOException;


public class main {

    public static void main(String[] args) throws IOException {
        String srcFile = "src/bad.cl";
        if (args.length >= 1) srcFile = args[0];

        Lexer lexer = new Lexer(srcFile);
        lexer.writeTokens(srcFile + "-lex");
    }
}

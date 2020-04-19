
import org.antlr.v4.runtime.tree.ParseTree;

        import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;

@SuppressWarnings("ALL")


public class PARSERR {

    private COOLParser coolParser;
    private ParseTree cachedParseTree;

    /**
     * The purpose of this constructor is to intialize an object <b>coolParser</b> of the
     * class <b> PARSER </b> , with a stream of tokens get from the lexer.
     *
     * @param lexer
     * The lexer is an input parameter to the constructor,
     * and when a token trigger an error , it will be tracked.
     */
    public PARSERR(Lexer lexer) {
        coolParser = new COOLParser(lexer.getTokensStream());
        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.INSTANCE);
    }

    /**
     * This function named <b>getCST</b> is used to convert a pre-defined stream of tokens
     * into a context syntax tree and output it in string format.
     *
     * @param
     * no input parameters.
     *
     * @return
     * a string , representing a syntax tree.
     */
    public String getCST() {
        COOLParser.ProgramContext program = coolParser.program();
        String tree = program.toStringTree(coolParser);
        return tree;
    }

    /**
     *
     * This is a function named <b>writeCST</b> that prints out the context syntax tree to an output file
     * and throws a RuntimeException if an error occurs.
     *
     * @param fileName
     * is the input file in which the context syntax tree is printed.
     *
     * @return
     * {@link void} , no return type for this function.
     */

    public void writeCST(String fileName){
        String tree = getCST();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(tree);
            bw.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * It is an interface to access the tree ,
     * that has no input parameters.
     *
     * @return
     * This returns the tree created during the parse.
     */
    public ParseTree parse() {
        // coolParser.addParseListener(new CoolBaseListener());
        if (cachedParseTree == null) cachedParseTree = coolParser.globals();
        return cachedParseTree;
    }

}

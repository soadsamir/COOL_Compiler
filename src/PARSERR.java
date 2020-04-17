import org.antlr.v4.runtime.tree.ParseTree;

        import java.io.BufferedWriter;
        import java.io.FileWriter;
        import java.io.IOException;

@SuppressWarnings("ALL")
public class PARSERR {

    private COOLParser coolParser;
    private ParseTree cachedParseTree;

    public PARSERR(Lexer lexer) {
        coolParser = new COOLParser(lexer.getTokensStream());

        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.INSTANCE);
    }

    public String getCST() {
        COOLParser.ProgramContext program = coolParser.program();
        String tree = program.toStringTree(coolParser);
        return tree;
    }

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

    public ParseTree parse() {
        // coolParser.addParseListener(new CoolBaseListener());
        if (cachedParseTree == null) cachedParseTree = coolParser.globals();
        return cachedParseTree;
    }

}

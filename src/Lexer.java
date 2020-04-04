import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
public class Lexer {
    private COOLLexer lexer;
    private CommonTokenStream tokensStream;
    private List<Token> tokens;
    private List<Token> errors;
    private List<String> outputTokens;

    public Lexer(String fileName) {
        CharStream charStream;
        try{
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new COOLLexer(charStream);
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        lex();
    }

    private void lex() {
        outputTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String[] ruleNames = lexer.getRuleNames();
        for (Token token : tokens) {
            if (token.getType() > 0) {        //Not EOF
                if (lexer.getRuleNames()[token.getType() - 1].equals("ErrorChar")) {
                    errors.add(token);
                } else {
                    outputTokens.add(Integer.toString(token.getLine()));
                    outputTokens.add(ruleNames[token.getType() - 1]);
                    if (shouldBeTriplet(ruleNames[token.getType()]))
                        outputTokens.add(token.getText());
                }
            }
        }

        if (hasErrors()) reportErrors();
    }

    public CommonTokenStream getTokensStream() {
        return tokensStream;
    }

    public List<String> getTokens() {
        return outputTokens;
    }

    public void writeTokens(String outputFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String token : outputTokens) {
                writer.write(token + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean shouldBeTriplet(String tokenName) {
        return tokenName.equals("SELF")
                || tokenName.equals("STRING")
                || tokenName.equals("NUM")
                || tokenName.equals("LITERAL")
                || tokenName.equals("ID");
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void reportErrors() {
        StringBuilder report = new StringBuilder();
        for (Token errorToken : errors) {
            report.append(
                    String.format(
                            "Lexer ERROR: Line %s - invalid character %s\n",
                            errorToken.getLine(),
                            errorToken.getText()
                    )
            );
        }
        throw new RuntimeException(report.toString());
    }
}

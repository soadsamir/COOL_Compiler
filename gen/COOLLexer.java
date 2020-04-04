// Generated from C:/Users/So3ad/IdeaProjects/Compiler/src\COOL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class COOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CLASS=2, INHERITS=3, NEW=4, SELF_TYPE=5, SELF=6, INT=7, STRING=8, 
		VOID=9, BOOL=10, TRUE=11, FALSE=12, ISVOID=13, IO=14, IF=15, THEN=16, 
		ELSE=17, FI=18, CASE=19, OF=20, ESAC=21, WHILE=22, LOOP=23, POOL=24, LET=25, 
		IN=26, OP_ASSIGNMENT=27, OP_ADD=28, OP_SUB=29, OP_MUL=30, OP_DIV=31, RELOP_LT=32, 
		RELOP_LE=33, RELOP_EQ=34, OP_NOT=35, OP_INV=36, SEMICOLON=37, OPENING_CURLY_BRACKET=38, 
		CLOSING_CURLY_BRACKET=39, OPENING_BRACKET=40, CLOSING_BRACKET=41, OPENING_SQUARE_BRACKET=42, 
		CLOSING_SQUARE_BRACKET=43, COMMA=44, COLON=45, DOT=46, AT=47, SINGLELINECOMMENTSTART=48, 
		NUM=49, LITERAL=50, ID=51, WS=52, SINGLELINECOMMENT=53, BlockComment=54, 
		ErrorChar=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "CLASS", "INHERITS", "NEW", "SELF_TYPE", "SELF", "INT", "STRING", 
			"VOID", "BOOL", "TRUE", "FALSE", "ISVOID", "IO", "IF", "THEN", "ELSE", 
			"FI", "CASE", "OF", "ESAC", "WHILE", "LOOP", "POOL", "LET", "IN", "OP_ASSIGNMENT", 
			"OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "RELOP_LT", "RELOP_LE", "RELOP_EQ", 
			"OP_NOT", "OP_INV", "SEMICOLON", "OPENING_CURLY_BRACKET", "CLOSING_CURLY_BRACKET", 
			"OPENING_BRACKET", "CLOSING_BRACKET", "OPENING_SQUARE_BRACKET", "CLOSING_SQUARE_BRACKET", 
			"COMMA", "COLON", "DOT", "AT", "SINGLELINECOMMENTSTART", "NUM", "LITERAL", 
			"ID", "WS", "SINGLELINECOMMENT", "BlockComment", "ErrorChar", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'<-'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", 
			"'='", null, "'~'", "';'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"','", "':'", "'.'", "'@'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CLASS", "INHERITS", "NEW", "SELF_TYPE", "SELF", "INT", "STRING", 
			"VOID", "BOOL", "TRUE", "FALSE", "ISVOID", "IO", "IF", "THEN", "ELSE", 
			"FI", "CASE", "OF", "ESAC", "WHILE", "LOOP", "POOL", "LET", "IN", "OP_ASSIGNMENT", 
			"OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "RELOP_LT", "RELOP_LE", "RELOP_EQ", 
			"OP_NOT", "OP_INV", "SEMICOLON", "OPENING_CURLY_BRACKET", "CLOSING_CURLY_BRACKET", 
			"OPENING_BRACKET", "CLOSING_BRACKET", "OPENING_SQUARE_BRACKET", "CLOSING_SQUARE_BRACKET", 
			"COMMA", "COLON", "DOT", "AT", "SINGLELINECOMMENTSTART", "NUM", "LITERAL", 
			"ID", "WS", "SINGLELINECOMMENT", "BlockComment", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public COOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "COOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\5\62"+
		"\u015b\n\62\3\62\6\62\u015e\n\62\r\62\16\62\u015f\3\62\3\62\7\62\u0164"+
		"\n\62\f\62\16\62\u0167\13\62\5\62\u0169\n\62\3\62\3\62\5\62\u016d\n\62"+
		"\3\62\6\62\u0170\n\62\r\62\16\62\u0171\5\62\u0174\n\62\3\63\3\63\7\63"+
		"\u0178\n\63\f\63\16\63\u017b\13\63\3\63\3\63\3\64\3\64\7\64\u0181\n\64"+
		"\f\64\16\64\u0184\13\64\3\65\6\65\u0187\n\65\r\65\16\65\u0188\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\7\66\u0191\n\66\f\66\16\66\u0194\13\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u019f\n\67\f\67\16\67\u01a2\13"+
		"\67\3\67\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\4\u0192\u01a0\2S"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\3\2\"\4\2--//\3\2\62;\4\2GGgg\5\2\f\f\17\17"+
		"$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01d0\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3\u00a5"+
		"\3\2\2\2\5\u00a8\3\2\2\2\7\u00ae\3\2\2\2\t\u00b7\3\2\2\2\13\u00bb\3\2"+
		"\2\2\r\u00c5\3\2\2\2\17\u00ca\3\2\2\2\21\u00ce\3\2\2\2\23\u00d5\3\2\2"+
		"\2\25\u00da\3\2\2\2\27\u00df\3\2\2\2\31\u00e4\3\2\2\2\33\u00ea\3\2\2\2"+
		"\35\u00f1\3\2\2\2\37\u00f4\3\2\2\2!\u00f7\3\2\2\2#\u00fc\3\2\2\2%\u0101"+
		"\3\2\2\2\'\u0104\3\2\2\2)\u0109\3\2\2\2+\u010c\3\2\2\2-\u0111\3\2\2\2"+
		"/\u0117\3\2\2\2\61\u011c\3\2\2\2\63\u0121\3\2\2\2\65\u0125\3\2\2\2\67"+
		"\u0128\3\2\2\29\u012b\3\2\2\2;\u012d\3\2\2\2=\u012f\3\2\2\2?\u0131\3\2"+
		"\2\2A\u0133\3\2\2\2C\u0135\3\2\2\2E\u0138\3\2\2\2G\u013a\3\2\2\2I\u013e"+
		"\3\2\2\2K\u0140\3\2\2\2M\u0142\3\2\2\2O\u0144\3\2\2\2Q\u0146\3\2\2\2S"+
		"\u0148\3\2\2\2U\u014a\3\2\2\2W\u014c\3\2\2\2Y\u014e\3\2\2\2[\u0150\3\2"+
		"\2\2]\u0152\3\2\2\2_\u0154\3\2\2\2a\u0156\3\2\2\2c\u015a\3\2\2\2e\u0175"+
		"\3\2\2\2g\u017e\3\2\2\2i\u0186\3\2\2\2k\u018c\3\2\2\2m\u0199\3\2\2\2o"+
		"\u01a8\3\2\2\2q\u01aa\3\2\2\2s\u01ac\3\2\2\2u\u01ae\3\2\2\2w\u01b0\3\2"+
		"\2\2y\u01b2\3\2\2\2{\u01b4\3\2\2\2}\u01b6\3\2\2\2\177\u01b8\3\2\2\2\u0081"+
		"\u01ba\3\2\2\2\u0083\u01bc\3\2\2\2\u0085\u01be\3\2\2\2\u0087\u01c0\3\2"+
		"\2\2\u0089\u01c2\3\2\2\2\u008b\u01c4\3\2\2\2\u008d\u01c6\3\2\2\2\u008f"+
		"\u01c8\3\2\2\2\u0091\u01ca\3\2\2\2\u0093\u01cc\3\2\2\2\u0095\u01ce\3\2"+
		"\2\2\u0097\u01d0\3\2\2\2\u0099\u01d2\3\2\2\2\u009b\u01d4\3\2\2\2\u009d"+
		"\u01d6\3\2\2\2\u009f\u01d8\3\2\2\2\u00a1\u01da\3\2\2\2\u00a3\u01dc\3\2"+
		"\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7@\2\2\u00a7\4\3\2\2\2\u00a8\u00a9"+
		"\5u;\2\u00a9\u00aa\5\u0087D\2\u00aa\u00ab\5q9\2\u00ab\u00ac\5\u0095K\2"+
		"\u00ac\u00ad\5\u0095K\2\u00ad\6\3\2\2\2\u00ae\u00af\5\u0081A\2\u00af\u00b0"+
		"\5\u008bF\2\u00b0\u00b1\5\177@\2\u00b1\u00b2\5y=\2\u00b2\u00b3\5\u0093"+
		"J\2\u00b3\u00b4\5\u0081A\2\u00b4\u00b5\5\u0097L\2\u00b5\u00b6\5\u0095"+
		"K\2\u00b6\b\3\2\2\2\u00b7\u00b8\5\u008bF\2\u00b8\u00b9\5y=\2\u00b9\u00ba"+
		"\5\u009dO\2\u00ba\n\3\2\2\2\u00bb\u00bc\5\u0095K\2\u00bc\u00bd\5y=\2\u00bd"+
		"\u00be\5\u0087D\2\u00be\u00bf\5{>\2\u00bf\u00c0\7a\2\2\u00c0\u00c1\5\u0097"+
		"L\2\u00c1\u00c2\5\u00a1Q\2\u00c2\u00c3\5\u008fH\2\u00c3\u00c4\5y=\2\u00c4"+
		"\f\3\2\2\2\u00c5\u00c6\5\u0095K\2\u00c6\u00c7\5y=\2\u00c7\u00c8\5\u0087"+
		"D\2\u00c8\u00c9\5{>\2\u00c9\16\3\2\2\2\u00ca\u00cb\5\u0081A\2\u00cb\u00cc"+
		"\5\u008bF\2\u00cc\u00cd\5\u0097L\2\u00cd\20\3\2\2\2\u00ce\u00cf\5\u0095"+
		"K\2\u00cf\u00d0\5\u0097L\2\u00d0\u00d1\5\u0093J\2\u00d1\u00d2\5\u0081"+
		"A\2\u00d2\u00d3\5\u008bF\2\u00d3\u00d4\5}?\2\u00d4\22\3\2\2\2\u00d5\u00d6"+
		"\5\u009bN\2\u00d6\u00d7\5\u008dG\2\u00d7\u00d8\5\u0081A\2\u00d8\u00d9"+
		"\5w<\2\u00d9\24\3\2\2\2\u00da\u00db\5s:\2\u00db\u00dc\5\u008dG\2\u00dc"+
		"\u00dd\5\u008dG\2\u00dd\u00de\5\u0087D\2\u00de\26\3\2\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0\u00e1\5\u0093J\2\u00e1\u00e2\5\u0099M\2\u00e2\u00e3\5y="+
		"\2\u00e3\30\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\5q9\2\u00e6\u00e7\5"+
		"\u0087D\2\u00e7\u00e8\5\u0095K\2\u00e8\u00e9\5y=\2\u00e9\32\3\2\2\2\u00ea"+
		"\u00eb\5\u0081A\2\u00eb\u00ec\5\u0095K\2\u00ec\u00ed\5\u009bN\2\u00ed"+
		"\u00ee\5\u008dG\2\u00ee\u00ef\5\u0081A\2\u00ef\u00f0\5w<\2\u00f0\34\3"+
		"\2\2\2\u00f1\u00f2\5\u0081A\2\u00f2\u00f3\5\u008dG\2\u00f3\36\3\2\2\2"+
		"\u00f4\u00f5\5\u0081A\2\u00f5\u00f6\5{>\2\u00f6 \3\2\2\2\u00f7\u00f8\5"+
		"\u0097L\2\u00f8\u00f9\5\177@\2\u00f9\u00fa\5y=\2\u00fa\u00fb\5\u008bF"+
		"\2\u00fb\"\3\2\2\2\u00fc\u00fd\5y=\2\u00fd\u00fe\5\u0087D\2\u00fe\u00ff"+
		"\5\u0095K\2\u00ff\u0100\5y=\2\u0100$\3\2\2\2\u0101\u0102\5{>\2\u0102\u0103"+
		"\5\u0081A\2\u0103&\3\2\2\2\u0104\u0105\5u;\2\u0105\u0106\5q9\2\u0106\u0107"+
		"\5\u0095K\2\u0107\u0108\5y=\2\u0108(\3\2\2\2\u0109\u010a\5\u008dG\2\u010a"+
		"\u010b\5{>\2\u010b*\3\2\2\2\u010c\u010d\5y=\2\u010d\u010e\5\u0095K\2\u010e"+
		"\u010f\5q9\2\u010f\u0110\5u;\2\u0110,\3\2\2\2\u0111\u0112\5\u009dO\2\u0112"+
		"\u0113\5\177@\2\u0113\u0114\5\u0081A\2\u0114\u0115\5\u0087D\2\u0115\u0116"+
		"\5y=\2\u0116.\3\2\2\2\u0117\u0118\5\u0087D\2\u0118\u0119\5\u008dG\2\u0119"+
		"\u011a\5\u008dG\2\u011a\u011b\5\u008fH\2\u011b\60\3\2\2\2\u011c\u011d"+
		"\5\u008fH\2\u011d\u011e\5\u008dG\2\u011e\u011f\5\u008dG\2\u011f\u0120"+
		"\5\u0087D\2\u0120\62\3\2\2\2\u0121\u0122\5\u0087D\2\u0122\u0123\5y=\2"+
		"\u0123\u0124\5\u0097L\2\u0124\64\3\2\2\2\u0125\u0126\5\u0081A\2\u0126"+
		"\u0127\5\u008bF\2\u0127\66\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7/\2"+
		"\2\u012a8\3\2\2\2\u012b\u012c\7-\2\2\u012c:\3\2\2\2\u012d\u012e\7/\2\2"+
		"\u012e<\3\2\2\2\u012f\u0130\7,\2\2\u0130>\3\2\2\2\u0131\u0132\7\61\2\2"+
		"\u0132@\3\2\2\2\u0133\u0134\7>\2\2\u0134B\3\2\2\2\u0135\u0136\7>\2\2\u0136"+
		"\u0137\7?\2\2\u0137D\3\2\2\2\u0138\u0139\7?\2\2\u0139F\3\2\2\2\u013a\u013b"+
		"\5\u008bF\2\u013b\u013c\5\u008dG\2\u013c\u013d\5\u0097L\2\u013dH\3\2\2"+
		"\2\u013e\u013f\7\u0080\2\2\u013fJ\3\2\2\2\u0140\u0141\7=\2\2\u0141L\3"+
		"\2\2\2\u0142\u0143\7}\2\2\u0143N\3\2\2\2\u0144\u0145\7\177\2\2\u0145P"+
		"\3\2\2\2\u0146\u0147\7*\2\2\u0147R\3\2\2\2\u0148\u0149\7+\2\2\u0149T\3"+
		"\2\2\2\u014a\u014b\7]\2\2\u014bV\3\2\2\2\u014c\u014d\7_\2\2\u014dX\3\2"+
		"\2\2\u014e\u014f\7.\2\2\u014fZ\3\2\2\2\u0150\u0151\7<\2\2\u0151\\\3\2"+
		"\2\2\u0152\u0153\7\60\2\2\u0153^\3\2\2\2\u0154\u0155\7B\2\2\u0155`\3\2"+
		"\2\2\u0156\u0157\7/\2\2\u0157\u0158\7/\2\2\u0158b\3\2\2\2\u0159\u015b"+
		"\t\2\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015e\t\3\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0168\3\2\2\2\u0161\u0165\7\60\2\2\u0162"+
		"\u0164\t\3\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u0161\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0173\3\2\2\2\u016a\u016c\t\4"+
		"\2\2\u016b\u016d\t\2\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0170\t\3\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u016a\3\2\2\2\u0173\u0174\3\2\2\2\u0174d\3\2\2\2\u0175\u0179\7$\2\2\u0176"+
		"\u0178\n\5\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017d\7$\2\2\u017df\3\2\2\2\u017e\u0182\t\6\2\2\u017f\u0181\t\7\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183h\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\t\b\2\2\u0186\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\b\65\2\2\u018bj\3\2\2\2\u018c\u018d\7/\2\2"+
		"\u018d\u018e\7/\2\2\u018e\u0192\3\2\2\2\u018f\u0191\13\2\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7\f\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\b\66\3\2\u0198l\3\2\2\2\u0199\u019a\7*\2\2\u019a\u019b"+
		"\7,\2\2\u019b\u01a0\3\2\2\2\u019c\u019f\5m\67\2\u019d\u019f\13\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a4\7,\2\2\u01a4\u01a5\7+\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\b\67"+
		"\3\2\u01a7n\3\2\2\2\u01a8\u01a9\13\2\2\2\u01a9p\3\2\2\2\u01aa\u01ab\t"+
		"\t\2\2\u01abr\3\2\2\2\u01ac\u01ad\t\n\2\2\u01adt\3\2\2\2\u01ae\u01af\t"+
		"\13\2\2\u01afv\3\2\2\2\u01b0\u01b1\t\f\2\2\u01b1x\3\2\2\2\u01b2\u01b3"+
		"\t\4\2\2\u01b3z\3\2\2\2\u01b4\u01b5\t\r\2\2\u01b5|\3\2\2\2\u01b6\u01b7"+
		"\t\16\2\2\u01b7~\3\2\2\2\u01b8\u01b9\t\17\2\2\u01b9\u0080\3\2\2\2\u01ba"+
		"\u01bb\t\20\2\2\u01bb\u0082\3\2\2\2\u01bc\u01bd\t\21\2\2\u01bd\u0084\3"+
		"\2\2\2\u01be\u01bf\t\22\2\2\u01bf\u0086\3\2\2\2\u01c0\u01c1\t\23\2\2\u01c1"+
		"\u0088\3\2\2\2\u01c2\u01c3\t\24\2\2\u01c3\u008a\3\2\2\2\u01c4\u01c5\t"+
		"\25\2\2\u01c5\u008c\3\2\2\2\u01c6\u01c7\t\26\2\2\u01c7\u008e\3\2\2\2\u01c8"+
		"\u01c9\t\27\2\2\u01c9\u0090\3\2\2\2\u01ca\u01cb\t\30\2\2\u01cb\u0092\3"+
		"\2\2\2\u01cc\u01cd\t\31\2\2\u01cd\u0094\3\2\2\2\u01ce\u01cf\t\32\2\2\u01cf"+
		"\u0096\3\2\2\2\u01d0\u01d1\t\33\2\2\u01d1\u0098\3\2\2\2\u01d2\u01d3\t"+
		"\34\2\2\u01d3\u009a\3\2\2\2\u01d4\u01d5\t\35\2\2\u01d5\u009c\3\2\2\2\u01d6"+
		"\u01d7\t\36\2\2\u01d7\u009e\3\2\2\2\u01d8\u01d9\t\37\2\2\u01d9\u00a0\3"+
		"\2\2\2\u01da\u01db\t \2\2\u01db\u00a2\3\2\2\2\u01dc\u01dd\t!\2\2\u01dd"+
		"\u00a4\3\2\2\2\20\2\u015a\u015f\u0165\u0168\u016c\u0171\u0173\u0179\u0182"+
		"\u0188\u0192\u019e\u01a0\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from D:/DLSU/TERM 2 2018-2019/CMPILER/MP\PascalGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CHR=7, CONST=8, DIV=9, 
		DO=10, DOWNTO=11, ELSE=12, END=13, FILE=14, FOR=15, FUNCTION=16, GOTO=17, 
		IF=18, IN=19, INTEGER=20, LABEL=21, MOD=22, NIL=23, NOT=24, OF=25, OR=26, 
		PACKED=27, PROCEDURE=28, PROGRAM=29, REAL=30, RECORD=31, REPEAT=32, SET=33, 
		THEN=34, TO=35, TYPE=36, UNTIL=37, VAR=38, WHILE=39, WITH=40, PLUS=41, 
		MINUS=42, STAR=43, SLASH=44, ASSIGN=45, COMMA=46, SEMI=47, COLON=48, EQUAL=49, 
		NOT_EQUAL=50, LT=51, LE=52, GE=53, GT=54, LPAREN=55, RPAREN=56, LBRACK=57, 
		LBRACK2=58, RBRACK=59, RBRACK2=60, POINTER=61, AT=62, DOT=63, DOTDOT=64, 
		LCURLY=65, RCURLY=66, UNIT=67, INTERFACE=68, USES=69, STRING=70, IMPLEMENTATION=71, 
		TRUE=72, FALSE=73, WRITE=74, READ=75, WS=76, COMMENT_1=77, COMMENT_2=78, 
		IDENT=79, STRING_LITERAL=80, NUM_INT=81, NUM_REAL=82;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AND", "ARRAY", 
			"BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", "DIV", "DO", "DOWNTO", 
			"ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "INTEGER", 
			"LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", 
			"REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", 
			"WHILE", "WITH", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
			"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", 
			"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", 
			"DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", 
			"IMPLEMENTATION", "TRUE", "FALSE", "WRITE", "READ", "WS", "COMMENT_1", 
			"COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "EXPONENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'%'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "':='", "','", 
			"';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
			"'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'", 
			null, null, null, null, null, null, null, null, "'readln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", 
			"DIV", "DO", "DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", 
			"IF", "IN", "INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", 
			"PROCEDURE", "PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", 
			"TYPE", "UNTIL", "VAR", "WHILE", "WITH", "PLUS", "MINUS", "STAR", "SLASH", 
			"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
			"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", 
			"POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", 
			"USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WRITE", "READ", 
			"WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", 
			"NUM_REAL"
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


	public PascalGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PascalGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u02b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\3"+
		"8\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3"+
		"A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3"+
		"H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3"+
		"R\3R\3S\3S\3T\3T\3U\3U\3U\3V\3V\3W\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3"+
		"\\\3\\\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`"+
		"\3`\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b"+
		"\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e"+
		"\5e\u025e\ne\3f\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3h\3h\3h\3h\7h\u026f\nh"+
		"\fh\16h\u0272\13h\3h\3h\3h\3h\3h\3i\3i\7i\u027b\ni\fi\16i\u027e\13i\3"+
		"i\3i\3i\3i\3j\3j\7j\u0286\nj\fj\16j\u0289\13j\3k\3k\3k\3k\7k\u028f\nk"+
		"\fk\16k\u0292\13k\3k\3k\3l\6l\u0297\nl\rl\16l\u0298\3m\6m\u029c\nm\rm"+
		"\16m\u029d\3m\3m\6m\u02a2\nm\rm\16m\u02a3\3m\5m\u02a7\nm\5m\u02a9\nm\3"+
		"m\5m\u02ac\nm\3n\3n\5n\u02b0\nn\3n\6n\u02b3\nn\rn\16n\u02b4\4\u0270\u027c"+
		"\2o\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG"+
		"\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34"+
		"k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b"+
		"-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65"+
		"\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af"+
		"?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3"+
		"I\u00c5J\u00c7K\u00c9L\u00cbM\u00cdN\u00cfO\u00d1P\u00d3Q\u00d5R\u00d7"+
		"S\u00d9T\u00db\2\3\2!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh"+
		"\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2Q"+
		"Qqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3"+
		"\2))\4\2--//\2\u02a8\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?"+
		"\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2"+
		"\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2"+
		"\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e"+
		"\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2"+
		"\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2"+
		"\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\3\u00dd\3\2\2\2\5\u00df\3\2\2\2\7\u00e1\3\2\2\2\t\u00e3"+
		"\3\2\2\2\13\u00e5\3\2\2\2\r\u00e7\3\2\2\2\17\u00e9\3\2\2\2\21\u00eb\3"+
		"\2\2\2\23\u00ed\3\2\2\2\25\u00ef\3\2\2\2\27\u00f1\3\2\2\2\31\u00f3\3\2"+
		"\2\2\33\u00f5\3\2\2\2\35\u00f7\3\2\2\2\37\u00f9\3\2\2\2!\u00fb\3\2\2\2"+
		"#\u00fd\3\2\2\2%\u00ff\3\2\2\2\'\u0101\3\2\2\2)\u0103\3\2\2\2+\u0105\3"+
		"\2\2\2-\u0107\3\2\2\2/\u0109\3\2\2\2\61\u010b\3\2\2\2\63\u010d\3\2\2\2"+
		"\65\u010f\3\2\2\2\67\u0111\3\2\2\29\u0115\3\2\2\2;\u011b\3\2\2\2=\u0121"+
		"\3\2\2\2?\u0129\3\2\2\2A\u012e\3\2\2\2C\u0133\3\2\2\2E\u0137\3\2\2\2G"+
		"\u013d\3\2\2\2I\u0141\3\2\2\2K\u0144\3\2\2\2M\u014b\3\2\2\2O\u0150\3\2"+
		"\2\2Q\u0154\3\2\2\2S\u0159\3\2\2\2U\u015d\3\2\2\2W\u0166\3\2\2\2Y\u016b"+
		"\3\2\2\2[\u016e\3\2\2\2]\u0171\3\2\2\2_\u0179\3\2\2\2a\u017f\3\2\2\2c"+
		"\u0181\3\2\2\2e\u0185\3\2\2\2g\u0189\3\2\2\2i\u018c\3\2\2\2k\u018f\3\2"+
		"\2\2m\u0196\3\2\2\2o\u01a0\3\2\2\2q\u01a8\3\2\2\2s\u01ad\3\2\2\2u\u01b4"+
		"\3\2\2\2w\u01bb\3\2\2\2y\u01bf\3\2\2\2{\u01c4\3\2\2\2}\u01c7\3\2\2\2\177"+
		"\u01cc\3\2\2\2\u0081\u01d2\3\2\2\2\u0083\u01d6\3\2\2\2\u0085\u01dc\3\2"+
		"\2\2\u0087\u01e1\3\2\2\2\u0089\u01e3\3\2\2\2\u008b\u01e5\3\2\2\2\u008d"+
		"\u01e7\3\2\2\2\u008f\u01e9\3\2\2\2\u0091\u01ec\3\2\2\2\u0093\u01ee\3\2"+
		"\2\2\u0095\u01f0\3\2\2\2\u0097\u01f2\3\2\2\2\u0099\u01f4\3\2\2\2\u009b"+
		"\u01f7\3\2\2\2\u009d\u01f9\3\2\2\2\u009f\u01fc\3\2\2\2\u00a1\u01ff\3\2"+
		"\2\2\u00a3\u0201\3\2\2\2\u00a5\u0203\3\2\2\2\u00a7\u0205\3\2\2\2\u00a9"+
		"\u0207\3\2\2\2\u00ab\u020a\3\2\2\2\u00ad\u020c\3\2\2\2\u00af\u020f\3\2"+
		"\2\2\u00b1\u0211\3\2\2\2\u00b3\u0213\3\2\2\2\u00b5\u0215\3\2\2\2\u00b7"+
		"\u0218\3\2\2\2\u00b9\u021a\3\2\2\2\u00bb\u021c\3\2\2\2\u00bd\u0221\3\2"+
		"\2\2\u00bf\u022b\3\2\2\2\u00c1\u0230\3\2\2\2\u00c3\u0237\3\2\2\2\u00c5"+
		"\u0246\3\2\2\2\u00c7\u024b\3\2\2\2\u00c9\u025d\3\2\2\2\u00cb\u025f\3\2"+
		"\2\2\u00cd\u0266\3\2\2\2\u00cf\u026a\3\2\2\2\u00d1\u0278\3\2\2\2\u00d3"+
		"\u0283\3\2\2\2\u00d5\u028a\3\2\2\2\u00d7\u0296\3\2\2\2\u00d9\u029b\3\2"+
		"\2\2\u00db\u02ad\3\2\2\2\u00dd\u00de\t\2\2\2\u00de\4\3\2\2\2\u00df\u00e0"+
		"\t\3\2\2\u00e0\6\3\2\2\2\u00e1\u00e2\t\4\2\2\u00e2\b\3\2\2\2\u00e3\u00e4"+
		"\t\5\2\2\u00e4\n\3\2\2\2\u00e5\u00e6\t\6\2\2\u00e6\f\3\2\2\2\u00e7\u00e8"+
		"\t\7\2\2\u00e8\16\3\2\2\2\u00e9\u00ea\t\b\2\2\u00ea\20\3\2\2\2\u00eb\u00ec"+
		"\t\t\2\2\u00ec\22\3\2\2\2\u00ed\u00ee\t\n\2\2\u00ee\24\3\2\2\2\u00ef\u00f0"+
		"\t\13\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\t\f\2\2\u00f2\30\3\2\2\2\u00f3"+
		"\u00f4\t\r\2\2\u00f4\32\3\2\2\2\u00f5\u00f6\t\16\2\2\u00f6\34\3\2\2\2"+
		"\u00f7\u00f8\t\17\2\2\u00f8\36\3\2\2\2\u00f9\u00fa\t\20\2\2\u00fa \3\2"+
		"\2\2\u00fb\u00fc\t\21\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\t\22\2\2\u00fe$"+
		"\3\2\2\2\u00ff\u0100\t\23\2\2\u0100&\3\2\2\2\u0101\u0102\t\24\2\2\u0102"+
		"(\3\2\2\2\u0103\u0104\t\25\2\2\u0104*\3\2\2\2\u0105\u0106\t\26\2\2\u0106"+
		",\3\2\2\2\u0107\u0108\t\27\2\2\u0108.\3\2\2\2\u0109\u010a\t\30\2\2\u010a"+
		"\60\3\2\2\2\u010b\u010c\t\31\2\2\u010c\62\3\2\2\2\u010d\u010e\t\32\2\2"+
		"\u010e\64\3\2\2\2\u010f\u0110\t\33\2\2\u0110\66\3\2\2\2\u0111\u0112\5"+
		"\3\2\2\u0112\u0113\5\35\17\2\u0113\u0114\5\t\5\2\u01148\3\2\2\2\u0115"+
		"\u0116\5\3\2\2\u0116\u0117\5%\23\2\u0117\u0118\5%\23\2\u0118\u0119\5\3"+
		"\2\2\u0119\u011a\5\63\32\2\u011a:\3\2\2\2\u011b\u011c\5\5\3\2\u011c\u011d"+
		"\5\13\6\2\u011d\u011e\5\17\b\2\u011e\u011f\5\23\n\2\u011f\u0120\5\35\17"+
		"\2\u0120<\3\2\2\2\u0121\u0122\5\5\3\2\u0122\u0123\5\37\20\2\u0123\u0124"+
		"\5\37\20\2\u0124\u0125\5\31\r\2\u0125\u0126\5\13\6\2\u0126\u0127\5\3\2"+
		"\2\u0127\u0128\5\35\17\2\u0128>\3\2\2\2\u0129\u012a\5\7\4\2\u012a\u012b"+
		"\5\3\2\2\u012b\u012c\5\'\24\2\u012c\u012d\5\13\6\2\u012d@\3\2\2\2\u012e"+
		"\u012f\5\7\4\2\u012f\u0130\5\21\t\2\u0130\u0131\5\3\2\2\u0131\u0132\5"+
		"%\23\2\u0132B\3\2\2\2\u0133\u0134\5\7\4\2\u0134\u0135\5\21\t\2\u0135\u0136"+
		"\5%\23\2\u0136D\3\2\2\2\u0137\u0138\5\7\4\2\u0138\u0139\5\37\20\2\u0139"+
		"\u013a\5\35\17\2\u013a\u013b\5\'\24\2\u013b\u013c\5)\25\2\u013cF\3\2\2"+
		"\2\u013d\u013e\5\t\5\2\u013e\u013f\5\23\n\2\u013f\u0140\5-\27\2\u0140"+
		"H\3\2\2\2\u0141\u0142\5\t\5\2\u0142\u0143\5\37\20\2\u0143J\3\2\2\2\u0144"+
		"\u0145\5\t\5\2\u0145\u0146\5\37\20\2\u0146\u0147\5/\30\2\u0147\u0148\5"+
		"\35\17\2\u0148\u0149\5)\25\2\u0149\u014a\5\37\20\2\u014aL\3\2\2\2\u014b"+
		"\u014c\5\13\6\2\u014c\u014d\5\31\r\2\u014d\u014e\5\'\24\2\u014e\u014f"+
		"\5\13\6\2\u014fN\3\2\2\2\u0150\u0151\5\13\6\2\u0151\u0152\5\35\17\2\u0152"+
		"\u0153\5\t\5\2\u0153P\3\2\2\2\u0154\u0155\5\r\7\2\u0155\u0156\5\23\n\2"+
		"\u0156\u0157\5\31\r\2\u0157\u0158\5\13\6\2\u0158R\3\2\2\2\u0159\u015a"+
		"\5\r\7\2\u015a\u015b\5\37\20\2\u015b\u015c\5%\23\2\u015cT\3\2\2\2\u015d"+
		"\u015e\5\r\7\2\u015e\u015f\5+\26\2\u015f\u0160\5\35\17\2\u0160\u0161\5"+
		"\7\4\2\u0161\u0162\5)\25\2\u0162\u0163\5\23\n\2\u0163\u0164\5\37\20\2"+
		"\u0164\u0165\5\35\17\2\u0165V\3\2\2\2\u0166\u0167\5\17\b\2\u0167\u0168"+
		"\5\37\20\2\u0168\u0169\5)\25\2\u0169\u016a\5\37\20\2\u016aX\3\2\2\2\u016b"+
		"\u016c\5\23\n\2\u016c\u016d\5\r\7\2\u016dZ\3\2\2\2\u016e\u016f\5\23\n"+
		"\2\u016f\u0170\5\35\17\2\u0170\\\3\2\2\2\u0171\u0172\5\23\n\2\u0172\u0173"+
		"\5\35\17\2\u0173\u0174\5)\25\2\u0174\u0175\5\13\6\2\u0175\u0176\5\17\b"+
		"\2\u0176\u0177\5\13\6\2\u0177\u0178\5%\23\2\u0178^\3\2\2\2\u0179\u017a"+
		"\5\31\r\2\u017a\u017b\5\3\2\2\u017b\u017c\5\5\3\2\u017c\u017d\5\13\6\2"+
		"\u017d\u017e\5\31\r\2\u017e`\3\2\2\2\u017f\u0180\7\'\2\2\u0180b\3\2\2"+
		"\2\u0181\u0182\5\35\17\2\u0182\u0183\5\23\n\2\u0183\u0184\5\31\r\2\u0184"+
		"d\3\2\2\2\u0185\u0186\5\35\17\2\u0186\u0187\5\37\20\2\u0187\u0188\5)\25"+
		"\2\u0188f\3\2\2\2\u0189\u018a\5\37\20\2\u018a\u018b\5\r\7\2\u018bh\3\2"+
		"\2\2\u018c\u018d\5\37\20\2\u018d\u018e\5%\23\2\u018ej\3\2\2\2\u018f\u0190"+
		"\5!\21\2\u0190\u0191\5\3\2\2\u0191\u0192\5\7\4\2\u0192\u0193\5\27\f\2"+
		"\u0193\u0194\5\13\6\2\u0194\u0195\5\t\5\2\u0195l\3\2\2\2\u0196\u0197\5"+
		"!\21\2\u0197\u0198\5%\23\2\u0198\u0199\5\37\20\2\u0199\u019a\5\7\4\2\u019a"+
		"\u019b\5\13\6\2\u019b\u019c\5\t\5\2\u019c\u019d\5+\26\2\u019d\u019e\5"+
		"%\23\2\u019e\u019f\5\13\6\2\u019fn\3\2\2\2\u01a0\u01a1\5!\21\2\u01a1\u01a2"+
		"\5%\23\2\u01a2\u01a3\5\37\20\2\u01a3\u01a4\5\17\b\2\u01a4\u01a5\5%\23"+
		"\2\u01a5\u01a6\5\3\2\2\u01a6\u01a7\5\33\16\2\u01a7p\3\2\2\2\u01a8\u01a9"+
		"\5%\23\2\u01a9\u01aa\5\13\6\2\u01aa\u01ab\5\3\2\2\u01ab\u01ac\5\31\r\2"+
		"\u01acr\3\2\2\2\u01ad\u01ae\5%\23\2\u01ae\u01af\5\13\6\2\u01af\u01b0\5"+
		"\7\4\2\u01b0\u01b1\5\37\20\2\u01b1\u01b2\5%\23\2\u01b2\u01b3\5\t\5\2\u01b3"+
		"t\3\2\2\2\u01b4\u01b5\5%\23\2\u01b5\u01b6\5\13\6\2\u01b6\u01b7\5!\21\2"+
		"\u01b7\u01b8\5\13\6\2\u01b8\u01b9\5\3\2\2\u01b9\u01ba\5)\25\2\u01bav\3"+
		"\2\2\2\u01bb\u01bc\5\'\24\2\u01bc\u01bd\5\13\6\2\u01bd\u01be\5)\25\2\u01be"+
		"x\3\2\2\2\u01bf\u01c0\5)\25\2\u01c0\u01c1\5\21\t\2\u01c1\u01c2\5\13\6"+
		"\2\u01c2\u01c3\5\35\17\2\u01c3z\3\2\2\2\u01c4\u01c5\5)\25\2\u01c5\u01c6"+
		"\5\37\20\2\u01c6|\3\2\2\2\u01c7\u01c8\5)\25\2\u01c8\u01c9\5\63\32\2\u01c9"+
		"\u01ca\5!\21\2\u01ca\u01cb\5\13\6\2\u01cb~\3\2\2\2\u01cc\u01cd\5+\26\2"+
		"\u01cd\u01ce\5\35\17\2\u01ce\u01cf\5)\25\2\u01cf\u01d0\5\23\n\2\u01d0"+
		"\u01d1\5\31\r\2\u01d1\u0080\3\2\2\2\u01d2\u01d3\5-\27\2\u01d3\u01d4\5"+
		"\3\2\2\u01d4\u01d5\5%\23\2\u01d5\u0082\3\2\2\2\u01d6\u01d7\5/\30\2\u01d7"+
		"\u01d8\5\21\t\2\u01d8\u01d9\5\23\n\2\u01d9\u01da\5\31\r\2\u01da\u01db"+
		"\5\13\6\2\u01db\u0084\3\2\2\2\u01dc\u01dd\5/\30\2\u01dd\u01de\5\23\n\2"+
		"\u01de\u01df\5)\25\2\u01df\u01e0\5\21\t\2\u01e0\u0086\3\2\2\2\u01e1\u01e2"+
		"\7-\2\2\u01e2\u0088\3\2\2\2\u01e3\u01e4\7/\2\2\u01e4\u008a\3\2\2\2\u01e5"+
		"\u01e6\7,\2\2\u01e6\u008c\3\2\2\2\u01e7\u01e8\7\61\2\2\u01e8\u008e\3\2"+
		"\2\2\u01e9\u01ea\7<\2\2\u01ea\u01eb\7?\2\2\u01eb\u0090\3\2\2\2\u01ec\u01ed"+
		"\7.\2\2\u01ed\u0092\3\2\2\2\u01ee\u01ef\7=\2\2\u01ef\u0094\3\2\2\2\u01f0"+
		"\u01f1\7<\2\2\u01f1\u0096\3\2\2\2\u01f2\u01f3\7?\2\2\u01f3\u0098\3\2\2"+
		"\2\u01f4\u01f5\7>\2\2\u01f5\u01f6\7@\2\2\u01f6\u009a\3\2\2\2\u01f7\u01f8"+
		"\7>\2\2\u01f8\u009c\3\2\2\2\u01f9\u01fa\7>\2\2\u01fa\u01fb\7?\2\2\u01fb"+
		"\u009e\3\2\2\2\u01fc\u01fd\7@\2\2\u01fd\u01fe\7?\2\2\u01fe\u00a0\3\2\2"+
		"\2\u01ff\u0200\7@\2\2\u0200\u00a2\3\2\2\2\u0201\u0202\7*\2\2\u0202\u00a4"+
		"\3\2\2\2\u0203\u0204\7+\2\2\u0204\u00a6\3\2\2\2\u0205\u0206\7]\2\2\u0206"+
		"\u00a8\3\2\2\2\u0207\u0208\7*\2\2\u0208\u0209\7\60\2\2\u0209\u00aa\3\2"+
		"\2\2\u020a\u020b\7_\2\2\u020b\u00ac\3\2\2\2\u020c\u020d\7\60\2\2\u020d"+
		"\u020e\7+\2\2\u020e\u00ae\3\2\2\2\u020f\u0210\7`\2\2\u0210\u00b0\3\2\2"+
		"\2\u0211\u0212\7B\2\2\u0212\u00b2\3\2\2\2\u0213\u0214\7\60\2\2\u0214\u00b4"+
		"\3\2\2\2\u0215\u0216\7\60\2\2\u0216\u0217\7\60\2\2\u0217\u00b6\3\2\2\2"+
		"\u0218\u0219\7}\2\2\u0219\u00b8\3\2\2\2\u021a\u021b\7\177\2\2\u021b\u00ba"+
		"\3\2\2\2\u021c\u021d\5+\26\2\u021d\u021e\5\35\17\2\u021e\u021f\5\23\n"+
		"\2\u021f\u0220\5)\25\2\u0220\u00bc\3\2\2\2\u0221\u0222\5\23\n\2\u0222"+
		"\u0223\5\35\17\2\u0223\u0224\5)\25\2\u0224\u0225\5\13\6\2\u0225\u0226"+
		"\5%\23\2\u0226\u0227\5\r\7\2\u0227\u0228\5\3\2\2\u0228\u0229\5\7\4\2\u0229"+
		"\u022a\5\13\6\2\u022a\u00be\3\2\2\2\u022b\u022c\5+\26\2\u022c\u022d\5"+
		"\'\24\2\u022d\u022e\5\13\6\2\u022e\u022f\5\'\24\2\u022f\u00c0\3\2\2\2"+
		"\u0230\u0231\5\'\24\2\u0231\u0232\5)\25\2\u0232\u0233\5%\23\2\u0233\u0234"+
		"\5\23\n\2\u0234\u0235\5\35\17\2\u0235\u0236\5\17\b\2\u0236\u00c2\3\2\2"+
		"\2\u0237\u0238\5\23\n\2\u0238\u0239\5\33\16\2\u0239\u023a\5!\21\2\u023a"+
		"\u023b\5\31\r\2\u023b\u023c\5\13\6\2\u023c\u023d\5\33\16\2\u023d\u023e"+
		"\5\13\6\2\u023e\u023f\5\35\17\2\u023f\u0240\5)\25\2\u0240\u0241\5\3\2"+
		"\2\u0241\u0242\5)\25\2\u0242\u0243\5\23\n\2\u0243\u0244\5\37\20\2\u0244"+
		"\u0245\5\35\17\2\u0245\u00c4\3\2\2\2\u0246\u0247\5)\25\2\u0247\u0248\5"+
		"%\23\2\u0248\u0249\5+\26\2\u0249\u024a\5\13\6\2\u024a\u00c6\3\2\2\2\u024b"+
		"\u024c\5\r\7\2\u024c\u024d\5\3\2\2\u024d\u024e\5\31\r\2\u024e\u024f\5"+
		"\'\24\2\u024f\u0250\5\13\6\2\u0250\u00c8\3\2\2\2\u0251\u0252\7y\2\2\u0252"+
		"\u0253\7t\2\2\u0253\u0254\7k\2\2\u0254\u0255\7v\2\2\u0255\u025e\7g\2\2"+
		"\u0256\u0257\7y\2\2\u0257\u0258\7t\2\2\u0258\u0259\7k\2\2\u0259\u025a"+
		"\7v\2\2\u025a\u025b\7g\2\2\u025b\u025c\7n\2\2\u025c\u025e\7p\2\2\u025d"+
		"\u0251\3\2\2\2\u025d\u0256\3\2\2\2\u025e\u00ca\3\2\2\2\u025f\u0260\7t"+
		"\2\2\u0260\u0261\7g\2\2\u0261\u0262\7c\2\2\u0262\u0263\7f\2\2\u0263\u0264"+
		"\7n\2\2\u0264\u0265\7p\2\2\u0265\u00cc\3\2\2\2\u0266\u0267\t\34\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u0269\bg\2\2\u0269\u00ce\3\2\2\2\u026a\u026b\7*\2"+
		"\2\u026b\u026c\7,\2\2\u026c\u0270\3\2\2\2\u026d\u026f\13\2\2\2\u026e\u026d"+
		"\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271"+
		"\u0273\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0274\7,\2\2\u0274\u0275\7+\2"+
		"\2\u0275\u0276\3\2\2\2\u0276\u0277\bh\2\2\u0277\u00d0\3\2\2\2\u0278\u027c"+
		"\7}\2\2\u0279\u027b\13\2\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027f\u0280\7\177\2\2\u0280\u0281\3\2\2\2\u0281\u0282\bi\2\2\u0282"+
		"\u00d2\3\2\2\2\u0283\u0287\t\35\2\2\u0284\u0286\t\36\2\2\u0285\u0284\3"+
		"\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u00d4\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u0290\7)\2\2\u028b\u028c\7)\2"+
		"\2\u028c\u028f\7)\2\2\u028d\u028f\n\37\2\2\u028e\u028b\3\2\2\2\u028e\u028d"+
		"\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0293\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\7)\2\2\u0294\u00d6\3\2"+
		"\2\2\u0295\u0297\4\62;\2\u0296\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u00d8\3\2\2\2\u029a\u029c\4\62"+
		";\2\u029b\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029b\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u02ab\3\2\2\2\u029f\u02a1\7\60\2\2\u02a0\u02a2\4"+
		"\62;\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a7\5\u00dbn\2\u02a6\u02a5"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u029f\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02ac\5\u00dbn\2\u02ab\u02a8"+
		"\3\2\2\2\u02ab\u02aa\3\2\2\2\u02ac\u00da\3\2\2\2\u02ad\u02af\7g\2\2\u02ae"+
		"\u02b0\t \2\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2"+
		"\2\2\u02b1\u02b3\4\62;\2\u02b2\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u00dc\3\2\2\2\21\2\u025d\u0270"+
		"\u027c\u0287\u028e\u0290\u0298\u029d\u02a3\u02a6\u02a8\u02ab\u02af\u02b4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
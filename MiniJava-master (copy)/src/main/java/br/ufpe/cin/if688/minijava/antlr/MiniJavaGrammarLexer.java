// Generated from /home/CIN/lccao/Desktop/MiniJavaCompiler/MiniJava-master (copy)/src/main/java/br/ufpe/cin/if688/minijava/MiniJavaGrammar.g4 by ANTLR 4.7.2
package br.ufpe.cin.if688.minijava.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INTARRAY=16, 
		BOOLEAN=17, INT=18, IDENTIFIER=19, AND=20, LT=21, PLUS=22, MINUS=23, TIMES=24, 
		POWER=25, NOT=26, LSB=27, RSB=28, DOTLENGTH=29, LP=30, RP=31, EQ=32, DOT=33, 
		COMMA=34, SEMICOLON=35, TRUE=36, FALSE=37, INTEGER=38, THIS=39, VALID_ID_START=40, 
		WS=41, MULTILINE_COMMENT=42, LINE_COMMENT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "INTARRAY", "BOOLEAN", 
			"INT", "IDENTIFIER", "AND", "LT", "PLUS", "MINUS", "TIMES", "POWER", 
			"NOT", "LSB", "RSB", "DOTLENGTH", "LP", "RP", "EQ", "DOT", "COMMA", "SEMICOLON", 
			"TRUE", "FALSE", "INTEGER", "THIS", "VALID_ID_START", "WS", "MULTILINE_COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'", 
			"'}'", "'extends'", "'return'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'new'", null, "'boolean'", "'int'", null, "'&&'", "'<'", "'+'", "'-'", 
			"'*'", "'**'", "'!'", "'['", "']'", "'.length'", "'('", "')'", "'='", 
			"'.'", "','", "';'", "'true'", "'false'", null, "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INTARRAY", "BOOLEAN", "INT", "IDENTIFIER", "AND", 
			"LT", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH", 
			"LP", "RP", "EQ", "DOT", "COMMA", "SEMICOLON", "TRUE", "FALSE", "INTEGER", 
			"THIS", "VALID_ID_START", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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


	public MiniJavaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJavaGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0130\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\7\24\u00ca\n\24\f\24\16\24\u00cd\13\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\6"+
		"\'\u0103\n\'\r\'\16\'\u0104\3(\3(\3(\3(\3(\3)\5)\u010d\n)\3*\6*\u0110"+
		"\n*\r*\16*\u0111\3*\3*\3+\3+\3+\3+\7+\u011a\n+\f+\16+\u011d\13+\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\7,\u0128\n,\f,\16,\u012b\13,\3,\3,\3,\3,\4\u011b"+
		"\u0129\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\4\5\2C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\t"+
		"h\3\2\2\2\13o\3\2\2\2\rt\3\2\2\2\17y\3\2\2\2\21\u0080\3\2\2\2\23\u0082"+
		"\3\2\2\2\25\u008a\3\2\2\2\27\u0091\3\2\2\2\31\u0094\3\2\2\2\33\u0099\3"+
		"\2\2\2\35\u009f\3\2\2\2\37\u00b2\3\2\2\2!\u00b6\3\2\2\2#\u00ba\3\2\2\2"+
		"%\u00c2\3\2\2\2\'\u00c6\3\2\2\2)\u00ce\3\2\2\2+\u00d1\3\2\2\2-\u00d3\3"+
		"\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00dc\3\2\2"+
		"\2\67\u00de\3\2\2\29\u00e0\3\2\2\2;\u00e2\3\2\2\2=\u00ea\3\2\2\2?\u00ec"+
		"\3\2\2\2A\u00ee\3\2\2\2C\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I"+
		"\u00f6\3\2\2\2K\u00fb\3\2\2\2M\u0102\3\2\2\2O\u0106\3\2\2\2Q\u010c\3\2"+
		"\2\2S\u010f\3\2\2\2U\u0115\3\2\2\2W\u0123\3\2\2\2YZ\7e\2\2Z[\7n\2\2[\\"+
		"\7c\2\2\\]\7u\2\2]^\7u\2\2^\4\3\2\2\2_`\7}\2\2`\6\3\2\2\2ab\7r\2\2bc\7"+
		"w\2\2cd\7d\2\2de\7n\2\2ef\7k\2\2fg\7e\2\2g\b\3\2\2\2hi\7u\2\2ij\7v\2\2"+
		"jk\7c\2\2kl\7v\2\2lm\7k\2\2mn\7e\2\2n\n\3\2\2\2op\7x\2\2pq\7q\2\2qr\7"+
		"k\2\2rs\7f\2\2s\f\3\2\2\2tu\7o\2\2uv\7c\2\2vw\7k\2\2wx\7p\2\2x\16\3\2"+
		"\2\2yz\7U\2\2z{\7v\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177\7i\2\2\177\20\3"+
		"\2\2\2\u0080\u0081\7\177\2\2\u0081\22\3\2\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7z\2\2\u0084\u0085\7v\2\2\u0085\u0086\7g\2\2\u0086\u0087\7p\2\2"+
		"\u0087\u0088\7f\2\2\u0088\u0089\7u\2\2\u0089\24\3\2\2\2\u008a\u008b\7"+
		"t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e\7w\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0090\7p\2\2\u0090\26\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7h\2\2\u0093\30\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u0098\7g\2\2\u0098\32\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b"+
		"\7j\2\2\u009b\u009c\7k\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7U\2\2\u00a0\u00a1\7{\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7\60\2"+
		"\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa"+
		"\7\60\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7p\2\2"+
		"\u00b1\36\3\2\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7"+
		"y\2\2\u00b5 \3\2\2\2\u00b6\u00b7\5%\23\2\u00b7\u00b8\5\67\34\2\u00b8\u00b9"+
		"\59\35\2\u00b9\"\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd"+
		"\7q\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5&\3\2\2\2\u00c6\u00cb\5Q)\2\u00c7\u00ca\5Q)\2\u00c8"+
		"\u00ca\5M\'\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc(\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d0\7(\2\2\u00d0*\3\2\2\2\u00d1\u00d2"+
		"\7>\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7"+
		"/\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\62\3\2\2\2\u00d9\u00da"+
		"\7,\2\2\u00da\u00db\7,\2\2\u00db\64\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\66"+
		"\3\2\2\2\u00de\u00df\7]\2\2\u00df8\3\2\2\2\u00e0\u00e1\7_\2\2\u00e1:\3"+
		"\2\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7j\2\2"+
		"\u00e9<\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed"+
		"@\3\2\2\2\u00ee\u00ef\7?\2\2\u00efB\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1"+
		"D\3\2\2\2\u00f2\u00f3\7.\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7=\2\2\u00f5H"+
		"\3\2\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7w\2\2\u00f9"+
		"\u00fa\7g\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7c\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100L\3\2\2\2\u0101"+
		"\u0103\4\62;\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105N\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108"+
		"\7j\2\2\u0108\u0109\7k\2\2\u0109\u010a\7u\2\2\u010aP\3\2\2\2\u010b\u010d"+
		"\t\2\2\2\u010c\u010b\3\2\2\2\u010dR\3\2\2\2\u010e\u0110\t\3\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b*\2\2\u0114T\3\2\2\2\u0115\u0116"+
		"\7\61\2\2\u0116\u0117\7,\2\2\u0117\u011b\3\2\2\2\u0118\u011a\13\2\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u011c\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7,\2\2\u011f"+
		"\u0120\7\61\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b+\2\2\u0122V\3\2\2\2"+
		"\u0123\u0124\7\61\2\2\u0124\u0125\7\61\2\2\u0125\u0129\3\2\2\2\u0126\u0128"+
		"\13\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d"+
		"\7\f\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b,\2\2\u012fX\3\2\2\2\n\2\u00c9"+
		"\u00cb\u0104\u010c\u0111\u011b\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
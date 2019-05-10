// Generated from /home/CIN/lccao/Desktop/MiniJavaCompiler/MiniJava-master (copy)/src/main/java/br/ufpe/cin/if688/minijava/MiniJavaGrammar.g4 by ANTLR 4.7.2
package br.ufpe.cin.if688.minijava.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_id = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"type", "statement", "expression", "id"
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

	@Override
	public String getGrammarFileName() { return "MiniJavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaGrammarParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			mainClass();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(19);
				classDeclaration();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LP() { return getToken(MiniJavaGrammarParser.LP, 0); }
		public TerminalNode LSB() { return getToken(MiniJavaGrammarParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MiniJavaGrammarParser.RSB, 0); }
		public TerminalNode RP() { return getToken(MiniJavaGrammarParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__0);
			setState(28);
			id();
			setState(29);
			match(T__1);
			setState(30);
			match(T__2);
			setState(31);
			match(T__3);
			setState(32);
			match(T__4);
			setState(33);
			match(T__5);
			setState(34);
			match(LP);
			setState(35);
			match(T__6);
			setState(36);
			match(LSB);
			setState(37);
			match(RSB);
			setState(38);
			id();
			setState(39);
			match(RP);
			setState(40);
			match(T__1);
			setState(41);
			statement();
			setState(42);
			match(T__7);
			setState(43);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			id();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(47);
				match(T__8);
				setState(48);
				id();
				}
			}

			setState(51);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTARRAY) | (1L << BOOLEAN) | (1L << INT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(52);
				varDeclaration();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(58);
				methodDeclaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			type();
			setState(67);
			id();
			setState(68);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode LP() { return getToken(MiniJavaGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(MiniJavaGrammarParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaGrammarParser.COMMA, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__2);
			setState(71);
			type();
			setState(72);
			id();
			setState(73);
			match(LP);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTARRAY) | (1L << BOOLEAN) | (1L << INT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(74);
				type();
				setState(75);
				id();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(76);
					match(COMMA);
					setState(77);
					type();
					setState(78);
					id();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(87);
			match(RP);
			setState(88);
			match(T__1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					varDeclaration();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(95);
				statement();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__9);
			setState(102);
			expression(0);
			setState(103);
			match(SEMICOLON);
			setState(104);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTARRAY() { return getToken(MiniJavaGrammarParser.INTARRAY, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaGrammarParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(MiniJavaGrammarParser.INT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(INTARRAY);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(BOOLEAN);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(INT);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LP() { return getToken(MiniJavaGrammarParser.LP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(MiniJavaGrammarParser.RP, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EQ() { return getToken(MiniJavaGrammarParser.EQ, 0); }
		public TerminalNode LSB() { return getToken(MiniJavaGrammarParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MiniJavaGrammarParser.RSB, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__1);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(113);
					statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__10);
				setState(121);
				match(LP);
				setState(122);
				expression(0);
				setState(123);
				match(RP);
				setState(124);
				statement();
				setState(125);
				match(T__11);
				setState(126);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__12);
				setState(129);
				match(LP);
				setState(130);
				expression(0);
				setState(131);
				match(RP);
				setState(132);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__13);
				setState(135);
				match(LP);
				setState(136);
				expression(0);
				setState(137);
				match(RP);
				setState(138);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				id();
				setState(141);
				match(EQ);
				setState(142);
				expression(0);
				setState(143);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				id();
				setState(146);
				match(LSB);
				setState(147);
				expression(0);
				setState(148);
				match(RSB);
				setState(149);
				match(EQ);
				setState(150);
				expression(0);
				setState(151);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniJavaGrammarParser.INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(MiniJavaGrammarParser.MINUS, 0); }
		public TerminalNode TRUE() { return getToken(MiniJavaGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniJavaGrammarParser.FALSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode THIS() { return getToken(MiniJavaGrammarParser.THIS, 0); }
		public TerminalNode INT() { return getToken(MiniJavaGrammarParser.INT, 0); }
		public TerminalNode LSB() { return getToken(MiniJavaGrammarParser.LSB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSB() { return getToken(MiniJavaGrammarParser.RSB, 0); }
		public TerminalNode LP() { return getToken(MiniJavaGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(MiniJavaGrammarParser.RP, 0); }
		public TerminalNode NOT() { return getToken(MiniJavaGrammarParser.NOT, 0); }
		public TerminalNode AND() { return getToken(MiniJavaGrammarParser.AND, 0); }
		public TerminalNode LT() { return getToken(MiniJavaGrammarParser.LT, 0); }
		public TerminalNode PLUS() { return getToken(MiniJavaGrammarParser.PLUS, 0); }
		public TerminalNode TIMES() { return getToken(MiniJavaGrammarParser.TIMES, 0); }
		public TerminalNode DOTLENGTH() { return getToken(MiniJavaGrammarParser.DOTLENGTH, 0); }
		public TerminalNode DOT() { return getToken(MiniJavaGrammarParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaGrammarParser.COMMA, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(156);
					match(MINUS);
					}
				}

				setState(159);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(160);
				match(TRUE);
				}
				break;
			case 3:
				{
				setState(161);
				match(FALSE);
				}
				break;
			case 4:
				{
				setState(162);
				id();
				}
				break;
			case 5:
				{
				setState(163);
				match(THIS);
				}
				break;
			case 6:
				{
				setState(164);
				match(T__14);
				setState(165);
				match(INT);
				setState(166);
				match(LSB);
				setState(167);
				expression(0);
				setState(168);
				match(RSB);
				}
				break;
			case 7:
				{
				setState(170);
				match(T__14);
				setState(171);
				id();
				setState(172);
				match(LP);
				setState(173);
				match(RP);
				}
				break;
			case 8:
				{
				setState(175);
				match(NOT);
				setState(176);
				expression(2);
				}
				break;
			case 9:
				{
				setState(177);
				match(LP);
				setState(178);
				expression(0);
				setState(179);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(184);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(187);
						match(LSB);
						setState(188);
						expression(0);
						setState(189);
						match(RSB);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(192);
						match(DOTLENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(194);
						match(DOT);
						setState(195);
						id();
						setState(196);
						match(LP);
						setState(205);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << IDENTIFIER) | (1L << MINUS) | (1L << NOT) | (1L << LP) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << THIS))) != 0)) {
							{
							setState(197);
							expression(0);
							setState(202);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(198);
								match(COMMA);
								setState(199);
								expression(0);
								}
								}
								setState(204);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(207);
						match(RP);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener ) ((MiniJavaGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\64\n\4\3\4"+
		"\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16\6V"+
		"\13\6\5\6X\n\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\7\6c\n\6\f\6\16"+
		"\6f\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\7\bu\n\b"+
		"\f\b\16\bx\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00b8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00cb\n\t\f\t\16\t\u00ce\13\t\5\t\u00d0\n\t\3\t\3\t\7\t\u00d4"+
		"\n\t\f\t\16\t\u00d7\13\t\3\n\3\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22\2"+
		"\3\3\2\26\32\2\u00f1\2\24\3\2\2\2\4\35\3\2\2\2\6/\3\2\2\2\bD\3\2\2\2\n"+
		"H\3\2\2\2\fp\3\2\2\2\16\u009b\3\2\2\2\20\u00b7\3\2\2\2\22\u00d8\3\2\2"+
		"\2\24\30\5\4\3\2\25\27\5\6\4\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2"+
		"\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2"+
		"\2\35\36\7\3\2\2\36\37\5\22\n\2\37 \7\4\2\2 !\7\5\2\2!\"\7\6\2\2\"#\7"+
		"\7\2\2#$\7\b\2\2$%\7 \2\2%&\7\t\2\2&\'\7\35\2\2\'(\7\36\2\2()\5\22\n\2"+
		")*\7!\2\2*+\7\4\2\2+,\5\16\b\2,-\7\n\2\2-.\7\n\2\2.\5\3\2\2\2/\60\7\3"+
		"\2\2\60\63\5\22\n\2\61\62\7\13\2\2\62\64\5\22\n\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\65\3\2\2\2\659\7\4\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2<>\5\n\6\2=<\3\2\2\2>A\3\2\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\n\2\2C\7\3\2\2\2DE\5\f"+
		"\7\2EF\5\22\n\2FG\7%\2\2G\t\3\2\2\2HI\7\5\2\2IJ\5\f\7\2JK\5\22\n\2KW\7"+
		" \2\2LM\5\f\7\2MT\5\22\n\2NO\7$\2\2OP\5\f\7\2PQ\5\22\n\2QS\3\2\2\2RN\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WL\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2YZ\7!\2\2Z^\7\4\2\2[]\5\b\5\2\\[\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_d\3\2\2\2`^\3\2\2\2ac\5\16\b\2ba\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\f\2\2hi\5\20\t\2ij\7%\2\2"+
		"jk\7\n\2\2k\13\3\2\2\2lq\7\22\2\2mq\7\23\2\2nq\7\24\2\2oq\5\22\n\2pl\3"+
		"\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2rv\7\4\2\2su\5\16\b\2t"+
		"s\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u009c\7\n"+
		"\2\2z{\7\r\2\2{|\7 \2\2|}\5\20\t\2}~\7!\2\2~\177\5\16\b\2\177\u0080\7"+
		"\16\2\2\u0080\u0081\5\16\b\2\u0081\u009c\3\2\2\2\u0082\u0083\7\17\2\2"+
		"\u0083\u0084\7 \2\2\u0084\u0085\5\20\t\2\u0085\u0086\7!\2\2\u0086\u0087"+
		"\5\16\b\2\u0087\u009c\3\2\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7 \2\2"+
		"\u008a\u008b\5\20\t\2\u008b\u008c\7!\2\2\u008c\u008d\7%\2\2\u008d\u009c"+
		"\3\2\2\2\u008e\u008f\5\22\n\2\u008f\u0090\7\"\2\2\u0090\u0091\5\20\t\2"+
		"\u0091\u0092\7%\2\2\u0092\u009c\3\2\2\2\u0093\u0094\5\22\n\2\u0094\u0095"+
		"\7\35\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7\36\2\2\u0097\u0098\7\"\2"+
		"\2\u0098\u0099\5\20\t\2\u0099\u009a\7%\2\2\u009a\u009c\3\2\2\2\u009br"+
		"\3\2\2\2\u009bz\3\2\2\2\u009b\u0082\3\2\2\2\u009b\u0088\3\2\2\2\u009b"+
		"\u008e\3\2\2\2\u009b\u0093\3\2\2\2\u009c\17\3\2\2\2\u009d\u009f\b\t\1"+
		"\2\u009e\u00a0\7\31\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00b8\7(\2\2\u00a2\u00b8\7&\2\2\u00a3\u00b8\7\'\2"+
		"\2\u00a4\u00b8\5\22\n\2\u00a5\u00b8\7)\2\2\u00a6\u00a7\7\21\2\2\u00a7"+
		"\u00a8\7\24\2\2\u00a8\u00a9\7\35\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab"+
		"\7\36\2\2\u00ab\u00b8\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\5\22\n"+
		"\2\u00ae\u00af\7 \2\2\u00af\u00b0\7!\2\2\u00b0\u00b8\3\2\2\2\u00b1\u00b2"+
		"\7\34\2\2\u00b2\u00b8\5\20\t\4\u00b3\u00b4\7 \2\2\u00b4\u00b5\5\20\t\2"+
		"\u00b5\u00b6\7!\2\2\u00b6\u00b8\3\2\2\2\u00b7\u009d\3\2\2\2\u00b7\u00a2"+
		"\3\2\2\2\u00b7\u00a3\3\2\2\2\u00b7\u00a4\3\2\2\2\u00b7\u00a5\3\2\2\2\u00b7"+
		"\u00a6\3\2\2\2\u00b7\u00ac\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b3\3\2"+
		"\2\2\u00b8\u00d5\3\2\2\2\u00b9\u00ba\f\17\2\2\u00ba\u00bb\t\2\2\2\u00bb"+
		"\u00d4\5\20\t\20\u00bc\u00bd\f\16\2\2\u00bd\u00be\7\35\2\2\u00be\u00bf"+
		"\5\20\t\2\u00bf\u00c0\7\36\2\2\u00c0\u00d4\3\2\2\2\u00c1\u00c2\f\r\2\2"+
		"\u00c2\u00d4\7\37\2\2\u00c3\u00c4\f\f\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6"+
		"\5\22\n\2\u00c6\u00cf\7 \2\2\u00c7\u00cc\5\20\t\2\u00c8\u00c9\7$\2\2\u00c9"+
		"\u00cb\5\20\t\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00c7\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7!"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00b9\3\2\2\2\u00d3\u00bc\3\2\2\2\u00d3"+
		"\u00c1\3\2\2\2\u00d3\u00c3\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9"+
		"\7\25\2\2\u00d9\23\3\2\2\2\23\30\639?TW^dpv\u009b\u009f\u00b7\u00cc\u00cf"+
		"\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
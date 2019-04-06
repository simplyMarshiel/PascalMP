// Generated from D:/DLSU/TERM 2 2018-2019/CMPILER/MP\PascalGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_identifier = 2, RULE_block = 3, 
		RULE_usesUnitsPart = 4, RULE_labelDeclarationPart = 5, RULE_label = 6, 
		RULE_constantDefinitionPart = 7, RULE_constantDefinition = 8, RULE_constantChr = 9, 
		RULE_constant = 10, RULE_unsignedNumber = 11, RULE_unsignedInteger = 12, 
		RULE_unsignedReal = 13, RULE_sign = 14, RULE_bool = 15, RULE_string = 16, 
		RULE_typeDefinitionPart = 17, RULE_typeDefinition = 18, RULE_functionType = 19, 
		RULE_procedureType = 20, RULE_type = 21, RULE_simpleType = 22, RULE_scalarType = 23, 
		RULE_subrangeType = 24, RULE_typeIdentifier = 25, RULE_structuredType = 26, 
		RULE_unpackedStructuredType = 27, RULE_stringtype = 28, RULE_arrayType = 29, 
		RULE_typeList = 30, RULE_indexType = 31, RULE_componentType = 32, RULE_recordType = 33, 
		RULE_fieldList = 34, RULE_fixedPart = 35, RULE_recordSection = 36, RULE_variantPart = 37, 
		RULE_tag = 38, RULE_variant = 39, RULE_setType = 40, RULE_baseType = 41, 
		RULE_fileType = 42, RULE_pointerType = 43, RULE_variableDeclarationPart = 44, 
		RULE_variableDeclaration = 45, RULE_procedureAndFunctionDeclarationPart = 46, 
		RULE_procedureOrFunctionDeclaration = 47, RULE_procedureDeclaration = 48, 
		RULE_formalParameterList = 49, RULE_formalParameterSection = 50, RULE_parameterGroup = 51, 
		RULE_identifierList = 52, RULE_constList = 53, RULE_functionDeclaration = 54, 
		RULE_resultType = 55, RULE_statement = 56, RULE_unlabelledStatement = 57, 
		RULE_simpleStatement = 58, RULE_ioStatement = 59, RULE_assignmentStatement = 60, 
		RULE_variable = 61, RULE_expression = 62, RULE_relationaloperator = 63, 
		RULE_simpleExpression = 64, RULE_additiveoperator = 65, RULE_term = 66, 
		RULE_multiplicativeoperator = 67, RULE_signedFactor = 68, RULE_factor = 69, 
		RULE_unsignedConstant = 70, RULE_functionDesignator = 71, RULE_parameterList = 72, 
		RULE_set = 73, RULE_elementList = 74, RULE_element = 75, RULE_procedureStatement = 76, 
		RULE_actualParameter = 77, RULE_parameterwidth = 78, RULE_gotoStatement = 79, 
		RULE_emptyStatement = 80, RULE_empty = 81, RULE_structuredStatement = 82, 
		RULE_compoundStatement = 83, RULE_statements = 84, RULE_conditionalStatement = 85, 
		RULE_ifStatement = 86, RULE_caseStatement = 87, RULE_caseListElement = 88, 
		RULE_repetetiveStatement = 89, RULE_whileStatement = 90, RULE_repeatStatement = 91, 
		RULE_forStatement = 92, RULE_forList = 93, RULE_initialValue = 94, RULE_finalValue = 95, 
		RULE_withStatement = 96, RULE_recordVariableList = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeading", "identifier", "block", "usesUnitsPart", 
			"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
			"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
			"sign", "bool", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
			"procedureType", "type", "simpleType", "scalarType", "subrangeType", 
			"typeIdentifier", "structuredType", "unpackedStructuredType", "stringtype", 
			"arrayType", "typeList", "indexType", "componentType", "recordType", 
			"fieldList", "fixedPart", "recordSection", "variantPart", "tag", "variant", 
			"setType", "baseType", "fileType", "pointerType", "variableDeclarationPart", 
			"variableDeclaration", "procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
			"procedureDeclaration", "formalParameterList", "formalParameterSection", 
			"parameterGroup", "identifierList", "constList", "functionDeclaration", 
			"resultType", "statement", "unlabelledStatement", "simpleStatement", 
			"ioStatement", "assignmentStatement", "variable", "expression", "relationaloperator", 
			"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
			"signedFactor", "factor", "unsignedConstant", "functionDesignator", "parameterList", 
			"set", "elementList", "element", "procedureStatement", "actualParameter", 
			"parameterwidth", "gotoStatement", "emptyStatement", "empty", "structuredStatement", 
			"compoundStatement", "statements", "conditionalStatement", "ifStatement", 
			"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
			"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
			"withStatement", "recordVariableList"
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

	@Override
	public String getGrammarFileName() { return "PascalGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PascalGrammarParser.DOT, 0); }
		public TerminalNode INTERFACE() { return getToken(PascalGrammarParser.INTERFACE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(196);
			programHeading();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERFACE) {
				{
				setState(197);
				match(INTERFACE);
				}
			}

			setState(200);
			block();
			setState(201);
			match(DOT);
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

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalGrammarParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public TerminalNode UNIT() { return getToken(PascalGrammarParser.UNIT, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitProgramHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProgramHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(PROGRAM);
				setState(204);
				identifier();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(205);
					match(LPAREN);
					setState(206);
					identifierList();
					setState(207);
					match(RPAREN);
					}
				}

				setState(211);
				match(SEMI);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(UNIT);
				setState(214);
				identifier();
				setState(215);
				match(SEMI);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalGrammarParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IDENT);
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

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<LabelDeclarationPartContext> labelDeclarationPart() {
			return getRuleContexts(LabelDeclarationPartContext.class);
		}
		public LabelDeclarationPartContext labelDeclarationPart(int i) {
			return getRuleContext(LabelDeclarationPartContext.class,i);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<TypeDefinitionPartContext> typeDefinitionPart() {
			return getRuleContexts(TypeDefinitionPartContext.class);
		}
		public TypeDefinitionPartContext typeDefinitionPart(int i) {
			return getRuleContext(TypeDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public List<UsesUnitsPartContext> usesUnitsPart() {
			return getRuleContexts(UsesUnitsPartContext.class);
		}
		public UsesUnitsPartContext usesUnitsPart(int i) {
			return getRuleContext(UsesUnitsPartContext.class,i);
		}
		public List<TerminalNode> IMPLEMENTATION() { return getTokens(PascalGrammarParser.IMPLEMENTATION); }
		public TerminalNode IMPLEMENTATION(int i) {
			return getToken(PascalGrammarParser.IMPLEMENTATION, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (CONST - 8)) | (1L << (FUNCTION - 8)) | (1L << (LABEL - 8)) | (1L << (PROCEDURE - 8)) | (1L << (TYPE - 8)) | (1L << (VAR - 8)) | (1L << (USES - 8)) | (1L << (IMPLEMENTATION - 8)))) != 0)) {
				{
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(221);
					labelDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(222);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(223);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(224);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(225);
					procedureAndFunctionDeclarationPart();
					}
					break;
				case USES:
					{
					setState(226);
					usesUnitsPart();
					}
					break;
				case IMPLEMENTATION:
					{
					setState(227);
					match(IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			compoundStatement();
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

	public static class UsesUnitsPartContext extends ParserRuleContext {
		public TerminalNode USES() { return getToken(PascalGrammarParser.USES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public UsesUnitsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesUnitsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterUsesUnitsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitUsesUnitsPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUsesUnitsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsesUnitsPartContext usesUnitsPart() throws RecognitionException {
		UsesUnitsPartContext _localctx = new UsesUnitsPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_usesUnitsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(USES);
			setState(236);
			identifierList();
			setState(237);
			match(SEMI);
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

	public static class LabelDeclarationPartContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(PascalGrammarParser.LABEL, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public LabelDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterLabelDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitLabelDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitLabelDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LABEL);
			setState(240);
			label();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				label();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(SEMI);
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

	public static class LabelContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			unsignedInteger();
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

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PascalGrammarParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitConstantDefinitionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitConstantDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(CONST);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				constantDefinition();
				setState(254);
				match(SEMI);
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalGrammarParser.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(PascalGrammarParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitConstantDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IDENT);
			setState(261);
			match(EQUAL);
			setState(262);
			constant();
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

	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(PascalGrammarParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterConstantChr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitConstantChr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitConstantChr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(CHR);
			setState(265);
			match(LPAREN);
			setState(266);
			unsignedInteger();
			setState(267);
			match(RPAREN);
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

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				sign();
				setState(271);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				sign();
				setState(275);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				constantChr();
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsignedNumber);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				unsignedReal();
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(PascalGrammarParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitUnsignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(NUM_INT);
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

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(PascalGrammarParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitUnsignedReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnsignedReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(NUM_REAL);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalGrammarParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PascalGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascalGrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PascalGrammarParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(STRING_LITERAL);
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

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PascalGrammarParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterTypeDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitTypeDefinitionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTypeDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(TYPE);
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296);
				typeDefinition();
				setState(297);
				match(SEMI);
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascalGrammarParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ProcedureTypeContext procedureType() {
			return getRuleContext(ProcedureTypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			identifier();
			setState(304);
			match(EQUAL);
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOLEAN:
			case CHAR:
			case CHR:
			case FILE:
			case INTEGER:
			case PACKED:
			case REAL:
			case RECORD:
			case SET:
			case PLUS:
			case MINUS:
			case LPAREN:
			case POINTER:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(305);
				type();
				}
				break;
			case FUNCTION:
				{
				setState(306);
				functionType();
				}
				break;
			case PROCEDURE:
				{
				setState(307);
				procedureType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PascalGrammarParser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(FUNCTION);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(311);
				formalParameterList();
				}
			}

			setState(314);
			match(COLON);
			setState(315);
			resultType();
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

	public static class ProcedureTypeContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascalGrammarParser.PROCEDURE, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterProcedureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitProcedureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProcedureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureTypeContext procedureType() throws RecognitionException {
		ProcedureTypeContext _localctx = new ProcedureTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(PROCEDURE);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(318);
				formalParameterList();
				}
			}

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
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case CHR:
			case INTEGER:
			case REAL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				simpleType();
				}
				break;
			case ARRAY:
			case FILE:
			case PACKED:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				structuredType();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				pointerType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleType);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				stringtype();
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

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LPAREN);
			setState(333);
			identifierList();
			setState(334);
			match(RPAREN);
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

	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalGrammarParser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSubrangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSubrangeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSubrangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			constant();
			setState(337);
			match(DOTDOT);
			setState(338);
			constant();
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(PascalGrammarParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalGrammarParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascalGrammarParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(PascalGrammarParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(PascalGrammarParser.STRING, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitTypeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeIdentifier);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				identifier();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INTEGER) | (1L << REAL))) != 0) || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class StructuredTypeContext extends ParserRuleContext {
		public TerminalNode PACKED() { return getToken(PascalGrammarParser.PACKED, 0); }
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structuredType);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(PACKED);
				setState(345);
				unpackedStructuredType();
				}
				break;
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				unpackedStructuredType();
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

	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterUnpackedStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitUnpackedStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnpackedStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unpackedStructuredType);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				fileType();
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

	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PascalGrammarParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(PascalGrammarParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PascalGrammarParser.RBRACK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterStringtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitStringtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitStringtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(STRING);
			setState(356);
			match(LBRACK);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(357);
				identifier();
				}
				break;
			case NUM_INT:
			case NUM_REAL:
				{
				setState(358);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(361);
			match(RBRACK);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PascalGrammarParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PascalGrammarParser.LBRACK, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PascalGrammarParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(PascalGrammarParser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public TerminalNode LBRACK2() { return getToken(PascalGrammarParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(PascalGrammarParser.RBRACK2, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayType);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(ARRAY);
				setState(364);
				match(LBRACK);
				setState(365);
				typeList();
				setState(366);
				match(RBRACK);
				setState(367);
				match(OF);
				setState(368);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(ARRAY);
				setState(371);
				match(LBRACK2);
				setState(372);
				typeList();
				setState(373);
				match(RBRACK2);
				setState(374);
				match(OF);
				setState(375);
				componentType();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			indexType();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(380);
				match(COMMA);
				setState(381);
				indexType();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IndexTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitIndexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitIndexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			simpleType();
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

	public static class ComponentTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitComponentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitComponentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			type();
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

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(PascalGrammarParser.RECORD, 0); }
		public TerminalNode END() { return getToken(PascalGrammarParser.END, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitRecordType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(RECORD);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==IDENT) {
				{
				setState(392);
				fieldList();
				}
			}

			setState(395);
			match(END);
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

	public static class FieldListContext extends ParserRuleContext {
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public VariantPartContext variantPart() {
			return getRuleContext(VariantPartContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fieldList);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				fixedPart();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(398);
					match(SEMI);
					setState(399);
					variantPart();
					}
				}

				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				variantPart();
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

	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFixedPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFixedPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFixedPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			recordSection();
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(406);
					match(SEMI);
					setState(407);
					recordSection();
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
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

	public static class RecordSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterRecordSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitRecordSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitRecordSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			identifierList();
			setState(414);
			match(COLON);
			setState(415);
			type();
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

	public static class VariantPartContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalGrammarParser.CASE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalGrammarParser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterVariantPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitVariantPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVariantPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variantPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(CASE);
			setState(418);
			tag();
			setState(419);
			match(OF);
			setState(420);
			variant();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(421);
				match(SEMI);
				setState(422);
				variant();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tag);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				identifier();
				setState(429);
				match(COLON);
				setState(430);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				typeIdentifier();
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

	public static class VariantContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			constList();
			setState(436);
			match(COLON);
			setState(437);
			match(LPAREN);
			setState(438);
			fieldList();
			setState(439);
			match(RPAREN);
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

	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PascalGrammarParser.SET, 0); }
		public TerminalNode OF() { return getToken(PascalGrammarParser.OF, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(SET);
			setState(442);
			match(OF);
			setState(443);
			baseType();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			simpleType();
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

	public static class FileTypeContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(PascalGrammarParser.FILE, 0); }
		public TerminalNode OF() { return getToken(PascalGrammarParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFileType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFileType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fileType);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(FILE);
				setState(448);
				match(OF);
				setState(449);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(FILE);
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

	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(PascalGrammarParser.POINTER, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(POINTER);
			setState(454);
			typeIdentifier();
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalGrammarParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitVariableDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVariableDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(VAR);
			setState(457);
			variableDeclaration();
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					match(SEMI);
					setState(459);
					variableDeclaration();
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(465);
			match(SEMI);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			identifierList();
			setState(468);
			match(COLON);
			setState(469);
			type();
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

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProcedureAndFunctionDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			procedureOrFunctionDeclaration();
			setState(472);
			match(SEMI);
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

	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterProcedureOrFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitProcedureOrFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProcedureOrFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_procedureOrFunctionDeclaration);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				functionDeclaration();
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascalGrammarParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(PROCEDURE);
			setState(479);
			identifier();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(480);
				formalParameterList();
				}
			}

			setState(483);
			match(SEMI);
			setState(484);
			block();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LPAREN);
			setState(487);
			formalParameterSection();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(488);
				match(SEMI);
				setState(489);
				formalParameterSection();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(RPAREN);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PascalGrammarParser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(PascalGrammarParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PascalGrammarParser.PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFormalParameterSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameterSection);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(VAR);
				setState(499);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(FUNCTION);
				setState(501);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(PROCEDURE);
				setState(503);
				parameterGroup();
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			identifierList();
			setState(507);
			match(COLON);
			setState(508);
			typeIdentifier();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			identifier();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				identifier();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConstListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitConstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitConstList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			constant();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(519);
				match(COMMA);
				setState(520);
				constant();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PascalGrammarParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalGrammarParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(FUNCTION);
			setState(527);
			identifier();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(528);
				formalParameterList();
				}
			}

			setState(531);
			match(COLON);
			setState(532);
			resultType();
			setState(533);
			match(SEMI);
			setState(534);
			block();
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitResultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			typeIdentifier();
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_statement);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				label();
				setState(539);
				match(COLON);
				setState(540);
				unlabelledStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case ELSE:
			case END:
			case FOR:
			case GOTO:
			case IF:
			case REPEAT:
			case UNTIL:
			case WHILE:
			case WITH:
			case SEMI:
			case AT:
			case WRITE:
			case READ:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				unlabelledStatement();
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

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitUnlabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnlabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unlabelledStatement);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case SEMI:
			case AT:
			case WRITE:
			case READ:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				simpleStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case FOR:
			case IF:
			case REPEAT:
			case WHILE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				structuredStatement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public IoStatementContext ioStatement() {
			return getRuleContext(IoStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_simpleStatement);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				emptyStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				ioStatement();
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

	public static class IoStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(PascalGrammarParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode READ() { return getToken(PascalGrammarParser.READ, 0); }
		public IoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterIoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitIoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitIoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoStatementContext ioStatement() throws RecognitionException {
		IoStatementContext _localctx = new IoStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ioStatement);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(WRITE);
				setState(557);
				match(LPAREN);
				setState(560);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(558);
					string();
					}
					break;
				case IDENT:
					{
					setState(559);
					identifierList();
					}
					break;
				case RPAREN:
					break;
				default:
					break;
				}
				setState(562);
				match(RPAREN);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(READ);
				setState(564);
				match(LPAREN);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(565);
					identifierList();
					}
				}

				setState(568);
				match(RPAREN);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			variable();
			setState(572);
			match(ASSIGN);
			setState(573);
			expression();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PascalGrammarParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(PascalGrammarParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PascalGrammarParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PascalGrammarParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PascalGrammarParser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(PascalGrammarParser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(PascalGrammarParser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(PascalGrammarParser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(PascalGrammarParser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PascalGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PascalGrammarParser.DOT, i);
		}
		public List<TerminalNode> POINTER() { return getTokens(PascalGrammarParser.POINTER); }
		public TerminalNode POINTER(int i) {
			return getToken(PascalGrammarParser.POINTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				setState(575);
				match(AT);
				setState(576);
				identifier();
				}
				break;
			case IDENT:
				{
				setState(577);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << LBRACK2) | (1L << POINTER) | (1L << DOT))) != 0)) {
				{
				setState(605);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(580);
					match(LBRACK);
					setState(581);
					expression();
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(582);
						match(COMMA);
						setState(583);
						expression();
						}
						}
						setState(588);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(589);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(591);
					match(LBRACK2);
					setState(592);
					expression();
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(593);
						match(COMMA);
						setState(594);
						expression();
						}
						}
						setState(599);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(600);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(602);
					match(DOT);
					setState(603);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(604);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			simpleExpression();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				setState(611);
				relationaloperator();
				setState(612);
				expression();
				}
			}

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

	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PascalGrammarParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PascalGrammarParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(PascalGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(PascalGrammarParser.LE, 0); }
		public TerminalNode GE() { return getToken(PascalGrammarParser.GE, 0); }
		public TerminalNode GT() { return getToken(PascalGrammarParser.GT, 0); }
		public TerminalNode IN() { return getToken(PascalGrammarParser.IN, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterRelationaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitRelationaloperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitRelationaloperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			term();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(619);
				additiveoperator();
				setState(620);
				simpleExpression();
				}
			}

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

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalGrammarParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(PascalGrammarParser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterAdditiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitAdditiveoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitAdditiveoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			signedFactor();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				setState(627);
				multiplicativeoperator();
				setState(628);
				term();
				}
			}

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

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PascalGrammarParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PascalGrammarParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(PascalGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PascalGrammarParser.MOD, 0); }
		public TerminalNode AND() { return getToken(PascalGrammarParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterMultiplicativeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitMultiplicativeoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitMultiplicativeoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PascalGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalGrammarParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSignedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(634);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(637);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PascalGrammarParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_factor);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(LPAREN);
				setState(641);
				expression();
				setState(642);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(647);
				match(NOT);
				setState(648);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(649);
				bool();
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NIL() { return getToken(PascalGrammarParser.NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitUnsignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unsignedConstant);
		try {
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				match(NIL);
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFunctionDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFunctionDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			identifier();
			setState(659);
			match(LPAREN);
			setState(660);
			parameterList();
			setState(661);
			match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			actualParameter();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(664);
				match(COMMA);
				setState(665);
				actualParameter();
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PascalGrammarParser.LBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PascalGrammarParser.RBRACK, 0); }
		public TerminalNode LBRACK2() { return getToken(PascalGrammarParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(PascalGrammarParser.RBRACK2, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_set);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(LBRACK);
				setState(672);
				elementList();
				setState(673);
				match(RBRACK);
				}
				break;
			case LBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(LBRACK2);
				setState(676);
				elementList();
				setState(677);
				match(RBRACK2);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementList);
		int _la;
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHR:
			case NIL:
			case NOT:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case AT:
			case TRUE:
			case FALSE:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				element();
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(682);
					match(COMMA);
					setState(683);
					element();
					}
					}
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACK:
			case RBRACK2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalGrammarParser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			expression();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(693);
				match(DOTDOT);
				setState(694);
				expression();
				}
			}

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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalGrammarParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalGrammarParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			identifier();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(698);
				match(LPAREN);
				setState(699);
				parameterList();
				setState(700);
				match(RPAREN);
				}
			}

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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterwidthContext> parameterwidth() {
			return getRuleContexts(ParameterwidthContext.class);
		}
		public ParameterwidthContext parameterwidth(int i) {
			return getRuleContext(ParameterwidthContext.class,i);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			expression();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(705);
				parameterwidth();
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParameterwidthContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterParameterwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitParameterwidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitParameterwidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterwidthContext parameterwidth() throws RecognitionException {
		ParameterwidthContext _localctx = new ParameterwidthContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(COLON);
			setState(712);
			expression();
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

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(PascalGrammarParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(GOTO);
			setState(715);
			label();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_structuredStatement);
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(724);
				withStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalGrammarParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalGrammarParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(BEGIN);
			setState(728);
			statements();
			setState(729);
			match(END);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			statement();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(732);
				match(SEMI);
				setState(733);
				statement();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_conditionalStatement);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				caseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascalGrammarParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalGrammarParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascalGrammarParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(IF);
			setState(744);
			expression();
			setState(745);
			match(THEN);
			setState(746);
			statement();
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(747);
				match(ELSE);
				setState(748);
				statement();
				}
				break;
			}
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalGrammarParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalGrammarParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(PascalGrammarParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascalGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalGrammarParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(PascalGrammarParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(CASE);
			setState(752);
			expression();
			setState(753);
			match(OF);
			setState(754);
			caseListElement();
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755);
					match(SEMI);
					setState(756);
					caseListElement();
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(762);
				match(SEMI);
				setState(763);
				match(ELSE);
				setState(764);
				statements();
				}
			}

			setState(767);
			match(END);
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

	public static class CaseListElementContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalGrammarParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitCaseListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitCaseListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			constList();
			setState(770);
			match(COLON);
			setState(771);
			statement();
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

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitRepetetiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitRepetetiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_repetetiveStatement);
		try {
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				forStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascalGrammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalGrammarParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(WHILE);
			setState(779);
			expression();
			setState(780);
			match(DO);
			setState(781);
			statement();
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(PascalGrammarParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(PascalGrammarParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(REPEAT);
			setState(784);
			statements();
			setState(785);
			match(UNTIL);
			setState(786);
			expression();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PascalGrammarParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalGrammarParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalGrammarParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(FOR);
			setState(789);
			identifier();
			setState(790);
			match(ASSIGN);
			setState(791);
			forList();
			setState(792);
			match(DO);
			setState(793);
			statement();
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

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascalGrammarParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(PascalGrammarParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			initialValue();
			setState(796);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(797);
			finalValue();
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

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			expression();
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

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			expression();
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

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PascalGrammarParser.WITH, 0); }
		public RecordVariableListContext recordVariableList() {
			return getRuleContext(RecordVariableListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalGrammarParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(WITH);
			setState(804);
			recordVariableList();
			setState(805);
			match(DO);
			setState(806);
			statement();
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

	public static class RecordVariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalGrammarParser.COMMA, i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).enterRecordVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalGrammarListener ) ((PascalGrammarListener)listener).exitRecordVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalGrammarVisitor ) return ((PascalGrammarVisitor<? extends T>)visitor).visitRecordVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			variable();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(809);
				match(COMMA);
				setState(810);
				variable();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0333\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\5\2\u00c9\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u00d4\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00dc\n\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00e7\n\5\f\5\16\5\u00ea\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00f6\n\7\f\7\16\7\u00f9\13\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\6\t\u0103\n\t\r\t\16\t\u0104\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u011a\n\f\3\r\3\r\5\r\u011e\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\6\23\u012e\n\23\r\23\16\23\u012f\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0137\n\24\3\25\3\25\5\25\u013b\n\25\3\25"+
		"\3\25\3\25\3\26\3\26\5\26\u0142\n\26\3\27\3\27\3\27\5\27\u0147\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u014d\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\5\33\u0159\n\33\3\34\3\34\3\34\5\34\u015e\n\34\3\35\3"+
		"\35\3\35\3\35\5\35\u0164\n\35\3\36\3\36\3\36\3\36\5\36\u016a\n\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u017c\n\37\3 \3 \3 \7 \u0181\n \f \16 \u0184\13 \3!\3!\3\""+
		"\3\"\3#\3#\5#\u018c\n#\3#\3#\3$\3$\3$\5$\u0193\n$\3$\5$\u0196\n$\3%\3"+
		"%\3%\7%\u019b\n%\f%\16%\u019e\13%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\7\'\u01aa\n\'\f\'\16\'\u01ad\13\'\3(\3(\3(\3(\3(\5(\u01b4\n(\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\5,\u01c6\n,\3-\3-\3-\3.\3.\3"+
		".\3.\7.\u01cf\n.\f.\16.\u01d2\13.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\5\61\u01df\n\61\3\62\3\62\3\62\5\62\u01e4\n\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\7\63\u01ed\n\63\f\63\16\63\u01f0\13\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01fb\n\64\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\7\66\u0204\n\66\f\66\16\66\u0207\13\66\3\67\3\67\3\67"+
		"\7\67\u020c\n\67\f\67\16\67\u020f\13\67\38\38\38\58\u0214\n8\38\38\38"+
		"\38\38\39\39\3:\3:\3:\3:\3:\5:\u0222\n:\3;\3;\5;\u0226\n;\3<\3<\3<\3<"+
		"\3<\5<\u022d\n<\3=\3=\3=\3=\5=\u0233\n=\3=\3=\3=\3=\5=\u0239\n=\3=\5="+
		"\u023c\n=\3>\3>\3>\3>\3?\3?\3?\5?\u0245\n?\3?\3?\3?\3?\7?\u024b\n?\f?"+
		"\16?\u024e\13?\3?\3?\3?\3?\3?\3?\7?\u0256\n?\f?\16?\u0259\13?\3?\3?\3"+
		"?\3?\3?\7?\u0260\n?\f?\16?\u0263\13?\3@\3@\3@\3@\5@\u0269\n@\3A\3A\3B"+
		"\3B\3B\3B\5B\u0271\nB\3C\3C\3D\3D\3D\3D\5D\u0279\nD\3E\3E\3F\5F\u027e"+
		"\nF\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u028d\nG\3H\3H\3H\3H\5H"+
		"\u0293\nH\3I\3I\3I\3I\3I\3J\3J\3J\7J\u029d\nJ\fJ\16J\u02a0\13J\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\5K\u02aa\nK\3L\3L\3L\7L\u02af\nL\fL\16L\u02b2\13L\3L"+
		"\5L\u02b5\nL\3M\3M\3M\5M\u02ba\nM\3N\3N\3N\3N\3N\5N\u02c1\nN\3O\3O\7O"+
		"\u02c5\nO\fO\16O\u02c8\13O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3T\5"+
		"T\u02d8\nT\3U\3U\3U\3U\3V\3V\3V\7V\u02e1\nV\fV\16V\u02e4\13V\3W\3W\5W"+
		"\u02e8\nW\3X\3X\3X\3X\3X\3X\5X\u02f0\nX\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u02f8\nY"+
		"\fY\16Y\u02fb\13Y\3Y\3Y\3Y\5Y\u0300\nY\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\5[\u030b"+
		"\n[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3"+
		"_\3`\3`\3a\3a\3b\3b\3b\3b\3b\3c\3c\3c\7c\u032e\nc\fc\16c\u0331\13c\3c"+
		"\2\2d\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\2\t\3\2+,\3\2JK\7\2\6\6\b\b\26\26  HH\4"+
		"\2\25\25\638\4\2\34\34+,\6\2\3\3\13\13\30\30-.\4\2\r\r%%\2\u0335\2\u00c6"+
		"\3\2\2\2\4\u00db\3\2\2\2\6\u00dd\3\2\2\2\b\u00e8\3\2\2\2\n\u00ed\3\2\2"+
		"\2\f\u00f1\3\2\2\2\16\u00fc\3\2\2\2\20\u00fe\3\2\2\2\22\u0106\3\2\2\2"+
		"\24\u010a\3\2\2\2\26\u0119\3\2\2\2\30\u011d\3\2\2\2\32\u011f\3\2\2\2\34"+
		"\u0121\3\2\2\2\36\u0123\3\2\2\2 \u0125\3\2\2\2\"\u0127\3\2\2\2$\u0129"+
		"\3\2\2\2&\u0131\3\2\2\2(\u0138\3\2\2\2*\u013f\3\2\2\2,\u0146\3\2\2\2."+
		"\u014c\3\2\2\2\60\u014e\3\2\2\2\62\u0152\3\2\2\2\64\u0158\3\2\2\2\66\u015d"+
		"\3\2\2\28\u0163\3\2\2\2:\u0165\3\2\2\2<\u017b\3\2\2\2>\u017d\3\2\2\2@"+
		"\u0185\3\2\2\2B\u0187\3\2\2\2D\u0189\3\2\2\2F\u0195\3\2\2\2H\u0197\3\2"+
		"\2\2J\u019f\3\2\2\2L\u01a3\3\2\2\2N\u01b3\3\2\2\2P\u01b5\3\2\2\2R\u01bb"+
		"\3\2\2\2T\u01bf\3\2\2\2V\u01c5\3\2\2\2X\u01c7\3\2\2\2Z\u01ca\3\2\2\2\\"+
		"\u01d5\3\2\2\2^\u01d9\3\2\2\2`\u01de\3\2\2\2b\u01e0\3\2\2\2d\u01e8\3\2"+
		"\2\2f\u01fa\3\2\2\2h\u01fc\3\2\2\2j\u0200\3\2\2\2l\u0208\3\2\2\2n\u0210"+
		"\3\2\2\2p\u021a\3\2\2\2r\u0221\3\2\2\2t\u0225\3\2\2\2v\u022c\3\2\2\2x"+
		"\u023b\3\2\2\2z\u023d\3\2\2\2|\u0244\3\2\2\2~\u0264\3\2\2\2\u0080\u026a"+
		"\3\2\2\2\u0082\u026c\3\2\2\2\u0084\u0272\3\2\2\2\u0086\u0274\3\2\2\2\u0088"+
		"\u027a\3\2\2\2\u008a\u027d\3\2\2\2\u008c\u028c\3\2\2\2\u008e\u0292\3\2"+
		"\2\2\u0090\u0294\3\2\2\2\u0092\u0299\3\2\2\2\u0094\u02a9\3\2\2\2\u0096"+
		"\u02b4\3\2\2\2\u0098\u02b6\3\2\2\2\u009a\u02bb\3\2\2\2\u009c\u02c2\3\2"+
		"\2\2\u009e\u02c9\3\2\2\2\u00a0\u02cc\3\2\2\2\u00a2\u02cf\3\2\2\2\u00a4"+
		"\u02d1\3\2\2\2\u00a6\u02d7\3\2\2\2\u00a8\u02d9\3\2\2\2\u00aa\u02dd\3\2"+
		"\2\2\u00ac\u02e7\3\2\2\2\u00ae\u02e9\3\2\2\2\u00b0\u02f1\3\2\2\2\u00b2"+
		"\u0303\3\2\2\2\u00b4\u030a\3\2\2\2\u00b6\u030c\3\2\2\2\u00b8\u0311\3\2"+
		"\2\2\u00ba\u0316\3\2\2\2\u00bc\u031d\3\2\2\2\u00be\u0321\3\2\2\2\u00c0"+
		"\u0323\3\2\2\2\u00c2\u0325\3\2\2\2\u00c4\u032a\3\2\2\2\u00c6\u00c8\5\4"+
		"\3\2\u00c7\u00c9\7F\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\7A\2\2\u00cc\3\3\2\2\2"+
		"\u00cd\u00ce\7\37\2\2\u00ce\u00d3\5\6\4\2\u00cf\u00d0\79\2\2\u00d0\u00d1"+
		"\5j\66\2\u00d1\u00d2\7:\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00dc\3"+
		"\2\2\2\u00d7\u00d8\7E\2\2\u00d8\u00d9\5\6\4\2\u00d9\u00da\7\61\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00cd\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\5\3\2\2\2"+
		"\u00dd\u00de\7Q\2\2\u00de\7\3\2\2\2\u00df\u00e7\5\f\7\2\u00e0\u00e7\5"+
		"\20\t\2\u00e1\u00e7\5$\23\2\u00e2\u00e7\5Z.\2\u00e3\u00e7\5^\60\2\u00e4"+
		"\u00e7\5\n\6\2\u00e5\u00e7\7I\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e0\3\2"+
		"\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\5\u00a8U\2\u00ec\t\3\2\2\2\u00ed\u00ee\7G\2\2\u00ee\u00ef\5j\66"+
		"\2\u00ef\u00f0\7\61\2\2\u00f0\13\3\2\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f7"+
		"\5\16\b\2\u00f3\u00f4\7\60\2\2\u00f4\u00f6\5\16\b\2\u00f5\u00f3\3\2\2"+
		"\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\r\3\2\2\2\u00fc"+
		"\u00fd\5\32\16\2\u00fd\17\3\2\2\2\u00fe\u0102\7\n\2\2\u00ff\u0100\5\22"+
		"\n\2\u0100\u0101\7\61\2\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\21\3\2\2"+
		"\2\u0106\u0107\7Q\2\2\u0107\u0108\7\63\2\2\u0108\u0109\5\26\f\2\u0109"+
		"\23\3\2\2\2\u010a\u010b\7\t\2\2\u010b\u010c\79\2\2\u010c\u010d\5\32\16"+
		"\2\u010d\u010e\7:\2\2\u010e\25\3\2\2\2\u010f\u011a\5\30\r\2\u0110\u0111"+
		"\5\36\20\2\u0111\u0112\5\30\r\2\u0112\u011a\3\2\2\2\u0113\u011a\5\6\4"+
		"\2\u0114\u0115\5\36\20\2\u0115\u0116\5\6\4\2\u0116\u011a\3\2\2\2\u0117"+
		"\u011a\5\"\22\2\u0118\u011a\5\24\13\2\u0119\u010f\3\2\2\2\u0119\u0110"+
		"\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\27\3\2\2\2\u011b\u011e\5\32\16\2\u011c\u011e\5\34"+
		"\17\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\31\3\2\2\2\u011f\u0120"+
		"\7S\2\2\u0120\33\3\2\2\2\u0121\u0122\7T\2\2\u0122\35\3\2\2\2\u0123\u0124"+
		"\t\2\2\2\u0124\37\3\2\2\2\u0125\u0126\t\3\2\2\u0126!\3\2\2\2\u0127\u0128"+
		"\7R\2\2\u0128#\3\2\2\2\u0129\u012d\7&\2\2\u012a\u012b\5&\24\2\u012b\u012c"+
		"\7\61\2\2\u012c\u012e\3\2\2\2\u012d\u012a\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130%\3\2\2\2\u0131\u0132\5"+
		"\6\4\2\u0132\u0136\7\63\2\2\u0133\u0137\5,\27\2\u0134\u0137\5(\25\2\u0135"+
		"\u0137\5*\26\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2"+
		"\2\2\u0137\'\3\2\2\2\u0138\u013a\7\22\2\2\u0139\u013b\5d\63\2\u013a\u0139"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7\62\2\2"+
		"\u013d\u013e\5p9\2\u013e)\3\2\2\2\u013f\u0141\7\36\2\2\u0140\u0142\5d"+
		"\63\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142+\3\2\2\2\u0143\u0147"+
		"\5.\30\2\u0144\u0147\5\66\34\2\u0145\u0147\5X-\2\u0146\u0143\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147-\3\2\2\2\u0148\u014d\5\60\31"+
		"\2\u0149\u014d\5\62\32\2\u014a\u014d\5\64\33\2\u014b\u014d\5:\36\2\u014c"+
		"\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2"+
		"\2\2\u014d/\3\2\2\2\u014e\u014f\79\2\2\u014f\u0150\5j\66\2\u0150\u0151"+
		"\7:\2\2\u0151\61\3\2\2\2\u0152\u0153\5\26\f\2\u0153\u0154\7B\2\2\u0154"+
		"\u0155\5\26\f\2\u0155\63\3\2\2\2\u0156\u0159\5\6\4\2\u0157\u0159\t\4\2"+
		"\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\65\3\2\2\2\u015a\u015b"+
		"\7\35\2\2\u015b\u015e\58\35\2\u015c\u015e\58\35\2\u015d\u015a\3\2\2\2"+
		"\u015d\u015c\3\2\2\2\u015e\67\3\2\2\2\u015f\u0164\5<\37\2\u0160\u0164"+
		"\5D#\2\u0161\u0164\5R*\2\u0162\u0164\5V,\2\u0163\u015f\3\2\2\2\u0163\u0160"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u01649\3\2\2\2\u0165"+
		"\u0166\7H\2\2\u0166\u0169\7;\2\2\u0167\u016a\5\6\4\2\u0168\u016a\5\30"+
		"\r\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\7=\2\2\u016c;\3\2\2\2\u016d\u016e\7\4\2\2\u016e\u016f\7;\2\2\u016f"+
		"\u0170\5> \2\u0170\u0171\7=\2\2\u0171\u0172\7\33\2\2\u0172\u0173\5B\""+
		"\2\u0173\u017c\3\2\2\2\u0174\u0175\7\4\2\2\u0175\u0176\7<\2\2\u0176\u0177"+
		"\5> \2\u0177\u0178\7>\2\2\u0178\u0179\7\33\2\2\u0179\u017a\5B\"\2\u017a"+
		"\u017c\3\2\2\2\u017b\u016d\3\2\2\2\u017b\u0174\3\2\2\2\u017c=\3\2\2\2"+
		"\u017d\u0182\5@!\2\u017e\u017f\7\60\2\2\u017f\u0181\5@!\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"?\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\5.\30\2\u0186A\3\2\2\2\u0187"+
		"\u0188\5,\27\2\u0188C\3\2\2\2\u0189\u018b\7!\2\2\u018a\u018c\5F$\2\u018b"+
		"\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7\17"+
		"\2\2\u018eE\3\2\2\2\u018f\u0192\5H%\2\u0190\u0191\7\61\2\2\u0191\u0193"+
		"\5L\'\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0196\5L\'\2\u0195\u018f\3\2\2\2\u0195\u0194\3\2\2\2\u0196G\3\2\2\2\u0197"+
		"\u019c\5J&\2\u0198\u0199\7\61\2\2\u0199\u019b\5J&\2\u019a\u0198\3\2\2"+
		"\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dI"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\5j\66\2\u01a0\u01a1\7\62\2\2"+
		"\u01a1\u01a2\5,\27\2\u01a2K\3\2\2\2\u01a3\u01a4\7\7\2\2\u01a4\u01a5\5"+
		"N(\2\u01a5\u01a6\7\33\2\2\u01a6\u01ab\5P)\2\u01a7\u01a8\7\61\2\2\u01a8"+
		"\u01aa\5P)\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01acM\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af"+
		"\5\6\4\2\u01af\u01b0\7\62\2\2\u01b0\u01b1\5\64\33\2\u01b1\u01b4\3\2\2"+
		"\2\u01b2\u01b4\5\64\33\2\u01b3\u01ae\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"O\3\2\2\2\u01b5\u01b6\5l\67\2\u01b6\u01b7\7\62\2\2\u01b7\u01b8\79\2\2"+
		"\u01b8\u01b9\5F$\2\u01b9\u01ba\7:\2\2\u01baQ\3\2\2\2\u01bb\u01bc\7#\2"+
		"\2\u01bc\u01bd\7\33\2\2\u01bd\u01be\5T+\2\u01beS\3\2\2\2\u01bf\u01c0\5"+
		".\30\2\u01c0U\3\2\2\2\u01c1\u01c2\7\20\2\2\u01c2\u01c3\7\33\2\2\u01c3"+
		"\u01c6\5,\27\2\u01c4\u01c6\7\20\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c4\3"+
		"\2\2\2\u01c6W\3\2\2\2\u01c7\u01c8\7?\2\2\u01c8\u01c9\5\64\33\2\u01c9Y"+
		"\3\2\2\2\u01ca\u01cb\7(\2\2\u01cb\u01d0\5\\/\2\u01cc\u01cd\7\61\2\2\u01cd"+
		"\u01cf\5\\/\2\u01ce\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d4\7\61\2\2\u01d4[\3\2\2\2\u01d5\u01d6\5j\66\2\u01d6\u01d7\7\62\2"+
		"\2\u01d7\u01d8\5,\27\2\u01d8]\3\2\2\2\u01d9\u01da\5`\61\2\u01da\u01db"+
		"\7\61\2\2\u01db_\3\2\2\2\u01dc\u01df\5b\62\2\u01dd\u01df\5n8\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01dd\3\2\2\2\u01dfa\3\2\2\2\u01e0\u01e1\7\36\2\2\u01e1"+
		"\u01e3\5\6\4\2\u01e2\u01e4\5d\63\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\61\2\2\u01e6\u01e7\5\b\5\2\u01e7"+
		"c\3\2\2\2\u01e8\u01e9\79\2\2\u01e9\u01ee\5f\64\2\u01ea\u01eb\7\61\2\2"+
		"\u01eb\u01ed\5f\64\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f2\7:\2\2\u01f2e\3\2\2\2\u01f3\u01fb\5h\65\2\u01f4\u01f5\7(\2\2\u01f5"+
		"\u01fb\5h\65\2\u01f6\u01f7\7\22\2\2\u01f7\u01fb\5h\65\2\u01f8\u01f9\7"+
		"\36\2\2\u01f9\u01fb\5h\65\2\u01fa\u01f3\3\2\2\2\u01fa\u01f4\3\2\2\2\u01fa"+
		"\u01f6\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fbg\3\2\2\2\u01fc\u01fd\5j\66\2"+
		"\u01fd\u01fe\7\62\2\2\u01fe\u01ff\5\64\33\2\u01ffi\3\2\2\2\u0200\u0205"+
		"\5\6\4\2\u0201\u0202\7\60\2\2\u0202\u0204\5\6\4\2\u0203\u0201\3\2\2\2"+
		"\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206k\3"+
		"\2\2\2\u0207\u0205\3\2\2\2\u0208\u020d\5\26\f\2\u0209\u020a\7\60\2\2\u020a"+
		"\u020c\5\26\f\2\u020b\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3"+
		"\2\2\2\u020d\u020e\3\2\2\2\u020em\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211"+
		"\7\22\2\2\u0211\u0213\5\6\4\2\u0212\u0214\5d\63\2\u0213\u0212\3\2\2\2"+
		"\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\7\62\2\2\u0216\u0217"+
		"\5p9\2\u0217\u0218\7\61\2\2\u0218\u0219\5\b\5\2\u0219o\3\2\2\2\u021a\u021b"+
		"\5\64\33\2\u021bq\3\2\2\2\u021c\u021d\5\16\b\2\u021d\u021e\7\62\2\2\u021e"+
		"\u021f\5t;\2\u021f\u0222\3\2\2\2\u0220\u0222\5t;\2\u0221\u021c\3\2\2\2"+
		"\u0221\u0220\3\2\2\2\u0222s\3\2\2\2\u0223\u0226\5v<\2\u0224\u0226\5\u00a6"+
		"T\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226u\3\2\2\2\u0227\u022d"+
		"\5z>\2\u0228\u022d\5\u009aN\2\u0229\u022d\5\u00a0Q\2\u022a\u022d\5\u00a2"+
		"R\2\u022b\u022d\5x=\2\u022c\u0227\3\2\2\2\u022c\u0228\3\2\2\2\u022c\u0229"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022dw\3\2\2\2\u022e"+
		"\u022f\7L\2\2\u022f\u0232\79\2\2\u0230\u0233\5\"\22\2\u0231\u0233\5j\66"+
		"\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u023c\7:\2\2\u0235\u0236\7M\2\2\u0236\u0238\79\2\2\u0237"+
		"\u0239\5j\66\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023c\7:\2\2\u023b\u022e\3\2\2\2\u023b\u0235\3\2\2\2\u023c"+
		"y\3\2\2\2\u023d\u023e\5|?\2\u023e\u023f\7/\2\2\u023f\u0240\5~@\2\u0240"+
		"{\3\2\2\2\u0241\u0242\7@\2\2\u0242\u0245\5\6\4\2\u0243\u0245\5\6\4\2\u0244"+
		"\u0241\3\2\2\2\u0244\u0243\3\2\2\2\u0245\u0261\3\2\2\2\u0246\u0247\7;"+
		"\2\2\u0247\u024c\5~@\2\u0248\u0249\7\60\2\2\u0249\u024b\5~@\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\7=\2\2\u0250\u0260\3\2"+
		"\2\2\u0251\u0252\7<\2\2\u0252\u0257\5~@\2\u0253\u0254\7\60\2\2\u0254\u0256"+
		"\5~@\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7>"+
		"\2\2\u025b\u0260\3\2\2\2\u025c\u025d\7A\2\2\u025d\u0260\5\6\4\2\u025e"+
		"\u0260\7?\2\2\u025f\u0246\3\2\2\2\u025f\u0251\3\2\2\2\u025f\u025c\3\2"+
		"\2\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262}\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0268\5\u0082"+
		"B\2\u0265\u0266\5\u0080A\2\u0266\u0267\5~@\2\u0267\u0269\3\2\2\2\u0268"+
		"\u0265\3\2\2\2\u0268\u0269\3\2\2\2\u0269\177\3\2\2\2\u026a\u026b\t\5\2"+
		"\2\u026b\u0081\3\2\2\2\u026c\u0270\5\u0086D\2\u026d\u026e\5\u0084C\2\u026e"+
		"\u026f\5\u0082B\2\u026f\u0271\3\2\2\2\u0270\u026d\3\2\2\2\u0270\u0271"+
		"\3\2\2\2\u0271\u0083\3\2\2\2\u0272\u0273\t\6\2\2\u0273\u0085\3\2\2\2\u0274"+
		"\u0278\5\u008aF\2\u0275\u0276\5\u0088E\2\u0276\u0277\5\u0086D\2\u0277"+
		"\u0279\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u0087\3\2"+
		"\2\2\u027a\u027b\t\7\2\2\u027b\u0089\3\2\2\2\u027c\u027e\t\2\2\2\u027d"+
		"\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\5\u008c"+
		"G\2\u0280\u008b\3\2\2\2\u0281\u028d\5|?\2\u0282\u0283\79\2\2\u0283\u0284"+
		"\5~@\2\u0284\u0285\7:\2\2\u0285\u028d\3\2\2\2\u0286\u028d\5\u0090I\2\u0287"+
		"\u028d\5\u008eH\2\u0288\u028d\5\u0094K\2\u0289\u028a\7\32\2\2\u028a\u028d"+
		"\5\u008cG\2\u028b\u028d\5 \21\2\u028c\u0281\3\2\2\2\u028c\u0282\3\2\2"+
		"\2\u028c\u0286\3\2\2\2\u028c\u0287\3\2\2\2\u028c\u0288\3\2\2\2\u028c\u0289"+
		"\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u008d\3\2\2\2\u028e\u0293\5\30\r\2"+
		"\u028f\u0293\5\24\13\2\u0290\u0293\5\"\22\2\u0291\u0293\7\31\2\2\u0292"+
		"\u028e\3\2\2\2\u0292\u028f\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0291\3\2"+
		"\2\2\u0293\u008f\3\2\2\2\u0294\u0295\5\6\4\2\u0295\u0296\79\2\2\u0296"+
		"\u0297\5\u0092J\2\u0297\u0298\7:\2\2\u0298\u0091\3\2\2\2\u0299\u029e\5"+
		"\u009cO\2\u029a\u029b\7\60\2\2\u029b\u029d\5\u009cO\2\u029c\u029a\3\2"+
		"\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u0093\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\7;\2\2\u02a2\u02a3\5\u0096"+
		"L\2\u02a3\u02a4\7=\2\2\u02a4\u02aa\3\2\2\2\u02a5\u02a6\7<\2\2\u02a6\u02a7"+
		"\5\u0096L\2\u02a7\u02a8\7>\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a1\3\2\2\2"+
		"\u02a9\u02a5\3\2\2\2\u02aa\u0095\3\2\2\2\u02ab\u02b0\5\u0098M\2\u02ac"+
		"\u02ad\7\60\2\2\u02ad\u02af\5\u0098M\2\u02ae\u02ac\3\2\2\2\u02af\u02b2"+
		"\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b5\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02ab\3\2\2\2\u02b4\u02b3\3\2"+
		"\2\2\u02b5\u0097\3\2\2\2\u02b6\u02b9\5~@\2\u02b7\u02b8\7B\2\2\u02b8\u02ba"+
		"\5~@\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u0099\3\2\2\2\u02bb"+
		"\u02c0\5\6\4\2\u02bc\u02bd\79\2\2\u02bd\u02be\5\u0092J\2\u02be\u02bf\7"+
		":\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u009b\3\2\2\2\u02c2\u02c6\5~@\2\u02c3\u02c5\5\u009eP\2\u02c4\u02c3\3"+
		"\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u009d\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\7\62\2\2\u02ca\u02cb\5"+
		"~@\2\u02cb\u009f\3\2\2\2\u02cc\u02cd\7\23\2\2\u02cd\u02ce\5\16\b\2\u02ce"+
		"\u00a1\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u00a3\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2\u00a5\3\2\2\2\u02d3\u02d8\5\u00a8U\2\u02d4\u02d8\5\u00acW\2"+
		"\u02d5\u02d8\5\u00b4[\2\u02d6\u02d8\5\u00c2b\2\u02d7\u02d3\3\2\2\2\u02d7"+
		"\u02d4\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\u00a7\3\2"+
		"\2\2\u02d9\u02da\7\5\2\2\u02da\u02db\5\u00aaV\2\u02db\u02dc\7\17\2\2\u02dc"+
		"\u00a9\3\2\2\2\u02dd\u02e2\5r:\2\u02de\u02df\7\61\2\2\u02df\u02e1\5r:"+
		"\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3"+
		"\3\2\2\2\u02e3\u00ab\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\5\u00aeX"+
		"\2\u02e6\u02e8\5\u00b0Y\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8"+
		"\u00ad\3\2\2\2\u02e9\u02ea\7\24\2\2\u02ea\u02eb\5~@\2\u02eb\u02ec\7$\2"+
		"\2\u02ec\u02ef\5r:\2\u02ed\u02ee\7\16\2\2\u02ee\u02f0\5r:\2\u02ef\u02ed"+
		"\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u00af\3\2\2\2\u02f1\u02f2\7\7\2\2\u02f2"+
		"\u02f3\5~@\2\u02f3\u02f4\7\33\2\2\u02f4\u02f9\5\u00b2Z\2\u02f5\u02f6\7"+
		"\61\2\2\u02f6\u02f8\5\u00b2Z\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2\2\2"+
		"\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02ff\3\2\2\2\u02fb\u02f9"+
		"\3\2\2\2\u02fc\u02fd\7\61\2\2\u02fd\u02fe\7\16\2\2\u02fe\u0300\5\u00aa"+
		"V\2\u02ff\u02fc\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u0302\7\17\2\2\u0302\u00b1\3\2\2\2\u0303\u0304\5l\67\2\u0304\u0305\7"+
		"\62\2\2\u0305\u0306\5r:\2\u0306\u00b3\3\2\2\2\u0307\u030b\5\u00b6\\\2"+
		"\u0308\u030b\5\u00b8]\2\u0309\u030b\5\u00ba^\2\u030a\u0307\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030a\u0309\3\2\2\2\u030b\u00b5\3\2\2\2\u030c\u030d\7)"+
		"\2\2\u030d\u030e\5~@\2\u030e\u030f\7\f\2\2\u030f\u0310\5r:\2\u0310\u00b7"+
		"\3\2\2\2\u0311\u0312\7\"\2\2\u0312\u0313\5\u00aaV\2\u0313\u0314\7\'\2"+
		"\2\u0314\u0315\5~@\2\u0315\u00b9\3\2\2\2\u0316\u0317\7\21\2\2\u0317\u0318"+
		"\5\6\4\2\u0318\u0319\7/\2\2\u0319\u031a\5\u00bc_\2\u031a\u031b\7\f\2\2"+
		"\u031b\u031c\5r:\2\u031c\u00bb\3\2\2\2\u031d\u031e\5\u00be`\2\u031e\u031f"+
		"\t\b\2\2\u031f\u0320\5\u00c0a\2\u0320\u00bd\3\2\2\2\u0321\u0322\5~@\2"+
		"\u0322\u00bf\3\2\2\2\u0323\u0324\5~@\2\u0324\u00c1\3\2\2\2\u0325\u0326"+
		"\7*\2\2\u0326\u0327\5\u00c4c\2\u0327\u0328\7\f\2\2\u0328\u0329\5r:\2\u0329"+
		"\u00c3\3\2\2\2\u032a\u032f\5|?\2\u032b\u032c\7\60\2\2\u032c\u032e\5|?"+
		"\2\u032d\u032b\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u00c5\3\2\2\2\u0331\u032f\3\2\2\2F\u00c8\u00d3\u00db\u00e6"+
		"\u00e8\u00f7\u0104\u0119\u011d\u012f\u0136\u013a\u0141\u0146\u014c\u0158"+
		"\u015d\u0163\u0169\u017b\u0182\u018b\u0192\u0195\u019c\u01ab\u01b3\u01c5"+
		"\u01d0\u01de\u01e3\u01ee\u01fa\u0205\u020d\u0213\u0221\u0225\u022c\u0232"+
		"\u0238\u023b\u0244\u024c\u0257\u025f\u0261\u0268\u0270\u0278\u027d\u028c"+
		"\u0292\u029e\u02a9\u02b0\u02b4\u02b9\u02c0\u02c6\u02d7\u02e2\u02e7\u02ef"+
		"\u02f9\u02ff\u030a\u032f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
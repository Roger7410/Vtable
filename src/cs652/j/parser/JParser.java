// Generated from /Users/JOKER/Courses/cs652/Roger7410-vtable/grammars/cs652/j/parser/J.g4 by ANTLR 4.5.1

package cs652.j.parser;
import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CLASS=3, ELSE=4, EXTENDS=5, FLOAT=6, IF=7, INT=8, NEW=9, 
		PUBLIC=10, RETURN=11, SUPER=12, THIS=13, VOID=14, WHILE=15, IDENTIFIER=16, 
		INTEGER_TYPE=17, FLOAT_TYPE=18, STRING_TYPE=19, LPAREN=20, RPAREN=21, 
		LBRACE=22, RBRACE=23, LBRACK=24, RBRACK=25, SEMI=26, COMMA=27, DOT=28, 
		ASSIGN=29, GT=30, LT=31, WS=32, COMMENT=33, LINE_COMMENT=34;
	public static final int
		RULE_file = 0, RULE_main = 1, RULE_mainblock = 2, RULE_classDeclaration = 3, 
		RULE_classBody = 4, RULE_classBodyDeclaration = 5, RULE_fieldDeclaration = 6, 
		RULE_methodDeclaration = 7, RULE_jType = 8, RULE_formalParameters = 9, 
		RULE_formalParameterList = 10, RULE_formalParameter = 11, RULE_methodBody = 12, 
		RULE_block = 13, RULE_blockStatement = 14, RULE_statement = 15, RULE_localVariableDeclaration = 16, 
		RULE_parExpression = 17, RULE_expression = 18, RULE_expressionList = 19, 
		RULE_creator = 20;
	public static final String[] ruleNames = {
		"file", "main", "mainblock", "classDeclaration", "classBody", "classBodyDeclaration", 
		"fieldDeclaration", "methodDeclaration", "jType", "formalParameters", 
		"formalParameterList", "formalParameter", "methodBody", "block", "blockStatement", 
		"statement", "localVariableDeclaration", "parExpression", "expression", 
		"expressionList", "creator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'printf'", "'null'", "'class'", "'else'", "'extends'", "'float'", 
		"'if'", "'int'", "'new'", "'public'", "'return'", "'super'", "'this'", 
		"'void'", "'while'", null, null, null, null, "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "CLASS", "ELSE", "EXTENDS", "FLOAT", "IF", "INT", "NEW", 
		"PUBLIC", "RETURN", "SUPER", "THIS", "VOID", "WHILE", "IDENTIFIER", "INTEGER_TYPE", 
		"FLOAT_TYPE", "STRING_TYPE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
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
	public String getGrammarFileName() { return "J.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public GlobalScope scope;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(42);
				classDeclaration();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			main();
			setState(49);
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

	public static class MainContext extends ParserRuleContext {
		public JMethod scope;
		public MainblockContext mainblock() {
			return getRuleContext(MainblockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			mainblock();
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

	public static class MainblockContext extends ParserRuleContext {
		public Scope scope;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterMainblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitMainblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMainblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainblockContext mainblock() throws RecognitionException {
		MainblockContext _localctx = new MainblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public JClass scope;
		public Token name;
		public Token superclass;
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(JParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JParser.IDENTIFIER, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CLASS);
			setState(56);
			((ClassDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(59);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(57);
				match(EXTENDS);
				setState(58);
				((ClassDeclarationContext)_localctx).superclass = match(IDENTIFIER);
				}
			}

			setState(61);
			classBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(LBRACE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER) | (1L << SEMI))) != 0)) {
				{
				{
				setState(64);
				classBodyDeclaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBodyDeclaration);
		try {
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(SEMI);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public JTypeContext jType() {
			return getRuleContext(JTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			jType();
			setState(78);
			match(IDENTIFIER);
			setState(79);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public JMethod scope;
		public JTypeContext jType() {
			return getRuleContext(JTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			jType();
			setState(82);
			match(IDENTIFIER);
			setState(83);
			formalParameters();
			setState(84);
			methodBody();
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

	public static class JTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public JTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterJType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitJType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitJType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JTypeContext jType() throws RecognitionException {
		JTypeContext _localctx = new JTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LPAREN);
			setState(90);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(89);
				formalParameterList();
				}
			}

			setState(92);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			formalParameter();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				formalParameter();
				}
				}
				setState(101);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public JTypeContext jType() {
			return getRuleContext(JTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			jType();
			setState(103);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LBRACE);
			setState(106);
			block();
			setState(107);
			match(RBRACE);
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
		public LocalScope scope;
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << NEW) | (1L << RETURN) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << IDENTIFIER) | (1L << INTEGER_TYPE) | (1L << FLOAT_TYPE) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0)) {
				{
				{
				setState(109);
				blockStatement();
				}
				}
				setState(114);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStringStatContext extends StatementContext {
		public TerminalNode STRING_TYPE() { return getToken(JParser.STRING_TYPE, 0); }
		public PrintStringStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterPrintStringStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitPrintStringStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitPrintStringStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallStatContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterCallStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitCallStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitCallStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatContext extends StatementContext {
		public TerminalNode STRING_TYPE() { return getToken(JParser.STRING_TYPE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterPrintStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitPrintStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitBlockStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitBlockStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhatIsThisStatContext extends StatementContext {
		public WhatIsThisStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterWhatIsThisStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitWhatIsThisStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitWhatIsThisStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetureStatContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetureStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterRetureStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitRetureStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitRetureStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatContext extends StatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitAssignStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalVarStatContext extends StatementContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVarStatContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterLocalVarStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitLocalVarStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitLocalVarStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new BlockStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(LBRACE);
				setState(120);
				block();
				setState(121);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new LocalVarStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				localVariableDeclaration();
				setState(124);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				expression(0);
				setState(127);
				match(ASSIGN);
				setState(128);
				expression(0);
				setState(129);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(IF);
				setState(132);
				parExpression();
				setState(133);
				statement();
				setState(136);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(134);
					match(ELSE);
					setState(135);
					statement();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(WHILE);
				setState(139);
				parExpression();
				setState(140);
				statement();
				}
				break;
			case 6:
				_localctx = new RetureStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(RETURN);
				setState(144);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << INTEGER_TYPE) | (1L << FLOAT_TYPE) | (1L << LPAREN))) != 0)) {
					{
					setState(143);
					expression(0);
					}
				}

				setState(146);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(T__0);
				setState(148);
				match(LPAREN);
				setState(149);
				match(STRING_TYPE);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					expression(0);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(RPAREN);
				setState(158);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new PrintStringStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				match(T__0);
				setState(160);
				match(LPAREN);
				setState(161);
				match(STRING_TYPE);
				setState(162);
				match(RPAREN);
				}
				break;
			case 9:
				_localctx = new CallStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				expression(0);
				setState(164);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new WhatIsThisStatContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(166);
				match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public JTypeContext jType() {
			return getRuleContext(JTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			jType();
			setState(170);
			match(IDENTIFIER);
			setState(171);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LPAREN);
			setState(174);
			expression(0);
			setState(175);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Type type;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class THIS_LABLEContext extends ExpressionContext {
		public THIS_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterTHIS_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitTHIS_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitTHIS_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ID_LABLEContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public ID_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterID_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitID_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitID_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class METHOD_CALL_LABLEContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public METHOD_CALL_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterMETHOD_CALL_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitMETHOD_CALL_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitMETHOD_CALL_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class INTEGER_LABLEContext extends ExpressionContext {
		public TerminalNode INTEGER_TYPE() { return getToken(JParser.INTEGER_TYPE, 0); }
		public INTEGER_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterINTEGER_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitINTEGER_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitINTEGER_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class INS_METHOD_CALL_LABLEContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public INS_METHOD_CALL_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterINS_METHOD_CALL_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitINS_METHOD_CALL_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitINS_METHOD_CALL_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CREATOR_LABLEContext extends ExpressionContext {
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public CREATOR_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterCREATOR_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitCREATOR_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitCREATOR_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULL_LABLEContext extends ExpressionContext {
		public NULL_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterNULL_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitNULL_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitNULL_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FIELD_LABLEContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public FIELD_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFIELD_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFIELD_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFIELD_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENS_LABLEContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PARENS_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterPARENS_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitPARENS_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitPARENS_LABLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FLOAT_LABLEContext extends ExpressionContext {
		public TerminalNode FLOAT_TYPE() { return getToken(JParser.FLOAT_TYPE, 0); }
		public FLOAT_LABLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterFLOAT_LABLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitFLOAT_LABLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitFLOAT_LABLE(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CREATOR_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				match(NEW);
				setState(179);
				creator();
				}
				break;
			case 2:
				{
				_localctx = new METHOD_CALL_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(IDENTIFIER);
				setState(181);
				match(LPAREN);
				setState(183);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << INTEGER_TYPE) | (1L << FLOAT_TYPE) | (1L << LPAREN))) != 0)) {
					{
					setState(182);
					expressionList();
					}
				}

				setState(185);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new PARENS_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LPAREN);
				setState(187);
				expression(0);
				setState(188);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new THIS_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(THIS);
				}
				break;
			case 5:
				{
				_localctx = new INTEGER_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(INTEGER_TYPE);
				}
				break;
			case 6:
				{
				_localctx = new FLOAT_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(FLOAT_TYPE);
				}
				break;
			case 7:
				{
				_localctx = new ID_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new NULL_LABLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new FIELD_LABLEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(198);
						match(DOT);
						setState(199);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						_localctx = new INS_METHOD_CALL_LABLEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(201);
						match(DOT);
						setState(202);
						match(IDENTIFIER);
						setState(203);
						match(LPAREN);
						setState(205);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << NEW) | (1L << THIS) | (1L << IDENTIFIER) | (1L << INTEGER_TYPE) | (1L << FLOAT_TYPE) | (1L << LPAREN))) != 0)) {
							{
							setState(204);
							expressionList();
							}
						}

						setState(207);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(212);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expression(0);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				expression(0);
				}
				}
				setState(220);
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

	public static class CreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JParser.IDENTIFIER, 0); }
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JListener ) ((JListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVisitor ) return ((JVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IDENTIFIER);
			setState(222);
			match(LPAREN);
			setState(223);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\6\3\6"+
		"\7\6D\n\6\f\6\16\6G\13\6\3\6\3\6\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13]\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\7\fd\n\f\f\f\16\fg\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\7\17q"+
		"\n\17\f\17\16\17t\13\17\3\20\3\20\5\20x\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008b"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0093\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u009b\n\21\f\21\16\21\u009e\13\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00aa\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ba\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c6\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00d0\n\24\3\24\7\24\u00d3\n\24\f\24\16"+
		"\24\u00d6\13\24\3\25\3\25\3\25\7\25\u00db\n\25\f\25\16\25\u00de\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\2\3&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\3\6\2\b\b\n\n\20\20\22\22\u00ef\2/\3\2\2\2\4\65\3\2\2\2\6"+
		"\67\3\2\2\2\b9\3\2\2\2\nA\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20S\3\2\2\2\22"+
		"X\3\2\2\2\24Z\3\2\2\2\26`\3\2\2\2\30h\3\2\2\2\32k\3\2\2\2\34r\3\2\2\2"+
		"\36w\3\2\2\2 \u00a9\3\2\2\2\"\u00ab\3\2\2\2$\u00af\3\2\2\2&\u00c5\3\2"+
		"\2\2(\u00d7\3\2\2\2*\u00df\3\2\2\2,.\5\b\5\2-,\3\2\2\2.\61\3\2\2\2/-\3"+
		"\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\5\4\3\2\63\64\7\2\2"+
		"\3\64\3\3\2\2\2\65\66\5\6\4\2\66\5\3\2\2\2\678\5\34\17\28\7\3\2\2\29:"+
		"\7\5\2\2:=\7\22\2\2;<\7\7\2\2<>\7\22\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2"+
		"?@\5\n\6\2@\t\3\2\2\2AE\7\30\2\2BD\5\f\7\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\31\2\2I\13\3\2\2\2JN\5\16\b\2KN\5"+
		"\20\t\2LN\7\34\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\r\3\2\2\2OP\5\22\n\2"+
		"PQ\7\22\2\2QR\7\34\2\2R\17\3\2\2\2ST\5\22\n\2TU\7\22\2\2UV\5\24\13\2V"+
		"W\5\32\16\2W\21\3\2\2\2XY\t\2\2\2Y\23\3\2\2\2Z\\\7\26\2\2[]\5\26\f\2\\"+
		"[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\27\2\2_\25\3\2\2\2`e\5\30\r\2ab\7\35"+
		"\2\2bd\5\30\r\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\27\3\2\2\2ge"+
		"\3\2\2\2hi\5\22\n\2ij\7\22\2\2j\31\3\2\2\2kl\7\30\2\2lm\5\34\17\2mn\7"+
		"\31\2\2n\33\3\2\2\2oq\5\36\20\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2s\35\3\2\2\2tr\3\2\2\2ux\5\"\22\2vx\5 \21\2wu\3\2\2\2wv\3\2\2\2x\37"+
		"\3\2\2\2yz\7\30\2\2z{\5\34\17\2{|\7\31\2\2|\u00aa\3\2\2\2}~\5\"\22\2~"+
		"\177\7\34\2\2\177\u00aa\3\2\2\2\u0080\u0081\5&\24\2\u0081\u0082\7\37\2"+
		"\2\u0082\u0083\5&\24\2\u0083\u0084\7\34\2\2\u0084\u00aa\3\2\2\2\u0085"+
		"\u0086\7\t\2\2\u0086\u0087\5$\23\2\u0087\u008a\5 \21\2\u0088\u0089\7\6"+
		"\2\2\u0089\u008b\5 \21\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u00aa\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e\5$\23\2\u008e\u008f\5"+
		" \21\2\u008f\u00aa\3\2\2\2\u0090\u0092\7\r\2\2\u0091\u0093\5&\24\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00aa\7\34"+
		"\2\2\u0095\u0096\7\3\2\2\u0096\u0097\7\26\2\2\u0097\u009c\7\25\2\2\u0098"+
		"\u0099\7\35\2\2\u0099\u009b\5&\24\2\u009a\u0098\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0\u00aa\7\34\2\2\u00a1\u00a2\7"+
		"\3\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00aa\7\27\2\2"+
		"\u00a5\u00a6\5&\24\2\u00a6\u00a7\7\34\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa"+
		"\7\34\2\2\u00a9y\3\2\2\2\u00a9}\3\2\2\2\u00a9\u0080\3\2\2\2\u00a9\u0085"+
		"\3\2\2\2\u00a9\u008c\3\2\2\2\u00a9\u0090\3\2\2\2\u00a9\u0095\3\2\2\2\u00a9"+
		"\u00a1\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa!\3\2\2\2"+
		"\u00ab\u00ac\5\22\n\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\7\34\2\2\u00ae"+
		"#\3\2\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\7\27\2"+
		"\2\u00b2%\3\2\2\2\u00b3\u00b4\b\24\1\2\u00b4\u00b5\7\13\2\2\u00b5\u00c6"+
		"\5*\26\2\u00b6\u00b7\7\22\2\2\u00b7\u00b9\7\26\2\2\u00b8\u00ba\5(\25\2"+
		"\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c6"+
		"\7\27\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00be\5&\24\2\u00be\u00bf\7\27\2"+
		"\2\u00bf\u00c6\3\2\2\2\u00c0\u00c6\7\17\2\2\u00c1\u00c6\7\23\2\2\u00c2"+
		"\u00c6\7\24\2\2\u00c3\u00c6\7\22\2\2\u00c4\u00c6\7\4\2\2\u00c5\u00b3\3"+
		"\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5"+
		"\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6\u00d4\3\2\2\2\u00c7\u00c8\f\f\2\2\u00c8\u00c9\7\36\2\2\u00c9"+
		"\u00d3\7\22\2\2\u00ca\u00cb\f\13\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd"+
		"\7\22\2\2\u00cd\u00cf\7\26\2\2\u00ce\u00d0\5(\25\2\u00cf\u00ce\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\27\2\2\u00d2\u00c7"+
		"\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\'\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc\5&\24\2"+
		"\u00d8\u00d9\7\35\2\2\u00d9\u00db\5&\24\2\u00da\u00d8\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd)\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7\22\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\7"+
		"\27\2\2\u00e2+\3\2\2\2\24/=EM\\erw\u008a\u0092\u009c\u00a9\u00b9\u00c5"+
		"\u00cf\u00d2\u00d4\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
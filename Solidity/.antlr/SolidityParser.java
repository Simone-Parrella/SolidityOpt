// Generated from c:/Users/simon/Documents/GitHub/SolidityProject/Solidity/Solidity.g4 by ANTLR 4.13.1

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, VersionLiteral=91, LiteralBooleano=92, NumeroDecimale=93, 
		NumeroEsadecimale=94, UnitaNumero=95, LiteralEsadecimale=96, ReservedKeyword=97, 
		AnonymousKeyword=98, BreakKeyword=99, ConstantKeyword=100, ContinueKeyword=101, 
		ExternalKeyword=102, IndexedKeyword=103, InternalKeyword=104, PayableKeyword=105, 
		PrivateKeyword=106, PublicKeyword=107, PureKeyword=108, TypeKeyword=109, 
		ViewKeyword=110, OverrideKeyword=111, Int=112, Uint=113, Byte=114, Fixed=115, 
		Ufixed=116, Identifier=117, AND=118, OR=119, NOT=120, LiteralStringa=121, 
		WS=122, COMMENTO=123, COMMENTO_LINEA=124;
	public static final int
		RULE_sourceUnit = 0, RULE_pragma = 1, RULE_nomePragma = 2, RULE_valorePragma = 3, 
		RULE_versione = 4, RULE_operatoreVersione = 5, RULE_vincoloVersione = 6, 
		RULE_dichiarazioneImport = 7, RULE_imports = 8, RULE_definizioneContratto = 9, 
		RULE_inheritanceSpecifier = 10, RULE_parteDiContratto = 11, RULE_assegnazioneVariabile = 12, 
		RULE_usingForDeclaration = 13, RULE_definizioneStruct = 14, RULE_definizioneCostruttore = 15, 
		RULE_definizioneModifier = 16, RULE_invocazioneModifier = 17, RULE_definizioneFunzione = 18, 
		RULE_definizioneErrore = 19, RULE_valoreRitorno = 20, RULE_listaModifier = 21, 
		RULE_definizioneEvento = 22, RULE_valoreEnum = 23, RULE_definizioneEnum = 24, 
		RULE_listaParametri = 25, RULE_parametro = 26, RULE_listaParametriEvent = 27, 
		RULE_parametriEvent = 28, RULE_listaParametriFunzione = 29, RULE_parametroFunzione = 30, 
		RULE_dichiarazioneVariabile = 31, RULE_nomeTipo = 32, RULE_tipiDefinitiUtente = 33, 
		RULE_mapping = 34, RULE_functionTypeName = 35, RULE_tipoStorage = 36, 
		RULE_stateMutability = 37, RULE_block = 38, RULE_assemblyBlock = 39, RULE_statement = 40, 
		RULE_expressionStatement = 41, RULE_ifStatement = 42, RULE_whileStatement = 43, 
		RULE_simpleStatement = 44, RULE_forStatement = 45, RULE_doWhileStatement = 46, 
		RULE_continueStatement = 47, RULE_breakStatement = 48, RULE_returnStatement = 49, 
		RULE_throwStatement = 50, RULE_emitStatement = 51, RULE_assemblyStatement = 52, 
		RULE_tryCatchStatement = 53, RULE_listaCatch = 54, RULE_catchBlock = 55, 
		RULE_dichiarazioneVariabileStatement = 56, RULE_listaDichiarazioneVariabili = 57, 
		RULE_listaIdentifier = 58, RULE_expression = 59, RULE_primaryExpression = 60, 
		RULE_listaExpression = 61, RULE_listaNameValue = 62, RULE_listaSalt = 63, 
		RULE_nameValue = 64, RULE_argomentiChiamataFunzione = 65, RULE_chiamataFunzione = 66, 
		RULE_tupleExpression = 67, RULE_tipiExpression = 68, RULE_valoreNumerico = 69, 
		RULE_identificatore = 70, RULE_tipiPrimitivi = 71, RULE_array = 72, RULE_incremento = 73, 
		RULE_decremento = 74, RULE_operatoriSomma = 75, RULE_potenza = 76, RULE_operatoriMoltiplicazione = 77, 
		RULE_operatoriRelazionali = 78, RULE_operatoriConfrontoDiretto = 79, RULE_puntoVirgola = 80, 
		RULE_operatoriAssegnazione = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragma", "nomePragma", "valorePragma", "versione", "operatoreVersione", 
			"vincoloVersione", "dichiarazioneImport", "imports", "definizioneContratto", 
			"inheritanceSpecifier", "parteDiContratto", "assegnazioneVariabile", 
			"usingForDeclaration", "definizioneStruct", "definizioneCostruttore", 
			"definizioneModifier", "invocazioneModifier", "definizioneFunzione", 
			"definizioneErrore", "valoreRitorno", "listaModifier", "definizioneEvento", 
			"valoreEnum", "definizioneEnum", "listaParametri", "parametro", "listaParametriEvent", 
			"parametriEvent", "listaParametriFunzione", "parametroFunzione", "dichiarazioneVariabile", 
			"nomeTipo", "tipiDefinitiUtente", "mapping", "functionTypeName", "tipoStorage", 
			"stateMutability", "block", "assemblyBlock", "statement", "expressionStatement", 
			"ifStatement", "whileStatement", "simpleStatement", "forStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "returnStatement", "throwStatement", 
			"emitStatement", "assemblyStatement", "tryCatchStatement", "listaCatch", 
			"catchBlock", "dichiarazioneVariabileStatement", "listaDichiarazioneVariabili", 
			"listaIdentifier", "expression", "primaryExpression", "listaExpression", 
			"listaNameValue", "listaSalt", "nameValue", "argomentiChiamataFunzione", 
			"chiamataFunzione", "tupleExpression", "tipiExpression", "valoreNumerico", 
			"identificatore", "tipiPrimitivi", "array", "incremento", "decremento", 
			"operatoriSomma", "potenza", "operatoriMoltiplicazione", "operatoriRelazionali", 
			"operatoriConfrontoDiretto", "puntoVirgola", "operatoriAssegnazione"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", "'='", 
			"'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'abstract'", 
			"'contract'", "'interface'", "'library'", "'is'", "'('", "')'", "'immutable'", 
			"'using'", "'for'", "'struct'", "'constructor'", "'modifier'", "'function'", 
			"'error'", "'returns'", "'event'", "'enum'", "'['", "']'", "'address'", 
			"'.'", "'mapping'", "'=>'", "'memory'", "'storage'", "'calldata'", "'assembly'", 
			"'if'", "'else'", "'while'", "'do'", "'return'", "'throw'", "'emit'", 
			"'let'", "':='", "'try'", "'catch'", "'Error'", "'Panic'", "'var'", "'new'", 
			"'after'", "'delete'", "'<<'", "'>>'", "'&'", "'|'", "'?'", "':'", "'salt'", 
			"'bool'", "'string'", "'byte'", "'++'", "'--'", "'+'", "'-'", "'**'", 
			"'/'", "'%'", "'=='", "'!='", "';'", "'|='", "'^='", "'&='", "'<<='", 
			"'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", null, null, null, null, 
			null, null, null, "'anonymous'", "'break'", "'constant'", "'continue'", 
			"'external'", "'indexed'", "'internal'", "'payable'", "'private'", "'public'", 
			"'pure'", "'type'", "'view'", "'override'", null, null, null, null, null, 
			null, "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "VersionLiteral", "LiteralBooleano", 
			"NumeroDecimale", "NumeroEsadecimale", "UnitaNumero", "LiteralEsadecimale", 
			"ReservedKeyword", "AnonymousKeyword", "BreakKeyword", "ConstantKeyword", 
			"ContinueKeyword", "ExternalKeyword", "IndexedKeyword", "InternalKeyword", 
			"PayableKeyword", "PrivateKeyword", "PublicKeyword", "PureKeyword", "TypeKeyword", 
			"ViewKeyword", "OverrideKeyword", "Int", "Uint", "Byte", "Fixed", "Ufixed", 
			"Identifier", "AND", "OR", "NOT", "LiteralStringa", "WS", "COMMENTO", 
			"COMMENTO_LINEA"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<DefinizioneContrattoContext> definizioneContratto() {
			return getRuleContexts(DefinizioneContrattoContext.class);
		}
		public DefinizioneContrattoContext definizioneContratto(int i) {
			return getRuleContext(DefinizioneContrattoContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 984066L) != 0)) {
				{
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(164);
					pragma();
					}
					break;
				case T__9:
					{
					setState(165);
					imports();
					}
					break;
				case T__15:
				case T__16:
				case T__17:
				case T__18:
					{
					setState(166);
					definizioneContratto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaContext extends ParserRuleContext {
		public NomePragmaContext nomePragma() {
			return getRuleContext(NomePragmaContext.class,0);
		}
		public ValorePragmaContext valorePragma() {
			return getRuleContext(ValorePragmaContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__0);
			setState(175);
			nomePragma();
			setState(176);
			valorePragma();
			setState(177);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NomePragmaContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public NomePragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomePragma; }
	}

	public final NomePragmaContext nomePragma() throws RecognitionException {
		NomePragmaContext _localctx = new NomePragmaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nomePragma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorePragmaContext extends ParserRuleContext {
		public VersioneContext versione() {
			return getRuleContext(VersioneContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValorePragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorePragma; }
	}

	public final ValorePragmaContext valorePragma() throws RecognitionException {
		ValorePragmaContext _localctx = new ValorePragmaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valorePragma);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				versione();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VersioneContext extends ParserRuleContext {
		public List<VincoloVersioneContext> vincoloVersione() {
			return getRuleContexts(VincoloVersioneContext.class);
		}
		public VincoloVersioneContext vincoloVersione(int i) {
			return getRuleContext(VincoloVersioneContext.class,i);
		}
		public VersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versione; }
	}

	public final VersioneContext versione() throws RecognitionException {
		VersioneContext _localctx = new VersioneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_versione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			vincoloVersione();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 508L) != 0) || _la==VersionLiteral) {
				{
				setState(186);
				vincoloVersione();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoreVersioneContext extends ParserRuleContext {
		public OperatoreVersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoreVersione; }
	}

	public final OperatoreVersioneContext operatoreVersione() throws RecognitionException {
		OperatoreVersioneContext _localctx = new OperatoreVersioneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operatoreVersione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 508L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VincoloVersioneContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public OperatoreVersioneContext operatoreVersione() {
			return getRuleContext(OperatoreVersioneContext.class,0);
		}
		public VincoloVersioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vincoloVersione; }
	}

	public final VincoloVersioneContext vincoloVersione() throws RecognitionException {
		VincoloVersioneContext _localctx = new VincoloVersioneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vincoloVersione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 508L) != 0)) {
				{
				setState(191);
				operatoreVersione();
				}
			}

			setState(194);
			match(VersionLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DichiarazioneImportContext extends ParserRuleContext {
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public DichiarazioneImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneImport; }
	}

	public final DichiarazioneImportContext dichiarazioneImport() throws RecognitionException {
		DichiarazioneImportContext _localctx = new DichiarazioneImportContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dichiarazioneImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			identificatore();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(197);
				match(T__8);
				setState(198);
				identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode LiteralStringa() { return getToken(SolidityParser.LiteralStringa, 0); }
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public List<DichiarazioneImportContext> dichiarazioneImport() {
			return getRuleContexts(DichiarazioneImportContext.class);
		}
		public DichiarazioneImportContext dichiarazioneImport(int i) {
			return getRuleContext(DichiarazioneImportContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_imports);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__9);
				setState(202);
				match(LiteralStringa);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(203);
					match(T__8);
					setState(204);
					identificatore();
					}
				}

				setState(207);
				puntoVirgola();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__9);
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(209);
					match(T__10);
					}
					break;
				case T__11:
				case T__41:
				case Identifier:
					{
					setState(210);
					identificatore();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(213);
					match(T__8);
					setState(214);
					identificatore();
					}
				}

				setState(217);
				match(T__11);
				setState(218);
				match(LiteralStringa);
				setState(219);
				puntoVirgola();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__9);
				setState(221);
				match(T__12);
				setState(222);
				dichiarazioneImport();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(223);
					match(T__13);
					setState(224);
					dichiarazioneImport();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				match(T__14);
				setState(231);
				match(T__11);
				setState(232);
				match(LiteralStringa);
				setState(233);
				puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneContrattoContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ParteDiContrattoContext> parteDiContratto() {
			return getRuleContexts(ParteDiContrattoContext.class);
		}
		public ParteDiContrattoContext parteDiContratto(int i) {
			return getRuleContext(ParteDiContrattoContext.class,i);
		}
		public DefinizioneContrattoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneContratto; }
	}

	public final DefinizioneContrattoContext definizioneContratto() throws RecognitionException {
		DefinizioneContrattoContext _localctx = new DefinizioneContrattoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definizioneContratto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(237);
				match(T__15);
				}
			}

			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(242);
			identificatore();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(243);
				match(T__19);
				setState(244);
				inheritanceSpecifier();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(245);
					match(T__13);
					setState(246);
					inheritanceSpecifier();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(254);
			match(T__12);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119944701808640L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
				{
				{
				setState(255);
				parteDiContratto();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			tipiDefinitiUtente();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(264);
				match(T__20);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
					{
					setState(265);
					listaExpression();
					}
				}

				setState(268);
				match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParteDiContrattoContext extends ParserRuleContext {
		public AssegnazioneVariabileContext assegnazioneVariabile() {
			return getRuleContext(AssegnazioneVariabileContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public DefinizioneStructContext definizioneStruct() {
			return getRuleContext(DefinizioneStructContext.class,0);
		}
		public DefinizioneCostruttoreContext definizioneCostruttore() {
			return getRuleContext(DefinizioneCostruttoreContext.class,0);
		}
		public DefinizioneModifierContext definizioneModifier() {
			return getRuleContext(DefinizioneModifierContext.class,0);
		}
		public DefinizioneFunzioneContext definizioneFunzione() {
			return getRuleContext(DefinizioneFunzioneContext.class,0);
		}
		public DefinizioneErroreContext definizioneErrore() {
			return getRuleContext(DefinizioneErroreContext.class,0);
		}
		public DefinizioneEventoContext definizioneEvento() {
			return getRuleContext(DefinizioneEventoContext.class,0);
		}
		public DefinizioneEnumContext definizioneEnum() {
			return getRuleContext(DefinizioneEnumContext.class,0);
		}
		public ParteDiContrattoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parteDiContratto; }
	}

	public final ParteDiContrattoContext parteDiContratto() throws RecognitionException {
		ParteDiContrattoContext _localctx = new ParteDiContrattoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parteDiContratto);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				assegnazioneVariabile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				definizioneStruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				definizioneCostruttore();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				definizioneModifier();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				definizioneFunzione();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				definizioneErrore();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				definizioneEvento();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(279);
				definizioneEnum();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssegnazioneVariabileContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> OverrideKeyword() { return getTokens(SolidityParser.OverrideKeyword); }
		public TerminalNode OverrideKeyword(int i) {
			return getToken(SolidityParser.OverrideKeyword, i);
		}
		public AssegnazioneVariabileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assegnazioneVariabile; }
	}

	public final AssegnazioneVariabileContext assegnazioneVariabile() throws RecognitionException {
		AssegnazioneVariabileContext _localctx = new AssegnazioneVariabileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assegnazioneVariabile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			nomeTipo(0);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 2257L) != 0)) {
				{
				{
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==T__22 || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 2257L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			identificatore();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(290);
				match(T__7);
				setState(291);
				expression(0);
				}
			}

			setState(294);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__23);
			setState(297);
			identificatore();
			setState(298);
			match(T__24);
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(299);
				match(T__10);
				}
				break;
			case T__11:
			case T__28:
			case T__35:
			case T__37:
			case T__41:
			case T__56:
			case T__67:
			case T__68:
			case T__69:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(300);
				nomeTipo(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(303);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneStructContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<DichiarazioneVariabileContext> dichiarazioneVariabile() {
			return getRuleContexts(DichiarazioneVariabileContext.class);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile(int i) {
			return getRuleContext(DichiarazioneVariabileContext.class,i);
		}
		public List<PuntoVirgolaContext> puntoVirgola() {
			return getRuleContexts(PuntoVirgolaContext.class);
		}
		public PuntoVirgolaContext puntoVirgola(int i) {
			return getRuleContext(PuntoVirgolaContext.class,i);
		}
		public DefinizioneStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneStruct; }
	}

	public final DefinizioneStructContext definizioneStruct() throws RecognitionException {
		DefinizioneStructContext _localctx = new DefinizioneStructContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definizioneStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__25);
			setState(306);
			identificatore();
			setState(307);
			match(T__12);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119930256625664L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
				{
				setState(308);
				dichiarazioneVariabile();
				setState(309);
				puntoVirgola();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119930256625664L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
					{
					{
					setState(310);
					dichiarazioneVariabile();
					setState(311);
					puntoVirgola();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(320);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneCostruttoreContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ListaModifierContext listaModifier() {
			return getRuleContext(ListaModifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefinizioneCostruttoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneCostruttore; }
	}

	public final DefinizioneCostruttoreContext definizioneCostruttore() throws RecognitionException {
		DefinizioneCostruttoreContext _localctx = new DefinizioneCostruttoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_definizioneCostruttore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__26);
			setState(323);
			listaParametri();
			setState(324);
			listaModifier();
			setState(325);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneModifierContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public DefinizioneModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneModifier; }
	}

	public final DefinizioneModifierContext definizioneModifier() throws RecognitionException {
		DefinizioneModifierContext _localctx = new DefinizioneModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definizioneModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__27);
			setState(328);
			identificatore();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(329);
				listaParametri();
				}
			}

			setState(332);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InvocazioneModifierContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public InvocazioneModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocazioneModifier; }
	}

	public final InvocazioneModifierContext invocazioneModifier() throws RecognitionException {
		InvocazioneModifierContext _localctx = new InvocazioneModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_invocazioneModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			identificatore();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(335);
				match(T__20);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
					{
					setState(336);
					listaExpression();
					}
				}

				setState(339);
				match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneFunzioneContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ListaModifierContext listaModifier() {
			return getRuleContext(ListaModifierContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ValoreRitornoContext valoreRitorno() {
			return getRuleContext(ValoreRitornoContext.class,0);
		}
		public DefinizioneFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneFunzione; }
	}

	public final DefinizioneFunzioneContext definizioneFunzione() throws RecognitionException {
		DefinizioneFunzioneContext _localctx = new DefinizioneFunzioneContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definizioneFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__28);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__41 || _la==Identifier) {
				{
				setState(343);
				identificatore();
				}
			}

			setState(346);
			listaParametri();
			setState(347);
			listaModifier();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(348);
				valoreRitorno();
				}
			}

			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__79:
				{
				setState(351);
				puntoVirgola();
				}
				break;
			case T__12:
				{
				setState(352);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneErroreContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public DefinizioneErroreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneErrore; }
	}

	public final DefinizioneErroreContext definizioneErrore() throws RecognitionException {
		DefinizioneErroreContext _localctx = new DefinizioneErroreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definizioneErrore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__29);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__41 || _la==Identifier) {
				{
				setState(356);
				identificatore();
				}
			}

			setState(359);
			listaParametri();
			setState(360);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoreRitornoContext extends ParserRuleContext {
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ValoreRitornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreRitorno; }
	}

	public final ValoreRitornoContext valoreRitorno() throws RecognitionException {
		ValoreRitornoContext _localctx = new ValoreRitornoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valoreRitorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__30);
			setState(363);
			listaParametri();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaModifierContext extends ParserRuleContext {
		public List<InvocazioneModifierContext> invocazioneModifier() {
			return getRuleContexts(InvocazioneModifierContext.class);
		}
		public InvocazioneModifierContext invocazioneModifier(int i) {
			return getRuleContext(InvocazioneModifierContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> OverrideKeyword() { return getTokens(SolidityParser.OverrideKeyword); }
		public TerminalNode OverrideKeyword(int i) {
			return getToken(SolidityParser.OverrideKeyword, i);
		}
		public ListaModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaModifier; }
	}

	public final ListaModifierContext listaModifier() throws RecognitionException {
		ListaModifierContext _localctx = new ListaModifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listaModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398054903808L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 134645L) != 0)) {
				{
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(365);
					invocazioneModifier();
					}
					break;
				case 2:
					{
					setState(366);
					stateMutability();
					}
					break;
				case 3:
					{
					setState(367);
					match(ExternalKeyword);
					}
					break;
				case 4:
					{
					setState(368);
					match(PublicKeyword);
					}
					break;
				case 5:
					{
					setState(369);
					match(InternalKeyword);
					}
					break;
				case 6:
					{
					setState(370);
					match(PrivateKeyword);
					}
					break;
				case 7:
					{
					setState(371);
					match(ConstantKeyword);
					}
					break;
				case 8:
					{
					setState(372);
					match(OverrideKeyword);
					}
					break;
				case 9:
					{
					setState(373);
					match(T__22);
					}
					break;
				}
				}
				setState(378);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneEventoContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaParametriEventContext listaParametriEvent() {
			return getRuleContext(ListaParametriEventContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public DefinizioneEventoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneEvento; }
	}

	public final DefinizioneEventoContext definizioneEvento() throws RecognitionException {
		DefinizioneEventoContext _localctx = new DefinizioneEventoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_definizioneEvento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__31);
			setState(380);
			identificatore();
			setState(381);
			listaParametriEvent();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(382);
				match(AnonymousKeyword);
				}
			}

			setState(385);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoreEnumContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ValoreEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreEnum; }
	}

	public final ValoreEnumContext valoreEnum() throws RecognitionException {
		ValoreEnumContext _localctx = new ValoreEnumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valoreEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinizioneEnumContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public List<ValoreEnumContext> valoreEnum() {
			return getRuleContexts(ValoreEnumContext.class);
		}
		public ValoreEnumContext valoreEnum(int i) {
			return getRuleContext(ValoreEnumContext.class,i);
		}
		public DefinizioneEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definizioneEnum; }
	}

	public final DefinizioneEnumContext definizioneEnum() throws RecognitionException {
		DefinizioneEnumContext _localctx = new DefinizioneEnumContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_definizioneEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__32);
			setState(390);
			identificatore();
			setState(391);
			match(T__12);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__41 || _la==Identifier) {
				{
				setState(392);
				valoreEnum();
				}
			}

			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(395);
				match(T__13);
				setState(396);
				valoreEnum();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametriContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ListaParametriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametri; }
	}

	public final ListaParametriContext listaParametri() throws RecognitionException {
		ListaParametriContext _localctx = new ListaParametriContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listaParametri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__20);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119930256625664L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
				{
				setState(405);
				parametro();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(406);
					match(T__13);
					setState(407);
					parametro();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(415);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			nomeTipo(0);
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(418);
				tipoStorage();
				}
				break;
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__41 || _la==Identifier) {
				{
				setState(421);
				identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametriEventContext extends ParserRuleContext {
		public List<ParametriEventContext> parametriEvent() {
			return getRuleContexts(ParametriEventContext.class);
		}
		public ParametriEventContext parametriEvent(int i) {
			return getRuleContext(ParametriEventContext.class,i);
		}
		public ListaParametriEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametriEvent; }
	}

	public final ListaParametriEventContext listaParametriEvent() throws RecognitionException {
		ListaParametriEventContext _localctx = new ListaParametriEventContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaParametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__20);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119930256625664L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
				{
				setState(425);
				parametriEvent();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(426);
					match(T__13);
					setState(427);
					parametriEvent();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(435);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametriEventContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ParametriEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametriEvent; }
	}

	public final ParametriEventContext parametriEvent() throws RecognitionException {
		ParametriEventContext _localctx = new ParametriEventContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametriEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			nomeTipo(0);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(438);
				match(IndexedKeyword);
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__41 || _la==Identifier) {
				{
				setState(441);
				identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametriFunzioneContext extends ParserRuleContext {
		public List<ParametroFunzioneContext> parametroFunzione() {
			return getRuleContexts(ParametroFunzioneContext.class);
		}
		public ParametroFunzioneContext parametroFunzione(int i) {
			return getRuleContext(ParametroFunzioneContext.class,i);
		}
		public ListaParametriFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametriFunzione; }
	}

	public final ListaParametriFunzioneContext listaParametriFunzione() throws RecognitionException {
		ListaParametriFunzioneContext _localctx = new ListaParametriFunzioneContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listaParametriFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__20);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119930256625664L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
				{
				setState(445);
				parametroFunzione();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(446);
					match(T__13);
					setState(447);
					parametroFunzione();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(455);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroFunzioneContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public ParametroFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroFunzione; }
	}

	public final ParametroFunzioneContext parametroFunzione() throws RecognitionException {
		ParametroFunzioneContext _localctx = new ParametroFunzioneContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parametroFunzione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			nomeTipo(0);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) {
				{
				setState(458);
				tipoStorage();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DichiarazioneVariabileContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public TipoStorageContext tipoStorage() {
			return getRuleContext(TipoStorageContext.class,0);
		}
		public DichiarazioneVariabileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneVariabile; }
	}

	public final DichiarazioneVariabileContext dichiarazioneVariabile() throws RecognitionException {
		DichiarazioneVariabileContext _localctx = new DichiarazioneVariabileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dichiarazioneVariabile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			nomeTipo(0);
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(462);
				tipoStorage();
				}
				break;
			}
			setState(465);
			identificatore();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NomeTipoContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NomeTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeTipo; }
	}

	public final NomeTipoContext nomeTipo() throws RecognitionException {
		return nomeTipo(0);
	}

	private NomeTipoContext nomeTipo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NomeTipoContext _localctx = new NomeTipoContext(_ctx, _parentState);
		NomeTipoContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_nomeTipo, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(468);
				tipiPrimitivi();
				}
				break;
			case 2:
				{
				setState(469);
				tipiDefinitiUtente();
				}
				break;
			case 3:
				{
				setState(470);
				mapping();
				}
				break;
			case 4:
				{
				setState(471);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(472);
				match(T__35);
				setState(473);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NomeTipoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nomeTipo);
					setState(476);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(477);
					match(T__33);
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
						{
						setState(478);
						expression(0);
						}
					}

					setState(481);
					match(T__34);
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipiDefinitiUtenteContext extends ParserRuleContext {
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public TipiDefinitiUtenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiDefinitiUtente; }
	}

	public final TipiDefinitiUtenteContext tipiDefinitiUtente() throws RecognitionException {
		TipiDefinitiUtenteContext _localctx = new TipiDefinitiUtenteContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tipiDefinitiUtente);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			identificatore();
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(488);
					match(T__36);
					setState(489);
					identificatore();
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MappingContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__37);
			setState(496);
			match(T__20);
			setState(497);
			tipiPrimitivi();
			setState(498);
			match(T__38);
			setState(499);
			nomeTipo(0);
			setState(500);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<ListaParametriFunzioneContext> listaParametriFunzione() {
			return getRuleContexts(ListaParametriFunzioneContext.class);
		}
		public ListaParametriFunzioneContext listaParametriFunzione(int i) {
			return getRuleContext(ListaParametriFunzioneContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__28);
			setState(503);
			listaParametriFunzione();
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(507);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(504);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(505);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(506);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(512);
				match(T__30);
				setState(513);
				listaParametriFunzione();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoStorageContext extends ParserRuleContext {
		public TipoStorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoStorage; }
	}

	public final TipoStorageContext tipoStorage() throws RecognitionException {
		TipoStorageContext _localctx = new TipoStorageContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tipoStorage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 1313L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(T__12);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2172947599137452040L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621316749459583L) != 0)) {
				{
				{
				setState(521);
				statement();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyStatementContext> assemblyStatement() {
			return getRuleContexts(AssemblyStatementContext.class);
		}
		public AssemblyStatementContext assemblyStatement(int i) {
			return getRuleContext(AssemblyStatementContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__42);
			setState(530);
			match(T__12);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2282586709692416L) != 0) || _la==Identifier) {
				{
				{
				setState(531);
				assemblyStatement();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				assemblyBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(545);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(546);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(547);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(548);
				throwStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(549);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(550);
				simpleStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(551);
				tryCatchStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(552);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			expression(0);
			setState(556);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T__43);
			setState(559);
			match(T__20);
			setState(560);
			expression(0);
			setState(561);
			match(T__21);
			setState(562);
			statement();
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(563);
				match(T__44);
				setState(564);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(T__45);
			setState(568);
			match(T__20);
			setState(569);
			expression(0);
			setState(570);
			match(T__21);
			setState(571);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public DichiarazioneVariabileStatementContext dichiarazioneVariabileStatement() {
			return getRuleContext(DichiarazioneVariabileStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(573);
				dichiarazioneVariabileStatement();
				}
				break;
			case 2:
				{
				setState(574);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<PuntoVirgolaContext> puntoVirgola() {
			return getRuleContexts(PuntoVirgolaContext.class);
		}
		public PuntoVirgolaContext puntoVirgola(int i) {
			return getRuleContext(PuntoVirgolaContext.class,i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__24);
			setState(578);
			match(T__20);
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__20:
			case T__28:
			case T__33:
			case T__35:
			case T__37:
			case T__41:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case NOT:
			case LiteralStringa:
				{
				setState(579);
				simpleStatement();
				}
				break;
			case T__79:
				{
				setState(580);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__20:
			case T__33:
			case T__35:
			case T__41:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case NOT:
			case LiteralStringa:
				{
				setState(583);
				expressionStatement();
				}
				break;
			case T__79:
				{
				setState(584);
				puntoVirgola();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
				{
				setState(587);
				expression(0);
				}
			}

			setState(590);
			match(T__21);
			setState(591);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(T__46);
			setState(594);
			statement();
			setState(595);
			match(T__45);
			setState(596);
			match(T__20);
			setState(597);
			expression(0);
			setState(598);
			match(T__21);
			setState(599);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ContinueKeyword);
			setState(602);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(BreakKeyword);
			setState(605);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T__47);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
				{
				setState(608);
				expression(0);
				}
			}

			setState(611);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(T__48);
			setState(614);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmitStatementContext extends ParserRuleContext {
		public ChiamataFunzioneContext chiamataFunzione() {
			return getRuleContext(ChiamataFunzioneContext.class,0);
		}
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T__49);
			setState(617);
			chiamataFunzione();
			setState(618);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyStatementContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStatement; }
	}

	public final AssemblyStatementContext assemblyStatement() throws RecognitionException {
		AssemblyStatementContext _localctx = new AssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assemblyStatement);
		int _la;
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				identificatore();
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(621);
					listaParametri();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				match(T__50);
				setState(625);
				identificatore();
				setState(626);
				match(T__51);
				setState(627);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				identificatore();
				setState(630);
				match(T__51);
				setState(631);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				match(T__43);
				setState(634);
				expression(0);
				setState(635);
				assemblyBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(637);
				assemblyBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(638);
				match(T__24);
				setState(639);
				assemblyBlock();
				setState(640);
				assemblyBlock();
				setState(641);
				assemblyBlock();
				setState(642);
				assemblyBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(644);
				match(T__28);
				setState(645);
				identificatore();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(646);
					listaParametri();
					}
				}

				setState(649);
				assemblyBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ListaCatchContext listaCatch() {
			return getRuleContext(ListaCatchContext.class,0);
		}
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T__52);
			setState(654);
			expression(0);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(655);
				match(T__30);
				setState(656);
				listaParametri();
				}
			}

			setState(659);
			block();
			setState(660);
			listaCatch();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaCatchContext extends ParserRuleContext {
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public ListaCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCatch; }
	}

	public final ListaCatchContext listaCatch() throws RecognitionException {
		ListaCatchContext _localctx = new ListaCatchContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_listaCatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(662);
				catchBlock();
				}
				}
				setState(665); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__53 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ListaParametriContext listaParametri() {
			return getRuleContext(ListaParametriContext.class,0);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(T__53);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54 || _la==T__55) {
				{
				setState(668);
				_la = _input.LA(1);
				if ( !(_la==T__54 || _la==T__55) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(671);
				listaParametri();
				}
			}

			setState(674);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DichiarazioneVariabileStatementContext extends ParserRuleContext {
		public PuntoVirgolaContext puntoVirgola() {
			return getRuleContext(PuntoVirgolaContext.class,0);
		}
		public ListaIdentifierContext listaIdentifier() {
			return getRuleContext(ListaIdentifierContext.class,0);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile() {
			return getRuleContext(DichiarazioneVariabileContext.class,0);
		}
		public ListaDichiarazioneVariabiliContext listaDichiarazioneVariabili() {
			return getRuleContext(ListaDichiarazioneVariabiliContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DichiarazioneVariabileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dichiarazioneVariabileStatement; }
	}

	public final DichiarazioneVariabileStatementContext dichiarazioneVariabileStatement() throws RecognitionException {
		DichiarazioneVariabileStatementContext _localctx = new DichiarazioneVariabileStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dichiarazioneVariabileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(676);
				match(T__56);
				setState(677);
				listaIdentifier();
				}
				break;
			case 2:
				{
				setState(678);
				dichiarazioneVariabile();
				}
				break;
			case 3:
				{
				setState(679);
				match(T__20);
				setState(680);
				listaDichiarazioneVariabili();
				setState(681);
				match(T__21);
				}
				break;
			}
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(685);
				match(T__7);
				setState(686);
				expression(0);
				}
			}

			setState(689);
			puntoVirgola();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDichiarazioneVariabiliContext extends ParserRuleContext {
		public List<DichiarazioneVariabileContext> dichiarazioneVariabile() {
			return getRuleContexts(DichiarazioneVariabileContext.class);
		}
		public DichiarazioneVariabileContext dichiarazioneVariabile(int i) {
			return getRuleContext(DichiarazioneVariabileContext.class,i);
		}
		public ListaDichiarazioneVariabiliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDichiarazioneVariabili; }
	}

	public final ListaDichiarazioneVariabiliContext listaDichiarazioneVariabili() throws RecognitionException {
		ListaDichiarazioneVariabiliContext _localctx = new ListaDichiarazioneVariabiliContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_listaDichiarazioneVariabili);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119930256625664L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
				{
				setState(691);
				dichiarazioneVariabile();
				}
			}

			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(694);
				match(T__13);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 144119930256625664L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 1108307720798215L) != 0)) {
					{
					setState(695);
					dichiarazioneVariabile();
					}
				}

				}
				}
				setState(702);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdentifierContext extends ParserRuleContext {
		public List<IdentificatoreContext> identificatore() {
			return getRuleContexts(IdentificatoreContext.class);
		}
		public IdentificatoreContext identificatore(int i) {
			return getRuleContext(IdentificatoreContext.class,i);
		}
		public ListaIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdentifier; }
	}

	public final ListaIdentifierContext listaIdentifier() throws RecognitionException {
		ListaIdentifierContext _localctx = new ListaIdentifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_listaIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__20);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__11 || _la==T__41 || _la==Identifier) {
						{
						setState(704);
						identificatore();
						}
					}

					setState(707);
					match(T__13);
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__41 || _la==Identifier) {
				{
				setState(713);
				identificatore();
				}
			}

			setState(716);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public NomeTipoContext nomeTipo() {
			return getRuleContext(NomeTipoContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public DecrementoContext decremento() {
			return getRuleContext(DecrementoContext.class,0);
		}
		public OperatoriSommaContext operatoriSomma() {
			return getRuleContext(OperatoriSommaContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SolidityParser.NOT, 0); }
		public ListaSaltContext listaSalt() {
			return getRuleContext(ListaSaltContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PotenzaContext potenza() {
			return getRuleContext(PotenzaContext.class,0);
		}
		public OperatoriMoltiplicazioneContext operatoriMoltiplicazione() {
			return getRuleContext(OperatoriMoltiplicazioneContext.class,0);
		}
		public OperatoriRelazionaliContext operatoriRelazionali() {
			return getRuleContext(OperatoriRelazionaliContext.class,0);
		}
		public OperatoriConfrontoDirettoContext operatoriConfrontoDiretto() {
			return getRuleContext(OperatoriConfrontoDirettoContext.class,0);
		}
		public TerminalNode AND() { return getToken(SolidityParser.AND, 0); }
		public TerminalNode OR() { return getToken(SolidityParser.OR, 0); }
		public OperatoriAssegnazioneContext operatoriAssegnazione() {
			return getRuleContext(OperatoriAssegnazioneContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
		}
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(719);
				match(T__57);
				setState(720);
				nomeTipo(0);
				}
				break;
			case 2:
				{
				setState(721);
				match(T__20);
				setState(722);
				expression(0);
				setState(723);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(727);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__70:
					{
					setState(725);
					incremento();
					}
					break;
				case T__71:
					{
					setState(726);
					decremento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(729);
				expression(20);
				}
				break;
			case 4:
				{
				{
				setState(731);
				operatoriSomma();
				}
				setState(732);
				expression(19);
				}
				break;
			case 5:
				{
				setState(734);
				_la = _input.LA(1);
				if ( !(_la==T__58 || _la==T__59) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(735);
				expression(18);
				}
				break;
			case 6:
				{
				setState(736);
				match(NOT);
				setState(737);
				expression(17);
				}
				break;
			case 7:
				{
				setState(738);
				match(T__2);
				setState(739);
				expression(16);
				}
				break;
			case 8:
				{
				setState(740);
				match(T__57);
				setState(741);
				nomeTipo(0);
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(742);
					match(T__12);
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__66) {
						{
						setState(743);
						listaSalt();
						}
					}

					setState(746);
					match(T__14);
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(749);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(752);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(753);
						potenza();
						setState(754);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(756);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						{
						setState(757);
						operatoriMoltiplicazione();
						}
						setState(758);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						{
						setState(761);
						operatoriSomma();
						}
						setState(762);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(764);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(765);
						_la = _input.LA(1);
						if ( !(_la==T__60 || _la==T__61) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(766);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(767);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(768);
						match(T__62);
						setState(769);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(770);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(771);
						match(T__1);
						setState(772);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(773);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(774);
						match(T__63);
						setState(775);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(776);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(777);
						operatoriRelazionali();
						}
						setState(778);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(780);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(781);
						operatoriConfrontoDiretto();
						}
						setState(782);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(784);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(785);
						match(AND);
						setState(786);
						expression(7);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(787);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(788);
						match(OR);
						setState(789);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(791);
						match(T__64);
						setState(792);
						expression(0);
						setState(793);
						match(T__65);
						setState(794);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(797);
						operatoriAssegnazione();
						}
						setState(798);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(800);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(803);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__70:
							{
							setState(801);
							incremento();
							}
							break;
						case T__71:
							{
							setState(802);
							decremento();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(805);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(806);
						match(T__33);
						setState(807);
						expression(0);
						setState(808);
						match(T__34);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(810);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(811);
						match(T__20);
						setState(812);
						argomentiChiamataFunzione();
						setState(813);
						match(T__21);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(815);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(816);
						match(T__36);
						setState(817);
						identificatore();
						}
						break;
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode LiteralBooleano() { return getToken(SolidityParser.LiteralBooleano, 0); }
		public ValoreNumericoContext valoreNumerico() {
			return getRuleContext(ValoreNumericoContext.class,0);
		}
		public TerminalNode LiteralEsadecimale() { return getToken(SolidityParser.LiteralEsadecimale, 0); }
		public TerminalNode LiteralStringa() { return getToken(SolidityParser.LiteralStringa, 0); }
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TipiExpressionContext tipiExpression() {
			return getRuleContext(TipiExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_primaryExpression);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(LiteralBooleano);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				valoreNumerico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				match(LiteralEsadecimale);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				match(LiteralStringa);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				identificatore();
				setState(830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(828);
					match(T__33);
					setState(829);
					match(T__34);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(832);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(833);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(834);
				tipiExpression();
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(835);
					match(T__33);
					setState(836);
					match(T__34);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpression; }
	}

	public final ListaExpressionContext listaExpression() throws RecognitionException {
		ListaExpressionContext _localctx = new ListaExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_listaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			expression(0);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(842);
				match(T__13);
				setState(843);
				expression(0);
				}
				}
				setState(848);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaNameValueContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public ListaNameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaNameValue; }
	}

	public final ListaNameValueContext listaNameValue() throws RecognitionException {
		ListaNameValueContext _localctx = new ListaNameValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_listaNameValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			nameValue();
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(850);
					match(T__13);
					setState(851);
					nameValue();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(857);
				match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaSaltContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListaSaltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSalt; }
	}

	public final ListaSaltContext listaSalt() throws RecognitionException {
		ListaSaltContext _localctx = new ListaSaltContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_listaSalt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(T__66);
			setState(861);
			match(T__65);
			setState(862);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameValueContext extends ParserRuleContext {
		public IdentificatoreContext identificatore() {
			return getRuleContext(IdentificatoreContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			identificatore();
			setState(865);
			match(T__65);
			setState(866);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgomentiChiamataFunzioneContext extends ParserRuleContext {
		public ListaNameValueContext listaNameValue() {
			return getRuleContext(ListaNameValueContext.class,0);
		}
		public ListaExpressionContext listaExpression() {
			return getRuleContext(ListaExpressionContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argomentiChiamataFunzione; }
	}

	public final ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() throws RecognitionException {
		ArgomentiChiamataFunzioneContext _localctx = new ArgomentiChiamataFunzioneContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_argomentiChiamataFunzione);
		int _la;
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(T__12);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11 || _la==T__41 || _la==Identifier) {
					{
					setState(869);
					listaNameValue();
					}
				}

				setState(872);
				match(T__14);
				}
				break;
			case T__2:
			case T__11:
			case T__20:
			case T__21:
			case T__33:
			case T__35:
			case T__41:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case LiteralBooleano:
			case NumeroDecimale:
			case NumeroEsadecimale:
			case LiteralEsadecimale:
			case TypeKeyword:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
			case NOT:
			case LiteralStringa:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
					{
					setState(873);
					listaExpression();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChiamataFunzioneContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgomentiChiamataFunzioneContext argomentiChiamataFunzione() {
			return getRuleContext(ArgomentiChiamataFunzioneContext.class,0);
		}
		public ChiamataFunzioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chiamataFunzione; }
	}

	public final ChiamataFunzioneContext chiamataFunzione() throws RecognitionException {
		ChiamataFunzioneContext _localctx = new ChiamataFunzioneContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_chiamataFunzione);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			expression(0);
			setState(879);
			match(T__20);
			setState(880);
			argomentiChiamataFunzione();
			setState(881);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tupleExpression);
		int _la;
		try {
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(T__20);
				{
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
					{
					setState(884);
					expression(0);
					}
				}

				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(887);
					match(T__13);
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
						{
						setState(888);
						expression(0);
						}
					}

					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(896);
				match(T__21);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				match(T__33);
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161732305085796360L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 14621306012041343L) != 0)) {
					{
					setState(898);
					expression(0);
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(899);
						match(T__13);
						setState(900);
						expression(0);
						}
						}
						setState(905);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(908);
				match(T__34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipiExpressionContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public TipiDefinitiUtenteContext tipiDefinitiUtente() {
			return getRuleContext(TipiDefinitiUtenteContext.class,0);
		}
		public TipiExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiExpression; }
	}

	public final TipiExpressionContext tipiExpression() throws RecognitionException {
		TipiExpressionContext _localctx = new TipiExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tipiExpression);
		try {
			setState(913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__56:
			case T__67:
			case T__68:
			case T__69:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				tipiPrimitivi();
				}
				break;
			case T__11:
			case T__41:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				tipiDefinitiUtente();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoreNumericoContext extends ParserRuleContext {
		public TerminalNode NumeroDecimale() { return getToken(SolidityParser.NumeroDecimale, 0); }
		public TerminalNode NumeroEsadecimale() { return getToken(SolidityParser.NumeroEsadecimale, 0); }
		public TerminalNode UnitaNumero() { return getToken(SolidityParser.UnitaNumero, 0); }
		public ValoreNumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoreNumerico; }
	}

	public final ValoreNumericoContext valoreNumerico() throws RecognitionException {
		ValoreNumericoContext _localctx = new ValoreNumericoContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_valoreNumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_la = _input.LA(1);
			if ( !(_la==NumeroDecimale || _la==NumeroEsadecimale) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(916);
				match(UnitaNumero);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificatoreContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentificatoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificatore; }
	}

	public final IdentificatoreContext identificatore() throws RecognitionException {
		IdentificatoreContext _localctx = new IdentificatoreContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identificatore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__41 || _la==Identifier) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipiPrimitiviContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public TipiPrimitiviContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipiPrimitivi; }
	}

	public final TipiPrimitiviContext tipiPrimitivi() throws RecognitionException {
		TipiPrimitiviContext _localctx = new TipiPrimitiviContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tipiPrimitivi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__56 || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 545357767376903L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TipiPrimitiviContext tipiPrimitivi() {
			return getRuleContext(TipiPrimitiviContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			tipiPrimitivi();
			setState(924);
			match(T__33);
			setState(925);
			match(T__34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends ParserRuleContext {
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(T__70);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecrementoContext extends ParserRuleContext {
		public DecrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decremento; }
	}

	public final DecrementoContext decremento() throws RecognitionException {
		DecrementoContext _localctx = new DecrementoContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_decremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(T__71);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriSommaContext extends ParserRuleContext {
		public OperatoriSommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriSomma; }
	}

	public final OperatoriSommaContext operatoriSomma() throws RecognitionException {
		OperatoriSommaContext _localctx = new OperatoriSommaContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_operatoriSomma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_la = _input.LA(1);
			if ( !(_la==T__72 || _la==T__73) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PotenzaContext extends ParserRuleContext {
		public PotenzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenza; }
	}

	public final PotenzaContext potenza() throws RecognitionException {
		PotenzaContext _localctx = new PotenzaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_potenza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(T__74);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriMoltiplicazioneContext extends ParserRuleContext {
		public OperatoriMoltiplicazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriMoltiplicazione; }
	}

	public final OperatoriMoltiplicazioneContext operatoriMoltiplicazione() throws RecognitionException {
		OperatoriMoltiplicazioneContext _localctx = new OperatoriMoltiplicazioneContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_operatoriMoltiplicazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__75 || _la==T__76) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriRelazionaliContext extends ParserRuleContext {
		public OperatoriRelazionaliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriRelazionali; }
	}

	public final OperatoriRelazionaliContext operatoriRelazionali() throws RecognitionException {
		OperatoriRelazionaliContext _localctx = new OperatoriRelazionaliContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_operatoriRelazionali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriConfrontoDirettoContext extends ParserRuleContext {
		public OperatoriConfrontoDirettoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriConfrontoDiretto; }
	}

	public final OperatoriConfrontoDirettoContext operatoriConfrontoDiretto() throws RecognitionException {
		OperatoriConfrontoDirettoContext _localctx = new OperatoriConfrontoDirettoContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_operatoriConfrontoDiretto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( !(_la==T__77 || _la==T__78) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PuntoVirgolaContext extends ParserRuleContext {
		public PuntoVirgolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntoVirgola; }
	}

	public final PuntoVirgolaContext puntoVirgola() throws RecognitionException {
		PuntoVirgolaContext _localctx = new PuntoVirgolaContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_puntoVirgola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(T__79);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatoriAssegnazioneContext extends ParserRuleContext {
		public OperatoriAssegnazioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatoriAssegnazione; }
	}

	public final OperatoriAssegnazioneContext operatoriAssegnazione() throws RecognitionException {
		OperatoriAssegnazioneContext _localctx = new OperatoriAssegnazioneContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_operatoriAssegnazione);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if ( !(_la==T__7 || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 1023L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return nomeTipo_sempred((NomeTipoContext)_localctx, predIndex);
		case 59:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nomeTipo_sempred(NomeTipoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 24);
		case 16:
			return precpred(_ctx, 23);
		case 17:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001|\u03b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u00a8\b\u0000\n\u0000\f\u0000\u00ab\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00b8\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00bc\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0003"+
		"\u0006\u00c1\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00c8\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00ce\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d4\b\b\u0001\b"+
		"\u0001\b\u0003\b\u00d8\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00e2\b\b\n\b\f\b\u00e5\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00ec\b\b\u0001\t\u0003\t\u00ef\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00f8\b\t\n"+
		"\t\f\t\u00fb\t\t\u0003\t\u00fd\b\t\u0001\t\u0001\t\u0005\t\u0101\b\t\n"+
		"\t\f\t\u0104\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u010b"+
		"\b\n\u0001\n\u0003\n\u010e\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0119\b\u000b\u0001\f\u0001\f\u0005\f\u011d\b\f\n\f\f\f\u0120\t"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0125\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u012e\b\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u013a\b\u000e\n\u000e\f\u000e\u013d\t\u000e\u0003"+
		"\u000e\u013f\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u014b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0152\b\u0011\u0001\u0011\u0003\u0011\u0155\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0159\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u015e\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0162\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0166\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0177\b\u0015\n\u0015\f\u0015"+
		"\u017a\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0180\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u018a\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u018e\b\u0018\n\u0018\f\u0018\u0191\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0199\b\u0019\n\u0019\f\u0019\u019c\t\u0019\u0003\u0019\u019e\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01a4"+
		"\b\u001a\u0001\u001a\u0003\u001a\u01a7\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u01ad\b\u001b\n\u001b\f\u001b\u01b0"+
		"\t\u001b\u0003\u001b\u01b2\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01b8\b\u001c\u0001\u001c\u0003\u001c\u01bb\b"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01c1"+
		"\b\u001d\n\u001d\f\u001d\u01c4\t\u001d\u0003\u001d\u01c6\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01cc\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01d0\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01db\b \u0001 \u0001"+
		" \u0001 \u0003 \u01e0\b \u0001 \u0005 \u01e3\b \n \f \u01e6\t \u0001!"+
		"\u0001!\u0001!\u0005!\u01eb\b!\n!\f!\u01ee\t!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u01fc\b#\n#\f#\u01ff\t#\u0001#\u0001#\u0003#\u0203\b#\u0001$\u0001$"+
		"\u0001%\u0001%\u0001&\u0001&\u0005&\u020b\b&\n&\f&\u020e\t&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u0215\b\'\n\'\f\'\u0218\t\'\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u022a\b(\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0236\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0003,\u0240\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u0246\b-\u0001-\u0001-\u0003-\u024a\b-\u0001"+
		"-\u0003-\u024d\b-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"1\u00011\u00031\u0262\b1\u00011\u00011\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00034\u026f\b4\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u0288\b4\u00014\u00014\u00034\u028c\b4\u00015\u00015\u00015\u00015\u0003"+
		"5\u0292\b5\u00015\u00015\u00015\u00016\u00046\u0298\b6\u000b6\f6\u0299"+
		"\u00017\u00017\u00037\u029e\b7\u00017\u00037\u02a1\b7\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u02ac\b8\u00018\u0001"+
		"8\u00038\u02b0\b8\u00018\u00018\u00019\u00039\u02b5\b9\u00019\u00019\u0003"+
		"9\u02b9\b9\u00059\u02bb\b9\n9\f9\u02be\t9\u0001:\u0001:\u0003:\u02c2\b"+
		":\u0001:\u0005:\u02c5\b:\n:\f:\u02c8\t:\u0001:\u0003:\u02cb\b:\u0001:"+
		"\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u02d8\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u02e9\b;\u0001"+
		";\u0003;\u02ec\b;\u0001;\u0003;\u02ef\b;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0324\b;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0005;\u0333\b;\n;\f;\u0336\t;\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u033f\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u0346\b<\u0003<\u0348\b<\u0001=\u0001=\u0001=\u0005=\u034d\b=\n=\f="+
		"\u0350\t=\u0001>\u0001>\u0001>\u0005>\u0355\b>\n>\f>\u0358\t>\u0001>\u0003"+
		">\u035b\b>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"A\u0001A\u0003A\u0367\bA\u0001A\u0001A\u0003A\u036b\bA\u0003A\u036d\b"+
		"A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0003C\u0376\bC\u0001"+
		"C\u0001C\u0003C\u037a\bC\u0005C\u037c\bC\nC\fC\u037f\tC\u0001C\u0001C"+
		"\u0001C\u0001C\u0001C\u0005C\u0386\bC\nC\fC\u0389\tC\u0003C\u038b\bC\u0001"+
		"C\u0003C\u038e\bC\u0001D\u0001D\u0003D\u0392\bD\u0001E\u0001E\u0003E\u0396"+
		"\bE\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001"+
		"I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001M\u0001M\u0001N\u0001"+
		"N\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0000\u0002@vR\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u0000\u0010\u0001\u0000\u0002\b\u0001\u0000\u0011\u0013"+
		"\u0005\u0000\u0017\u0017ddhhjkoo\u0001\u0000(*\u0004\u0000ddiillnn\u0001"+
		"\u000078\u0001\u0000;<\u0001\u0000=>\u0001\u0000]^\u0003\u0000\f\f**u"+
		"u\u0004\u0000$$99DFpt\u0001\u0000IJ\u0002\u0000\u000b\u000bLM\u0001\u0000"+
		"\u0004\u0007\u0001\u0000NO\u0002\u0000\b\bQZ\u0407\u0000\u00a9\u0001\u0000"+
		"\u0000\u0000\u0002\u00ae\u0001\u0000\u0000\u0000\u0004\u00b3\u0001\u0000"+
		"\u0000\u0000\u0006\u00b7\u0001\u0000\u0000\u0000\b\u00b9\u0001\u0000\u0000"+
		"\u0000\n\u00bd\u0001\u0000\u0000\u0000\f\u00c0\u0001\u0000\u0000\u0000"+
		"\u000e\u00c4\u0001\u0000\u0000\u0000\u0010\u00eb\u0001\u0000\u0000\u0000"+
		"\u0012\u00ee\u0001\u0000\u0000\u0000\u0014\u0107\u0001\u0000\u0000\u0000"+
		"\u0016\u0118\u0001\u0000\u0000\u0000\u0018\u011a\u0001\u0000\u0000\u0000"+
		"\u001a\u0128\u0001\u0000\u0000\u0000\u001c\u0131\u0001\u0000\u0000\u0000"+
		"\u001e\u0142\u0001\u0000\u0000\u0000 \u0147\u0001\u0000\u0000\u0000\""+
		"\u014e\u0001\u0000\u0000\u0000$\u0156\u0001\u0000\u0000\u0000&\u0163\u0001"+
		"\u0000\u0000\u0000(\u016a\u0001\u0000\u0000\u0000*\u0178\u0001\u0000\u0000"+
		"\u0000,\u017b\u0001\u0000\u0000\u0000.\u0183\u0001\u0000\u0000\u00000"+
		"\u0185\u0001\u0000\u0000\u00002\u0194\u0001\u0000\u0000\u00004\u01a1\u0001"+
		"\u0000\u0000\u00006\u01a8\u0001\u0000\u0000\u00008\u01b5\u0001\u0000\u0000"+
		"\u0000:\u01bc\u0001\u0000\u0000\u0000<\u01c9\u0001\u0000\u0000\u0000>"+
		"\u01cd\u0001\u0000\u0000\u0000@\u01da\u0001\u0000\u0000\u0000B\u01e7\u0001"+
		"\u0000\u0000\u0000D\u01ef\u0001\u0000\u0000\u0000F\u01f6\u0001\u0000\u0000"+
		"\u0000H\u0204\u0001\u0000\u0000\u0000J\u0206\u0001\u0000\u0000\u0000L"+
		"\u0208\u0001\u0000\u0000\u0000N\u0211\u0001\u0000\u0000\u0000P\u0229\u0001"+
		"\u0000\u0000\u0000R\u022b\u0001\u0000\u0000\u0000T\u022e\u0001\u0000\u0000"+
		"\u0000V\u0237\u0001\u0000\u0000\u0000X\u023f\u0001\u0000\u0000\u0000Z"+
		"\u0241\u0001\u0000\u0000\u0000\\\u0251\u0001\u0000\u0000\u0000^\u0259"+
		"\u0001\u0000\u0000\u0000`\u025c\u0001\u0000\u0000\u0000b\u025f\u0001\u0000"+
		"\u0000\u0000d\u0265\u0001\u0000\u0000\u0000f\u0268\u0001\u0000\u0000\u0000"+
		"h\u028b\u0001\u0000\u0000\u0000j\u028d\u0001\u0000\u0000\u0000l\u0297"+
		"\u0001\u0000\u0000\u0000n\u029b\u0001\u0000\u0000\u0000p\u02ab\u0001\u0000"+
		"\u0000\u0000r\u02b4\u0001\u0000\u0000\u0000t\u02bf\u0001\u0000\u0000\u0000"+
		"v\u02ee\u0001\u0000\u0000\u0000x\u0347\u0001\u0000\u0000\u0000z\u0349"+
		"\u0001\u0000\u0000\u0000|\u0351\u0001\u0000\u0000\u0000~\u035c\u0001\u0000"+
		"\u0000\u0000\u0080\u0360\u0001\u0000\u0000\u0000\u0082\u036c\u0001\u0000"+
		"\u0000\u0000\u0084\u036e\u0001\u0000\u0000\u0000\u0086\u038d\u0001\u0000"+
		"\u0000\u0000\u0088\u0391\u0001\u0000\u0000\u0000\u008a\u0393\u0001\u0000"+
		"\u0000\u0000\u008c\u0397\u0001\u0000\u0000\u0000\u008e\u0399\u0001\u0000"+
		"\u0000\u0000\u0090\u039b\u0001\u0000\u0000\u0000\u0092\u039f\u0001\u0000"+
		"\u0000\u0000\u0094\u03a1\u0001\u0000\u0000\u0000\u0096\u03a3\u0001\u0000"+
		"\u0000\u0000\u0098\u03a5\u0001\u0000\u0000\u0000\u009a\u03a7\u0001\u0000"+
		"\u0000\u0000\u009c\u03a9\u0001\u0000\u0000\u0000\u009e\u03ab\u0001\u0000"+
		"\u0000\u0000\u00a0\u03ad\u0001\u0000\u0000\u0000\u00a2\u03af\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a8\u0003\u0002\u0001\u0000\u00a5\u00a8\u0003\u0010"+
		"\b\u0000\u00a6\u00a8\u0003\u0012\t\u0000\u00a7\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0000\u0000"+
		"\u0001\u00ad\u0001\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0001\u0000"+
		"\u0000\u00af\u00b0\u0003\u0004\u0002\u0000\u00b0\u00b1\u0003\u0006\u0003"+
		"\u0000\u00b1\u00b2\u0003\u00a0P\u0000\u00b2\u0003\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0003\u008cF\u0000\u00b4\u0005\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0003\b\u0004\u0000\u00b6\u00b8\u0003v;\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u0007\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0003\f\u0006\u0000\u00ba\u00bc\u0003\f"+
		"\u0006\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\t\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\u0000\u0000"+
		"\u0000\u00be\u000b\u0001\u0000\u0000\u0000\u00bf\u00c1\u0003\n\u0005\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005[\u0000\u0000\u00c3"+
		"\r\u0001\u0000\u0000\u0000\u00c4\u00c7\u0003\u008cF\u0000\u00c5\u00c6"+
		"\u0005\t\u0000\u0000\u00c6\u00c8\u0003\u008cF\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u000f\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005\n\u0000\u0000\u00ca\u00cd\u0005y"+
		"\u0000\u0000\u00cb\u00cc\u0005\t\u0000\u0000\u00cc\u00ce\u0003\u008cF"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00ec\u0003\u00a0P\u0000"+
		"\u00d0\u00d3\u0005\n\u0000\u0000\u00d1\u00d4\u0005\u000b\u0000\u0000\u00d2"+
		"\u00d4\u0003\u008cF\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\t\u0000\u0000\u00d6\u00d8\u0003\u008cF\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\f\u0000\u0000\u00da\u00db\u0005y"+
		"\u0000\u0000\u00db\u00ec\u0003\u00a0P\u0000\u00dc\u00dd\u0005\n\u0000"+
		"\u0000\u00dd\u00de\u0005\r\u0000\u0000\u00de\u00e3\u0003\u000e\u0007\u0000"+
		"\u00df\u00e0\u0005\u000e\u0000\u0000\u00e0\u00e2\u0003\u000e\u0007\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u000f\u0000\u0000\u00e7\u00e8\u0005\f\u0000\u0000\u00e8"+
		"\u00e9\u0005y\u0000\u0000\u00e9\u00ea\u0003\u00a0P\u0000\u00ea\u00ec\u0001"+
		"\u0000\u0000\u0000\u00eb\u00c9\u0001\u0000\u0000\u0000\u00eb\u00d0\u0001"+
		"\u0000\u0000\u0000\u00eb\u00dc\u0001\u0000\u0000\u0000\u00ec\u0011\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0005\u0010\u0000\u0000\u00ee\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0007\u0001\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00fc\u0003\u008cF\u0000\u00f3\u00f4\u0005\u0014"+
		"\u0000\u0000\u00f4\u00f9\u0003\u0014\n\u0000\u00f5\u00f6\u0005\u000e\u0000"+
		"\u0000\u00f6\u00f8\u0003\u0014\n\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u0102\u0005\r\u0000\u0000\u00ff\u0101\u0003\u0016\u000b\u0000\u0100"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005\u000f\u0000\u0000\u0106\u0013\u0001\u0000\u0000\u0000\u0107"+
		"\u010d\u0003B!\u0000\u0108\u010a\u0005\u0015\u0000\u0000\u0109\u010b\u0003"+
		"z=\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0005\u0016\u0000"+
		"\u0000\u010d\u0108\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0015\u0001\u0000\u0000\u0000\u010f\u0119\u0003\u0018\f\u0000"+
		"\u0110\u0119\u0003\u001a\r\u0000\u0111\u0119\u0003\u001c\u000e\u0000\u0112"+
		"\u0119\u0003\u001e\u000f\u0000\u0113\u0119\u0003 \u0010\u0000\u0114\u0119"+
		"\u0003$\u0012\u0000\u0115\u0119\u0003&\u0013\u0000\u0116\u0119\u0003,"+
		"\u0016\u0000\u0117\u0119\u00030\u0018\u0000\u0118\u010f\u0001\u0000\u0000"+
		"\u0000\u0118\u0110\u0001\u0000\u0000\u0000\u0118\u0111\u0001\u0000\u0000"+
		"\u0000\u0118\u0112\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000"+
		"\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0118\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u0017\u0001\u0000\u0000\u0000\u011a\u011e\u0003@ \u0000\u011b"+
		"\u011d\u0007\u0002\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0124\u0003\u008cF\u0000\u0122\u0123"+
		"\u0005\b\u0000\u0000\u0123\u0125\u0003v;\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003\u00a0P\u0000\u0127\u0019\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0005\u0018\u0000\u0000\u0129\u012a\u0003\u008cF\u0000"+
		"\u012a\u012d\u0005\u0019\u0000\u0000\u012b\u012e\u0005\u000b\u0000\u0000"+
		"\u012c\u012e\u0003@ \u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0003\u00a0P\u0000\u0130\u001b\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"\u001a\u0000\u0000\u0132\u0133\u0003\u008cF\u0000\u0133\u013e\u0005\r"+
		"\u0000\u0000\u0134\u0135\u0003>\u001f\u0000\u0135\u013b\u0003\u00a0P\u0000"+
		"\u0136\u0137\u0003>\u001f\u0000\u0137\u0138\u0003\u00a0P\u0000\u0138\u013a"+
		"\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u0134\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005\u000f\u0000\u0000\u0141\u001d\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u001b\u0000\u0000\u0143\u0144\u00032\u0019\u0000\u0144\u0145\u0003"+
		"*\u0015\u0000\u0145\u0146\u0003L&\u0000\u0146\u001f\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u001c\u0000\u0000\u0148\u014a\u0003\u008cF\u0000"+
		"\u0149\u014b\u00032\u0019\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0003L&\u0000\u014d!\u0001\u0000\u0000\u0000\u014e\u0154\u0003"+
		"\u008cF\u0000\u014f\u0151\u0005\u0015\u0000\u0000\u0150\u0152\u0003z="+
		"\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0005\u0016\u0000"+
		"\u0000\u0154\u014f\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155#\u0001\u0000\u0000\u0000\u0156\u0158\u0005\u001d\u0000\u0000"+
		"\u0157\u0159\u0003\u008cF\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u00032\u0019\u0000\u015b\u015d\u0003*\u0015\u0000\u015c\u015e\u0003"+
		"(\u0014\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u0162\u0003\u00a0"+
		"P\u0000\u0160\u0162\u0003L&\u0000\u0161\u015f\u0001\u0000\u0000\u0000"+
		"\u0161\u0160\u0001\u0000\u0000\u0000\u0162%\u0001\u0000\u0000\u0000\u0163"+
		"\u0165\u0005\u001e\u0000\u0000\u0164\u0166\u0003\u008cF\u0000\u0165\u0164"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0168\u00032\u0019\u0000\u0168\u0169\u0003"+
		"\u00a0P\u0000\u0169\'\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u001f"+
		"\u0000\u0000\u016b\u016c\u00032\u0019\u0000\u016c)\u0001\u0000\u0000\u0000"+
		"\u016d\u0177\u0003\"\u0011\u0000\u016e\u0177\u0003J%\u0000\u016f\u0177"+
		"\u0005f\u0000\u0000\u0170\u0177\u0005k\u0000\u0000\u0171\u0177\u0005h"+
		"\u0000\u0000\u0172\u0177\u0005j\u0000\u0000\u0173\u0177\u0005d\u0000\u0000"+
		"\u0174\u0177\u0005o\u0000\u0000\u0175\u0177\u0005\u0017\u0000\u0000\u0176"+
		"\u016d\u0001\u0000\u0000\u0000\u0176\u016e\u0001\u0000\u0000\u0000\u0176"+
		"\u016f\u0001\u0000\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176"+
		"\u0171\u0001\u0000\u0000\u0000\u0176\u0172\u0001\u0000\u0000\u0000\u0176"+
		"\u0173\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179"+
		"+\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0005 \u0000\u0000\u017c\u017d\u0003\u008cF\u0000\u017d\u017f\u00036"+
		"\u001b\u0000\u017e\u0180\u0005b\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0003\u00a0P\u0000\u0182-\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0003\u008cF\u0000\u0184/\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"!\u0000\u0000\u0186\u0187\u0003\u008cF\u0000\u0187\u0189\u0005\r\u0000"+
		"\u0000\u0188\u018a\u0003.\u0017\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018f\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005\u000e\u0000\u0000\u018c\u018e\u0003.\u0017\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f"+
		"\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0192\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0005\u000f\u0000\u0000\u01931\u0001\u0000\u0000\u0000\u0194\u019d"+
		"\u0005\u0015\u0000\u0000\u0195\u019a\u00034\u001a\u0000\u0196\u0197\u0005"+
		"\u000e\u0000\u0000\u0197\u0199\u00034\u001a\u0000\u0198\u0196\u0001\u0000"+
		"\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u0195\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0005\u0016\u0000\u0000\u01a03\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a3\u0003@ \u0000\u01a2\u01a4\u0003H$\u0000\u01a3\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003\u008cF\u0000\u01a6\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a75\u0001\u0000"+
		"\u0000\u0000\u01a8\u01b1\u0005\u0015\u0000\u0000\u01a9\u01ae\u00038\u001c"+
		"\u0000\u01aa\u01ab\u0005\u000e\u0000\u0000\u01ab\u01ad\u00038\u001c\u0000"+
		"\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000"+
		"\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b1\u01a9\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u0016\u0000\u0000"+
		"\u01b47\u0001\u0000\u0000\u0000\u01b5\u01b7\u0003@ \u0000\u01b6\u01b8"+
		"\u0005g\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003"+
		"\u008cF\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb9\u0001\u0000\u0000\u0000\u01bc\u01c5\u0005\u0015\u0000"+
		"\u0000\u01bd\u01c2\u0003<\u001e\u0000\u01be\u01bf\u0005\u000e\u0000\u0000"+
		"\u01bf\u01c1\u0003<\u001e\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c5\u01bd\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0005\u0016\u0000\u0000\u01c8;\u0001\u0000\u0000\u0000\u01c9\u01cb"+
		"\u0003@ \u0000\u01ca\u01cc\u0003H$\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc=\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0003@ \u0000\u01ce\u01d0\u0003H$\u0000\u01cf\u01ce\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0003\u008cF\u0000\u01d2?\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0006 \uffff\uffff\u0000\u01d4\u01db\u0003\u008eG\u0000"+
		"\u01d5\u01db\u0003B!\u0000\u01d6\u01db\u0003D\"\u0000\u01d7\u01db\u0003"+
		"F#\u0000\u01d8\u01d9\u0005$\u0000\u0000\u01d9\u01db\u0005i\u0000\u0000"+
		"\u01da\u01d3\u0001\u0000\u0000\u0000\u01da\u01d5\u0001\u0000\u0000\u0000"+
		"\u01da\u01d6\u0001\u0000\u0000\u0000\u01da\u01d7\u0001\u0000\u0000\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01e4\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\n\u0003\u0000\u0000\u01dd\u01df\u0005\"\u0000\u0000\u01de"+
		"\u01e0\u0003v;\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0005"+
		"#\u0000\u0000\u01e2\u01dc\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5A\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e7\u01ec\u0003\u008cF\u0000\u01e8\u01e9\u0005%\u0000\u0000\u01e9"+
		"\u01eb\u0003\u008cF\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0001\u0000\u0000\u0000\u01edC\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0005&\u0000\u0000\u01f0\u01f1\u0005\u0015"+
		"\u0000\u0000\u01f1\u01f2\u0003\u008eG\u0000\u01f2\u01f3\u0005\'\u0000"+
		"\u0000\u01f3\u01f4\u0003@ \u0000\u01f4\u01f5\u0005\u0016\u0000\u0000\u01f5"+
		"E\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u001d\u0000\u0000\u01f7\u01fd"+
		"\u0003:\u001d\u0000\u01f8\u01fc\u0005h\u0000\u0000\u01f9\u01fc\u0005f"+
		"\u0000\u0000\u01fa\u01fc\u0003J%\u0000\u01fb\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0202\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0201\u0005\u001f\u0000\u0000"+
		"\u0201\u0203\u0003:\u001d\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203G\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0007\u0003\u0000\u0000\u0205I\u0001\u0000\u0000\u0000\u0206\u0207\u0007"+
		"\u0004\u0000\u0000\u0207K\u0001\u0000\u0000\u0000\u0208\u020c\u0005\r"+
		"\u0000\u0000\u0209\u020b\u0003P(\u0000\u020a\u0209\u0001\u0000\u0000\u0000"+
		"\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u000f\u0000\u0000"+
		"\u0210M\u0001\u0000\u0000\u0000\u0211\u0212\u0005+\u0000\u0000\u0212\u0216"+
		"\u0005\r\u0000\u0000\u0213\u0215\u0003h4\u0000\u0214\u0213\u0001\u0000"+
		"\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0219\u0001\u0000"+
		"\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021a\u0005\u000f"+
		"\u0000\u0000\u021aO\u0001\u0000\u0000\u0000\u021b\u022a\u0003T*\u0000"+
		"\u021c\u022a\u0003V+\u0000\u021d\u022a\u0003Z-\u0000\u021e\u022a\u0003"+
		"L&\u0000\u021f\u022a\u0003N\'\u0000\u0220\u022a\u0003\\.\u0000\u0221\u022a"+
		"\u0003^/\u0000\u0222\u022a\u0003`0\u0000\u0223\u022a\u0003b1\u0000\u0224"+
		"\u022a\u0003d2\u0000\u0225\u022a\u0003f3\u0000\u0226\u022a\u0003X,\u0000"+
		"\u0227\u022a\u0003j5\u0000\u0228\u022a\u0003R)\u0000\u0229\u021b\u0001"+
		"\u0000\u0000\u0000\u0229\u021c\u0001\u0000\u0000\u0000\u0229\u021d\u0001"+
		"\u0000\u0000\u0000\u0229\u021e\u0001\u0000\u0000\u0000\u0229\u021f\u0001"+
		"\u0000\u0000\u0000\u0229\u0220\u0001\u0000\u0000\u0000\u0229\u0221\u0001"+
		"\u0000\u0000\u0000\u0229\u0222\u0001\u0000\u0000\u0000\u0229\u0223\u0001"+
		"\u0000\u0000\u0000\u0229\u0224\u0001\u0000\u0000\u0000\u0229\u0225\u0001"+
		"\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022aQ\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0003v;\u0000\u022c\u022d\u0003\u00a0P\u0000"+
		"\u022dS\u0001\u0000\u0000\u0000\u022e\u022f\u0005,\u0000\u0000\u022f\u0230"+
		"\u0005\u0015\u0000\u0000\u0230\u0231\u0003v;\u0000\u0231\u0232\u0005\u0016"+
		"\u0000\u0000\u0232\u0235\u0003P(\u0000\u0233\u0234\u0005-\u0000\u0000"+
		"\u0234\u0236\u0003P(\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236U\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		".\u0000\u0000\u0238\u0239\u0005\u0015\u0000\u0000\u0239\u023a\u0003v;"+
		"\u0000\u023a\u023b\u0005\u0016\u0000\u0000\u023b\u023c\u0003P(\u0000\u023c"+
		"W\u0001\u0000\u0000\u0000\u023d\u0240\u0003p8\u0000\u023e\u0240\u0003"+
		"R)\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000"+
		"\u0000\u0240Y\u0001\u0000\u0000\u0000\u0241\u0242\u0005\u0019\u0000\u0000"+
		"\u0242\u0245\u0005\u0015\u0000\u0000\u0243\u0246\u0003X,\u0000\u0244\u0246"+
		"\u0003\u00a0P\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0244\u0001"+
		"\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u024a\u0003"+
		"R)\u0000\u0248\u024a\u0003\u00a0P\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000"+
		"\u0000\u024b\u024d\u0003v;\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0005\u0016\u0000\u0000\u024f\u0250\u0003P(\u0000\u0250[\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0005/\u0000\u0000\u0252\u0253\u0003P("+
		"\u0000\u0253\u0254\u0005.\u0000\u0000\u0254\u0255\u0005\u0015\u0000\u0000"+
		"\u0255\u0256\u0003v;\u0000\u0256\u0257\u0005\u0016\u0000\u0000\u0257\u0258"+
		"\u0003\u00a0P\u0000\u0258]\u0001\u0000\u0000\u0000\u0259\u025a\u0005e"+
		"\u0000\u0000\u025a\u025b\u0003\u00a0P\u0000\u025b_\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0005c\u0000\u0000\u025d\u025e\u0003\u00a0P\u0000\u025ea"+
		"\u0001\u0000\u0000\u0000\u025f\u0261\u00050\u0000\u0000\u0260\u0262\u0003"+
		"v;\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0003\u00a0P\u0000"+
		"\u0264c\u0001\u0000\u0000\u0000\u0265\u0266\u00051\u0000\u0000\u0266\u0267"+
		"\u0003\u00a0P\u0000\u0267e\u0001\u0000\u0000\u0000\u0268\u0269\u00052"+
		"\u0000\u0000\u0269\u026a\u0003\u0084B\u0000\u026a\u026b\u0003\u00a0P\u0000"+
		"\u026bg\u0001\u0000\u0000\u0000\u026c\u026e\u0003\u008cF\u0000\u026d\u026f"+
		"\u00032\u0019\u0000\u026e\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u028c\u0001\u0000\u0000\u0000\u0270\u0271\u0005"+
		"3\u0000\u0000\u0271\u0272\u0003\u008cF\u0000\u0272\u0273\u00054\u0000"+
		"\u0000\u0273\u0274\u0003v;\u0000\u0274\u028c\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0003\u008cF\u0000\u0276\u0277\u00054\u0000\u0000\u0277\u0278\u0003"+
		"v;\u0000\u0278\u028c\u0001\u0000\u0000\u0000\u0279\u027a\u0005,\u0000"+
		"\u0000\u027a\u027b\u0003v;\u0000\u027b\u027c\u0003N\'\u0000\u027c\u028c"+
		"\u0001\u0000\u0000\u0000\u027d\u028c\u0003N\'\u0000\u027e\u027f\u0005"+
		"\u0019\u0000\u0000\u027f\u0280\u0003N\'\u0000\u0280\u0281\u0003N\'\u0000"+
		"\u0281\u0282\u0003N\'\u0000\u0282\u0283\u0003N\'\u0000\u0283\u028c\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0005\u001d\u0000\u0000\u0285\u0287\u0003"+
		"\u008cF\u0000\u0286\u0288\u00032\u0019\u0000\u0287\u0286\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0003N\'\u0000\u028a\u028c\u0001\u0000\u0000\u0000"+
		"\u028b\u026c\u0001\u0000\u0000\u0000\u028b\u0270\u0001\u0000\u0000\u0000"+
		"\u028b\u0275\u0001\u0000\u0000\u0000\u028b\u0279\u0001\u0000\u0000\u0000"+
		"\u028b\u027d\u0001\u0000\u0000\u0000\u028b\u027e\u0001\u0000\u0000\u0000"+
		"\u028b\u0284\u0001\u0000\u0000\u0000\u028ci\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u00055\u0000\u0000\u028e\u0291\u0003v;\u0000\u028f\u0290\u0005"+
		"\u001f\u0000\u0000\u0290\u0292\u00032\u0019\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000"+
		"\u0000\u0000\u0293\u0294\u0003L&\u0000\u0294\u0295\u0003l6\u0000\u0295"+
		"k\u0001\u0000\u0000\u0000\u0296\u0298\u0003n7\u0000\u0297\u0296\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u0297\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029am\u0001\u0000"+
		"\u0000\u0000\u029b\u029d\u00056\u0000\u0000\u029c\u029e\u0007\u0005\u0000"+
		"\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u02a1\u00032\u0019\u0000"+
		"\u02a0\u029f\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a3\u0003L&\u0000\u02a3o"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u00059\u0000\u0000\u02a5\u02ac\u0003"+
		"t:\u0000\u02a6\u02ac\u0003>\u001f\u0000\u02a7\u02a8\u0005\u0015\u0000"+
		"\u0000\u02a8\u02a9\u0003r9\u0000\u02a9\u02aa\u0005\u0016\u0000\u0000\u02aa"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a4\u0001\u0000\u0000\u0000\u02ab"+
		"\u02a6\u0001\u0000\u0000\u0000\u02ab\u02a7\u0001\u0000\u0000\u0000\u02ac"+
		"\u02af\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005\b\u0000\u0000\u02ae\u02b0"+
		"\u0003v;\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003\u00a0"+
		"P\u0000\u02b2q\u0001\u0000\u0000\u0000\u02b3\u02b5\u0003>\u001f\u0000"+
		"\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b5\u02bc\u0001\u0000\u0000\u0000\u02b6\u02b8\u0005\u000e\u0000\u0000"+
		"\u02b7\u02b9\u0003>\u001f\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba"+
		"\u02b6\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd"+
		"s\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c6"+
		"\u0005\u0015\u0000\u0000\u02c0\u02c2\u0003\u008cF\u0000\u02c1\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c5\u0005\u000e\u0000\u0000\u02c4\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02ca\u0001"+
		"\u0000\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003"+
		"\u008cF\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005\u0016"+
		"\u0000\u0000\u02cdu\u0001\u0000\u0000\u0000\u02ce\u02cf\u0006;\uffff\uffff"+
		"\u0000\u02cf\u02d0\u0005:\u0000\u0000\u02d0\u02ef\u0003@ \u0000\u02d1"+
		"\u02d2\u0005\u0015\u0000\u0000\u02d2\u02d3\u0003v;\u0000\u02d3\u02d4\u0005"+
		"\u0016\u0000\u0000\u02d4\u02ef\u0001\u0000\u0000\u0000\u02d5\u02d8\u0003"+
		"\u0092I\u0000\u02d6\u02d8\u0003\u0094J\u0000\u02d7\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0003v;\u0014\u02da\u02ef\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0003\u0096K\u0000\u02dc\u02dd\u0003v;\u0013\u02dd\u02ef\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0007\u0006\u0000\u0000\u02df\u02ef\u0003"+
		"v;\u0012\u02e0\u02e1\u0005x\u0000\u0000\u02e1\u02ef\u0003v;\u0011\u02e2"+
		"\u02e3\u0005\u0003\u0000\u0000\u02e3\u02ef\u0003v;\u0010\u02e4\u02e5\u0005"+
		":\u0000\u0000\u02e5\u02eb\u0003@ \u0000\u02e6\u02e8\u0005\r\u0000\u0000"+
		"\u02e7\u02e9\u0003~?\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02ec"+
		"\u0005\u000f\u0000\u0000\u02eb\u02e6\u0001\u0000\u0000\u0000\u02eb\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02ef"+
		"\u0003x<\u0000\u02ee\u02ce\u0001\u0000\u0000\u0000\u02ee\u02d1\u0001\u0000"+
		"\u0000\u0000\u02ee\u02d7\u0001\u0000\u0000\u0000\u02ee\u02db\u0001\u0000"+
		"\u0000\u0000\u02ee\u02de\u0001\u0000\u0000\u0000\u02ee\u02e0\u0001\u0000"+
		"\u0000\u0000\u02ee\u02e2\u0001\u0000\u0000\u0000\u02ee\u02e4\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ef\u0334\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f1\n\u000f\u0000\u0000\u02f1\u02f2\u0003\u0098L"+
		"\u0000\u02f2\u02f3\u0003v;\u0010\u02f3\u0333\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\n\u000e\u0000\u0000\u02f5\u02f6\u0003\u009aM\u0000\u02f6\u02f7"+
		"\u0003v;\u000f\u02f7\u0333\u0001\u0000\u0000\u0000\u02f8\u02f9\n\r\u0000"+
		"\u0000\u02f9\u02fa\u0003\u0096K\u0000\u02fa\u02fb\u0003v;\u000e\u02fb"+
		"\u0333\u0001\u0000\u0000\u0000\u02fc\u02fd\n\f\u0000\u0000\u02fd\u02fe"+
		"\u0007\u0007\u0000\u0000\u02fe\u0333\u0003v;\r\u02ff\u0300\n\u000b\u0000"+
		"\u0000\u0300\u0301\u0005?\u0000\u0000\u0301\u0333\u0003v;\f\u0302\u0303"+
		"\n\n\u0000\u0000\u0303\u0304\u0005\u0002\u0000\u0000\u0304\u0333\u0003"+
		"v;\u000b\u0305\u0306\n\t\u0000\u0000\u0306\u0307\u0005@\u0000\u0000\u0307"+
		"\u0333\u0003v;\n\u0308\u0309\n\b\u0000\u0000\u0309\u030a\u0003\u009cN"+
		"\u0000\u030a\u030b\u0003v;\t\u030b\u0333\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\n\u0007\u0000\u0000\u030d\u030e\u0003\u009eO\u0000\u030e\u030f"+
		"\u0003v;\b\u030f\u0333\u0001\u0000\u0000\u0000\u0310\u0311\n\u0006\u0000"+
		"\u0000\u0311\u0312\u0005v\u0000\u0000\u0312\u0333\u0003v;\u0007\u0313"+
		"\u0314\n\u0005\u0000\u0000\u0314\u0315\u0005w\u0000\u0000\u0315\u0333"+
		"\u0003v;\u0006\u0316\u0317\n\u0004\u0000\u0000\u0317\u0318\u0005A\u0000"+
		"\u0000\u0318\u0319\u0003v;\u0000\u0319\u031a\u0005B\u0000\u0000\u031a"+
		"\u031b\u0003v;\u0005\u031b\u0333\u0001\u0000\u0000\u0000\u031c\u031d\n"+
		"\u0002\u0000\u0000\u031d\u031e\u0003\u00a2Q\u0000\u031e\u031f\u0003v;"+
		"\u0003\u031f\u0333\u0001\u0000\u0000\u0000\u0320\u0323\n\u001a\u0000\u0000"+
		"\u0321\u0324\u0003\u0092I\u0000\u0322\u0324\u0003\u0094J\u0000\u0323\u0321"+
		"\u0001\u0000\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0324\u0333"+
		"\u0001\u0000\u0000\u0000\u0325\u0326\n\u0018\u0000\u0000\u0326\u0327\u0005"+
		"\"\u0000\u0000\u0327\u0328\u0003v;\u0000\u0328\u0329\u0005#\u0000\u0000"+
		"\u0329\u0333\u0001\u0000\u0000\u0000\u032a\u032b\n\u0017\u0000\u0000\u032b"+
		"\u032c\u0005\u0015\u0000\u0000\u032c\u032d\u0003\u0082A\u0000\u032d\u032e"+
		"\u0005\u0016\u0000\u0000\u032e\u0333\u0001\u0000\u0000\u0000\u032f\u0330"+
		"\n\u0016\u0000\u0000\u0330\u0331\u0005%\u0000\u0000\u0331\u0333\u0003"+
		"\u008cF\u0000\u0332\u02f0\u0001\u0000\u0000\u0000\u0332\u02f4\u0001\u0000"+
		"\u0000\u0000\u0332\u02f8\u0001\u0000\u0000\u0000\u0332\u02fc\u0001\u0000"+
		"\u0000\u0000\u0332\u02ff\u0001\u0000\u0000\u0000\u0332\u0302\u0001\u0000"+
		"\u0000\u0000\u0332\u0305\u0001\u0000\u0000\u0000\u0332\u0308\u0001\u0000"+
		"\u0000\u0000\u0332\u030c\u0001\u0000\u0000\u0000\u0332\u0310\u0001\u0000"+
		"\u0000\u0000\u0332\u0313\u0001\u0000\u0000\u0000\u0332\u0316\u0001\u0000"+
		"\u0000\u0000\u0332\u031c\u0001\u0000\u0000\u0000\u0332\u0320\u0001\u0000"+
		"\u0000\u0000\u0332\u0325\u0001\u0000\u0000\u0000\u0332\u032a\u0001\u0000"+
		"\u0000\u0000\u0332\u032f\u0001\u0000\u0000\u0000\u0333\u0336\u0001\u0000"+
		"\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335w\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000"+
		"\u0000\u0337\u0348\u0005\\\u0000\u0000\u0338\u0348\u0003\u008aE\u0000"+
		"\u0339\u0348\u0005`\u0000\u0000\u033a\u0348\u0005y\u0000\u0000\u033b\u033e"+
		"\u0003\u008cF\u0000\u033c\u033d\u0005\"\u0000\u0000\u033d\u033f\u0005"+
		"#\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000"+
		"\u0000\u0000\u033f\u0348\u0001\u0000\u0000\u0000\u0340\u0348\u0005m\u0000"+
		"\u0000\u0341\u0348\u0003\u0086C\u0000\u0342\u0345\u0003\u0088D\u0000\u0343"+
		"\u0344\u0005\"\u0000\u0000\u0344\u0346\u0005#\u0000\u0000\u0345\u0343"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0348"+
		"\u0001\u0000\u0000\u0000\u0347\u0337\u0001\u0000\u0000\u0000\u0347\u0338"+
		"\u0001\u0000\u0000\u0000\u0347\u0339\u0001\u0000\u0000\u0000\u0347\u033a"+
		"\u0001\u0000\u0000\u0000\u0347\u033b\u0001\u0000\u0000\u0000\u0347\u0340"+
		"\u0001\u0000\u0000\u0000\u0347\u0341\u0001\u0000\u0000\u0000\u0347\u0342"+
		"\u0001\u0000\u0000\u0000\u0348y\u0001\u0000\u0000\u0000\u0349\u034e\u0003"+
		"v;\u0000\u034a\u034b\u0005\u000e\u0000\u0000\u034b\u034d\u0003v;\u0000"+
		"\u034c\u034a\u0001\u0000\u0000\u0000\u034d\u0350\u0001\u0000\u0000\u0000"+
		"\u034e\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
		"\u034f{\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351"+
		"\u0356\u0003\u0080@\u0000\u0352\u0353\u0005\u000e\u0000\u0000\u0353\u0355"+
		"\u0003\u0080@\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0358\u0001"+
		"\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001"+
		"\u0000\u0000\u0000\u0357\u035a\u0001\u0000\u0000\u0000\u0358\u0356\u0001"+
		"\u0000\u0000\u0000\u0359\u035b\u0005\u000e\u0000\u0000\u035a\u0359\u0001"+
		"\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b}\u0001\u0000"+
		"\u0000\u0000\u035c\u035d\u0005C\u0000\u0000\u035d\u035e\u0005B\u0000\u0000"+
		"\u035e\u035f\u0003v;\u0000\u035f\u007f\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0003\u008cF\u0000\u0361\u0362\u0005B\u0000\u0000\u0362\u0363\u0003v"+
		";\u0000\u0363\u0081\u0001\u0000\u0000\u0000\u0364\u0366\u0005\r\u0000"+
		"\u0000\u0365\u0367\u0003|>\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368"+
		"\u036d\u0005\u000f\u0000\u0000\u0369\u036b\u0003z=\u0000\u036a\u0369\u0001"+
		"\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036d\u0001"+
		"\u0000\u0000\u0000\u036c\u0364\u0001\u0000\u0000\u0000\u036c\u036a\u0001"+
		"\u0000\u0000\u0000\u036d\u0083\u0001\u0000\u0000\u0000\u036e\u036f\u0003"+
		"v;\u0000\u036f\u0370\u0005\u0015\u0000\u0000\u0370\u0371\u0003\u0082A"+
		"\u0000\u0371\u0372\u0005\u0016\u0000\u0000\u0372\u0085\u0001\u0000\u0000"+
		"\u0000\u0373\u0375\u0005\u0015\u0000\u0000\u0374\u0376\u0003v;\u0000\u0375"+
		"\u0374\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376"+
		"\u037d\u0001\u0000\u0000\u0000\u0377\u0379\u0005\u000e\u0000\u0000\u0378"+
		"\u037a\u0003v;\u0000\u0379\u0378\u0001\u0000\u0000\u0000\u0379\u037a\u0001"+
		"\u0000\u0000\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0377\u0001"+
		"\u0000\u0000\u0000\u037c\u037f\u0001\u0000\u0000\u0000\u037d\u037b\u0001"+
		"\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e\u0380\u0001"+
		"\u0000\u0000\u0000\u037f\u037d\u0001\u0000\u0000\u0000\u0380\u038e\u0005"+
		"\u0016\u0000\u0000\u0381\u038a\u0005\"\u0000\u0000\u0382\u0387\u0003v"+
		";\u0000\u0383\u0384\u0005\u000e\u0000\u0000\u0384\u0386\u0003v;\u0000"+
		"\u0385\u0383\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000"+
		"\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000"+
		"\u0388\u038b\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000"+
		"\u038a\u0382\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000"+
		"\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038e\u0005#\u0000\u0000\u038d"+
		"\u0373\u0001\u0000\u0000\u0000\u038d\u0381\u0001\u0000\u0000\u0000\u038e"+
		"\u0087\u0001\u0000\u0000\u0000\u038f\u0392\u0003\u008eG\u0000\u0390\u0392"+
		"\u0003B!\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0391\u0390\u0001\u0000"+
		"\u0000\u0000\u0392\u0089\u0001\u0000\u0000\u0000\u0393\u0395\u0007\b\u0000"+
		"\u0000\u0394\u0396\u0005_\u0000\u0000\u0395\u0394\u0001\u0000\u0000\u0000"+
		"\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u008b\u0001\u0000\u0000\u0000"+
		"\u0397\u0398\u0007\t\u0000\u0000\u0398\u008d\u0001\u0000\u0000\u0000\u0399"+
		"\u039a\u0007\n\u0000\u0000\u039a\u008f\u0001\u0000\u0000\u0000\u039b\u039c"+
		"\u0003\u008eG\u0000\u039c\u039d\u0005\"\u0000\u0000\u039d\u039e\u0005"+
		"#\u0000\u0000\u039e\u0091\u0001\u0000\u0000\u0000\u039f\u03a0\u0005G\u0000"+
		"\u0000\u03a0\u0093\u0001\u0000\u0000\u0000\u03a1\u03a2\u0005H\u0000\u0000"+
		"\u03a2\u0095\u0001\u0000\u0000\u0000\u03a3\u03a4\u0007\u000b\u0000\u0000"+
		"\u03a4\u0097\u0001\u0000\u0000\u0000\u03a5\u03a6\u0005K\u0000\u0000\u03a6"+
		"\u0099\u0001\u0000\u0000\u0000\u03a7\u03a8\u0007\f\u0000\u0000\u03a8\u009b"+
		"\u0001\u0000\u0000\u0000\u03a9\u03aa\u0007\r\u0000\u0000\u03aa\u009d\u0001"+
		"\u0000\u0000\u0000\u03ab\u03ac\u0007\u000e\u0000\u0000\u03ac\u009f\u0001"+
		"\u0000\u0000\u0000\u03ad\u03ae\u0005P\u0000\u0000\u03ae\u00a1\u0001\u0000"+
		"\u0000\u0000\u03af\u03b0\u0007\u000f\u0000\u0000\u03b0\u00a3\u0001\u0000"+
		"\u0000\u0000f\u00a7\u00a9\u00b7\u00bb\u00c0\u00c7\u00cd\u00d3\u00d7\u00e3"+
		"\u00eb\u00ee\u00f9\u00fc\u0102\u010a\u010d\u0118\u011e\u0124\u012d\u013b"+
		"\u013e\u014a\u0151\u0154\u0158\u015d\u0161\u0165\u0176\u0178\u017f\u0189"+
		"\u018f\u019a\u019d\u01a3\u01a6\u01ae\u01b1\u01b7\u01ba\u01c2\u01c5\u01cb"+
		"\u01cf\u01da\u01df\u01e4\u01ec\u01fb\u01fd\u0202\u020c\u0216\u0229\u0235"+
		"\u023f\u0245\u0249\u024c\u0261\u026e\u0287\u028b\u0291\u0299\u029d\u02a0"+
		"\u02ab\u02af\u02b4\u02b8\u02bc\u02c1\u02c6\u02ca\u02d7\u02e8\u02eb\u02ee"+
		"\u0323\u0332\u0334\u033e\u0345\u0347\u034e\u0356\u035a\u0366\u036a\u036c"+
		"\u0375\u0379\u037d\u0387\u038a\u038d\u0391\u0395";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
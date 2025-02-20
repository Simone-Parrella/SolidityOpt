grammar Solidity;
@header {
package grammar;
}

// Programma completo
sourceUnit
  : (pragma | imports | definizioneContratto)* EOF ;

// Pragma
pragma
  : 'pragma' nomePragma valorePragma puntoVirgola ;

nomePragma
  : identificatore ;

valorePragma
  : versione | expression ;

versione
  : vincoloVersione vincoloVersione? ;

operatoreVersione
  : '^' | '~' | '>=' | '>' | '<' | '<=' | '=' ;

vincoloVersione
  : operatoreVersione? VersionLiteral ;

// Import
dichiarazioneImport
  : identificatore ('as' identificatore)? ;

imports
  : 'import' LiteralStringa ('as' identificatore)? puntoVirgola
  | 'import' ('*' | identificatore) ('as' identificatore)? 'from' LiteralStringa puntoVirgola
  | 'import' '{' dichiarazioneImport ( ',' dichiarazioneImport )* '}' 'from' LiteralStringa puntoVirgola ;

// Contratto e sue parti
definizioneContratto
  : ( 'abstract'? ( 'contract' | 'interface' | 'library' ) ) identificatore
    ( 'is' inheritanceSpecifier (',' inheritanceSpecifier )* )?
    '{' parteDiContratto* '}' ;


inheritanceSpecifier
  : tipiDefinitiUtente ( '(' listaExpression? ')' )? ;

parteDiContratto
  : assegnazioneVariabile
  | usingForDeclaration
  | definizioneStruct
  | definizioneCostruttore
  | definizioneModifier
  | definizioneFunzione
  | definizioneErrore
  | definizioneEvento
  | definizioneEnum ;

assegnazioneVariabile
  : nomeTipo
( PublicKeyword | InternalKeyword | PrivateKeyword | ConstantKeyword | OverrideKeyword | 'immutable' )*
  identificatore ( '=' expression )? puntoVirgola ;

usingForDeclaration
  : 'using' identificatore 'for' ('*' | nomeTipo) puntoVirgola ;

definizioneStruct
  : 'struct' identificatore
    '{' ( dichiarazioneVariabile puntoVirgola (dichiarazioneVariabile puntoVirgola)* )? '}' ;

definizioneCostruttore
  : 'constructor' listaParametri listaModifier block ;

definizioneModifier
  : 'modifier' identificatore listaParametri? block ;

invocazioneModifier
  : identificatore ( '(' listaExpression? ')' )? ;

definizioneFunzione
  : 'function' identificatore? listaParametri listaModifier valoreRitorno? ( puntoVirgola | block ) ;

definizioneErrore
  : 'error' identificatore? listaParametri puntoVirgola ;

valoreRitorno
  : 'returns' listaParametri ;

listaModifier
  : ( invocazioneModifier | stateMutability | ExternalKeyword
    | PublicKeyword | InternalKeyword | PrivateKeyword | ConstantKeyword | OverrideKeyword | 'immutable' )* ;

definizioneEvento
  : 'event' identificatore listaParametriEvent AnonymousKeyword? puntoVirgola ;

valoreEnum
  : identificatore ;

definizioneEnum
  : 'enum' identificatore '{' valoreEnum? (',' valoreEnum)* '}' ;

listaParametri
  : '(' ( parametro (',' parametro)* )? ')' ;

parametro
  : nomeTipo tipoStorage? identificatore? ;

listaParametriEvent
  : '(' ( parametriEvent (',' parametriEvent)* )? ')' ;

parametriEvent
  : nomeTipo IndexedKeyword? identificatore? ;

listaParametriFunzione
  : '(' ( parametroFunzione (',' parametroFunzione)* )? ')' ;

parametroFunzione
  : nomeTipo tipoStorage? ;

dichiarazioneVariabile
  : nomeTipo tipoStorage? identificatore ;

nomeTipo
  : tipiPrimitivi
  | tipiDefinitiUtente
  | mapping
  | nomeTipo '[' expression? ']'
  | functionTypeName
  | 'address' 'payable' ;

tipiDefinitiUtente
  : identificatore ( '.' identificatore )* ;

mapping
  : 'mapping' '(' tipiPrimitivi '=>' nomeTipo ')' ;

functionTypeName
  : 'function' listaParametriFunzione
    ( InternalKeyword | ExternalKeyword | stateMutability )*
    ( 'returns' listaParametriFunzione )? ;

tipoStorage
  : 'memory' | 'storage' | 'calldata';

stateMutability
  : PureKeyword | ConstantKeyword | ViewKeyword | PayableKeyword ;

// Statement interni
block
  : '{' statement* '}' ;
assemblyBlock : 'assembly' '{' assemblyStatement* '}';


statement
  : ifStatement
  | whileStatement
  | forStatement
  | block
  | assemblyBlock
  | doWhileStatement
  | continueStatement
  | breakStatement
  | returnStatement
  | throwStatement
  | emitStatement
  | simpleStatement
  | tryCatchStatement
  | expressionStatement;

expressionStatement
  : expression puntoVirgola ;

ifStatement
  : 'if' '(' expression ')' statement ( 'else' statement )? ;

whileStatement
  : 'while' '(' expression ')' statement ;

simpleStatement
  : ( dichiarazioneVariabileStatement | expressionStatement ) ;

forStatement
  : 'for' '(' ( simpleStatement | puntoVirgola ) ( expressionStatement | puntoVirgola ) expression? ')' statement ;

doWhileStatement
  : 'do' statement 'while' '(' expression ')' puntoVirgola ;

continueStatement
  : 'continue' puntoVirgola ;

breakStatement
  : 'break' puntoVirgola ;

returnStatement
  : 'return' expression? puntoVirgola ;

throwStatement
  : 'throw' puntoVirgola ;

emitStatement
  : 'emit' chiamataFunzione puntoVirgola ;

assemblyStatement
    : identificatore (listaParametri)?
    | 'let' identificatore ':=' expression
    | identificatore ':=' expression
    | 'if' expression assemblyBlock
    | assemblyBlock
    | 'for' assemblyBlock assemblyBlock assemblyBlock assemblyBlock
    | 'function' identificatore  listaParametri?  assemblyBlock
    ;

tryCatchStatement
  : 'try' expression ('returns' listaParametri)? block listaCatch ;

listaCatch
  : catchBlock+
  ;

catchBlock
  : 'catch' ('Error'|'Panic')? ( listaParametri )? block ;


dichiarazioneVariabileStatement
  : ( 'var' listaIdentifier | dichiarazioneVariabile | '(' listaDichiarazioneVariabili ')' ) ( '=' expression )? puntoVirgola;

listaDichiarazioneVariabili
  : dichiarazioneVariabile? (',' dichiarazioneVariabile? )* ;

listaIdentifier
  : '(' ( identificatore? ',' )* identificatore? ')' ;

// Inizio definizione Espressioni

expression
  : expression ( incremento | decremento )
  | 'new' nomeTipo
  | expression '[' expression ']'
  | expression '(' argomentiChiamataFunzione ')'
  | expression '.' identificatore
  | '(' expression ')'
  | ( incremento | decremento ) expression
  | ( operatoriSomma ) expression
  | ('after' | 'delete') expression
  | NOT expression
  | '~' expression
  | expression potenza expression
  | expression ( operatoriMoltiplicazione ) expression
  | expression ( operatoriSomma ) expression
  | expression ('<<' | '>>') expression
  | expression '&' expression
  | expression '^' expression
  | expression '|' expression
  | expression ( operatoriRelazionali ) expression
  | expression ( operatoriConfrontoDiretto ) expression
  | expression AND expression
  | expression OR expression
  | expression '?' expression ':' expression
  |  'new' nomeTipo ( '{' listaSalt? '}' )?
  | expression ( operatoriAssegnazione ) expression
  | primaryExpression ;

primaryExpression
  : LiteralBooleano
  | valoreNumerico
  | LiteralEsadecimale
  | LiteralStringa
  | identificatore ('[' ']')?
  | TypeKeyword
  | tupleExpression
  | tipiExpression ('[' ']')? ;

listaExpression
  : expression (',' expression)* ;

listaNameValue
  : nameValue (',' nameValue)* ','? ;

listaSalt
  : 'salt' ':' expression ;


nameValue
  : identificatore ':' expression ;

argomentiChiamataFunzione
  : '{' listaNameValue? '}'
  | listaExpression? ;

chiamataFunzione
  : expression '(' argomentiChiamataFunzione ')' ;

tupleExpression
  : '(' ( expression? ( ',' expression? )* ) ')'
  | '[' ( expression ( ',' expression )* )? ']' ;

tipiExpression
  : tipiPrimitivi
  | tipiDefinitiUtente ;

// Parte del Lexer

// Valori numerici
valoreNumerico
  : (NumeroDecimale | NumeroEsadecimale) UnitaNumero? ;

identificatore
  : ('from' | 'calldata' | Identifier) ;

VersionLiteral
  : [0-9]+ '.' [0-9]+ '.' [0-9]+ ;

LiteralBooleano
  : 'true' | 'false' ;

NumeroDecimale
  : ( DigitDecimali | (DigitDecimali? '.' DigitDecimali) ) ( [eE] DigitDecimali )? ;

fragment
DigitDecimali
  : [0-9] ( '_'? [0-9] )* ;

NumeroEsadecimale
  : '0' [xX] DigitEsadecimali ;

fragment
DigitEsadecimali
  : CarattereEsadecimale ( '_'? CarattereEsadecimale )* ;

UnitaNumero
  : 'wei' | 'szabo' | 'finney' | 'ether'
  | 'seconds' | 'minutes' | 'hours' | 'days' | 'weeks' | 'years' ;

LiteralEsadecimale : 'hex' ('"' CoppiaEsadecimale* '"' | '\'' CoppiaEsadecimale* '\'') ;

fragment
CoppiaEsadecimale
  : CarattereEsadecimale CarattereEsadecimale ;

fragment
CarattereEsadecimale
  : [0-9A-Fa-f] ;

// Parole riservate
ReservedKeyword
  : 'abstract'
  | 'after'
  | 'default'
  | 'catch'
  | 'final'
  | 'in'
  | 'inline'
  | 'let'
  | 'match'
  | 'null'
  | 'of'
  | 'relocatable'
  | 'static'
  | 'try'
  | 'typeof' ;

AnonymousKeyword : 'anonymous' ;
BreakKeyword : 'break' ;
ConstantKeyword : 'constant' ;
ContinueKeyword : 'continue' ;
ExternalKeyword : 'external' ;
IndexedKeyword : 'indexed' ;
InternalKeyword : 'internal' ;
PayableKeyword : 'payable' ;
PrivateKeyword : 'private' ;
PublicKeyword : 'public' ;
PureKeyword : 'pure' ;
TypeKeyword : 'type' ;
ViewKeyword : 'view' ;
OverrideKeyword : 'override' ;

// Tipi primitivi
tipiPrimitivi
  : 'address' | 'bool' | 'string' | 'var' | Int | Uint | 'byte' | Byte | Fixed | Ufixed ;

Int
  : 'int' | 'int8' | 'int16' | 'int24' | 'int32' | 'int40' | 'int48' | 'int56' | 'int64' | 'int72' | 'int80' | 'int88' | 'int96' | 'int104' | 'int112' | 'int120' | 'int128' | 'int136' | 'int144' | 'int152' | 'int160' | 'int168' | 'int176' | 'int184' | 'int192' | 'int200' | 'int208' | 'int216' | 'int224' | 'int232' | 'int240' | 'int248' | 'int256' ;

Uint
  : 'uint' | 'uint8' | 'uint16' | 'uint24' | 'uint32' | 'uint40' | 'uint48' | 'uint56' | 'uint64' | 'uint72' | 'uint80' | 'uint88' | 'uint96' | 'uint104' | 'uint112' | 'uint120' | 'uint128' | 'uint136' | 'uint144' | 'uint152' | 'uint160' | 'uint168' | 'uint176' | 'uint184' | 'uint192' | 'uint200' | 'uint208' | 'uint216' | 'uint224' | 'uint232' | 'uint240' | 'uint248' | 'uint256' ;

Byte
  : 'bytes' | 'bytes1' | 'bytes2' | 'bytes3' | 'bytes4' | 'bytes5' | 'bytes6' | 'bytes7' | 'bytes8' | 'bytes9' | 'bytes10' | 'bytes11' | 'bytes12' | 'bytes13' | 'bytes14' | 'bytes15' | 'bytes16' | 'bytes17' | 'bytes18' | 'bytes19' | 'bytes20' | 'bytes21' | 'bytes22' | 'bytes23' | 'bytes24' | 'bytes25' | 'bytes26' | 'bytes27' | 'bytes28' | 'bytes29' | 'bytes30' | 'bytes31' | 'bytes32' ;

Fixed
  : 'fixed' | ( 'fixed' [0-9]+ 'x' [0-9]+ ) ;

Ufixed
  : 'ufixed' | ( 'ufixed' [0-9]+ 'x' [0-9]+ ) ;

array
  : tipiPrimitivi '[' ']' ;

// Operatori di base
Identifier
  : IdentifierStart IdentifierPart* ;

incremento
  : '++' ;

decremento
  : '--' ;

operatoriSomma
  : '+' | '-' ;

potenza
  : '**';

operatoriMoltiplicazione
  : '*' | '/' | '%' ;

operatoriRelazionali
  : '<' | '>' | '<=' | '>=' ;

operatoriConfrontoDiretto
  : '==' | '!=' ;

AND
  : '&&' ;

OR
  : '||' ;

NOT
  : '!' ;

puntoVirgola
  : ';' ;

operatoriAssegnazione
  : '=' | '|=' | '^=' | '&=' | '<<=' | '>>=' | '+=' | '-=' | '*=' | '/=' | '%=' ;

fragment
IdentifierStart
  : [a-zA-Z$_] ;

fragment
IdentifierPart
  : [a-zA-Z0-9$_] ;

LiteralStringa
  : '"' CarattereDoppiApici* '"'
  | '\'' CarattereSingoliApici* '\'' ;

fragment
CarattereDoppiApici
  : ~["\r\n\\] | ('\\' .) ;

fragment
CarattereSingoliApici
  : ~['\r\n\\] | ('\\' .) ;

WS
  : [ \t\r\n\u000C]+ -> skip ;

COMMENTO
  : '/*' .*? '*/' -> skip ;

COMMENTO_LINEA
  : '//' ~[\r\n]* -> skip ;

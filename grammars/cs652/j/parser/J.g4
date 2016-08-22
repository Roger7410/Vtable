grammar J;

@header {
package cs652.j.parser;
import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;
}

file returns [GlobalScope scope] // this allows us to annotate trees with symtab info
    :   classDeclaration* main EOF
    ;

main returns [JMethod scope]
    :   mainblock
    ;

mainblock returns [Scope scope]
    :   block
    ;

//mainblock returns [Scope scope]
//    :   (statement|variable)
//    ;

//main returns [JMethod scope]
//    :   mainblock
//    ;
//
//mainblock returns [Scope scope]
//    :   (statement|variable)*
//    ;

//variable
//    :   jType IDENTIFIER ';'
//    ;



classDeclaration returns [JClass scope]
    :   'class' name=IDENTIFIER
        ('extends' superclass=IDENTIFIER)?
        classBody
    ;

classBody
    :   '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    :   fieldDeclaration
    |   methodDeclaration
    |   ';'
    ;

fieldDeclaration
    :   jType IDENTIFIER ';'
    ;

methodDeclaration returns [JMethod scope]
    :   jType IDENTIFIER formalParameters methodBody
//        (   methodBody
//        |   ';'
//        )
    ;

jType
    :   IDENTIFIER
    |   'int'
    |   'float'
    |   'void'
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   jType IDENTIFIER
    ;

methodBody
    :   '{' block '}'
    ;



// STATEMENTS / BLOCKS
//  MARK
//block   returns [LocalScope scope]
//    :   blockStatement*
//    ;
//
//blockStatement
//    :   localVariableDeclarationStatement
//    |   statement
//    ;
//
//localVariableDeclarationStatement
//    :    localVariableDeclaration ';'
//    ;
//

//block returns [LocalScope scope]
//    :   statement*
//    ;

block returns [LocalScope scope]
    :   blockStatement*
    ;

blockStatement
    :   localVariableDeclaration
    |   statement
    ;

statement
    :   '{' block '}'                                                   #BlockStat
    |   localVariableDeclaration ';'                                    #LocalVarStat
    |   <assoc=right> expression '='expression  ';'                     #AssignStat
    |   'if' parExpression statement ('else' statement)?                #IfStat
    |   'while' parExpression statement                                 #WhileStat
    |   'return' expression? ';'                                        #RetureStat
    |   'printf' '(' STRING_TYPE (','expression)* ')' ';'               #PrintStat
    |   'printf' '(' STRING_TYPE ')'                                    #PrintStringStat
    |   expression ';'                                                  #CallStat
    |   ';'                                                             #WhatIsThisStat
    ;


localVariableDeclaration
    :   jType IDENTIFIER ';'
    ;

//Strings
//    :   '"' StringCharacters? '"'
//    ;
//StringCharacters
//    :   StringCharacter+
//    ;
//StringCharacter
//    :   ~["\\]
//    |   EscapeSequence
//    ;
//EscapeSequence
//    :   '\\'
//    ;

parExpression
    :   '(' expression ')'
    ;
//label

//11
expression  returns [Type type] // annotate all expression nodes with type info
    :   expression '.' IDENTIFIER                               # FIELD_LABLE
    |   expression '.' IDENTIFIER '(' expressionList? ')'       # INS_METHOD_CALL_LABLE
    |   'new' creator                                           # CREATOR_LABLE
    |   IDENTIFIER '(' expressionList? ')'                      # METHOD_CALL_LABLE
    |   '(' expression ')'                                      # PARENS_LABLE
    |   'this'                                                  # THIS_LABLE
    |   INTEGER_TYPE                                            # INTEGER_LABLE
    |   FLOAT_TYPE                                              # FLOAT_LABLE
    |   IDENTIFIER                                              # ID_LABLE
    |   'null'                                                  # NULL_LABLE
    ;


expressionList
    :   expression (',' expression)*
    ;
creator
    :  IDENTIFIER'(' ')'
    ;

//LEXER
CLASS         : 'class';
ELSE          : 'else';
EXTENDS       : 'extends';
FLOAT         : 'float';
IF            : 'if';
INT           : 'int';
NEW           : 'new';
PUBLIC        : 'public';
RETURN        : 'return';
SUPER         : 'super';
THIS          : 'this';
VOID          : 'void';
WHILE         : 'while';

IDENTIFIER:[a-zA-Z$_][a-zA-Z0-9$_]*;
INTEGER_TYPE:[0-9]+;
FLOAT_TYPE: [0-9]+ '.' [0-9]+;
STRING_TYPE:'"' ((~["\\]|'\\')+)? '"';

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
ASSIGN          : '=';
GT              : '>';
LT              : '<';


WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;


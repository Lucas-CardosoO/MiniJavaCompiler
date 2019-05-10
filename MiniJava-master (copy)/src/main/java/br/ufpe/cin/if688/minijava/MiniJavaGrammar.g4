/*
BSD License

Copyright (c) 2013, Tom Everett
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

grammar MiniJavaGrammar;


program: mainClass(classDeclaration)* EOF;

mainClass: 'class' id '{' 'public' 'static' 'void' 'main' LP 'String' '[' ']' id RP '{' statement '}' '}';

classDeclaration: 'class' id ('extends' id)? '{'(varDeclaration)* (methodDeclaration)* '}';

varDeclaration: type id SEMICOLON;

methodDeclaration: 'public' type id LP (type id (COMMA type id)*)? RP '{' (varDeclaration)* (statement)* 'return' expression SEMICOLON '}';

type: INTARRAY
    | BOOLEAN
    | INT
    | id;

INTARRAY: INT LSB RSB;
BOOLEAN: 'boolean';
INT: 'int';

statement: '{' (statement)* '}'
    | 'if' LP expression RP statement 'else' statement
    | 'while' LP expression RP statement
    | 'System.out.println' LP expression RP SEMICOLON
    | id EQ expression SEMICOLON
    | id '[' expression ']' EQ expression SEMICOLON;


expression: expression (AND | LT | PLUS | MINUS | TIMES) expression
    | expression LSB expression RSB
    | expression DOTLENGTH
    | expression DOT id LP (expression (COMMA expression)*)? RP
    | MINUS? INTEGER
    | TRUE
    | FALSE
    | id
    | THIS
    | 'new' 'int' LSB expression RSB
    | 'new' id LP RP
    | NOT expression
    | LP expression RP;

id: IDENTIFIER;

IDENTIFIER: VALID_ID_START (VALID_ID_START|INTEGER)*;


AND:'&&';
LT:'<';
PLUS:'+';
MINUS:'-';
TIMES:'*';
POWER:'**';
NOT:'!';
LSB:'[';
RSB:']';
DOTLENGTH:'.length';
LP:'(';
RP:')';
EQ: '=';
DOT: '.';
COMMA: ',';
SEMICOLON: ';';
TRUE: 'true';
FALSE: 'false';
INTEGER: ('0' .. '9')+;
THIS: 'this';

VALID_ID_START: ('a' .. 'z') | ('A' .. 'Z') | '_';

WS:   [ \r\t\n]+ -> skip;
MULTILINE_COMMENT:  '/*' .*? '*/' -> skip;
LINE_COMMENT:  '//' .*? '\n' -> skip;
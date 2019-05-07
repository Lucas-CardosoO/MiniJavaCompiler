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


goal:;

varDeclaration: type identifier SEMICOLON;

methodDeclaration: 'public' type identifier LP (type identifier (COMMA type identifier)*)? RP '{' (varDeclaration)* (statement)* 'return' expresion SEMICOLON '}';

type: INT LSB RSB
    | 'boolean'
    | INT
    | identifier;

statement: '{' (statement)* '}'
    | 'if' LP expresion RP statement 'else' statement
    | 'while' LP expresion RP statement
    | 'System.out.println' LP expresion RP SEMICOLON
    | identifier EQ expresion SEMICOLON
    | identifier RSB expresion LSB EQ expresion SEMICOLON;


expresion: expresion (AND | LT | PLUS | MINUS | TIMES) expresion
    | LSB expresion RSB
    | expresion DOTLENGTH
    | expresion DOT identifier LP (expresion (COMMA expresion)*)? RP
    | MINUS? INTEGER
    | TRUE
    | FALSE
    | identifier
    | THIS
    | NEW INT LSB expresion RSB
    | NEW identifier LP RP
    | NOT expresion
    | LP expresion RP;

identifier: VALID_ID_START VALID_ID_CHAR*;


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
RETURN: 'return';
EQ: '=';
DOT: '.';
COMMA: ',';
SEMICOLON: ';';
TRUE: 'true';
FALSE: 'false';
INTEGER: ('0' .. '9')+;
THIS: 'this';
NEW: 'new';
INT: 'int';


fragment VALID_ID_START: ('a' .. 'z') | ('A' .. 'Z') | '_';


fragment VALID_ID_CHAR: VALID_ID_START | ('0' .. '9');

WS:   [ \r\t\n]+ -> skip;
MULTILINE_COMMENT:  '/*' .*? '*/' -> skip;
LINE_COMMENT:  '//' .*? '\n' -> skip;
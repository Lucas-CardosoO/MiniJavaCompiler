package br.ufpe.cin.if688.minijava;

import gen.br.ufpe.cin.if688.minijava.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        CharStream charstream = CharStreams.fromFileName("/home/CIN/lccao/Desktop/MiniJavaCompiler/MiniJava-master (copy)/src/main/java/br/ufpe/cin/if688/minijava/test.txt");
        MiniJavaGrammarLexer lexer = new MiniJavaGrammarLexer(charstream);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        MiniJavaGrammarParser parser = new MiniJavaGrammarParser (cts);
        parser.goal();

    }


//    public static void main(String[] args) {
//        MainClass main = new MainClass(
//                new Identifier("Teste"),
//                new Identifier("Testando"),
//                new Print(new IntegerLiteral(2))
//        );
//
//        VarDeclList vdl1 = new VarDeclList();
//        vdl1.addElement(new VarDecl(
//                new BooleanType(),
//                new Identifier("flag")
//        ));
//        vdl1.addElement(new VarDecl(
//                new IntegerType(),
//                new Identifier("num")
//        ));
//
//        MethodDeclList mdl = new MethodDeclList();
//
//        ClassDeclSimple A = new ClassDeclSimple(
//                new Identifier("A"), vdl1, mdl
//        );
//
//        ClassDeclExtends B = new ClassDeclExtends(
//                new Identifier("B"), new Identifier("A"),
//                new VarDeclList(), new MethodDeclList()
//        );
//
//        VarDeclList vdl2 = new VarDeclList();
//        vdl2.addElement(new VarDecl(
//                new IdentifierType("A"),
//                new Identifier("obj")
//        ));
//        ClassDeclSimple C = new ClassDeclSimple(
//                new Identifier("C"), vdl2, new MethodDeclList()
//        );
//
//        ClassDeclList cdl = new ClassDeclList();
//        cdl.addElement(A);
//        cdl.addElement(B);
//        cdl.addElement(C);
//
//        Program p = new Program(main, cdl);
//
//        PrettyPrintVisitor ppv = new PrettyPrintVisitor();
//        ppv.visit(p);
//    }

}
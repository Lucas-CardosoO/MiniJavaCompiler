package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.antlr.MiniJavaGrammarParser;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaGrammarVisitor;
import br.ufpe.cin.if688.minijava.ast.*;
import br.ufpe.cin.if688.minijava.symboltable.Method;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class MiniJavaVisitor implements MiniJavaGrammarVisitor {


    @Override
    public Object visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        MainClass main = (MainClass) ctx.mainClass().accept(this);
        ClassDeclList classDecList = new ClassDeclList();

        for (MiniJavaGrammarParser.ClassDeclarationContext i: ctx.classDeclaration()) {
            classDecList.addElement((ClassDecl) i.accept(this));
        }


        Program prog = new Program(main, classDecList);
        return prog;
    }

    @Override
    public Object visitMainClass(MiniJavaGrammarParser.MainClassContext ctx) {
        List<MiniJavaGrammarParser.IdContext> idList = ctx.id();

        Identifier id1 = (Identifier) idList.get(0).accept(this);
        Identifier id2 = (Identifier) idList.get(1).accept(this);

        Statement stm = (Statement) ctx.statement().accept(this);

        MainClass main = new MainClass(id1, id2, stm);
        return main;
    }

    @Override
    public Object visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx) {
        List<MiniJavaGrammarParser.IdContext> idList = ctx.id();

        ClassDecl classDecl;

        VarDeclList varDecList = new VarDeclList();
        for (MiniJavaGrammarParser.VarDeclarationContext i: ctx.varDeclaration()) {
            varDecList.addElement((VarDecl) i.accept(this));
        }

        MethodDeclList methodDecList = new MethodDeclList();
        for (MiniJavaGrammarParser.MethodDeclarationContext i: ctx.methodDeclaration()) {
            methodDecList.addElement((MethodDecl) i.accept(this));
        }

        if (idList.size() == 1) {
            Identifier id = (Identifier) idList.get(0).accept(this);

            classDecl = new ClassDeclSimple(id, varDecList, methodDecList);
        } else {
            Identifier id = (Identifier) idList.get(0).accept(this);
            Identifier id1 = (Identifier) idList.get(1).accept(this);

            classDecl = new ClassDeclExtends(id, id1, varDecList, methodDecList);
        }

        return classDecl;
    }

    @Override
    public Object visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitType(MiniJavaGrammarParser.TypeContext ctx) {
        return null;
    }

    @Override
    public Object visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Object visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitId(MiniJavaGrammarParser.IdContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return parseTree.accept(this);
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}

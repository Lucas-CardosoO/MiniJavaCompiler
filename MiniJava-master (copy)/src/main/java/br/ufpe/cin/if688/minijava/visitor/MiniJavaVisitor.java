package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.antlr.*;
import br.ufpe.cin.if688.minijava.ast.*;
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
        Type type = (Type) ctx.type().accept(this);
        Identifier id = (Identifier) ctx.id().accept(this);

        VarDecl varDecl = new VarDecl(type, id);
        return varDecl;
    }

    @Override
    public Object visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx) {
        Type type = (Type) ctx.type(0).accept(this);

        Identifier id = (Identifier) ctx.id(0).accept(this);

        FormalList formalList = new FormalList();
        for (int i = 1; i < ctx.type().size(); i++){
            Type typex = (Type) ctx.type(i).accept(this);
            Identifier idx = (Identifier) ctx.id(i).accept(this);

            Formal formal = new Formal(typex, idx);
            formalList.addElement(formal);
        }

        VarDeclList varDecList = new VarDeclList();
        for (MiniJavaGrammarParser.VarDeclarationContext i: ctx.varDeclaration()) {
            varDecList.addElement((VarDecl) i.accept(this));
        }

        StatementList statementList = new StatementList();

        for (MiniJavaGrammarParser.StatementContext statement: ctx.statement()) {
            statementList.addElement((Statement) statement.accept(this));
        }

        Exp exp = (Exp) ctx.expression().accept(this);

        MethodDecl methodDecl = new MethodDecl(type, id, formalList, varDecList, statementList, exp);
        return methodDecl;
    }

    @Override
    public Object visitType(MiniJavaGrammarParser.TypeContext ctx) {
        Type type;

        if (ctx.INTARRAY() != null){
            type = new IntArrayType();
        } else if (ctx.BOOLEAN() != null) {
            type = new BooleanType();
        } else if (ctx.INT() != null) {
            type = new IntegerType();
        } else {
            type = new IdentifierType(ctx.id().accept(this).toString());
        }

        return type;
    }

    @Override
    public Object visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        Statement stm;

        if (ctx.arrayAssignStatement() != null) {
            stm = (ArrayAssign) ctx.arrayAssignStatement().accept(this);
        } else if(ctx.ifStatement() != null){
            stm = (If) ctx.ifStatement().accept(this);
        } else if (ctx.whiletStatement() != null) {
            stm = (Statement) ctx.whiletStatement().accept(this);
        } else if (ctx.printStatement() != null) {
            stm = (Statement) ctx.printStatement().accept(this);
        } else if (ctx.assignStatement() != null) {
            stm = (Statement) ctx.assignStatement().accept(this);
        } else {
            stm = (Statement) ctx.bracketStatemet().accept(this);
        }

        return  stm;
    }

    @Override
    public Object visitBracketStatemet(MiniJavaGrammarParser.BracketStatemetContext ctx) {
        StatementList statementList = new StatementList();

        for (MiniJavaGrammarParser.StatementContext statement: ctx.statement()) {
            statementList.addElement((Statement) statement.accept(this));
        }


        return new Block(statementList);
    }

    @Override
    public Object visitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx) {
        return new If((Exp) ctx.expression().accept(this), (Statement) ctx.statement(0).accept(this), (Statement) ctx.statement(1).accept(this));
    }

    @Override
    public Object visitWhiletStatement(MiniJavaGrammarParser.WhiletStatementContext ctx) {
        return new While((Exp) ctx.expression().accept(this), (Statement) ctx.statement().accept(this));
    }

    @Override
    public Object visitPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx) {
        return new Print((Exp) ctx.expression().accept(this));
    }

    @Override
    public Object visitAssignStatement(MiniJavaGrammarParser.AssignStatementContext ctx) {
        return new Assign((Identifier) ctx.id().accept(this), (Exp) ctx.expression().accept(this));
    }

    @Override
    public Object visitArrayAssignStatement(MiniJavaGrammarParser.ArrayAssignStatementContext ctx) {
        return new ArrayAssign((Identifier) ctx.id().accept(this), (Exp) ctx.expression(0).accept(this), (Exp) ctx.expression(1).accept(this));
    }

    @Override
    public Object visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {
        Exp exp;

        if(ctx.AND() != null) {
            exp = new And((Exp) ctx.expression(0).accept(this), (Exp) ctx.expression(1).accept(this));
        } else if (ctx.LT() != null) {
            exp = new LessThan((Exp) ctx.expression(0).accept(this), (Exp) ctx.expression(1).accept(this));
        } else if (ctx.PLUS() != null) {
            exp = new Plus((Exp) ctx.expression(0).accept(this), (Exp) ctx.expression(1).accept(this));
        } else if (ctx.MINUS() != null) {
            exp = new Minus((Exp) ctx.expression(0).accept(this), (Exp) ctx.expression(1).accept(this));
        } else if (ctx.TIMES() != null) {
            exp = new Times((Exp) ctx.expression(0).accept(this), (Exp) ctx.expression(1).accept(this));
        } else if (ctx.LSB() != null) {
            exp = new ArrayLookup((Exp) ctx.expression(0).accept(this), (Exp) ctx.expression(1).accept(this));
        } else if (ctx.DOTLENGTH() != null) {
            exp = new ArrayLength((Exp) ctx.expression(0).accept(this));
        } else if (ctx.DOT() != null) {
            Exp exp2 = (Exp) ctx.expression(0).accept(this);
            Identifier id = (Identifier) ctx.id().accept(this);
            ExpList expList = new ExpList();

            for(int i = 1; i < ctx.expression().size(); i++) {
                expList.addElement((Exp) ctx.expression(i).accept(this));
            }

            exp = new Call(exp2, id, expList);
        } else if (ctx.INTEGER() != null) {
            if (ctx.MINUS() != null) {
                exp = new IntegerLiteral(-Integer.parseInt((String) ctx.INTEGER().accept(this)));
            } else {
                exp = new IntegerLiteral(Integer.parseInt((String) ctx.INTEGER().accept(this)));
            }
        } else if (ctx.TRUE() != null) {
            exp = new True();
        } else  if (ctx.FALSE() != null) {
            exp = new False();
        } else if (ctx.id() != null) {
            exp = new IdentifierExp(((Identifier) ctx.id().accept(this)).toString());
        } else if (ctx.THIS() != null) {
            exp = new This();
        } else if (ctx.newIntExp() != null){
            exp = (Exp) ctx.newIntExp().accept(this);
        } else if (ctx.newIdExp() != null){
            exp = (Exp) ctx.newIdExp().accept(this);
        } else if (ctx.notExp() != null){
            exp = (Exp) ctx.notExp().accept(this);
        } else {
            exp = (Exp) ctx.parExp().accept(this);
        }

        return exp;
    }

    @Override
    public Object visitNewIntExp(MiniJavaGrammarParser.NewIntExpContext ctx) {
        return new NewArray((Exp) ctx.expression().accept(this));
    }

    @Override
    public Object visitNewIdExp(MiniJavaGrammarParser.NewIdExpContext ctx) {
        return new NewObject((Identifier) ctx.id().accept(this));
    }

    @Override
    public Object visitNotExp(MiniJavaGrammarParser.NotExpContext ctx) {
        return new Not((Exp) ctx.expression().accept(this));
    }

    @Override
    public Object visitParExp(MiniJavaGrammarParser.ParExpContext ctx) {
        return (Exp) ctx.expression().accept(this);
    }

    @Override
    public Object visitId(MiniJavaGrammarParser.IdContext ctx) {
        String idStr = ctx.IDENTIFIER().accept(this).toString();

        Identifier id = new Identifier(idStr);
        return id;
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
        return terminalNode.getSymbol().getText();
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}

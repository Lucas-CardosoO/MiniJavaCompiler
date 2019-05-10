// Generated from /home/CIN/lccao/Desktop/MiniJavaCompiler/MiniJava-master (copy)/src/main/java/br/ufpe/cin/if688/minijava/MiniJavaGrammar.g4 by ANTLR 4.7.2
package br.ufpe.cin.if688.minijava.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaGrammarParser}.
 */
public interface MiniJavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#bracketStatemet}.
	 * @param ctx the parse tree
	 */
	void enterBracketStatemet(MiniJavaGrammarParser.BracketStatemetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#bracketStatemet}.
	 * @param ctx the parse tree
	 */
	void exitBracketStatemet(MiniJavaGrammarParser.BracketStatemetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#whiletStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhiletStatement(MiniJavaGrammarParser.WhiletStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#whiletStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhiletStatement(MiniJavaGrammarParser.WhiletStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(MiniJavaGrammarParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(MiniJavaGrammarParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStatement(MiniJavaGrammarParser.ArrayAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStatement(MiniJavaGrammarParser.ArrayAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#newIntExp}.
	 * @param ctx the parse tree
	 */
	void enterNewIntExp(MiniJavaGrammarParser.NewIntExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#newIntExp}.
	 * @param ctx the parse tree
	 */
	void exitNewIntExp(MiniJavaGrammarParser.NewIntExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#newIdExp}.
	 * @param ctx the parse tree
	 */
	void enterNewIdExp(MiniJavaGrammarParser.NewIdExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#newIdExp}.
	 * @param ctx the parse tree
	 */
	void exitNewIdExp(MiniJavaGrammarParser.NewIdExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#notExp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(MiniJavaGrammarParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#notExp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(MiniJavaGrammarParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#parExp}.
	 * @param ctx the parse tree
	 */
	void enterParExp(MiniJavaGrammarParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#parExp}.
	 * @param ctx the parse tree
	 */
	void exitParExp(MiniJavaGrammarParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MiniJavaGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MiniJavaGrammarParser.IdContext ctx);
}
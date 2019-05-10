// Generated from /home/CIN/lccao/Desktop/MiniJavaCompiler/MiniJava-master (copy)/src/main/java/br/ufpe/cin/if688/minijava/MiniJavaGrammar.g4 by ANTLR 4.7.2
package br.ufpe.cin.if688.minijava.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#bracketStatemet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketStatemet(MiniJavaGrammarParser.BracketStatemetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#whiletStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiletStatement(MiniJavaGrammarParser.WhiletStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(MiniJavaGrammarParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignStatement(MiniJavaGrammarParser.ArrayAssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#newIntExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIntExp(MiniJavaGrammarParser.NewIntExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#newIdExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIdExp(MiniJavaGrammarParser.NewIdExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#notExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(MiniJavaGrammarParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#parExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(MiniJavaGrammarParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MiniJavaGrammarParser.IdContext ctx);
}
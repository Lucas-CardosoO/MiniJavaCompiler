// Generated from /home/CIN/lccao/Desktop/MiniJavaCompiler/MiniJava-master (copy)/src/main/java/br/ufpe/cin/if688/minijava/MiniJavaGrammar.g4 by ANTLR 4.7.2
package gen.br.ufpe.cin.if688.minijava;
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
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(MiniJavaGrammarParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniJavaGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniJavaGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(MiniJavaGrammarParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MiniJavaGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(MiniJavaGrammarParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MiniJavaGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MiniJavaGrammarParser.RelopContext ctx);
}
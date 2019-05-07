// Generated from /home/CIN/lccao/Desktop/MiniJavaCompiler/MiniJava-master (copy)/src/main/java/br/ufpe/cin/if688/minijava/MiniJavaGrammar.g4 by ANTLR 4.7.2
package gen.br.ufpe.cin.if688.minijava;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaGrammarParser}.
 */
public interface MiniJavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(MiniJavaGrammarParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(MiniJavaGrammarParser.EquationContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniJavaGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniJavaGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniJavaGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniJavaGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(MiniJavaGrammarParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(MiniJavaGrammarParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MiniJavaGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MiniJavaGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(MiniJavaGrammarParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(MiniJavaGrammarParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiniJavaGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiniJavaGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MiniJavaGrammarParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MiniJavaGrammarParser.RelopContext ctx);
}
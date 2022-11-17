// Generated from sletoy.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sletoyParser}.
 */
public interface sletoyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sletoyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(sletoyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(sletoyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(sletoyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(sletoyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(sletoyParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(sletoyParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(sletoyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(sletoyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(sletoyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(sletoyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sletoyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sletoyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(sletoyParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(sletoyParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(sletoyParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(sletoyParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#term_list}.
	 * @param ctx the parse tree
	 */
	void enterTerm_list(sletoyParser.Term_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#term_list}.
	 * @param ctx the parse tree
	 */
	void exitTerm_list(sletoyParser.Term_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link sletoyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(sletoyParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sletoyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(sletoyParser.FactorContext ctx);
}
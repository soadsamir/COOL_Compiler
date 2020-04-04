// Generated from C:/Users/So3ad/IdeaProjects/Compiler/src\COOL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COOLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link COOLParser#classDefiniton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinitionRule(COOLParser.ClassDefinitionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(COOLParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#featureDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureDefinition(COOLParser.FeatureDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(COOLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(COOLParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(COOLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link COOLParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmtRule(COOLParser.AssignmentStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link COOLParser#featureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureCallRule(COOLParser.FeatureCallRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(COOLParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link COOLParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtRule(COOLParser.IfStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link COOLParser#caseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStmtRule(COOLParser.CaseStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(COOLParser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link COOLParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmtRule(COOLParser.WhileStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(COOLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link COOLParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectRule(COOLParser.NewObjectRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link COOLParser#isvoidExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoidExprRule(COOLParser.IsvoidExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link COOLParser#invrseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvrseExprRule(COOLParser.InvrseExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link COOLParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExprRule(COOLParser.NotExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(COOLParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(COOLParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#formalsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalsList(COOLParser.FormalsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(COOLParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(COOLParser.TypeContext ctx);
}
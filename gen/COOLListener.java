// Generated from C:/Users/So3ad/IdeaProjects/Compiler/src\COOL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link COOLParser}.
 */
public interface COOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(COOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link COOLParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinitionRule(COOLParser.ClassDefinitionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDefinitionRule}
	 * labeled alternative in {@link COOLParser#classDefiniton}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinitionRule(COOLParser.ClassDefinitionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(COOLParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(COOLParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#featureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFeatureDefinition(COOLParser.FeatureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#featureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFeatureDefinition(COOLParser.FeatureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(COOLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(COOLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(COOLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(COOLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(COOLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(COOLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link COOLParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmtRule(COOLParser.AssignmentStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStmtRule}
	 * labeled alternative in {@link COOLParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmtRule(COOLParser.AssignmentStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link COOLParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void enterFeatureCallRule(COOLParser.FeatureCallRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code featureCallRule}
	 * labeled alternative in {@link COOLParser#featureCall}.
	 * @param ctx the parse tree
	 */
	void exitFeatureCallRule(COOLParser.FeatureCallRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(COOLParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(COOLParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link COOLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtRule(COOLParser.IfStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtRule}
	 * labeled alternative in {@link COOLParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtRule(COOLParser.IfStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link COOLParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmtRule(COOLParser.CaseStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseStmtRule}
	 * labeled alternative in {@link COOLParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmtRule(COOLParser.CaseStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(COOLParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(COOLParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link COOLParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtRule(COOLParser.WhileStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmtRule}
	 * labeled alternative in {@link COOLParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtRule(COOLParser.WhileStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(COOLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(COOLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link COOLParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectRule(COOLParser.NewObjectRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjectRule}
	 * labeled alternative in {@link COOLParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectRule(COOLParser.NewObjectRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link COOLParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoidExprRule(COOLParser.IsvoidExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoidExprRule}
	 * labeled alternative in {@link COOLParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoidExprRule(COOLParser.IsvoidExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link COOLParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void enterInvrseExprRule(COOLParser.InvrseExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invrseExprRule}
	 * labeled alternative in {@link COOLParser#invrseExpr}.
	 * @param ctx the parse tree
	 */
	void exitInvrseExprRule(COOLParser.InvrseExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link COOLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExprRule(COOLParser.NotExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExprRule}
	 * labeled alternative in {@link COOLParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExprRule(COOLParser.NotExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(COOLParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(COOLParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(COOLParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(COOLParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#formalsList}.
	 * @param ctx the parse tree
	 */
	void enterFormalsList(COOLParser.FormalsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#formalsList}.
	 * @param ctx the parse tree
	 */
	void exitFormalsList(COOLParser.FormalsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(COOLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(COOLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(COOLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(COOLParser.TypeContext ctx);
}
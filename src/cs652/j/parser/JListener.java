// Generated from /Users/JOKER/Courses/cs652/Roger7410-vtable/grammars/cs652/j/parser/J.g4 by ANTLR 4.5.1

package cs652.j.parser;
import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JParser}.
 */
public interface JListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#mainblock}.
	 * @param ctx the parse tree
	 */
	void enterMainblock(JParser.MainblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#mainblock}.
	 * @param ctx the parse tree
	 */
	void exitMainblock(JParser.MainblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#jType}.
	 * @param ctx the parse tree
	 */
	void enterJType(JParser.JTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#jType}.
	 * @param ctx the parse tree
	 */
	void exitJType(JParser.JTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(JParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(JParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalVarStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarStat(JParser.LocalVarStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalVarStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarStat(JParser.LocalVarStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(JParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(JParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(JParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(JParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(JParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(JParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RetureStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRetureStat(JParser.RetureStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RetureStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRetureStat(JParser.RetureStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(JParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(JParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStringStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStringStat(JParser.PrintStringStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStringStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStringStat(JParser.PrintStringStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallStat(JParser.CallStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallStat(JParser.CallStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhatIsThisStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhatIsThisStat(JParser.WhatIsThisStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhatIsThisStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhatIsThisStat(JParser.WhatIsThisStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code THIS_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTHIS_LABLE(JParser.THIS_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code THIS_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTHIS_LABLE(JParser.THIS_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterID_LABLE(JParser.ID_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitID_LABLE(JParser.ID_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code METHOD_CALL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMETHOD_CALL_LABLE(JParser.METHOD_CALL_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code METHOD_CALL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMETHOD_CALL_LABLE(JParser.METHOD_CALL_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INS_METHOD_CALL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterINS_METHOD_CALL_LABLE(JParser.INS_METHOD_CALL_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INS_METHOD_CALL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitINS_METHOD_CALL_LABLE(JParser.INS_METHOD_CALL_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTEGER_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterINTEGER_LABLE(JParser.INTEGER_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTEGER_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitINTEGER_LABLE(JParser.INTEGER_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FIELD_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFIELD_LABLE(JParser.FIELD_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FIELD_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFIELD_LABLE(JParser.FIELD_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNULL_LABLE(JParser.NULL_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNULL_LABLE(JParser.NULL_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CREATOR_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCREATOR_LABLE(JParser.CREATOR_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CREATOR_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCREATOR_LABLE(JParser.CREATOR_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENS_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPARENS_LABLE(JParser.PARENS_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENS_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPARENS_LABLE(JParser.PARENS_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLOAT_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFLOAT_LABLE(JParser.FLOAT_LABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLOAT_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFLOAT_LABLE(JParser.FLOAT_LABLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JParser.CreatorContext ctx);
}
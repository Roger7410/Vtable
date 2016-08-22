// Generated from /Users/JOKER/Courses/cs652/Roger7410-vtable/grammars/cs652/j/parser/J.g4 by ANTLR 4.5.1

package cs652.j.parser;
import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(JParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#mainblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainblock(JParser.MainblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#jType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJType(JParser.JTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(JParser.BlockStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalVarStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarStat(JParser.LocalVarStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(JParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(JParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(JParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RetureStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetureStat(JParser.RetureStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(JParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStringStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStringStat(JParser.PrintStringStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStat(JParser.CallStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhatIsThisStat}
	 * labeled alternative in {@link JParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhatIsThisStat(JParser.WhatIsThisStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code THIS_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTHIS_LABLE(JParser.THIS_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_LABLE(JParser.ID_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code METHOD_CALL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHOD_CALL_LABLE(JParser.METHOD_CALL_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INS_METHOD_CALL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINS_METHOD_CALL_LABLE(JParser.INS_METHOD_CALL_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTEGER_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTEGER_LABLE(JParser.INTEGER_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FIELD_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFIELD_LABLE(JParser.FIELD_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULL_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULL_LABLE(JParser.NULL_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CREATOR_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCREATOR_LABLE(JParser.CREATOR_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENS_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENS_LABLE(JParser.PARENS_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLOAT_LABLE}
	 * labeled alternative in {@link JParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLOAT_LABLE(JParser.FLOAT_LABLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JParser.CreatorContext ctx);
}
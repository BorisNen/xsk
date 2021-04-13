// Generated from Xsjob.g4 by ANTLR 4.3
package com.sap.xsk.parser.xsjob.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XsjobParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XsjobVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XsjobParser#schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedule(@NotNull XsjobParser.ScheduleContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#xscron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXscron(@NotNull XsjobParser.XscronContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull XsjobParser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#xsjobsequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXsjobsequence(@NotNull XsjobParser.XsjobsequenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#schedules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchedules(@NotNull XsjobParser.SchedulesContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull XsjobParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(@NotNull XsjobParser.PropertyContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(@NotNull XsjobParser.DescriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull XsjobParser.ActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#item_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_description(@NotNull XsjobParser.Item_descriptionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XsjobParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(@NotNull XsjobParser.ItemsContext ctx);
}
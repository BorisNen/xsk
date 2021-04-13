// Generated from Xsjob.g4 by ANTLR 4.3
package com.sap.xsk.parser.xsjob.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XsjobParser}.
 */
public interface XsjobListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XsjobParser#schedule}.
	 * @param ctx the parse tree
	 */
	void enterSchedule(@NotNull XsjobParser.ScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#schedule}.
	 * @param ctx the parse tree
	 */
	void exitSchedule(@NotNull XsjobParser.ScheduleContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#xscron}.
	 * @param ctx the parse tree
	 */
	void enterXscron(@NotNull XsjobParser.XscronContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#xscron}.
	 * @param ctx the parse tree
	 */
	void exitXscron(@NotNull XsjobParser.XscronContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull XsjobParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull XsjobParser.ParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#xsjobsequence}.
	 * @param ctx the parse tree
	 */
	void enterXsjobsequence(@NotNull XsjobParser.XsjobsequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#xsjobsequence}.
	 * @param ctx the parse tree
	 */
	void exitXsjobsequence(@NotNull XsjobParser.XsjobsequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#schedules}.
	 * @param ctx the parse tree
	 */
	void enterSchedules(@NotNull XsjobParser.SchedulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#schedules}.
	 * @param ctx the parse tree
	 */
	void exitSchedules(@NotNull XsjobParser.SchedulesContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull XsjobParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull XsjobParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull XsjobParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull XsjobParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(@NotNull XsjobParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(@NotNull XsjobParser.DescriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull XsjobParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull XsjobParser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#item_description}.
	 * @param ctx the parse tree
	 */
	void enterItem_description(@NotNull XsjobParser.Item_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#item_description}.
	 * @param ctx the parse tree
	 */
	void exitItem_description(@NotNull XsjobParser.Item_descriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XsjobParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(@NotNull XsjobParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XsjobParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(@NotNull XsjobParser.ItemsContext ctx);
}
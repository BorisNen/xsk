package com.sap.xsk.parser.xsjob.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.sap.xsk.parser.xsjob.core.XsjobBaseVisitor;
import com.sap.xsk.parser.xsjob.core.XsjobParser;
import com.sap.xsk.parser.xsjob.exceptions.XSJOBDuplicatePropertyException;
import com.sap.xsk.parser.xsjob.utils.XSJOBConstants;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.List;

public class XsjobVisitor extends XsjobBaseVisitor<JsonElement> {

    private HashSet<String> visitedProperties = new HashSet<>();

    private JsonObject getDefaultParsedObj() {
        JsonObject parsedObj = new JsonObject();
        parsedObj.add(XSJOBConstants.DESCRIPTION_PROPERTY, null);
        parsedObj.add(XSJOBConstants.ACTION_PROPERTY, null);
        parsedObj.add(XSJOBConstants.SCHEDULES_PROPERTY, null);
        return parsedObj;
    }

    private void checkForPropertyRepetition(String property) throws XSJOBDuplicatePropertyException {
        if (!visitedProperties.contains(property)) {
            visitedProperties.add(property);
        } else {

            throw new XSJOBDuplicatePropertyException(String.format("Property %s is already declared!", property));
        }
    }

    @Override
    public JsonElement visitXsjobsequence(@NotNull XsjobParser.XsjobsequenceContext ctx) {
        JsonObject parsedObj = this.getDefaultParsedObj();
        List<ParseTree> ctxList = ctx.children;
        for (ParseTree tree : ctxList) {
            if (tree.getChild(0) instanceof XsjobParser.DescriptionContext) {
                parsedObj.add(XSJOBConstants.DESCRIPTION_PROPERTY,
                        visitDescription((XsjobParser.DescriptionContext) tree.getChild(0)));
            } else if (tree.getChild(0) instanceof XsjobParser.ActionContext) {
                parsedObj.add(XSJOBConstants.ACTION_PROPERTY,
                        visitAction((XsjobParser.ActionContext) tree.getChild(0)));
            } else if (tree.getChild(0) instanceof XsjobParser.SchedulesContext) {
                parsedObj.add(XSJOBConstants.SCHEDULES_PROPERTY,
                        visitSchedules((XsjobParser.SchedulesContext) tree.getChild(0)));
            }
        }
        return parsedObj;
    }

    @Override
    public JsonElement visitDescription (@NotNull XsjobParser.DescriptionContext ctx){
        checkForPropertyRepetition(XSJOBConstants.DESCRIPTION_PROPERTY);
        return (ctx != null && ctx.STRING() != null)
                ? new JsonPrimitive(ctx.STRING().getText())
                : null;

    }

    @Override
    public JsonElement visitAction (@NotNull XsjobParser.ActionContext ctx){
        checkForPropertyRepetition(XSJOBConstants.ACTION_PROPERTY);
        return (ctx != null && ctx.STRING() != null)
                ? new JsonPrimitive(ctx.STRING().getText())
                : null;

    }

    @Override
    public JsonElement visitSchedules (@NotNull XsjobParser.SchedulesContext ctx){
        checkForPropertyRepetition(XSJOBConstants.SCHEDULES_PROPERTY);
        JsonArray schedulesList = new JsonArray();
        if (ctx != null && ctx.schedule() != null) {
            ctx.schedule().forEach(t -> {
                schedulesList.add(visitSchedule(t));
            });
        }
        return schedulesList;
    }

    @Override
    public JsonElement visitSchedule(XsjobParser.ScheduleContext ctx) {
        JsonObject schedule = new JsonObject();
        if (ctx != null && ctx.items() != null) {
            for (XsjobParser.ItemsContext item: ctx.items()) {
                if (item.getChild(0) instanceof XsjobParser.Item_descriptionContext) {
                    schedule.add(XSJOBConstants.ITEM_DESCRIPTION_PROPERTY,
                            visitItem_description((XsjobParser.Item_descriptionContext) item.getChild(0)));
                } else if (item.getChild(0) instanceof XsjobParser.XscronContext) {
                    schedule.add(XSJOBConstants.XSCRON_PROPERTY,
                            visitXscron((XsjobParser.XscronContext) item.getChild(0)));
                } else if (item.getChild(0) instanceof XsjobParser.ParameterContext) {
                    schedule.add(XSJOBConstants.PARAMETER_PROPERTY,
                            visitParameter((XsjobParser.ParameterContext) item.getChild(0)));
                }
            }
        }
        return schedule;
    }

    @Override
    public JsonElement visitItem_description (@NotNull XsjobParser.Item_descriptionContext ctx){
        return (ctx != null && ctx.STRING() != null)
                ? new JsonPrimitive(ctx.STRING().getText())
                : null;
    }

    @Override
    public JsonElement visitXscron(XsjobParser.XscronContext ctx) {
        return (ctx != null && ctx.STRING() != null)
                ? new JsonPrimitive(ctx.STRING().getText())
                : null;
    }

    @Override
    public JsonElement visitParameter(XsjobParser.ParameterContext ctx) {
        JsonObject params = new JsonObject();
        if (ctx != null && ctx.param() != null) {
            for(XsjobParser.ParamContext param: ctx.param()) {
                params.add(param.STRING().get(0).getText(),
                        new JsonPrimitive(param.STRING().get(1).getText()));
            }
        }
        return params;
    }
}

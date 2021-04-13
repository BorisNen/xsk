package com.sap.xsk.parser.xsjob.models;

import com.sap.xsk.parser.xsjob.exceptions.XSJOBMissingPropertyException;

import java.util.List;
import java.util.Objects;

public class XSJOBModel {

    String description;
    String action;
    List<XSJOBSchedulesModel> schedules;

    public XSJOBModel() {
    }

    public XSJOBModel(String description, String action, List<XSJOBSchedulesModel> schedules) {
        this.description = description;
        this.action = action;
        this.schedules = schedules;
    }

    public String getDescription() {
        return description;
    }

    private <T> void checkPresence(T field, String fieldName) throws XSJOBMissingPropertyException {
        if(Objects.isNull(field)){
            throw new XSJOBMissingPropertyException(String.format("Missing mandatory field %s!", fieldName));
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<XSJOBSchedulesModel> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<XSJOBSchedulesModel> schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {
        return "XSJOBSEQUENCEModel{" +
                "description='" + description + '\'' +
                ", action='" + action + '\'' +
                ", schedules=" + schedules +
                '}';
    }
}

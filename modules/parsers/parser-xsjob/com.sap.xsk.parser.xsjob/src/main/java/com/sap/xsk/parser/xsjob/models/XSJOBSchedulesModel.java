package com.sap.xsk.parser.xsjob.models;

import com.sap.xsk.parser.xsjob.exceptions.XSJOBMissingPropertyException;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class XSJOBSchedulesModel {

    String description;
    String xscron;
    Map<String, String> parameter;

    public XSJOBSchedulesModel() {
    }

    public XSJOBSchedulesModel(String description, String xscron, Map<String, String> parameter) {
        this.description = description;
        this.xscron = xscron;
        this.parameter = parameter;
    }

    private <T> void checkPresence(T field, String fieldName) throws XSJOBMissingPropertyException {
        if(Objects.isNull(field)){
            throw new XSJOBMissingPropertyException(String.format("Missing mandatory field %s!", fieldName));
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getXscron() {
        return xscron;
    }

    public void setXscron(String xscron) {
        this.xscron = xscron;
    }

    public Map<String, String> getParameter() {
        return parameter;
    }

    public void setParameter(Map<String, String> parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "XSJOBSchedulesModel{" +
                "description='" + description + '\'' +
                ", xscron='" + xscron + '\'' +
                ", parameter='" + parameter + '\'' +
                '}';
    }
}

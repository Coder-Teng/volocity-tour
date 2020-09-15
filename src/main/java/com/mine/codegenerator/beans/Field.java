package com.mine.codegenerator.beans;

public class Field {
    private String fieldType;
    private String fieldName;

    private String fileNameUpperCase;

    public Field(String fieldName, String fieldType) {
        super();
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFileNameUpperCase() {
        return fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
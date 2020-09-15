package com.mine.codegenerator.beans;

import java.io.File;
import java.util.List;

public class GenEntity {

    private String genDir;
    private String fileName;
    private String fileSuffix;
    private String genPath;
    private String packagePath;
    private String className;

    List<Field> fieldList;

    public String getGenPath() {
        return genDir + File.separator + fileName + fileSuffix;
    }

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public String getGenDir() {
        return genDir;
    }

    public void setGenDir(String genDir) {
        this.genDir = genDir;
    }

    @Override
    public String toString() {
        return "GenEntity{" +
                "genDir='" + genDir + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSuffix='" + fileSuffix + '\'' +
                ", genPath='" + genPath + '\'' +
                ", packagePath='" + packagePath + '\'' +
                ", className='" + className + '\'' +
                ", fieldList=" + fieldList +
                '}';
    }
}
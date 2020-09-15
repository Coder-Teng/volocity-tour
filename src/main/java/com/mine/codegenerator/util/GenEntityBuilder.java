package com.mine.codegenerator.util;

import com.mine.codegenerator.beans.Field;
import com.mine.codegenerator.beans.GenEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Teng
 * @create 2020-09-11
 */
public class GenEntityBuilder {
    public static GenEntity build(String genDir) {
        GenEntity genEntity = new GenEntity();
        genEntity.setGenDir(genDir);
        genEntity.setFileName("User");
        genEntity.setFileSuffix(".java");
        genEntity.setPackagePath("com.velocity.gen");
        genEntity.setClassName("User");
        List<Field> fieldList = new ArrayList<>();
        fieldList.add(new Field("id", "int"));
        fieldList.add(new Field("firstName", "String"));
        fieldList.add(new Field("lastName", "String"));
        fieldList.add(new Field("dob", "LocalDate"));
        genEntity.setFieldList(fieldList);
        return genEntity;
    }
    public static GenEntity build4Test(String genDir) {
        GenEntity genEntity = new GenEntity();
        genEntity.setGenDir(genDir);
        genEntity.setFileName("User");
        genEntity.setFileSuffix(".txt");
        genEntity.setPackagePath("com.velocity.gen");
        genEntity.setClassName("User");
        List<Field> fieldList = new ArrayList<>();
        fieldList.add(new Field("id", "int"));
        fieldList.add(new Field("firstName", "String"));
        fieldList.add(new Field("lastName", "String"));
        fieldList.add(new Field("dob", "LocalDate"));
        genEntity.setFieldList(fieldList);
        return genEntity;
    }
}

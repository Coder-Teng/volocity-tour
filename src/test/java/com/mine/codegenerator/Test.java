package com.mine.codegenerator;

import com.mine.codegenerator.beans.Field;
import com.mine.codegenerator.beans.GenEntity;
import com.mine.codegenerator.constant.GenConstant;
import com.mine.codegenerator.util.FileUtil;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Teng
 * @create 2020-09-11
 */
public class Test {
    public static void main(String[] args) throws Exception {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
        velocityEngine.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
        velocityEngine.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH,
            "D:\\Git\\code-favorites\\volocitydemo\\src\\main\\java\\com\\mine\\codegenerator\\template");

        velocityEngine.init();
        VelocityContext context = new VelocityContext();
        GenEntity genEntity = build4Test(GenConstant.GENDIR);
        context.put("genEntity", genEntity);
        Template t = velocityEngine.getTemplate("test2.vm", "UTF-8");
        StringWriter writer = new StringWriter();

        t.merge(context, writer);
        FileUtil.write2File(genEntity.getGenPath(), writer.toString(), false);
    }

    public static GenEntity build4Test(String genDir) {
        GenEntity genEntity = new GenEntity();
        genEntity.setGenDir(genDir);
        genEntity.setFileName("User2");
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

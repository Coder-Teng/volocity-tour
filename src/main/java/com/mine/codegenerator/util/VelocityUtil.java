package com.mine.codegenerator.util;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.mine.codegenerator.beans.Field;
import com.mine.codegenerator.beans.GenEntity;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class VelocityUtil {

    public static String genContent(String templatePath, GenEntity genEntity) {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.setProperty(Velocity.ENCODING_DEFAULT, "UTF-8");
        velocityEngine.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
        velocityEngine.init();
        VelocityContext context = new VelocityContext();
        context.put("genEntity", genEntity);
        StringWriter stringWriter = new StringWriter();
        velocityEngine.evaluate(context, stringWriter, templatePath, FileUtil.readFromFile(templatePath).toString());
        return stringWriter.toString();
    }
}
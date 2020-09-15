package com.mine.codegenerator;
import com.mine.codegenerator.beans.GenEntity;
import com.mine.codegenerator.constant.GenConstant;
import com.mine.codegenerator.util.FileUtil;
import com.mine.codegenerator.util.GenEntityBuilder;
import com.mine.codegenerator.util.VelocityUtil;

/**
 * @author Teng
 * @create 2020-09-11
 */
public class TestVelocityGenApplication {

    public static void main(String[] args) {
        try {
            GenEntity genEntity = GenEntityBuilder.build4Test(GenConstant.GENDIR);
            String templatePath = GenConstant.ABDIR + "\\test.vm";
            String content = VelocityUtil.genContent(templatePath, genEntity);
            FileUtil.write2File(genEntity.getGenPath(), content, false);
        } catch (Exception e) {
            e.printStackTrace();;
        }
    }
}

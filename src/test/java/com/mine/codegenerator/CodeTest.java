package com.mine.codegenerator;

/**
 * @author Teng
 * @create 2020-09-14
 */
public class CodeTest {

    public static void main(String[] args) {
        String path1 = "D:\\SVN\\code-gen";
        String path2 = "D:/SVN/code-gen";
        String path3 = "avicit\\platform6\\console";
        String path4 = "avicit/platform6/console";
        System.out.println("replaceFileSep(path1) = " + replaceFileSep(path1));
        System.out.println("replaceFileSep(path2) = " + replaceFileSep(path2));
        System.out.println("replaceFileSep(path3) = " + replaceFileSep(path3));
        System.out.println("replaceFileSep(path4) = " + replaceFileSep(path4));
    }

    public static String replaceFileSep(String path) {
        if (path == null || "".equals(path)) {
            return null;
        }
        return path.replaceAll("\\\\","/");
    }

}

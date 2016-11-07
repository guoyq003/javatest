package com.jd.io.demo;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CommonsIoDemo {
    /** 复制文件或者目录,复制前后文件完全一样。
    * @param resFilePath   源文件路径
    * @param distFolder    目标文件夹
    */
    public static void copyFile(String resFilePath, String distFolder){
        File resFile=new File(resFilePath);
        File distFile=new File(distFolder);
        if (resFile.isDirectory()){
            try {
                FileUtils.copyDirectory(resFile,distFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (resFile.isFile()){
            try {
                FileUtils.copyFileToDirectory(resFile,distFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 删除一个文件或者目录
     * @param targetPath
     */
    public static void deleteFile(String targetPath){
        File targetFile=new File(targetPath);
        if (targetFile.isDirectory()){
            try {
                FileUtils.deleteDirectory(targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (targetFile.isFile()){
            targetFile.delete();
        }
    }
    /**
     * 将字符串写入指定文件(当指定的父路径中文件夹不存在时，会最大限度去创建，以保证保存成功！)
     *
     * @param res         原字符串
     * @param filePath    文件路径
     * @return 成功标记
     */
    public static boolean string2File(String res, String filePath) throws Exception{
        boolean flag=true;
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            File distFile=new File(filePath);
            if (!distFile.getParentFile().exists()){
                distFile.getParentFile().mkdir();
            }
            try {
                bufferedReader=new BufferedReader(new StringReader(res));
                bufferedWriter=new BufferedWriter(new FileWriter(distFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
            char buf[] = new char[1024];
            int len;
            while ((len = bufferedReader.read(buf)) != -1){
                bufferedWriter.write(buf,0,len);
            }
            bufferedWriter.flush();
            bufferedReader.close();
            bufferedWriter.close();
        }catch (IOException e){
            flag=false;
            throw e;
        }
        return flag;
    }
    /**
     * 取得指定文件内容
     * @param filePath    文件路径
     * @return 成功标记
     * @throws IOException
     */
    public static List<String> getContentFromFile(String filePath) throws IOException {
        List<String> lists = null;
        try {
            if(!(new File(filePath).exists())){
                return new ArrayList<String>();
            }
            lists = FileUtils.readLines(new File(filePath), Charset.defaultCharset());
//            System.out.println(Charset.defaultCharset());
        } catch (IOException e) {
            throw e;
        }
        return lists;
    }
    /**
     * 给指定文件追加内容
     * @param filePath
     * @param contents
     */
    public static void addContent(String filePath, List<String> contents) throws IOException {
        try {
            FileUtils.writeLines(new File(filePath), contents);
        } catch (IOException e) {
            throw e;
        }
    }
}

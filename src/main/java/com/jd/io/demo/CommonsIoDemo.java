package com.jd.io.demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

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
}

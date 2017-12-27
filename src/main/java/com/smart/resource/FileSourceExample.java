package com.smart.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSourceExample {

    public static void main(String[] args) {
        try {
            String filePath = "F:\\Spring\\code\\chapter_4\\src\\main\\resources\\conf\\file1.txt";
            //使用系统文件路径加载文件
            WritableResource wres = new PathResource(filePath);
            //使用类路径方式加载文件
            Resource res = new ClassPathResource("conf/file1.txt");
            //使用WritableResource接口写资源文件
            OutputStream outputStream = wres.getOutputStream();
            outputStream.write("欢迎光临Mr.L论坛".getBytes());
            outputStream.close();
            //使用Resource接口读资源文件
            InputStream wins = wres.getInputStream();
            InputStream ins = res.getInputStream();
            //ByteArrayOutputStream相当于缓存区，将
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int i;
            while ((i = wins.read()) != -1) {
                baos.write(i);
            }
            System.out.println(baos.toString());

            System.out.println("wres:" + wres.getFilename());
            System.out.println("res:" + res.getFilename());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

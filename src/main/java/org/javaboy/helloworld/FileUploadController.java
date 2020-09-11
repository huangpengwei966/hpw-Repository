package org.javaboy.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
    @RequestMapping("/file")
    public String file() {
        return "file";
    }

    @RequestMapping("/file2")
    public String file2() {
        return "file2";
    }

    @RequestMapping("/file3")
    public String file3() {
        return "file3";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest req) {
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        System.out.println(realPath);
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            file.transferTo(new File(folder, newName));
            String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/img" + format + newName;
            return url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failed";
    }

    @RequestMapping("/upload2")
    @ResponseBody
    public void upload2(/*@RequestParam("multipartFile") */MultipartFile[] files, HttpServletRequest req) {
        //此处用@RequestParam（"xx"）来指定参数名，上送file2页面所有name=multipartFile的file
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        try {
            for (MultipartFile file : files) {
                String oldName = file.getOriginalFilename();
                String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
                file.transferTo(new File(folder, newName));
                String url = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/img" + format + newName;
                System.out.println(url);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/upload3")
    @ResponseBody
    public void upload3(MultipartFile file1, MultipartFile file2, HttpServletRequest req) {
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        try {
            String oldName = file1.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
            file1.transferTo(new File(folder, newName));
            String url1 = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/img" + format + newName;
            System.out.println(url1);
            String oldName2 = file2.getOriginalFilename();
            String newName2 = UUID.randomUUID().toString() + oldName2.substring(oldName2.lastIndexOf("."));
            file2.transferTo(new File(folder, newName2));
            String url2 = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/img" + format + newName2;
            System.out.println(url2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
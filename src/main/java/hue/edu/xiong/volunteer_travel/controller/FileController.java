package hue.edu.xiong.volunteer_travel.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;


@RestController
@ResponseBody
@Slf4j

public class FileController {
    @PostMapping("/upload")
    @RequestMapping(value = "imgUpDown",method = {RequestMethod.POST})
    public String imgUpDown(@RequestParam("file") MultipartFile file) throws IOException {
        //获取文件名
        String fileName = file.getOriginalFilename();
        //获取文件后缀名。也可以在这里添加判断语句，规定特定格式的图片才能上传，否则拒绝保存。
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //为了避免发生图片替换，这里使用了文件名重新生成
        fileName = UUID.randomUUID()+suffixName;

        String path = ResourceUtils.getURL("classpath:").getPath()+"public/img/";
        file.transferTo(new File(path+fileName));

        return "http://localhost:5050/img/"+fileName;
    }
}

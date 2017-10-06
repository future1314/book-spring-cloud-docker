package com.getset.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String fileupload(@RequestParam(value = "file")MultipartFile file) throws IOException {
            byte[] bytes = file.getBytes();
            File fileToSave = new File(file.getOriginalFilename());
            FileCopyUtils.copy(bytes, fileToSave);
            return fileToSave.getAbsolutePath();
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody String test() {
        return "Hello, Zuul!";
    }
}

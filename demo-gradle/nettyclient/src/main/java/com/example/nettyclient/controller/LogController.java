package com.example.nettyclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: zhou yu
 * @create: 2021-06-01 12:32
 */
@Controller
@RequestMapping("/zhouyu")
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("say")
    public String test(){
        logger.info("测试");
        return "zhoyu";
    }
}

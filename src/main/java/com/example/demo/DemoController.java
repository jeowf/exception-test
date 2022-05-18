package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/throw")
    public void raiseException() throws Exception{
        LOGGER.info(">>>>> /throw");
        Exception e = new Exception("Exception!");
        // Nada
        throw e;
    }

    @GetMapping("/throw-log")
    public void raiseExceptionWithLog() throws Exception{
        LOGGER.info(">>>>> /throw-log");
        Exception e = new Exception("Exception!");
        LOGGER.error("logging", e);
        throw e;
    }

}

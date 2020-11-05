package cn.metaq.consul.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @GetMapping("producer")
    public String hello() {

        return "Producer";
    }
}

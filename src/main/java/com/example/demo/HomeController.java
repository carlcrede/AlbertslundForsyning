package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/energibesparelser")
    public String energibesparelser() {
        return "energibesparelser";
    }

    @GetMapping("/driftsstatus")
    public String driftsstatus() {
        return "driftsstatus";
    }

    @GetMapping("/tao")
    public String tao() {
        return "tao";
    }
}

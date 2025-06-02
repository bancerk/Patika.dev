package dev.patika.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customerExample")
public class CustomerControllerExample {

    @GetMapping("/")
    public String get() {
        return "Customer Get Metodu Çalıştı.";
    }

    @PostMapping("/save")
    public String save(@RequestBody String data) {
        return "Gelen Veri : " + data;
    }
}

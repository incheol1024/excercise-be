package me.incheol.exercisebe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercise")
public class ExController {

    @GetMapping("/get")
    public String getString() {
        return "get!";
    }

}

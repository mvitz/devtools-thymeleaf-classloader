package com.innoq.dtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    static class SomeClass {
    }

    @Controller
    static class SomeController {

        @GetMapping("/")
        public ModelAndView index() {
            return new ModelAndView("index")
                    .addObject("foo", new SomeClass());
        }
    }
}

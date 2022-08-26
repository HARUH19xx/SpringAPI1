package com.example.SpringAPI1

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("message", "Hello, Kotlin!!")
        return "index"
    }
}
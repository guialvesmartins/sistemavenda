package com.api.sistemavenda.config;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Doc")
public class SeuController {

    @GetMapping()
    public String redirecionarParaSwagger() {
        // Redirecionar para a página do Swagger
        return "redirect:/swagger-ui/index.html";
    }
}
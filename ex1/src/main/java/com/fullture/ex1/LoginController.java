package com.fullture.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login(Model model) {

        model.addAttribute("usuario", new Usuario());
        return "login";
	}

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute Usuario usuario, Model model) {
        model.addAttribute("usuario", usuario);
		return "result";
	}    
}

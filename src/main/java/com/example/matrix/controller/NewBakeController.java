package com.example.matrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * NewBakeController
 *
 * @author Aleksey Sokolov
 * @version 1.0
 */

@Controller
public class NewBakeController {
	
    @GetMapping("/newbake/{matrix}")
    public String read(@PathVariable String matrix, Model model) {
        model.addAttribute("matrix", matrix);
        return "newbake";
    }
}
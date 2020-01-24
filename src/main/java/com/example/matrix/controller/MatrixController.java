package com.example.matrix.controller;

import com.example.matrix.model.Matrix;
import com.example.matrix.repository.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * MatrixController
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */
@Controller
public class MatrixController {
    private final MatrixRepository matrixRepository;

    @Autowired
    public MatrixController(MatrixRepository matrixRepository) {
        this.matrixRepository = matrixRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Matrix> matrices = matrixRepository.findAll();
        model.addAttribute("matrices", matrices);
        return "index";
    }
}

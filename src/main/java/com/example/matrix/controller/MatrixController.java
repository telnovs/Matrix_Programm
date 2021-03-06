package com.example.matrix.controller;

import com.example.matrix.model.BakedFrame;
import com.example.matrix.model.Matrix;
import com.example.matrix.repository.BakedFrameRepository;
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
    
    @Autowired
    private BakedFrameRepository bakedFrameRepository;
    
    @GetMapping("/")
    public String index(Model model) {
        List<Matrix> matrices = matrixRepository.findAll();
        model.addAttribute("matrices", matrices);
        List<BakedFrame> bakedFrames = bakedFrameRepository.findAll();
        model.addAttribute("bakedFrames", bakedFrames);
        return "index";
    }
}

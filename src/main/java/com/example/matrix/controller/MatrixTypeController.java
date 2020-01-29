package com.example.matrix.controller;

import com.example.matrix.model.MatrixType;
import com.example.matrix.service.MatrixTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * MatrixTypesController
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */
@Controller
@RequestMapping("/admin/matrices/types")
public class MatrixTypeController {

    private MatrixTypeService matrixTypeService;

    @Autowired
    public MatrixTypeController(MatrixTypeService matrixTypeService) {
        this.matrixTypeService = matrixTypeService;
    }

    @GetMapping
    public String main(Model model) {
        List<MatrixType> matrixTypeList = matrixTypeService.findAll();
        model.addAttribute("matrixTypeList", matrixTypeList);
        return "adminMatrixTypes";
    }

    @GetMapping("create")
    public String getCreatePage(){
        return "adminMatrixTypeCreate";
    }

    @PostMapping("create")
    public String create(MatrixType matrixType, Model model) {
        if (matrixType.getName().isEmpty()) {
            model.addAttribute("message", "Укажите наименование типа матрицы!");
            return "adminMatrixTypeCreate";
        }

        if (matrixTypeService.save(matrixType)) {
            model.addAttribute("message", "Тип матрицы с таким наименованием уже существует!");
            return "adminMatrixTypeCreate";
        }

        return "redirect:/admin/matrices/types";
    }

    @GetMapping("{matrixType}")
    public String getType(@PathVariable MatrixType matrixType, Model model) {
        model.addAttribute("matrixType", matrixType);
        return "adminMatrixTypeEdit";
    }

    @PostMapping("{matrixType}")
    public String updateType(
            @PathVariable MatrixType matrixType,
            @RequestParam String name,
            Model model
    ) {
        matrixType.setName(name);

        if (matrixType.getName().isEmpty()) {
            model.addAttribute("message", "Укажите наименование типа матрицы!");
            return "adminMatrixTypeEdit";
        }

        if (matrixTypeService.save(matrixType)) {
            model.addAttribute("matrixType", matrixType);
            model.addAttribute("message", "Тип матрицы с таким наименованием уже существует!");
            return "adminMatrixTypeEdit";
        }
        return "redirect:/admin/matrices/types";
    }
}

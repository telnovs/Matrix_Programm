package com.example.matrix.service;

import com.example.matrix.model.MatrixType;
import com.example.matrix.repository.MatrixTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MatrixTypeService
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */
@Service
public class MatrixTypeService {
    private MatrixTypeRepository matrixTypeRepository;

    @Autowired
    public MatrixTypeService(MatrixTypeRepository matrixTypeRepository) {
        this.matrixTypeRepository = matrixTypeRepository;
    }

    public List<MatrixType> findAll() {
        return matrixTypeRepository.findAll();
    }

    public boolean save(MatrixType matrixType) {
        MatrixType matrixTypeDB = matrixTypeRepository.findByName(matrixType.getName());

        if (matrixTypeDB != null) return true;

        matrixTypeRepository.save(matrixType);

        return false;
    }
}

package com.example.matrix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.matrix.model.MatrixType;
import com.example.matrix.repository.MatrixRepository;
import com.example.matrix.repository.MatrixTypeRepository;

/**
 * MatrixTypeService
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */
@Service
public class MatrixTypeService {
    private MatrixTypeRepository matrixTypeRepository;
    private MatrixRepository matrixRepository;
    
    @Autowired
    public MatrixTypeService(MatrixTypeRepository matrixTypeRepository, MatrixRepository matrixRepository) {
        this.matrixTypeRepository = matrixTypeRepository;
        this.matrixRepository = matrixRepository;
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
        
    public boolean delete(MatrixType matrixType) {
    	if (matrixRepository.existsByType(matrixType)) return false;
    	matrixTypeRepository.delete(matrixType);
    	
    	return true;
    }
}

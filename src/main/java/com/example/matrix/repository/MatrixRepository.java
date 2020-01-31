package com.example.matrix.repository;

import com.example.matrix.model.Matrix;
import com.example.matrix.model.MatrixType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MatrixRepository
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */
@Repository
public interface MatrixRepository extends JpaRepository<Matrix, Long> {

	boolean existsByType(MatrixType matrixType);
}

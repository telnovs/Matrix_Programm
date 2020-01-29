package com.example.matrix.repository;

import com.example.matrix.model.MatrixType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MatrixTypesRepository
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */
@Repository
public interface MatrixTypeRepository extends JpaRepository<MatrixType, Long> {
    MatrixType findByName(String name);
}

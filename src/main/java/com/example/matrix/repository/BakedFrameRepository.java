package com.example.matrix.repository;

import com.example.matrix.model.BakedFrame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MatrixRepository
 *
 * @author Aleksey Sokolov
 * @version 1.0
 */

@Repository
public interface BakedFrameRepository extends JpaRepository<BakedFrame, Long> {

}

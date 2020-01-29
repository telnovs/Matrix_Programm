package com.example.matrix.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * MatrixType
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "matrix_types")
public class MatrixType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank(message = "Name cannot be empty")
    private String name;

    public MatrixType(String name) {
        this.name = name;
    }
}

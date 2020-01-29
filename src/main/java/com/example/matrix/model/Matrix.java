package com.example.matrix.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import javax.persistence.*;

/**
 * Matrix
 *
 * @author Kamyhin Alexander
 * @version 1.0
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "matrices")
public class Matrix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="type")
    private MatrixType type;

    private Integer size;
    private String serial;
    private Integer number;
    private Boolean visible;
}

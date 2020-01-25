package com.example.matrix.model;

import lombok.Data;
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
@Table(name = "matrices")
public class Matrix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;
    
    @OneToMany(mappedBy = "matrix", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<BakedFrame> bakedFrames;
}

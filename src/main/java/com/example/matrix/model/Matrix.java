package com.example.matrix.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

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
	public Matrix() {
		super();
	}
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
    
    public String getName() {
    	return type.getName() + " " + size.toString() + "(" + number.toString() + ")";
    }
    public Long getId() {
		return id;
	}
	public MatrixType getType() {
		return type;
	}
	public Integer getSize() {
		return size;
	}
	public String getSerial() {
		return serial;
	}
	public Integer getNumber() {
		return number;
	}
	public Boolean getVisible() {
		return visible;
	}
}

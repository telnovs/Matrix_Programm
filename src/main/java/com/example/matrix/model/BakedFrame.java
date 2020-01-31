package com.example.matrix.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * BakedFrame
 *
 * @author Aleksey Sokolov
 * @version 1.0
 */

@Entity
@Data
@Table(name = "baked_frames")
public class BakedFrame {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@NotNull
	private java.time.LocalDateTime timestamp;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="matrix_id", nullable=false)
	@NotNull
    private Matrix matrix;
	
	@Column(name="baking_time_1")
	@NotNull
	private java.time.LocalTime bakingTime1;
	
	@Column(name="baking_time_2")
	private java.time.LocalTime bakingTime2;
	
	@NotNull
	private Boolean success;
	
	@Column(name="id_in_1c")
	private String idIn1C;
	
	public Long getId() {
		return id;
	}

	public java.time.LocalDateTime getTimestamp() {
		return timestamp;
	}

	public Matrix getMatrix() {
		return matrix;
	}

	public java.time.LocalTime getBakingTime1() {
		return bakingTime1;
	}

	public java.time.LocalTime getBakingTime2() {
		return bakingTime2;
	}

	public Boolean getSuccess() {
		return success;
	}

	public String getIdIn1C() {
		return idIn1C;
	}
}
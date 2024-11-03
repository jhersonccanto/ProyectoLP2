package com.example.Proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="evaluacion_academica")
public class EvaluacionAcademica {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_evaluacion")
	private Long id_evaluacion;
	
	@Column(name="fecha_evaluacion")
private String fecha_evaluacion;
	
	@Column(name="calificacion")
private String calificacion;
	
	@Column(name="observaciones")
private String observaciones;
	
	@Column(name="nombre")
private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_plan_practica", nullable = false)
	private PlanPractica plan_practica;
}

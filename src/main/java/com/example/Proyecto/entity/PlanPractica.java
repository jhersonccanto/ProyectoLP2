package com.example.Proyecto.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name="plan_practica")
public class PlanPractica {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_plan_practica")
	private Long id_plan_practica;
	
	@Column(name="fecha_inicio")
private String fecha_inicio;
	
	@Column(name="fecha_fin")
private String fecha_fin;
	
	@Column(name="horas_plan")
private String horas_plan;
	
	@Column(name="nota_academica")
private String nota_academica;
	
	@Column(name="nota_empresarial")
private String nota_empresarial;
	
	@Column(name="ponderado_final")
	private String ponderado_final;
	
	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)
	private EstadoPPP estado_ppp;
	
	@ManyToOne
	@JoinColumn(name = "id_plan_carrera", nullable = false)
	private PlanCarrera plan_carrera;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "plan_practica")
	@JsonIgnore
	private Set<EvaluacionAcademica> evaluacion_academica;
	
	@ManyToOne
	@JoinColumn(name = "id_solicitud", nullable = false)
	private Solicitud solicitud;
	
	@ManyToOne
	@JoinColumn(name = "id_linea", nullable = false)
	private Linea linea;
	
	@ManyToOne
	@JoinColumn(name = "id_supervisor", nullable = false)
	private Supervisor supervisor;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "plan_practica")
	@JsonIgnore
	private Set<Documentacion> documentacion;
}

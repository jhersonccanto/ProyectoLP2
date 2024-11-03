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
@Table(name="documentacion")
public class Documentacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_documentacion")
	private Long id_documentacion;
	
	@Column(name="nombre")
private String nombre;
	
	@Column(name="url")
	private String url;
	
	@Column(name="fecha_creacion")
	private String fecha_creacion;
	
	@Column(name="fecha_subida")
	private String fecha_subida;
	
	@Column(name="estado")
private String estado;
	
	@ManyToOne
	@JoinColumn(name = "id_plan_practica", nullable = false)
	private PlanPractica plan_practica;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_documento", nullable = false)
	private TipoDocumento tipo_documento;
}

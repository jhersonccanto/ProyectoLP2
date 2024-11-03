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
@Table(name="solicitud")
public class Solicitud {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_solicitud")
	private Long id_solicitud;
	
	@Column(name="fecha_creacion")
private String fecha_creacion;
	
	@Column(name="fecha_envio")
private String fecha_envio;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa", nullable = false)
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "id_estado", nullable = false)
	private EstadoPPP estado_ppp;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "solicitud")
	@JsonIgnore
	private Set<PlanPractica> plan_practica;
	
	@ManyToOne
	@JoinColumn(name = "id_practicante", nullable = false)
	private Practicante practicante;
	
	@ManyToOne
	@JoinColumn(name = "id_linea", nullable = false)
	private Linea linea;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_documento", nullable = false)
	private TipoDocumento tipo_documento;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "solicitud")
	@JsonIgnore
	private Set<Notificaciones> notificaciones;
}

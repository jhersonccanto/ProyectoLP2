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
@Table(name="historial_notificaciones")
public class HistorialNotificaciones {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_historial")
	private Long id_historial;
	
	@Column(name="fecha_envio")
private String fecha_envio;
	
	@Column(name="fecha_vista")
private String fecha_vista;
	
	@ManyToOne
	@JoinColumn(name = "id_notificacion", nullable = false)
	private Notificaciones notificaciones;
}

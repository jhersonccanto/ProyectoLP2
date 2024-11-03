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
@Table(name="mensaje")
public class Mensaje {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id_mensaje")
	private Long id_mensaje;
	
	@Column(name="mensaje_emisor")
private String mensaje_emisor;
	
	@Column(name="mensaje_receptor")
private String mensaje_receptor;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_documento", nullable = false)
	private TipoDocumento tipo_documento;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "mensaje")
	@JsonIgnore
	private Set<Notificaciones> notificaciones;

}

package com.example.Proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@Column(name="id")
	private Long id;
	
	@Column(name="fechacreacion")
private String fechacreacion;
	
	@Column(name="fechaenvio")
private String fechaenvio;
	
	
}

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
@Table(name="planpractica")
public class PlanPractica {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;
	
	@Column(name="fechainicio")
private String fechainicio;
	
	@Column(name="fechafin")
private String fechafin;
	
	@Column(name="horasplan")
private String horasplan;
	
	@Column(name="notaacademica")
private String notaacademica;
	
	@Column(name="notaempresarial")
private String notaempresarial;
	
	@Column(name="ponderadofinal")
	private String ponderadofinal;
}

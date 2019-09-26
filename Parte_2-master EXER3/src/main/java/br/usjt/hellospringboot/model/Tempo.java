package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="previsoes")
public class Tempo implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	// private String dia;
	@Column(nullable=false, length=50)
	private Double Min;
	
	@Column(nullable=false, length=50)
	private Double Max;
	
	@Column(nullable=false, length=20)
	private Double ar;
	
	@Column(nullable=false, length=200)
	private String tex;
	
	@Column(nullable=false, length=20)
	private String dat;
	
	@Column(nullable=false, length=20)
	private Double hor;
	
	@Column(nullable=false, length=200)
	private Double lat;
	
	@Column(nullable=false, length=200)
	private Double lon;



	@OneToOne (optional=false)
	@JoinColumn (name = "id_dia")
	private Dia dDia;
	


	
	
}

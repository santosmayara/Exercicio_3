package br.usjt.hellospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
// @Table (name="dia")
@ToString @Getter @Setter
public class Dia {
	@Id
	@GeneratedValue
	private Long id;
	private String day;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
//	
//	@OneToOne 
//	@JoinColumn (name="pDia_FK")
//	private Previsao pDia;

}

package com.example.demo.matriculacion.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matricula {
	private LocalDate fMatricula;
	private BigDecimal vMatricula;
	
	
	
	@Override
	public String toString() {
		return "Matricula [fMatricula=" + fMatricula + ", vMatricula=" + vMatricula + "]";
	}
	//GET Y SET
	public LocalDate getfMatricula() {
		return fMatricula;
	}
	public void setfMatricula(LocalDate fMatricula) {
		this.fMatricula = fMatricula;
	}
	public BigDecimal getvMatricula() {
		return vMatricula;
	}
	public void setvMatricula(BigDecimal vMatricula) {
		this.vMatricula = vMatricula;
	}

}

package com.example.demo.matriculacion.repository;

import java.util.List;

import com.example.demo.matriculacion.repository.modelo.Matricula;
import com.example.demo.matriculacion.repository.modelo.Propietario;

public interface MatriculaRepository {
	public void insertar(Matricula matricula);
	public void actualizar(String nombre);
	public void eliminar(String nombre );
	public Propietario seleccionarPorId(String id);
	
	public List <Matricula> seleccionaTodos();

}

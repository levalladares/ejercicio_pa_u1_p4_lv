package com.example.demo.matriculacion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.matriculacion.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService {
	
	private static List<Propietario> baseDatos=new ArrayList<>();

	@Override
	public void crear(Propietario propietario) {
		baseDatos.add(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		Propietario prop=this.buscar(propietario.getNombre());
		this.eliminar(propietario.getNombre());
		this.crear(propietario);
		
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		Propietario prop= this.buscar(nombre);
		baseDatos.remove(prop);
		
		
	}

	@Override
	public Propietario buscar(String id) {
		// TODO Auto-generated method stub
		Propietario propEncontrado=new Propietario ();
		for (Propietario prop:baseDatos) {
			if(nombre.equals(prop.getNombre())) {
				propEncontrado=prop;	
			}
		}
		
		return propEncontrado;
	}

	@Override
	public List<Propietario> seleccionarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}

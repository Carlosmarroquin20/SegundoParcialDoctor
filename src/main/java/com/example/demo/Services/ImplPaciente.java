package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.Entities.Paciente_Entitie;

@Service
public class ImplPaciente implements ServicePacienteInterface{

	private static AtomicLong sequence = new AtomicLong();
	private static List<Paciente_Entitie> list = new ArrayList<Paciente_Entitie>();

	@Override
	public List<Paciente_Entitie> Listarpacientes() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Paciente_Entitie Buscarpacientes(long id) {
		// TODO Auto-generated method stub
		for (Paciente_Entitie e: list) {
			if (e.getID().equals(id))
				return e;
		}
		return null;

	}

	@Override
	public void Crearpacientes(Paciente_Entitie paciente) {
		// TODO Auto-generated method stub
		paciente.setID(sequence.incrementAndGet());
		list.add(paciente);
	}

	@Override
	public void Eliminarpacientes(long id) {
		// TODO Auto-generated method stub
		for (Paciente_Entitie e: list) {
			if (e.getID().equals(id))
				list.remove(e);
		}

	}

	@Override
	public void EditarPacientes(long id, Paciente_Entitie paciente) {
		// TODO Auto-generated method stub
		int id_value = (int) id-1;	
		paciente.setID(id);
		list.set(id_value, paciente);
	}

}

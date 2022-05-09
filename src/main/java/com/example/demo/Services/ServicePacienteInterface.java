package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Paciente_Entitie;

public interface ServicePacienteInterface {
	public List<Paciente_Entitie> Listarpacientes();
    public Paciente_Entitie Buscarpacientes(long id);
    public void Crearpacientes(Paciente_Entitie paciente);
    public void Eliminarpacientes(long id);
    public void EditarPacientes(long id, Paciente_Entitie paciente);
}

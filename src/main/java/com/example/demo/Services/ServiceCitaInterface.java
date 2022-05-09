package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Citas_Entitie;

public interface ServiceCitaInterface {
	public List<Citas_Entitie> Listarcitas();
	public Citas_Entitie Buscarcitas(long id);
	public void Crearcitas(Long id, Citas_Entitie Citas);
	public void Eliminarcitas(long id);
	public void Estadocitas(long id, String Estado);
}

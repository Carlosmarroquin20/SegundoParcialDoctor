package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.Poliza_Entitie;

public interface ServicePolizaInterface {
	public List<Poliza_Entitie> Listarpolizas();
	public Poliza_Entitie Buscarpolizas(long id);
	public void Crearpolizas(int ID_Cliente, Poliza_Entitie Poliza);
	public void Eliminarpolizas(long id);
	public void Editarpolizas(long id, Poliza_Entitie Poliza);
}

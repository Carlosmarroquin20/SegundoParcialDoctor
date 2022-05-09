package com.example.demo.Entities;

public class Poliza_Entitie {
	
	private Long IDPoliza;
	private int IDCliente;
	private String Estado;
	private String FechaInicio;
	private String FechaFin;
	public Poliza_Entitie(Long iDPoliza, int iDCliente, String estado, String fechaInicio, String fechaFin) {
		super();
		IDPoliza = iDPoliza;
		IDCliente = iDCliente;
		Estado = estado;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
	}
	public Long getIDPoliza() {
		return IDPoliza;
	}
	public void setIDPoliza(Long iDPoliza) {
		IDPoliza = iDPoliza;
	}
	public int getIDCliente() {
		return IDCliente;
	}
	public void setIDCliente(int iDCliente) {
		IDCliente = iDCliente;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}

}

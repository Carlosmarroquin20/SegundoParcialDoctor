package com.example.demo.Entities;

public class Citas_Entitie {
	private Long IDPoliza;
	private String Fecha;
	private String Hora;
	private String Estado;
	private String Observaciones;
	public Citas_Entitie(Long iDPoliza, String fecha, String hora, String estado, String observaciones) {
		super();
		IDPoliza = iDPoliza;
		Fecha = fecha;
		Hora = hora;
		Estado = estado;
		Observaciones = observaciones;
	}
	public Long getIDPoliza() {
		return IDPoliza;
	}
	public void setIDPoliza(Long iDPoliza) {
		IDPoliza = iDPoliza;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

}

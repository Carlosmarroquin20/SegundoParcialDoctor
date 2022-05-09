package com.example.demo.Entities;

public class Paciente_Entitie {
	private Long ID;
    private String Primernombre;
    private String Segundonombre;
    private String Primerapellido;
    private String Segundoapellido;
    private String Edad;
	public Paciente_Entitie(Long iD, String primernombre, String segundonombre, String primerapellido,
			String segundoapellido, String edad) {
		super();
		ID = iD;
		Primernombre = primernombre;
		Segundonombre = segundonombre;
		Primerapellido = primerapellido;
		Segundoapellido = segundoapellido;
		Edad = edad;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getPrimernombre() {
		return Primernombre;
	}
	public void setPrimernombre(String primernombre) {
		Primernombre = primernombre;
	}
	public String getSegundonombre() {
		return Segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		Segundonombre = segundonombre;
	}
	public String getPrimerapellido() {
		return Primerapellido;
	}
	public void setPrimerapellido(String primerapellido) {
		Primerapellido = primerapellido;
	}
	public String getSegundoapellido() {
		return Segundoapellido;
	}
	public void setSegundoapellido(String segundoapellido) {
		Segundoapellido = segundoapellido;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
    
}

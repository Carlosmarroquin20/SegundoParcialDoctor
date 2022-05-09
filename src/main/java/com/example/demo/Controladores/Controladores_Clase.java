package com.example.demo.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Citas_Entitie;
import com.example.demo.Entities.Paciente_Entitie;
import com.example.demo.Entities.Poliza_Entitie;
import com.example.demo.Services.ServiceCitaInterface;
import com.example.demo.Services.ServicePacienteInterface;
import com.example.demo.Services.ServicePolizaInterface;

@RestController
@RequestMapping("/API")
public class Controladores_Clase {
	
	@Autowired
	ServicePacienteInterface PacienteIMPL;
	
	@Autowired
	ServicePolizaInterface PolizaIMPL;
	
	@Autowired
	ServiceCitaInterface CitaIMPL;

	@GetMapping("Paciente")
	public List<Paciente_Entitie> Listarpacientes(){
		List<Paciente_Entitie> list = PacienteIMPL.Listarpacientes();
		return list;
	}
	@GetMapping("Paciente/{id}")
	public Paciente_Entitie Buscarpacientes(@PathVariable Long id) {
		Paciente_Entitie Paciente = PacienteIMPL.Buscarpacientes(id);
		return Paciente;

	}
	
	@PostMapping("Paciente")
	public void Crearpacientes(@RequestBody Paciente_Entitie Paciente) {
		PacienteIMPL.Crearpacientes(Paciente);
	}

	@DeleteMapping("Paciente/{id}")
	public void Eliminarpacientes(@PathVariable Long id) {
		PacienteIMPL.Eliminarpacientes(id);
	}

	@PutMapping("Paciente/{id}")
	public void EditarPacientes(@PathVariable Long id, @RequestBody Paciente_Entitie Paciente) {
		PacienteIMPL.EditarPacientes(id, Paciente);
	}
	@GetMapping("Poliza")
	public List<Poliza_Entitie> Listarpolizas(){
		List<Poliza_Entitie> list = PolizaIMPL.Listarpolizas();
		return list;
	}
	@GetMapping("Poliza/{id}")
	public Poliza_Entitie Buscarpolizas(@PathVariable Long id) {
		Poliza_Entitie Poliza = PolizaIMPL.Buscarpolizas(id);
		return Poliza;
	}
	@PostMapping("Poliza/{id}")
	public void Crearpolizas(@PathVariable int id, @RequestBody Poliza_Entitie Poliza) {
		PolizaIMPL.Crearpolizas(id, Poliza);
	}
	@DeleteMapping("Poliza/{id}")
	public void Eliminarpolizas(@PathVariable Long id) {
		PolizaIMPL.Eliminarpolizas(id);
	}
	@PutMapping("Poliza/{id}")
	public void Editarpolizas(@PathVariable Long id, @RequestBody Poliza_Entitie Poliza) {
		PolizaIMPL.Editarpolizas(id, Poliza);
	}
	@GetMapping("Cita")
	public List<Citas_Entitie> Listarcitas(){
		List<Citas_Entitie> list = CitaIMPL.Listarcitas();
		return list;
	}
	@GetMapping("Cita/{id}")
	public Citas_Entitie Buscarcitas(@PathVariable Long id) {
		Citas_Entitie cita = CitaIMPL.Buscarcitas(id);
		return cita;
	}
	@PostMapping("Cita/{id}")
	public void Crearcitas(@PathVariable Long id, @RequestBody Citas_Entitie Cita) {
		CitaIMPL.Crearcitas(id, Cita);
	}
	@DeleteMapping("Cita/{id}")
	public void Eliminarcitas(@PathVariable Long id) {
		CitaIMPL.Eliminarcitas(id);
	}
	@PutMapping("Cita/{id}")
	public void Estadocitas(@PathVariable Long id, @RequestBody String Estado) {
		CitaIMPL.Estadocitas(id, Estado);
	}

}


package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.Entities.Citas_Entitie;

@Service
public class ImplCita implements ServiceCitaInterface{
	private static AtomicLong sequence = new AtomicLong();
	private static List<Citas_Entitie> list = new ArrayList<Citas_Entitie>();
	@Override
	public List<Citas_Entitie> Listarcitas() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Citas_Entitie Buscarcitas(long id) {
		// TODO Auto-generated method stub
		for(Citas_Entitie e:list)
			if(e.getIDPoliza().equals(id)) {
				return e;
			}
		return null;

	}
	@Override
	public void Crearcitas(Long id, Citas_Entitie Citas) {
		// TODO Auto-generated method stub
		Citas.setIDPoliza(id);
		list.add(Citas);
	}
	@Override
	public void Eliminarcitas(long id) {
		// TODO Auto-generated method stub
		for (Citas_Entitie e: list) {
			if (e.getIDPoliza().equals(id))
				list.remove(e);
		}

	}
	@Override
	public void Estadocitas(long id, String Estado) {
		// TODO Auto-generated method stub
		for (Citas_Entitie e: list) {
			if (e.getIDPoliza().equals(id))
				e.setEstado(Estado);
		}

	}
	
}
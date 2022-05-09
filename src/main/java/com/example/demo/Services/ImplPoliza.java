package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import com.example.demo.Entities.Poliza_Entitie;

@Service
public class ImplPoliza implements ServicePolizaInterface {
	private static AtomicLong sequence = new AtomicLong();
	private static List<Poliza_Entitie> list = new ArrayList<Poliza_Entitie>();
	@Override
	public List<Poliza_Entitie> Listarpolizas() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Poliza_Entitie Buscarpolizas(long id) {
		// TODO Auto-generated method stub
		for (Poliza_Entitie e: list) {
			if (e.getIDPoliza().equals(id))
				return e;
		}
		return null;

	}
	@Override
	public void Crearpolizas(int ID_Cliente, Poliza_Entitie Poliza) {
		// TODO Auto-generated method stub
		Poliza.setIDPoliza(sequence.incrementAndGet());
		Poliza.setIDCliente(ID_Cliente);
		list.add(Poliza);
	}
	@Override
	public void Eliminarpolizas(long id) {
		// TODO Auto-generated method stub
		for (Poliza_Entitie e: list) {
			if (e.getIDPoliza().equals(id))
				list.remove(e);
		}

	}
	@Override
	public void Editarpolizas(long id, Poliza_Entitie Poliza) {
		// TODO Auto-generated method stub
		int IDV = (int) id-1;	
		Poliza.setIDPoliza(id);
		list.set(IDV,Poliza);

	}

}

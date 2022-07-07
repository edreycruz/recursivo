package com.warache.recursivo;

import java.util.List;

public class Operaciones {

	private List<Integer> lista;

	public Operaciones(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> invertir(List<Integer> listaOrdenada, int index) {
		if (index >= 0) {
			listaOrdenada.add(this.lista.get(index));
			invertir(listaOrdenada, index - 1);
		}
		return listaOrdenada;
	}

	public int buscarMayor(List<Integer> lista, int index) {
		return 0;
	}

	public void imprimir(List<Integer> lista) {
		lista.stream().forEach(item -> System.out.println(item));
	}

	public String reverseString(String string) {
		
		return "";
	}
}

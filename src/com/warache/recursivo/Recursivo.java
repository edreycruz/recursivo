package com.warache.recursivo;

import java.util.ArrayList;
import java.util.List;

public class Recursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanio = (int) (Math.random() * 10);
		System.out.println("Generando lista de tamaño: " + tamanio + "\n");

		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < tamanio; i++)
			lista.add((int) (Math.random() * 100));

		Operaciones op = new Operaciones(lista);
		
		System.out.println("\nLista inicial: ");
		op.imprimir(lista);
		
		lista = op.invertir(new ArrayList<Integer>(), lista.size() - 1);
		
		System.out.println("\nLista invertida: ");
		op.imprimir(lista);
	}

}

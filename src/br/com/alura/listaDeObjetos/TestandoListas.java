package br.com.alura.listaDeObjetos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Z - Aula 1";
		String aula2 = "B - Aula 2";
		String aula3 = "A - Aula 3";

		ArrayList<String> aulas = new ArrayList();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		Collections.sort(aulas);
		
		System.out.println(aulas);

	}

}

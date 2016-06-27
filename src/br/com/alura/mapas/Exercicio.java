package br.com.alura.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(123, "Dani");
		pessoas.put(456, "Hugo");
		pessoas.put(789, "Charles");
		pessoas.put(000, "David");

		// Podemos utilizar o forEach do Java 8 para
		// iterar pelo conjunto de chaves que � retornado
		// pelo m�todo keySet(). Depois, para cada chave idade,
		// n�s pegamos o seu valor atrav�s do m�todo get e imprimimos:
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
	
	}

}

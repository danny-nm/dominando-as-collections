package br.com.alura.listaDeObjetos;

public class Aula implements Comparable<Aula> { // comparamos para poder usar o método de ordenação sort.

	private String titulo;
	private int tempo;

	public Aula(String aula, int tempo) {
		this.titulo = aula;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: + " + this.titulo + ", " + this.tempo + "minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}

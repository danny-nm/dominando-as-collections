package br.com.alura.relacionamentoComColecoes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import br.com.alura.aplicandoOSetNoModelo.Aluno;
import br.com.alura.listaDeObjetos.Aula;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	// o mesmo método getTempoTotal usando o stram do Java 8
	// public int getTempoTotal(){
	// return this.aulas.stream().mapToInt(Aula::getTempo).sum();

	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		//Adiciona no Set de alunos
		this.alunos.add(aluno);
		//cria a relação no Map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) { 
		if(!matriculaParaAluno.containsKey(numero))//forçamos a exception pq o map automaticamente retorna null
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}
}

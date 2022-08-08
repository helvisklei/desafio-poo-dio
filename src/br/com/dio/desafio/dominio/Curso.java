package br.com.dio.desafio.dominio;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso extends Conteudo {

	private int cargaHoraria;
	private List<Curso> cursos = new LinkedList<Curso>();

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;

	}

	public List<Curso> getCursos() {
		return Collections.unmodifiableList(cursos);
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void adiciona(Curso curso) {
        this.cursos.add(curso);
    }

	@Override
	public String toString() {
		return "Curso [titulo= " + getTitulo() + ", descricao= " + getDescricao() + ", cargaHoraria= " + cargaHoraria
				+ "]";
	}

}

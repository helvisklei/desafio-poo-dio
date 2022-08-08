import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Curso cursoColecoes = new Curso(null, null, 0);
		int duracao = 0;
		int opcao = 0;
		char finalizar = ' ';
		String titulo;// = sc.nextLine();
		String descricao;// = sc.nextLine();

		/*
		 * Curso curso1 = new Curso(); curso1.setTitulo("Curso Java");
		 * curso1.setDescricao("POO em Java"); curso1.setCargaHoraria(8);
		 * 
		 * Curso curso2 = new Curso(); curso2.setTitulo("Curso PHP");
		 * curso2.setDescricao("POO em PHP");
		 * 
		 * // Conteudo conteudo = new Curso(); // polimofismo, pois não podemos
		 * instanciar // a classe Conteudo, mas podemos criar um tipo dessa c
		 * 
		 * // System.out.println(curso2);
		 * 
		 * Mentoria mentoria = new Mentoria();
		 * 
		 * mentoria.setTitulo(" Mentoria de JAVA");
		 * mentoria.setDescricao(" Mentoria da cadeira de JAVA");
		 * mentoria.setData(LocalDate.now());
		 * 
		 * 
		 * // * System.out.println(mentoria); System.out.println(curso1); // *
		 * curso2.setCargaHoraria(4);
		 * 
		 * 
		 * Bootcamp bootcamp = new Bootcamp();
		 * bootcamp.setNome(" Bootcamp Java Developer");
		 * bootcamp.setDescricao(" DEscrição Bootcamp Java Developer");
		 * bootcamp.getConteudos().add(curso1); bootcamp.getConteudos().add(curso2);
		 * bootcamp.getConteudos().add(mentoria);
		 * 
		 * Dev devCamila = new Dev(); devCamila.setNome("Camila");
		 * 
		 * //devCamila.setConteudosInscritos(bootcamp.getConteudos()); // essa forma ele
		 * pega todo o conteudo inscrito idependente de da pessoa e retira da lista.
		 * devCamila.inscreverBootcamp(bootcamp); devCamila.progredir();
		 * 
		 * System.out.println("Conteúdos Inscritos Camila \n" +
		 * devCamila.getConteudosInscritos());
		 * 
		 * System.out.println("Total de XP = " + devCamila.calcularTotalXp());
		 * 
		 * System.out.println("Conteúdos concluidos Camila \n" +
		 * devCamila.getConteudosConcluidos()); System.out.println();
		 * System.out.println(" \n");
		 * 
		 * Dev devJoao = new Dev(); devJoao.setNome("João");
		 * 
		 * devJoao.setConteudosInscritos(bootcamp.getConteudos());
		 * System.out.println("Conteúdos Inscritos João " +
		 * devJoao.getConteudosInscritos());
		 * 
		 */

		System.out.println(" ********** TELA DE CADASTRAR **********\n");

		System.out.println("1 - CADASTAR CURSOS");
		System.out.println("2 - CADASTRAR MENTORIA");
		System.out.println("3 - SE INSCREVER NO CURSO");
		System.out.println("4 - PROGREDIR CURSO");
		System.out.println("5 - SAIR");
		opcao = sc.nextInt();

		System.out.println("1 - Cadastrar curso");
		sc.nextLine();

		while (Character.toUpperCase(finalizar) != 'S') {

			sc.nextLine();
			System.out.println("Nome do curso ");
			titulo = sc.nextLine();

			System.out.println("Descricao ");
			descricao = sc.nextLine();

			System.out.println("Carga horária ");
			duracao = sc.nextInt();

			cursoColecoes.adiciona(new Curso(titulo, descricao, duracao));

			System.out.println("Digite S para finalizar");
			sc.nextLine();
			finalizar = (char) System.in.read();

		}
		
		
		

		System.out.println(cursoColecoes.getCursos());

		sc.close();

	}

}

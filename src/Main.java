import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso orientado a objeto em Java");
		curso1.setCargaHoraria(8);
		System.out.println(curso1);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso PHP");
		curso2.setDescricao("Curso orientado a objeto em PHP");
		curso2.setCargaHoraria(4);

		System.out.println(curso2);

		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de JAVA");
		mentoria.setDescricao("Mentoria da cadeira de JAVA");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);

	}

}

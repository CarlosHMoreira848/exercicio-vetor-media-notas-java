import java.util.Random;
public class VetorMediaNota {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao programa de exercício de vetor! Iremos exercitar a seleção da media das notas em uma turma de alunos!");
		System.out.println("Criando turma de alunos...");
		int notas[] = new int[10];
		System.out.println("A turma de alunos foi criada! Agora vamos atribuir notas para os alunos...");
		Random random = new Random();
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(11);
		}
		System.out.println("Atribuimos com sucesso notas para os alunos! Agora vamos listar as notas...");
		for(int a = 0; a < notas.length; a++) {
			System.out.println("Aluno " + (a + 1) + ", nota:  " + notas[a]);
		}
		System.out.println("A listagem foi concluída! Agora iremos listar a media das notas...");
		int maiorNota = notas[0];
		int menorNota = notas[0];
		for(int b = 0; b < notas.length; b++) {
			if(notas[b] > maiorNota) {
				maiorNota = notas[b];
			}
			if(notas[b] < menorNota) {
				menorNota = notas[b];
			}
		}
		double media = (maiorNota + menorNota) / 2;
		System.out.println("A media das notas encontradas na lista foi: " + media);
	}
}

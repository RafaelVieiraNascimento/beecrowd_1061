package program;

/*
beecrowd | 1061 - Tempo de um Evento

Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String auxiliar = sc.next();
		int diaInicial = sc.nextInt() * 24;
		int horaInicial = (sc.nextInt() + diaInicial) * 60;
		auxiliar = sc.next();
		int minutoInicial = (sc.nextInt() + horaInicial) * 60;
		auxiliar = sc.next();
		int segundoInicial = (sc.nextInt() + minutoInicial);

		auxiliar = sc.next();
		int diaFinal = sc.nextInt() * 24;
		int horaFinal = (sc.nextInt() + diaFinal) * 60;
		auxiliar = sc.next();
		int minutoFinal = (sc.nextInt() + horaFinal) * 60;
		auxiliar = sc.next();
		int segundoFinal = sc.nextInt() + minutoFinal;
		
		if (horaFinal < horaInicial) segundoFinal += 86400;
		
		int segundoTotal = segundoFinal - segundoInicial;
		
		int dias = 0;
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		for(int i = 0; i < segundoTotal; i++){
			
			segundos += 1;
			if(segundos == 60) {
				segundos -= 60;
				minutos += 1;
			}
			if(minutos == 60) {
				minutos -= 60;
				horas += 1;
			}
			if(horas == 24) {
				horas -= 24;
				dias += 1;
			}
		}
		
		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
		sc.close();
	}
}

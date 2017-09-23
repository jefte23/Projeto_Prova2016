import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		BDSimulado bd = new BDSimulado();

		System.out.println("Questão 2a");
		System.out.println(bd.getInfoPassageiro("Carolina Pinheiro"));

		System.out.println("Questão 2b");
		System.out.println(bd.getQtdeViagens("Maria da Silva"));

		System.out.println("Questão 2c");
		System.out.println(bd.getMaiorViagem());

		System.out.println("Questão 2d");
		System.out.println(bd.listaUFsViagem("Maria da Silva"));

		System.out.println("Questão 3a");
		System.out.println(bd.getCustoKmRodado("Maria da Silva"));

		System.out.println("Questão 3b");
		ArrayList<String> MotoqueiroPorPeriodo = bd.getMotoqueiroPorPeriodo(2016, 1);
		for (int i = 0; i < MotoqueiroPorPeriodo.size(); i++) {
			System.out.println(MotoqueiroPorPeriodo.get(i));
		}

		System.out.println("Questão 3c");
		System.out.println(bd.getViagemForaUF("Maria da Silva"));

		System.out.println("Questão 3d");
		System.out.println(bd.getKmPassageitoMotoqueiro("Maria da Silva", "Walleerrssonn"));

	}

}

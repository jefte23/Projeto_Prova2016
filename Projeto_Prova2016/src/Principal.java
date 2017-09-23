import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		BDSimulado bd = new BDSimulado();

		System.out.println(bd.getQtdeViagens("Maria da Silva"));
		System.out.println(bd.getMaiorViagem());

		System.out.println(bd.getInfoPassageiro("Maria da Silva"));
		System.out.println(bd.getCustoKmRodado("Maria da Silva"));
		System.out.println(bd.listaUFsViagem("Maria da Silva"));

		System.out.println("---------------------------------");

		ArrayList<String> MotoqueiroPorPeriodo = bd.getMotoqueiroPorPeriodo(2016, 1);
		for (int i = 0; i < MotoqueiroPorPeriodo.size(); i++) {
			System.out.println(MotoqueiroPorPeriodo.get(i));
		}

		System.out.println(bd.getKmPassageitoMotoqueiro("Maria da Silva", "Walleerrssonn"));
		System.out.println(bd.getViagemForaUF("Maria da Silva"));
	}

}

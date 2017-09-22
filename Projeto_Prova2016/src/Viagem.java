
public class Viagem {
	
	private int codigo;
	private int mes;
	private int ano;
	private Passageiro passageiro;
	private String motoqueiro;
	private double distancia;
	private double valor;
	private String cidade;
	private String UF;

	@Override
	public String toString() {
		return "Viagem [codigo=" + codigo + ", mes=" + mes + ", ano=" + ano + ", passageiro=" + passageiro
				+ ", motoqueiro=" + motoqueiro + ", distancia=" + distancia + ", valor=" + valor + ", cidade=" + cidade
				+ ", UF=" + UF + "]";
	}

	public Viagem(int codigo, int mes, int ano, Passageiro passageiro, String motoqueiro, double distancia,
			double valor, String cidade, String UF) {
		super();
		this.codigo = codigo;
		this.mes = mes;
		this.ano = ano;
		this.passageiro = passageiro;
		this.motoqueiro = motoqueiro;
		this.distancia = distancia;
		this.valor = valor;
		this.cidade = cidade;
		this.UF = UF;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public String getMotoqueiro() {
		return motoqueiro;
	}
	public void setMotoqueiro(String motoqueiro) {
		this.motoqueiro = motoqueiro;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String UF) {
		this.UF = UF;
	}
}

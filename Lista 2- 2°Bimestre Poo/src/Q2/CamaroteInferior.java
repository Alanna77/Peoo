package Q2;

public class CamaroteInferior extends IngressoVip{
	private String localizacao;

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void imprimirLocalizacao() {
		System.out.println(getLocalizacao());
	}

}

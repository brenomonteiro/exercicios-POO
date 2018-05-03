package aula20fev;

// Exercicio 10
public class CodigoPostal {
	private String indicativo;
	private String extensao;
	private String nomeDaZona;

	public CodigoPostal(String indicativo, String extensao, String nomeDaZona) {
		super();
		this.indicativo = indicativo;
		this.extensao = extensao;
		this.nomeDaZona = nomeDaZona;
	}

	public String getIndicativo() {
		return indicativo;
	}

	public void setIndicativo(String indicativo) {
		this.indicativo = indicativo;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public String getNomeDaZona() {
		return nomeDaZona;
	}

	public void setNomeDaZona(String nomeDaZona) {
		this.nomeDaZona = nomeDaZona;
	}

	public String mostrar() {
		return indicativo + "-" + extensao + " " + nomeDaZona;
	}

	public static void main(String[] args) {
		CodigoPostal c = new CodigoPostal("38400", "200", "Centro");

		System.out.println(c.mostrar());

		c.setIndicativo("39555");
		c.setExtensao("333");
		c.setNomeDaZona("Santa Monica");

		System.out.println(c.mostrar());

	}
}

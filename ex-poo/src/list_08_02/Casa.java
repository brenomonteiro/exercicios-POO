package aula8fev;

public class Casa {
	private Pessoa propietario;
	private Endereco endereco;

	public Casa(Pessoa propietario, Endereco endereco) {
		super();
		this.propietario = propietario;
		this.endereco = endereco;
	}

	public Pessoa getPropietario() {
		return propietario;
	}

	public void setPropietario(Pessoa propietario) {
		this.propietario = propietario;
		
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "casa=" + propietario + "&endereco=" + endereco;
	}
	
	
}

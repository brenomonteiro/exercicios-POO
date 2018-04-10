package ocp.segundo;

public class Frete implements ServicoDeEntrega {

	public double para(String cidade) {
		if(cidade.equalsIgnoreCase("SAO PAULO"))
			return 10;
		return 20;
	}

}

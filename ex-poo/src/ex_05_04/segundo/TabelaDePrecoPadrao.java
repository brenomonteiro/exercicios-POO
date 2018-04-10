package ocp.segundo;

public class TabelaDePrecoPadrao implements TabelaDePreco {

	public double descontoPara(double valor) {
		if(valor>1000 && valor < 5000) return 0.05;
		else if(valor>=5000) return 0.05;
		return 0;
	}

}

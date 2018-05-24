package designpattern.chainofresponsability.exemploDescontos;


public class SemDesconto extends ChainDesconto {

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

}

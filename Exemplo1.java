public class CartaoConsumo{
	private int numeroCartao;
	private double saldo;
	//Demais atributos e métodos
}

public class Operacoes{
	public void Recarregar(double valor, int nroCartao){
    	CartaoConsumo cartao = Context.getCartao(nroCartao);
		double saldo = cartao.getSaldo();
    	saldo += valor;
    	cartao.setSaldo(saldo);
	}
}

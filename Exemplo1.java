/*
 * Este exemplo foi desenvolvido para apresentar os seguintes problemas de qualidade de código:
 * - Code smell: DATA CLASS (Na classa CartaoConsumo)
 * - Violação do princípio SOLID: SINGLE RESPONSABILITY
 * - Violação do princípio: TELL DON'T ASK:
 */

public class CartaoConsumo{
	private int numeroCartao;
	private double saldo;
}

public class Operacoes{
	public void Recarregar(double valor, int nroCartao){
    	CartaoConsumo cartao = Context.getCartao(nroCartao);
		double saldo = cartao.getSaldo();
    	saldo += valor;
    	cartao.setSaldo(saldo);
	}
}

/*
 * Este exemplo foi desenvolvido para apresentar os seguintes problemas de qualidade de código:
 * - Code smell: Swicth Statements
 */
public class PaymentProcessor {

    public void processPayment(String paymentType) {
        switch (paymentType) {
            case "CREDIT_CARD":
                System.out.println("Processando pagamento com cartão de crédito...");
                // Lógica para pagamento com cartão de crédito
                break;

            case "PAYPAL":
                System.out.println("Processando pagamento com PayPal...");
                // Lógica para pagamento com PayPal
                break;

            case "BANK_TRANSFER":
                System.out.println("Processando pagamento com transferência bancária...");
                // Lógica para transferência bancária
                break;

            case "CRYPTO":
                System.out.println("Processando pagamento com criptomoeda...");
                // Lógica para pagamento com criptomoeda
                break;

            default:
                System.out.println("Método de pagamento não suportado.");
                break;
        }
    }
}

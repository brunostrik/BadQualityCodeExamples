/*
 * Este exemplo foi desenvolvido para apresentar os seguintes problemas de qualidade de código:
 * - Code smell: LONG PARAMETER LIST
 * - Code smell: DEAD CODE
 * - Code smell: TEMPORARY FIELDS
 * - Violação do princípio SOLID: SINGLE RESPONSABILITY
 */

 public class OrderService {

    public void processOrder(String orderId, String customerName, String customerEmail, 
                             String shippingAddress, String billingAddress, String paymentMethod, 
                             double discount, boolean isGift, String giftMessage, 
                             String deliveryInstructions) {

        System.out.println("Processando pedido para " + customerName);
        System.out.println("Enviando para: " + shippingAddress);
        System.out.println("Email do cliente: " + customerEmail);

        if (isGift) {
            System.out.println("Este pedido é um presente. Mensagem: " + giftMessage);
        }
    }

    private double calculateShippingCost(String address, double weight, double distance) {
        System.out.println("Calculando o custo de envio...");
		return weight * distance * 3.451;
        System.out.println("Custo de envio calculado!");
		
    }

    public void applyDiscount(String orderId, double discountPercentage) {
        double someVariable = 0.0;
        System.out.println("Aplicando desconto de " + discountPercentage + "% no pedido " + orderId);
    }
}

/**
 * ShoppingCart
 */
public class ShoppingCart {

    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        Customer regular = customerFactory.getCustomer("Regular");
        Double purchaseAmountRegularCustomer = 15000.00;
        Double billAmountRegularCustomer = regular.calculateBillAmount(purchaseAmountRegularCustomer);

        System.out.println("Regular Customer Purchase Amount: " + purchaseAmountRegularCustomer);
        System.out.println("Regular Customer Bill Amount: " + billAmountRegularCustomer);


        Customer premium = customerFactory.getCustomer("Premium");
        Double purchaseAmountPremiumCustomer = 20000.00;
        Double billAmountPremiumCustomer = premium.calculateBillAmount(purchaseAmountPremiumCustomer);

        System.out.println("Premium Customer Purchase Amount: " + purchaseAmountPremiumCustomer);
        System.out.println("Premium Customer Bill Amount: " + billAmountPremiumCustomer);
    }
}
/**
 * CustomerFactory
 */
public class CustomerFactory {

    public Customer getCustomer(String customerType) {
        if(customerType == null){
            return null;
        }

        if(customerType.equalsIgnoreCase("Regular")){
            return new RegularCustomer();
        } else if (customerType.equalsIgnoreCase("Premium")) {
            return new PremiumCustomer();
        }

        return null;
    }
}
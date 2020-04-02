/**
 * RegularCustomer
 */
public class RegularCustomer implements Customer {
    final double slabRate1 = 0.0;
    final double slabRate2 = 0.10;
    final double slabRate3 = 0.20;

    final double slab1limit = 5000;
    final double slab2limit = 10000;

    @Override
    public Double calculateBillAmount(Double purchaseAmount) {
        // TODO Auto-generated method stub
        double discountAmount = 0.0;
        if (purchaseAmount <= slab1limit) {
            discountAmount = discountAmount + DiscountUtil.calculateDiscount(purchaseAmount, slabRate1);
        }
        if (purchaseAmount > slab1limit && purchaseAmount <= slab2limit) {
            discountAmount = discountAmount + DiscountUtil.calculateDiscount((purchaseAmount - slab1limit), slabRate2)
                    + DiscountUtil.calculateDiscount(slab1limit, slabRate1);
        }
        if (purchaseAmount > slab2limit) {
            discountAmount = discountAmount + DiscountUtil.calculateDiscount((purchaseAmount - slab2limit), slabRate3)
                    + DiscountUtil.calculateDiscount((slab2limit - slab1limit), slabRate2)
                    + DiscountUtil.calculateDiscount(slab1limit, slabRate1);
        }
        return purchaseAmount - discountAmount;
    }

}
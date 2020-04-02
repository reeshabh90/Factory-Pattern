/**
 * PremiumCustomer
 */
public class PremiumCustomer implements Customer {

    final double slabRate1 = 0.10;
    final double slabRate2 = 0.15;
    final double slabRate3 = 0.20;
    final double slabRate4 = 0.30;

    final double slab1limit = 4000;
    final double slab2limit = 8000;
    final double slab3limit = 12000;

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
        if (purchaseAmount > slab2limit && purchaseAmount <= slab3limit) {
            discountAmount = discountAmount + DiscountUtil.calculateDiscount((purchaseAmount - slab2limit), slabRate3)
                    + DiscountUtil.calculateDiscount((slab2limit - slab1limit), slabRate2)
                    + DiscountUtil.calculateDiscount(slab1limit, slabRate1);
        }
        if (purchaseAmount > slab3limit) {
            discountAmount = discountAmount + DiscountUtil.calculateDiscount((purchaseAmount - slab3limit), slabRate4)
                    + DiscountUtil.calculateDiscount((slab3limit - slab2limit), slabRate3)
                    + DiscountUtil.calculateDiscount((slab2limit - slab1limit), slabRate2)
                    + DiscountUtil.calculateDiscount(slab1limit, slabRate1);
        }
        return purchaseAmount - discountAmount;
    }

}
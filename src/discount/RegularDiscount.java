package discount;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double apply(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}


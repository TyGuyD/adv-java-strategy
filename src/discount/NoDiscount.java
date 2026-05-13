package discount;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double apply(double billAmount) {
        return billAmount;
    }
}


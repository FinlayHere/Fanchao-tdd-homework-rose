package cn.xpbootcamp.gilded_rose;

/**
 * @author fanchaokong
 */
public class Sulfuras extends Product{
    public Sulfuras() {
    }

    public Sulfuras(String name, int sellIn, int quality, int shelfLife) {
        super(name, sellIn, quality, shelfLife);
    }

    @Override
    public void afterOneDay() {
        System.out.println("Quality won't change");
        this.increaseOneDaySellIn();
    }
}

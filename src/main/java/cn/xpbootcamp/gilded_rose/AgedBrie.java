package cn.xpbootcamp.gilded_rose;

/**
 * @author fanchaokong
 */
public class AgedBrie extends Product {
    private int increaseRate;

    public AgedBrie() {
    }

    public AgedBrie(int increaseRate) {
        this.increaseRate = increaseRate;
    }

    public AgedBrie(String name, int sellIn, int quality, int shelfLife, int increaseRate) {
        super(name, sellIn, quality, shelfLife);
        this.increaseRate = increaseRate;
    }

    public int getIncreaseRate() {
        return increaseRate;
    }

    public void setIncreaseRate(int increaseRate) {
        this.increaseRate = increaseRate;
    }

    @Override
    public void afterOneDay() {
        this.increaseOneDaySellIn();
        if (this.whetherOverShelfLife()) {
            this.setQuality(this.getQuality()+this.increaseRate);
        } else{
            this.setQuality(this.getQuality()+this.increaseRate*2);
        }
    }
}

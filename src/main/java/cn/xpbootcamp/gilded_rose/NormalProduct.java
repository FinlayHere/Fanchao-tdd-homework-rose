package cn.xpbootcamp.gilded_rose;

/**
 * @author fanchaokong
 */
public class NormalProduct extends Product {
    private int decreaseRate;

    public NormalProduct() {
    }

    public NormalProduct(int decreaseRate) {
        this.decreaseRate = decreaseRate;
    }

    public NormalProduct(String name, int sellIn, int quality, int shelfLife, int decreaseRate) {
        super(name, sellIn, quality, shelfLife);
        this.decreaseRate = decreaseRate;
    }

    public int getDecreaseRate() {
        return decreaseRate;
    }

    public void setDecreaseRate(int decreaseRate) {
        this.decreaseRate = decreaseRate;
    }

    public void decreaseQuality() {
        if (whetherOverShelfLife()) {
            this.setQuality(this.getQuality() - this.decreaseRate);
        } else {
            this.setQuality(this.getQuality() - 2 * this.decreaseRate);
        }
    }

    @Override
    public void afterOneDay(){
        this.increaseOneDaySellIn();
        if (checkQuality() == true){
            if (this.getQuality() >= (this.decreaseRate*2)){
                this.decreaseQuality();
            }
        }

    }
}

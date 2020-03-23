package cn.xpbootcamp.gilded_rose;

/**
 * @author fanchaokong
 */
public class BackstagePass extends Product{
    public BackstagePass() {
    }

    public BackstagePass(String name, int sellIn, int quality, int shelfLife) {
        super(name, sellIn, quality, shelfLife);
    }

    @Override
    public void afterOneDay() {
        this.increaseOneDaySellIn();
        int flag = getShelfLife() - getSellIn();
        if (flag > 10){
            this.setQuality(this.getQuality()+1);
        }
        if (flag > 5){
            this.setQuality(this.getQuality()+2);
        }
        if (flag > 0){
            this.setQuality(this.getQuality()+3);
        }
        if (flag < 0){
            this.setQuality(0);
        }
    }
}

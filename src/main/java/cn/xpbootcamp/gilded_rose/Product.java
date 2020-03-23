package cn.xpbootcamp.gilded_rose;

/**
 * @author fanchaokong
 */
public abstract class Product {
    private String name;
    private int sellIn;
    private int quality;
    private int shelfLife;

    public Product() {
    }

    public Product(String name, int sellIn, int quality, int shelfLife) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean checkQuality() {
        return this.quality > 0 && this.quality <= 50;
    }

    public boolean whetherOverShelfLife(){
        return this.getShelfLife() - this.getSellIn() > 0;
    }

    public void increaseOneDaySellIn(){
        this.sellIn += 1;
    }

    public abstract void afterOneDay();
}

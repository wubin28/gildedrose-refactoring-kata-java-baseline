package gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void doUpdateQuality() {
        if ("Aged Brie".equals(name)) {
            if (quality < 50) {
                quality = quality + 1;
            }

            sellIn = sellIn - 1;

            if (sellIn < 0) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            if (quality < 50) {
                quality = quality + 1;

                if (sellIn < 11) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }

                if (sellIn < 6) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
            }

            sellIn = sellIn - 1;

            if (sellIn < 0) {
                quality = quality - quality;
            }
        } else if ("Sulfuras, Hand of Ragnaros".equals(name)) {
        } else {
            if (quality > 0) {
                quality = quality - 1;
            }

            sellIn = sellIn - 1;

            if (sellIn < 0) {
                if (quality > 0) {
                    quality = quality - 1;
                }
            }
        }
    }
}

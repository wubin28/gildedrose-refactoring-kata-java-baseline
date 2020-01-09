package gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void doUpdateQuality() {
        if (true) {
            if (quality < 50) {
                quality = quality + 1;
            }

            sellIn = sellIn - 1;

            if (sellIn < 0) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        } else if (false) {
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
        } else if (false) {
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

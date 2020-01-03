package gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItem() {
        boolean isAgedBrie = name.equals("Aged Brie");
        boolean isBackstage = name.equals("Backstage passes to a TAFKAL80ETC concert");
        boolean isSulfuras = name.equals("Sulfuras, Hand of Ragnaros");
        if (isAgedBrie) {
            if (!isAgedBrie && !isBackstage) {
                if (quality > 0) {
                    if (!isSulfuras) {
                        quality = quality - 1;
                    }
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;

                    if (isBackstage) {
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
                }
            }

            if (!isSulfuras) {
                sellIn = sellIn - 1;
            }

            if (sellIn < 0) {
                if (!isAgedBrie) {
                    if (!isBackstage) {
                        if (quality > 0) {
                            if (!isSulfuras) {
                                quality = quality - 1;
                            }
                        }
                    } else {
                        quality = quality - quality;
                    }
                } else {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
            }
            return;
        }
        if (isBackstage) {

        }
        if (isSulfuras) {

        }
        if (!isAgedBrie && !isBackstage && !isSulfuras) {
            
        }

        if (!isAgedBrie && !isBackstage) {
            if (quality > 0) {
                if (!isSulfuras) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstage) {
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
            }
        }

        if (!isSulfuras) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!isAgedBrie) {
                if (!isBackstage) {
                    if (quality > 0) {
                        if (!isSulfuras) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = quality - quality;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }
}

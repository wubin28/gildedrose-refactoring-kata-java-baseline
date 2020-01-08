package gildedrose;

import org.approvaltests.Approvals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void updateQuality() {
        String name = "foo";
        int sellIn = 0;
        int quality = 0;
        String itemString = doUpdateQuality(name, sellIn, quality);
        Approvals.verify(itemString);
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        // assertEquals("foo", app.items[0].name);
        return app.items[0].toString();
    }

}

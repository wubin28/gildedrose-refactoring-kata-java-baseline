# gildedrose-refactoring-kata-java

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods. Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We have a system in place that updates our inventory for us. It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that we can begin selling a new category of items. First an introduction to our system:

- All items have a SellIn value which denotes the number of days we have to sell the item
- All items have a Quality value which denotes how valuable the item is
- At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

- Once the sell by date has passed, Quality degrades twice as fast
- The Quality of an item is never negative
- “Aged Brie” actually increases in Quality the older it gets
- The Quality of an item is never more than 50
- “Sulfuras”, being a legendary item, never has to be sold or decreases in Quality
- “Backstage passes”, like aged brie, increases in Quality as it’s SellIn value approaches; Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

- “Conjured” items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, do not alter the Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn’t believe in shared code ownership (you can make the UpdateQuality method and Items property static if you like, we’ll cover for you).

嗨，欢迎来到镀金玫瑰团队。如您所知，我们是一家小旅馆，位于一线城市的黄金地段，旅馆老板艾里森（Allison）很友好。我们只销售高端商品。不过，每件商品都有一个销售剩余天数。随着时间的推移，商品的品质会不断下降。我们拥有一个可以更新库存信息的系统。一个名叫Leeroy的开发人员开发了这个系统，之后就离开了。你的任务是将新功能添加到该系统中，以便我们可以开始销售新种类的商品。首先介绍一下这个系统：

- 所有商品（Item）都有一个销售剩余天数（SellIn）值，表示该商品必须在该值所代表的天数内销售出去
- 所有商品都有一个品质（Quality）值，表明该商品当前的品质
- 每天结束时，系统会降低每个商品的上述两个值

很简单，对吧？但下面的规则就更有趣了：

- 一旦商品过了销售剩余天数之后还未卖出去，那么其每日品质下降的速度就会翻番
- 商品的品质值不能为负数
- “陈年干酪”（Aged Brie）的品质值随着时间的推移，不减反增
- 商品的品质值永远不会超过50
- 魔法锤（Sulfuras）是一个传奇商品，其销售剩余天数和品质值都不会变化
- “剧院后台通行证”（Backstage passes），就像陈年干酪一样，其品质值会随着SellIn值的减少而提高——当离演出开始不足10天时，品质值每日提高2；当不足5天时，品质值每日提高3；当演出结束后，品质值下降到0

我们最近签约了一个魔法商品供应商，这需要对我们的系统进行更新：

- “魔法”（Conjured）商品每日品质下降速度是正常商品的2倍

只要一切仍能正常工作，请随时对UpdateQuality()方法进行任何更改，或添加任何新代码。但是，请勿更改Item类或Items属性。因为这些代码属于隔壁的土地爷，他不认可团队代码集体所有这回事。如果这些代码被动了，他会蹦出来揍你（如果愿意的话，可以将UpdateQuality()方法和Items属性设为静态的，我们会代你向他求情）。
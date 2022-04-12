
package ar.uba.fi.tdd.exercise;

class GildedRose {
  Item[] items;

    public GildedRose(Item[] _items) {
        items = _items;
    }


    public void disminuirCalidadAgedBrieCaso(Item item){
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.Name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
                // si es menor que 6
                if (item.sellIn < 6) {
                    // si la cantidad es es menor que 50
                    if (item.quality < 50) {
                        // sumo 1 a la calidad
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

    public void disminuirCalidaCasoDefault(Item item) {
        if (!item.Name.equals("Aged Brie")
                && !item.Name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0)
                if (!item.Name.equals("Sulfuras, Hand of Ragnaros"))
                    item.quality = item.quality - 1;
        } else {
            disminuirCalidadAgedBrieCaso(item);
        }

    }
        // update the quality of the emements
    public void updateQuality() {
        // for each item
        for (int i = 0; i < items.length; i++) {
            /*disminuirCalidaCasoDefault(items[i]);

            if (!items[i].Name.equals("Aged Brie")
                    && !items[i].Name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0)
                    if (!items[i].Name.equals("Sulfuras, Hand of Ragnaros"))
                        items[i].quality = items[i].quality- 1;
            } else { // Aged Brie case
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].Name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                          // si es menor que 6
                        if (items[i].sellIn < 6) {
                            // si la cantidad es es menor que 50
                            if (items[i].quality < 50) {
                                // sumo 1 a la calidad
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
            }}*/

          /* if (!items[i].Name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].Name.equals("Aged Brie")) {
                    if (!items[i].Name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].Name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {  // Aged Brie case
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
          }
            }*/

            //caso backstage passes
            if(items[i].Name.equals("Backstage passes to a TAFKAL80ETC concert")){
                if(items[i].quality <50){
                    if(items[i].sellIn <11 && items[i].sellIn >3  ){
                        items[i].quality = items[i].quality + 2;
                        items[i].sellIn = items[i].sellIn -1;

                    }

                    if(items[i].sellIn <6 && items[i].sellIn >0  ){
                        items[i].quality = items[i].quality + 3;
                        items[i].sellIn = items[i].sellIn -1;

                    }

                    if(items[i].sellIn <=0){
                        items[i].quality = 0;

                    }


                }
            } // fin caso backstage passes

            //caso aged brief
            if(items[i].Name.equals("Aged Brie")){
                if(items[i].quality <50){
                    items[i].quality = items[i].quality + 1;
                    items[i].sellIn = items[i].sellIn -1;
                }
                // fin caso aged brief
            }
            //caso Sulfuras


            if(items[i].Name.equals("Sulfuras, Hand of Ragnaros")){
                items[i].sellIn = items[i].sellIn -1;

                }
            //caso conjured
            if(items[i].Name.equals("conjured")){
                items[i].sellIn = items[i].sellIn -1;
                items[i].quality = items[i].quality - 2;

            }


        } //termina eñ for
    }
}

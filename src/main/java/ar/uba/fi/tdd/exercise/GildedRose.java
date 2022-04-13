
package ar.uba.fi.tdd.exercise;

class GildedRose {
  Item[] items;
  Quality calidad = new Quality();

    public GildedRose(Item[] _items) {
        items = _items;
    }


        // update the quality of the emements
    public void updateQuality() {
        // for each item
        for (int i = 0; i < items.length; i++) {


            //caso backstage passes
            if(items[i].Name.equals("Backstage passes to a TAFKAL80ETC concert")){
                if(items[i].quality <50){
                    if(items[i].sellIn <11 && items[i].sellIn >3  ){
                        calidad.duplicarCalidad(items[i]);

                    }

                    if(items[i].sellIn <6 && items[i].sellIn >0  ){
                        calidad.triplicarCalidad(items[i]);
                    }

                    if(items[i].sellIn <=0){
                        calidad.calidadNula(items[i]);

                    }


                }
            } // fin caso backstage passes

            //caso aged brief
            if(items[i].Name.equals("Aged Brie")){
                if(items[i].quality <50){
                    calidad.aumentarCalidad(items[i]);
                }
                // fin caso aged brief
            }
            //caso Sulfuras


            if(items[i].Name.equals("Sulfuras, Hand of Ragnaros")){
                items[i].sellIn = items[i].sellIn -1;

                }
            //caso conjured
            if(items[i].Name.equals("conjured")){
                calidad.disminuyeCalidadPorDos(items[i]);
            }


        } //termina eñ for
    }
}

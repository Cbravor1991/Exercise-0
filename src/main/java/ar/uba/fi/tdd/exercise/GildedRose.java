
package ar.uba.fi.tdd.exercise;

class GildedRose {
  Item[] items;
  Quality calidad = new Quality();
  Backstage backstage = new Backstage();
  AgedBrie agedBrie = new AgedBrie();
  Sulfuras sulfuras = new Sulfuras();
  Conjured conjured = new Conjured();

  ComunYCorriente comun = new ComunYCorriente();

    public GildedRose(Item[] _items) {
        items = _items;
    }


        // update the quality of the emements
    public void updateQuality() {
        // for each item
        for (int i = 0; i < items.length; i++) {

            // caso articulo comun y corriente

            if(!items[i].Name.equals("Backstage passes to a TAFKAL80ETC concert") && !items[i].Name.equals("Aged Brie")
            && !items[i].Name.equals("Sulfuras, Hand of Ragnaros") && !items[i].Name.equals("conjured") ){
                comun.modificarCalidad(items[i]);
            }

            //caso backstage passes
            if(items[i].Name.equals("Backstage passes to a TAFKAL80ETC concert")){
                backstage.modificarCalidad(items[i]);
            }

            //caso aged brief
            if(items[i].Name.equals("Aged Brie")){
                agedBrie.modificarCalidad(items[i]);
                // fin caso aged brief
            }
            //caso Sulfuras


            if(items[i].Name.equals("Sulfuras, Hand of Ragnaros")){
                sulfuras.modificarSellin(items[i]);

                }
            //caso conjured
            if(items[i].Name.equals("conjured")){
                conjured.modificarCalidad(items[i]);
            }


        } //termina for
    }
}

package ar.uba.fi.tdd.exercise;

public class Quality {


    //constructor
    public Quality(){

    }

    public void aumentarCalidad(Item item){
        item.quality = item.quality + 1;
        item.sellIn = item.sellIn -1;
    }

    public void duplicarCalidad(Item item){
        item.quality = item.quality + 2;
        item.sellIn = item.sellIn -1;
    }

    public void triplicarCalidad(Item item){
        item.quality = item.quality + 3;

    }

    public void calidadNula (Item item){
        item.quality = 0;
        item.sellIn = item.sellIn -1;
    }

    public void disminuyeCalidadPorDos (Item item){
        item.sellIn = item.sellIn -1;
        item.quality = item.quality - 2;

    }

}

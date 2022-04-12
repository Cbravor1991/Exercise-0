package ar.uba.fi.tdd.exercise;

public class Quality {


    //constructor
    public Quality(){

    }

    public void duplicarCalidad(Item item){
        item.quality = item.quality + 2;
        item.sellIn = item.sellIn -1;
    }
}

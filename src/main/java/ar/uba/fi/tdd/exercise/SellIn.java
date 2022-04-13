package ar.uba.fi.tdd.exercise;

public class SellIn {



    public SellIn(){

    }

    public void dismunirDiaDisponibles (Item item){
        item.sellIn = item.sellIn -1;

    }
}

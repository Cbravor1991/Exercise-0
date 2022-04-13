package ar.uba.fi.tdd.exercise;

public class Sulfuras {

    SellIn sellin = new SellIn();
    public Sulfuras(){}

    public void modificarSellin(Item item){
        sellin.dismunirDiaDisponibles(item);

    }

}

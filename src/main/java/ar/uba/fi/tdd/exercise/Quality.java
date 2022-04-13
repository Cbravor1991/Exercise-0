package ar.uba.fi.tdd.exercise;

public class Quality {
    SellIn sellin = new SellIn();

    //constructor
    public Quality(){

    }

    public void aumentarCalidad(Item item){
        item.quality = item.quality + 1;
        sellin.dismunirDiaDisponibles(item);
    }

    public void duplicarCalidad(Item item){
        item.quality = item.quality + 2;
        sellin.dismunirDiaDisponibles(item);
    }

    public void triplicarCalidad(Item item){
        item.quality = item.quality + 3;
        sellin.dismunirDiaDisponibles(item);

    }

    public void calidadNula (Item item){
        item.quality = 0;
        sellin.dismunirDiaDisponibles(item);
    }

    public void disminuyeCalidadPorDos (Item item){
        sellin.dismunirDiaDisponibles(item);
        item.quality = item.quality - 2;

    }
    public void disminuyeCalidadPorCuatro (Item item){
        sellin.dismunirDiaDisponibles(item);
        item.quality = item.quality - 4;

    }
    public void disminuyeCalidadPorUn0 (Item item){
        sellin.dismunirDiaDisponibles(item);
        item.quality = item.quality - 1;

    }
}

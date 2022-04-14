package ar.uba.fi.tdd.exercise;

public class Quality {
    SellIn sellin = new SellIn();

    //constructor
    public Quality(){

    }

    public void aumentarCalidadPorUno(Item item){
        if(item.sellIn<=49){
        item.quality = item.quality + 1;}
        sellin.dismunirDiaDisponibles(item);
    }

    public void aumentarCalidadPorDos(Item item){
        if(item.sellIn<=48){
        item.quality = item.quality + 2;}else{
            item.quality= 50;

        }
        sellin.dismunirDiaDisponibles(item);
    }

    public void aumentarCalidadPorTres(Item item){
        if(item.sellIn<=47){
        item.quality = item.quality + 3;} else{
            item.quality= 50;
        }
        sellin.dismunirDiaDisponibles(item);

    }

    public void calidadNula (Item item){
        item.quality = 0;
        sellin.dismunirDiaDisponibles(item);
    }

    public void establecerMaximoCalidad (Item item){
        item.quality = 50;
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

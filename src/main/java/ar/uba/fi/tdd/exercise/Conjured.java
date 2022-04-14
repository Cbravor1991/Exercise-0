package ar.uba.fi.tdd.exercise;

public class Conjured {

    Quality calidad = new Quality();

    public Conjured (){}

    public void modificarCalidad(Item item) {


        if (item.sellIn >= 0 )  {
            if(item.quality>=2){
        calidad.disminuyeCalidadPorDos(item);} else{
                calidad.calidadNula(item);
            }
        }

        if (item.sellIn < 0) {
            if(item.quality>=4){
            calidad.disminuyeCalidadPorCuatro(item);
        }else{
            calidad.calidadNula(item);}
        }

    }
}

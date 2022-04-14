package ar.uba.fi.tdd.exercise;

public class Conjured {

    Quality calidad = new Quality();

    public Conjured (){}

    public void modificarCalidad(Item item) {
        boolean calidadActualizada = false;

        if (item.sellIn >= 0 && calidadActualizada == false )  {
            calidadActualizada = true;
            if(item.quality>=2){
        calidad.disminuyeCalidadPorDos(item);} else{
                calidad.calidadNula(item);
            }
        }

        if (item.sellIn < 0 && calidadActualizada == false) {
            calidadActualizada = true;
            if(item.quality>=4){
            calidad.disminuyeCalidadPorCuatro(item);
        }else{
            calidad.calidadNula(item);}
        }

    }
}

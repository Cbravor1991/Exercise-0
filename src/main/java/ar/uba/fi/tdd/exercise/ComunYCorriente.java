package ar.uba.fi.tdd.exercise;

public class ComunYCorriente {
    Quality calidad = new Quality();

    public ComunYCorriente (){

    }

    public void modificarCalidad(Item item) {
        boolean calidadActualizada = false;
        if (item.sellIn >= 0 && item.quality>=1 ) {
             calidadActualizada = true;
            calidad.disminuyeCalidadPorUn0(item);
        }

        if (item.sellIn < 0 && calidadActualizada == false) {
            if(item.quality>=2){
            calidad.disminuyeCalidadPorDos(item);}else{
                calidad.calidadNula(item);

            }
        }

    }
}

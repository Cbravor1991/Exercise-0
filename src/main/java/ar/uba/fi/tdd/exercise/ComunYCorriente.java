package ar.uba.fi.tdd.exercise;

public class ComunYCorriente {
    Quality calidad = new Quality();

    public ComunYCorriente (){

    }

    public void modificarCalidad(Item item) {
        if (item.sellIn > 0 && item.quality>=1) {
            calidad.disminuyeCalidadPorUn0(item);
        }

        if (item.sellIn < 0 && item.quality>=2) {
            calidad.disminuyeCalidadPorDos(item);
        }

    }
}

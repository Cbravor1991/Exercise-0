package ar.uba.fi.tdd.exercise;

public class Conjured {

    Quality calidad = new Quality();

    public Conjured (){}

    public void modificarCalidad(Item item) {


        if (item.sellIn > 0 && item.quality>=2) {
        calidad.disminuyeCalidadPorDos(item);
        }

        if (item.sellIn < 0 && item.quality>=4) {
            calidad.disminuyeCalidadPorCuatro(item);
        }

    }
}

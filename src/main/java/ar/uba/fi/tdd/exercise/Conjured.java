package ar.uba.fi.tdd.exercise;

public class Conjured {

    Quality calidad = new Quality();

    public Conjured (){}

    public void modificarCalidad(Item item) {
        calidad.disminuyeCalidadPorDos(item);

    }
}

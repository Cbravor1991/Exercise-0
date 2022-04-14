package ar.uba.fi.tdd.exercise;

public class AgedBrie {

    Quality calidad = new Quality();

    public AgedBrie (){}

    public void modificarCalidad(Item item){
        if(item.quality <50){
            calidad.aumentarCalidadPorUno(item);
        }
    }
}

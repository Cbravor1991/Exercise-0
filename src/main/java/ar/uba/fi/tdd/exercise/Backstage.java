package ar.uba.fi.tdd.exercise;

public class Backstage {
    Quality calidad = new Quality();

    public Backstage(){

    }

    public void modificarCalidad(Item item){
        if(item.quality <50){
            if(item.sellIn <11 && item.sellIn >3  ){
                calidad.duplicarCalidad(item);

            }

            if(item.sellIn <6 && item.sellIn >0  ){
                calidad.triplicarCalidad(item);
            }

            if(item.sellIn <=0){
                calidad.calidadNula(item);

            }
    }

}
        }
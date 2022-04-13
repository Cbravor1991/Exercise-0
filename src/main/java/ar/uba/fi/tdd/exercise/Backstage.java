package ar.uba.fi.tdd.exercise;

public class Backstage {
    Quality calidad = new Quality();

    public Backstage(){

    }

    public void modificarCalidad(Item item){
        boolean calidadActualizada = false;
        if(item.quality <50){

            if(item.sellIn <0 && calidadActualizada == false){
                calidad.calidadNula(item);
                calidadActualizada = true;

            }

            if(item.sellIn <6 && item.sellIn >=0 && calidadActualizada == false  ){
                calidad.triplicarCalidad(item);
                calidadActualizada = true;
            }
            if(item.sellIn <11 && item.sellIn >3 && calidadActualizada == false  ){
                calidad.duplicarCalidad(item);
                calidadActualizada = true;

            }




    }

}
        }
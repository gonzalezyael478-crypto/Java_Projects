package model;

public class Pentagono extends FiguraGeometrica {

    public Pentagono(double lado, double apotema){
        super("Pentagono", lado, apotema);
        
        calcularPerimetro();
        calcularArea();
    }

    @Override
    public void calcularPerimetro(){
        perimetro = dimension1 * 5;
    }

    @Override
    public void calcularArea(){
        area = (perimetro * dimension2)/2;
    }

   


}

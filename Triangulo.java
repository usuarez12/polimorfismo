public class Triangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.altura = altura;
        this.base = base;

    }

    public double getBase(){
        return base;
    }

    public void setBase(double base ){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

     public void setAltura(double altura ){
        this.altura = altura;
    }

    //Pliformismo dinamico  -  sobre-escritura de metodos 
    @Override
    public double getArea(){
        double a = this.base * this.altura / 2;
        super.setArea(a);
        return a;
    }

    @Override
    public double getPerimetro(){
        double p = 3 * this.base;
        System.out.println("Perimetro de figura geometrica: " + super.getPerimetro());
        return p;
    }

    //Poliformismo dinamico  -  sobre-escritura de metodos
    //El metodo que se sobre-escribe es el toString de FiguraGeometrica
    @Override
    public String toString(){
        return super.toString() +"Triangulo [base=" + base +", altura=" + altura +"]";

    }

}
public class Piramide extends Triangulo {
    private double volumen;
    private double alturaPiramide; // Altura propia de la pirámide (no la del triángulo base)

    // Constructor que recibe solo el volumen
    public Piramide(String nombre, double volumen) {
        super(nombre, 100, 60); // Base y altura del triángulo en 0
        this.volumen = volumen;
        this.alturaPiramide = 0;
    }

    // Constructor que recibe volumen y altura 
    public Piramide(String nombre, double volumen, double alturaPiramide) {
        super(nombre, 100, 60); 
        this.volumen = volumen;
        this.alturaPiramide = alturaPiramide;
    }

    
    public double getVolumen() {
        
        double areaBase = super.getArea(); 
        return (areaBase * this.alturaPiramide) / 3.0; // Override 
    }



    public void setVolumen(double volumen) {
        this.volumen = volumen;

    }


    public double getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(double alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }

    @Override
    public double getArea(){
        double a = super.getBase() * super.getAltura() / 2;
        super.setArea(a);
        return a;
    }

    @Override
    public String toString() {
        return super.toString() + " Piramide [volumen=" + getVolumen() + ", alturaPiramide=" + alturaPiramide + "]";
    }
}
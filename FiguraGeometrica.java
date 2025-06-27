public class FiguraGeometrica{
    private String nombre;
    private double area;
    private double perimetro;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    //Sobre carga de metodos - pliformismo estatico, parametrico o de tiempo de complicacion 
    //sobre carga al constructor que recibe solo el nombre 
    public FiguraGeometrica(String nombre, double area){
        this.nombre = nombre;
        this.area = area;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //Polimorfismo dinamico, en tiempo de ejecucion, sobre-escritura de metodos 
    @Override
    public String toString() {
        return "FiguraGeometrica [nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + "]";
    }

    
}

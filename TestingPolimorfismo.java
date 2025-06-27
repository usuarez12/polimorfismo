public class TestingPolimorfismo {
    public static void main(String[] args) {

        // Ejemplo de uso de sobrecarga
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexagono");
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(32.9);
        System.out.println("Datos de una figura: " + unaFigura);

        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentagono", 25.12);
        System.out.println("Datos de otraFigura: " + otraFigura);
        System.out.println();

        Triangulo triangulo1 = new Triangulo("Triangulo 1", 19.2, 15.8);
        System.out.println("Datos del triangulo 1: " + triangulo1);
        System.out.println("Área de triangulo 1: " + triangulo1.getArea());
        System.out.println("Perímetro de triangulo 1: " + triangulo1.getPerimetro());
        System.out.println();

        
        // Pirámide 1
        Piramide piramide2 = new Piramide("Piramide 1", 90, 30);
        System.out.println("Volumen de pirámide 1: " + piramide2.getVolumen());
        System.out.println("Altura de pirámide 1: " + piramide2.getAlturaPiramide());
    }
}

import java.util.Scanner;

public class Triangulo {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto baricentro;

    private double a;
    private double b;
    private double c;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        a = calcularDistancias(this.punto1,this.punto2);
        b = calcularDistancias(this.punto1,this.punto3);
        c = calcularDistancias(this.punto2,this.punto3);
    }

    public Triangulo() {
    }

    public void ingresarPuntos(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese la componente X del punto 1: ");
        double x1 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 1: ");
        double y1 = sc.nextDouble();
        System.out.println("Ingrese la componente X del punto 2: ");
        double x2 = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto 2: ");
        double y2 = sc.nextDouble();
        System.out.println("Ingrese la componente X del punto 3: ");
        double x3 = sc.nextDouble();
        System.out.println("Ingrese la componente y del punto 3: ");
        double y3 = sc.nextDouble();
        this.punto1 = new Punto(x1,y1);
        this.punto2 = new Punto(x2,y2);
        this.punto3 = new Punto(x3,y3);
    }

    public boolean esRectangulo(){
        a = calcularDistancias(this.punto1,this.punto2);
        b = calcularDistancias(this.punto1,this.punto3);
        c = calcularDistancias(this.punto2,this.punto3);
        if (Math.pow(a,2)==(Math.pow(b,2)+Math.pow(c,2))){
            return true;
        }
        return false;
    }

    public double calcularDistancias(Punto punto1, Punto punto2){
        return Math.sqrt(Math.pow((punto1.getX()-punto2.getX()),2)+Math.pow((punto1.getY()-punto2.getY()),2));
    }

    public Punto getBaricentro(){
        double gx=(punto1.getX()+punto2.getX()+punto3.getX())/3;
        double gy=(punto1.getY()+punto2.getY()+punto3.getY())/3;
        this.baricentro=new Punto(gx,gy);
        return this.baricentro;
    }

    public double calcularArea(){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

}

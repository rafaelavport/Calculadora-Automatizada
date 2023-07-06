package exemplo.aulasobreabstract;

public class Aulasobreabstract {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.setRaio(5);
        System.out.println("A area do circulo de raio 5 é " + c1.calculaArea());
        System.out.println("O perimetro do circulo de raio 5 é " + c1.calculaPerimetro());
        System.out.println("-----------------------------");

        Retangulo r1 = new Retangulo();
        r1.setBase(7);
        r1.setAltura(5);
        System.out.println("A area do retangulo de base 7 e altura 5 é " + r1.calculaArea());
        System.out.println("O perimetro do retangulo de base 7 e altura 5 é " + r1.calculaPerimetro());
        System.out.println("-----------------------------");

        Triangulo t1 = new Triangulo();
        t1.setBase(5);
        t1.setAltura(5);
        System.out.println("A area do triangulo de altura 5 é " + t1.calculaArea());
        System.out.println("O perimetro do triangulo de base 5 é " + t1.calculaPerimetro());
        System.out.println("-----------------------------");

        Quadrado q1 = new Quadrado();
        q1.setBase(5);
        System.out.println("A area do quadrado de altura 5 é " + q1.calculaArea());
        System.out.println("O perimetro do quadrado de base 5 é " + q1.calculaPerimetro());
        System.out.println("-----------------------------");
    }

}

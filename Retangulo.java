package exemplo.aulasobreabstract;

public class Retangulo extends Figura {

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calculaArea() {
        return base * altura;
    }

    @Override
    public float calculaPerimetro() {
        return 2 * base + 2 * altura;
    }
}

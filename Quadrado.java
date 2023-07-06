package exemplo.aulasobreabstract;

public class Quadrado extends Figura {

    private float base;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float calculaArea() {
        return base * 2;
    }

    @Override
    public float calculaPerimetro() {
        return base * 4;
    }
}

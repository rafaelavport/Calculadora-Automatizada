package exemplo.aulasobreabstract;

public class Triangulo extends Figura {

    public float base;
    public float altura;
    public float hipotenusa;

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

    public float getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(float hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    @Override
    public float calculaArea() {
        return ((base * altura) / 2);
    }

    @Override
    public float calculaPerimetro() {
        return (base + base + base);
    }
}

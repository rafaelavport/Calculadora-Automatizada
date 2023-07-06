
package exemplo.aulasobreabstract;

public class Circulo extends Figura {
    
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float calculaArea() {
        return (float) (Math.PI*(raio*raio));
    }

    @Override
    public float calculaPerimetro() {
        return (float) (2*Math.PI*raio);
    }
}

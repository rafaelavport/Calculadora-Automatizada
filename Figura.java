
package exemplo.aulasobreabstract;

public abstract class Figura {
    private String nomeFigura;
    
    public String getNomeFigura(){
        return nomeFigura;
    }
    
    public void setNomeFigura(String nomeFigura){
        this.nomeFigura = nomeFigura;
    }
    
    public abstract float calculaArea();
    public abstract float calculaPerimetro();
}


package CapaNegocio;


public class Estudiante extends ComunidadUniver 
{
    public double promF;

    public Estudiante(String c, String a, double promF) {
        super(c, a);
        this.promF = promF;
    }

    public double getPromF() {
        return promF;
    }

    public void setPromF(double promF) {
        this.promF = promF;
    }
    
}

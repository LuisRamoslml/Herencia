
package CapaNegocio;


public class Profesor extends ComunidadUniver 
{
    public int nh;

    public Profesor(String c, String a, int nh) {
        super(c, a);
        this.nh = nh;
    }

    public int getNh() {
        return nh;
    }

    public void setNh(int nh) {
        this.nh = nh;
    }
    
}

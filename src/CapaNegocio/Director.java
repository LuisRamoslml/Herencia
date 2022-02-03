
package CapaNegocio;


public class Director extends ComunidadUniver 
{
    
    private String CodOf;

    public Director(String c, String a, String CodOf) {
        super(c, a);
        this.CodOf=CodOf;
    }

    public String getCodOf() {
        return CodOf;
    }

    public void setCodOf(String CodOf) {
        this.CodOf = CodOf;
    }
    
    
    
    
}

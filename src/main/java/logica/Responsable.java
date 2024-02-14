
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona implements Serializable{
    
    //private int id_responsable;
    private String tipo_resp;

    public Responsable() {
    }

    public Responsable(String tipo_resp, int id, String cc, String nombres, String apellidos, String telefono, String direccion, Date fecha_nac) {
        super(id, cc, nombres, apellidos, telefono, direccion, fecha_nac);
        this.tipo_resp = tipo_resp;
    }

    public String getTipo_resp() {
        return tipo_resp;
    }

    public void setTipo_resp(String tipo_resp) {
        this.tipo_resp = tipo_resp;
    }

  

   


    
    
    
    
    
    
}

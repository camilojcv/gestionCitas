
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable{
  
    //private int id_paciente;
    private boolean eps;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany (mappedBy ="pacien")
    private List <Turno> listaTurno;

    
    
    public Paciente() {
    }

    public Paciente(boolean eps, Responsable unResponsable, List<Turno> listaTurno, int id, String cc, String nombres, String apellidos, String telefono, String direccion, Date fecha_nac) {
        super(id, cc, nombres, apellidos, telefono, direccion, fecha_nac);
        this.eps = eps;
        this.unResponsable = unResponsable;
        this.listaTurno = listaTurno;
    }

   

 

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

    
 
    
   /* public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }
/*
    
    */
    public boolean isEps() {
        return eps;
    }

    public void setEps(boolean eps) {
        this.eps = eps;
    }
    
    
    
}

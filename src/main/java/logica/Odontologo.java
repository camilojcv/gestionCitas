
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable{
    
    //private int id_odontologo;
    @OneToMany (mappedBy ="odonto")
    private List <Turno> listaTurno;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(List<Turno> listaTurno, Usuario unUsuario, Horario unHorario, int id, String cc, String nombres, String apellidos, String telefono, String direccion, Date fecha_nac) {
        super(id, cc, nombres, apellidos, telefono, direccion, fecha_nac);
        this.listaTurno = listaTurno;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

   
    
    /*public int getId_odontologo() {
        return id_odontologo;
    }
/*
    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }
/*
    
    */
 
    public List<Turno> getListaTurno() {
        return listaTurno;
    }
    

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
    
    
    
}

import java.util.ArrayList;
import java.util.Date;

public class Turno {
    private Date fechaTurno;
    private Empresa empresa;
    private ArrayList<Personal> listPersonal;

    public Turno() {
    }

    public Turno(Date fechaTurno, Empresa empresa, ArrayList<Personal> listPersonal) {
        this.fechaTurno = fechaTurno;
        this.empresa = empresa;
        this.listPersonal = listPersonal;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Personal> getListPersonal() {
        return listPersonal;
    }

    public void setListPersonal(ArrayList<Personal> listPersonal) {
        this.listPersonal = listPersonal;
    }
}

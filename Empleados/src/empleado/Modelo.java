package empleado;

import java.util.ArrayList;

public class Modelo {
//ARREGLO PARA rRECUPERAR EL EMPLEADO QUE ESTA GUARDADO 
    private ArrayList<Empleado> empleado;

    public Modelo() {

    }

    public Modelo(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public Empleado buscar() {
        for (int i = 0; i < empleado.size(); i++) {
            if (empleado.get(i).getSalario() > empleado.get(i).getSalario()) {
                return empleado.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Modelo{" + "empleado=" + empleado + '}';
    }

}

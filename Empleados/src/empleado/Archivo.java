package empleado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {
// ARREGLO PARA GUARDAR EMPLEADO
    public ArrayList<Empleado> leer() {
        ArrayList<Empleado> empelados = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("empleados.txt"));
            String s;
            int cedula, antiguedad, tipoEmpleado;
            String nombre;
            double salario;
            double nuevoSalario;
            double pagarEmpleado;

            while ((s = entrada.readLine()) != null) {
                String[] informacion = s.split("-");
                cedula = Integer.parseInt(informacion[0]);
                nombre = informacion[1];
                antiguedad = Integer.parseInt(informacion[2]);
                salario = Double.parseDouble(informacion[3]);
                tipoEmpleado = Integer.parseInt(informacion[4]);
                nuevoSalario = Double.parseDouble(informacion[5]);
                pagarEmpleado = Double.parseDouble(informacion[6]);

                Empleado empleado = new Empleado(cedula, nombre, antiguedad, salario, tipoEmpleado, nuevoSalario, pagarEmpleado);
                empelados.add(empleado);
            }
            entrada.close();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
        }
        return empelados;
    }

    public void escribir(ArrayList<Empleado> empleado) {
        try {
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("empleados.txt")));
            for (int i = 0; i < empleado.size(); i++) {
                salida.println(empleado.get(i).getCedula() + "-" + empleado.get(i).getNombre() + "-" + empleado.get(i).getAntiguedad() + "-" + empleado.get(i).getSalario() + "-" + empleado.get(i).getTipoEmpleado()+ "-" + empleado.get(i).calcularNuevoSalario()+ "-" + empleado.get(i).calcularValorPago());
            }
            salida.close();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
        }
    }

}

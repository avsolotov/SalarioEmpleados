package empleado;

public class Empleado {
// QUE VAMOS A GUARDAR DE EMPLEADO Y SUS METODOS

    int cedula;
    String nombre;
    int antiguedad;
    double salario;
    int tipoEmpleado;
    double nuevoSalario;
    double pagarEmpleado;

    public Empleado(int cedula, String nombre, int antiguedad, double salario, int tipoEmpleado, double nuevoSalario, double pagarEmpleado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
        this.nuevoSalario = nuevoSalario;
        this.pagarEmpleado = pagarEmpleado;
    }

    public Empleado(int cedula, String nombre, int antiguedad, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.salario = salario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }


    public int ObtenerTipo() {
        if (antiguedad <= 4) {
            tipoEmpleado = 1;
        } else if (antiguedad >= 5 && antiguedad <= 8) {
            tipoEmpleado = 2;
        } else {
            tipoEmpleado = 3;
        }
        return tipoEmpleado;
    }

    public double calcularNuevoSalario() {
        double salario2;
        double salario3;
        double a = 82.000;
        double b = 96.000;

        if (tipoEmpleado == 1) {
            salario2 = salario * 0.0015;
            salario = salario2 + salario;
            if (salario < a) {
                salario3 = salario - a;
                nuevoSalario = salario + salario3;
            } else {
                nuevoSalario = salario;
            }
        } else if (tipoEmpleado == 2) {
            salario2 = salario * 0.002;
            salario = salario2 + salario;
            if (salario < b) {
                salario3 = salario - b;
                nuevoSalario = salario + salario3;
            } else {
                nuevoSalario = salario;
            }
        } else {
            salario2 = salario * 0.025;
            salario = salario2 + salario;
            nuevoSalario = salario;
        }
        return nuevoSalario;
    }

    public double calcularValorPago() {
        double nuevoSalario2;
        nuevoSalario2 = nuevoSalario * 0.08;
        pagarEmpleado = nuevoSalario - nuevoSalario2;
        return pagarEmpleado;
    }

}

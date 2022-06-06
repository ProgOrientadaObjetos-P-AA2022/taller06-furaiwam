package paquete1;

public class Doctor {
    private String nombre;
    private String especialidad;
    private double sueldo;

    public Doctor(String nom, String epec, double s) {
        nombre = nom;
        especialidad = epec;
        sueldo = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}

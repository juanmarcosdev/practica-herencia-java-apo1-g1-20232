package model;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private String carrera;

    public Estudiante(String nombre, int edad, int codigoEstudiante, String carrera) {
        super(nombre, edad);

        this.codigoEstudiante = codigoEstudiante;
        this.carrera = carrera;
    }

    public int getCodigoEstudiante() {
        return this.codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
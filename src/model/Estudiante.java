package model;

public class Estudiante extends Persona {

    private String codigoEstudiante;
    private String carrera;

    public Estudiante(String nombre, int edad, String codigoEstudiante, String carrera) {
        super(nombre,edad);


        this.codigoEstudiante = codigoEstudiante;
        this.carrera = carrera;
    }

    public String getCodigoEstudiante() {
        return this.codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String presentarse() {
        return "Hola Me llamo " + this.getNombre() + " y tengo " + this.getEdad() + " anhos, mi codigo es " + this.codigoEstudiante + " y estudio " + this.carrera;
     }
}
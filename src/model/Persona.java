package model;

public class Persona {


	 private String nombre;
	 private int edad;

	 public Persona() {

	 }

	 public Persona(String nombre) {
	 	this.nombre = nombre;
	 }

	 public Persona(String nombre, int edad) {
	 	this.nombre = nombre;
	 	this.edad = edad;
	 }

	 public String getNombre() {
	 	return this.nombre;
	 }

	 public void setNombre(String nombre) {
	 	this.nombre = nombre;
	 }

	 public int getEdad() {
	 	return this.edad;
	 }

	 public void setEdad(int edad) {
	 	this.edad = edad;
	 }

	 public String presentarse() {
	 	return "Hola Me llamo " + this.nombre + " y tengo " + this.edad + " anhos";
	 }

}
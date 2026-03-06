package com.school.model;

public class Student {

    // Atributos privados
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean status;

    // Constructor vacío
    public Student() {
    }

    // Constructor con parámetros
    public Student(int id, String firstName, String lastName, String email, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Método para imprimir información
    public void printInformation() {
        System.out.println("========== ESTUDIANTE ==========");
        System.out.println("ID         : " + id);
        System.out.println("Nombre : " + firstName);
        System.out.println("Apellido  : " + lastName);
        System.out.println("Email      : " + email);
        System.out.println("Estado     : " + (status ? "Active" : "Inactive"));
        System.out.println("=============================");
    }

    public boolean deleteStudent() {
        try {
            System.out.println("========== ELIMINAR ESTUDIANTE ==========");
            System.out.println("ELIMINAR EL SIGUIENTE ESTUDIANTE: " + this.id + " " + this.lastName + " (ID: " + this.id + ")");


            this.id = 0;
            this.firstName = null;
            this.lastName = null;
            this.email = null;
            this.status = false;

            System.out.println("Estudiante eliminado exitosamente.");
            System.out.println("====================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar el estudiante: " + e.getMessage());
            return false;
        }
    }

    public boolean modifyStudent(String firstName, String lastName, String email, boolean status) {
        try {
            System.out.println("========== MODIFICAR ESTUDIANTE ==========");
            System.out.println("Id de el estudiante a modificar: " + this.id);

            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.status = status;

            System.out.println("Estudiante modificado.");
            System.out.println("====================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al modificar el estudiante: " + e.getMessage());
            return false;
        }
    }

}

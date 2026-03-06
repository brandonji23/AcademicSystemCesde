package com.school.model;

public class Professor {

    // Atributos privados
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String specialty;
    private boolean status;

    // Constructor vacío
    public Professor() {
    }

    // Constructor con parámetros
    public Professor(int id, String firstName, String lastName, String specialty, String email, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void printInformation() {
        System.out.println("========== PROFESOR ==========");
        System.out.println("ID         : " + id);
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Email      : " + email);
        System.out.println("Specialty  : " + specialty);
        System.out.println("Status     : " + (status ? "Active" : "Inactive"));
        System.out.println("===============================");
    }

    public boolean addProfessor(int id, String firstName, String lastName, String email, String specialty, boolean status) {
        try {
            System.out.println("========== AÑADIR PROFESOR ==========");

            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.specialty = specialty;
            this.status = status;

            System.out.println("Profesor añadido con exito (id): " + this.id);
            System.out.println("===================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al añadir el profesor: " + e.getMessage());
            return false;
        }
    }


    public boolean modifyProfessor(String firstName, String lastName, String email, String specialty, boolean status) {
        try {
            System.out.println("========== MODIFICAR PROFESOR ==========");
            System.out.println("Modifying professor ID: " + this.id);

            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.specialty = specialty;
            this.status = status;

            System.out.println("Profesor modificado con exito.");
            System.out.println("======================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al modificar el profesor: " + e.getMessage());
            return false;
        }
    }


    public boolean deleteProfessor() {
        try {
            System.out.println("========== ELIMINAR PROFESOR ==========");
            System.out.println("Eliminar profesor: " + this.firstName + " " + this.lastName + " (ID: " + this.id + ")");

            this.id = 0;
            this.firstName = null;
            this.lastName = null;
            this.email = null;
            this.specialty = null;
            this.status = false;

            System.out.println("Profesor eliminado con exito.");
            System.out.println("======================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar el profesor: " + e.getMessage());
            return false;
        }
    }
}

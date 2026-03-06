package com.school.model;

public class School {

    // Atributos privados
    private int id;
    private String name;
    private String director;

    // Constructor vacío
    public School() {
    }

    // Constructor con parámetros
    public School(int id, String name, String director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Método para imprimir información
    public void printInformation() {
        System.out.println("========== SCHOOL ==========");
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Director : " + director);
        System.out.println("============================");
    }

    public boolean addSchool(int id, String name, String director) {
        try {
            System.out.println("========== AÑADIR ESCUELA ==========");

            this.id = id;
            this.name = name;
            this.director = director;

            System.out.println("Escuela añadida con exito (id): " + this.id);
            System.out.println("================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al añadir la escuela: " + e.getMessage());
            return false;
        }
    }

    public boolean modifySchool(String name, String director) {
        try {
            System.out.println("========== MODIFICAR ESCUELA ==========");
            System.out.println("ID de la escuela a modificar: " + this.id);

            this.name = name;
            this.director = director;

            System.out.println("Escuela modificada con exito.");
            System.out.println("===================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al modificar la escuela: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteSchool() {
        try {
            System.out.println("========== ELIMINAR ESCUELA ==========");
            System.out.println("Escuela a eliminar: " + this.name + " (ID: " + this.id + ")");

            this.id = 0;
            this.name = null;
            this.director = null;

            System.out.println("Escuela eliminada con exito.");
            System.out.println("===================================");
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar la escuela: " + e.getMessage());
            return false;
        }
    }
}

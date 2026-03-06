package com.school.model;

import java.time.LocalDate;

public class Course {

    // Atributos privados
    private int id;
    private String name;
    private String programName;
    private School school;
    private Professor professor;
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructor vacío
    public Course() {
    }

    // Constructor con parámetros
    public Course(int id, String name, String programName, School school,
                  Professor professor, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.name = name;
        this.programName = programName;
        this.school = school;
        this.professor = professor;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // Método para imprimir información
    public void printInformation() {
        System.out.println("========== COURSE ==========");
        System.out.println("ID           : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Program      : " + programName);
        System.out.println("School       : " + (school != null ? school.getName() : "N/A"));
        System.out.println("Professor    : " + (professor != null ? professor.getFirstName() + " " + professor.getLastName() : "N/A"));
        System.out.println("Start Date   : " + startDate);
        System.out.println("End Date     : " + endDate);
        System.out.println("============================");
    }
}

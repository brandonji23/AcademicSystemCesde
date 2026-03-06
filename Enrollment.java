package com.school.model;

import java.time.LocalDate;

public class Enrollment {

    // Atributos privados
    private int id;
    private LocalDate enrollmentDate;
    private Student student;
    private Course course;
    private Classroom classroom;
    private boolean status;

    // Constructor vacío
    public Enrollment() {
    }

    // Constructor con parámetros
    public Enrollment(int id, LocalDate enrollmentDate, Student student,
                      Course course, Classroom classroom, boolean status) {
        this.id = id;
        this.enrollmentDate = enrollmentDate;
        this.student = student;
        this.course = course;
        this.classroom = classroom;
        this.status = status;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Método para imprimir información
    public void printInformation() {
        System.out.println("========== ENROLLMENT ==========");
        System.out.println("ID              : " + id);
        System.out.println("Enrollment Date : " + enrollmentDate);
        System.out.println("Student         : " + (student != null ? student.getFirstName() + " " + student.getLastName() : "N/A"));
        System.out.println("Course          : " + (course != null ? course.getName() : "N/A"));
        System.out.println("Classroom       : " + (classroom != null ? "Room " + classroom.getRoomNumber() + " - Floor " + classroom.getFloor() : "N/A"));
        System.out.println("Status          : " + (status ? "Active" : "Inactive"));
        System.out.println("================================");
    }
}

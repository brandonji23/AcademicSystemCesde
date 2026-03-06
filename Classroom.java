package com.school.model;

public class Classroom {

    // Atributos privados
    private int id;
    private int roomNumber;
    private int floor;
    private int capacity;
    private boolean status;

    // Constructor vacío
    public Classroom() {
    }

    // Constructor con parámetros
    public Classroom(int id, int roomNumber, int floor, int capacity, boolean status) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
        this.status = status;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Método para imprimir información
    public void printInformation() {
        System.out.println("========== CLASSROOM ==========");
        System.out.println("ID          : " + id);
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Floor       : " + floor);
        System.out.println("Capacity    : " + capacity);
        System.out.println("Status      : " + (status ? "Available" : "Unavailable"));
        System.out.println("===============================");
    }
}

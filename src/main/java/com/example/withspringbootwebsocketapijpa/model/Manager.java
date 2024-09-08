package com.example.withspringbootwebsocketapijpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Manager {
    public void setMid(int mid) {
        this.mid = mid;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;
    @Column
    private String name;
    public int getMid() {
        return mid;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Manager [mid=" + mid + ", name=" + name + "]";
    }
}

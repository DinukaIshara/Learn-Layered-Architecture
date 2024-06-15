package com.example.layeredarchitecture.model;

import java.io.Serializable;

//High Cohesion
public class CustomerDTO implements Serializable {
    private String id;
    private String name;
    private String address;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String address) { // Constructor Through Injection
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) { // Setter Method Through Injection
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // Setter Method Through Injection
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) { // Setter Method Through Injection
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

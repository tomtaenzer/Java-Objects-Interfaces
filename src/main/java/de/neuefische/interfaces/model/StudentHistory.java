package de.neuefische.interfaces.model;

public class StudentHistory {

    private String Name;
    private int id;

    public StudentHistory(String name, int id) {
        Name = name;
        this.id = id; }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}

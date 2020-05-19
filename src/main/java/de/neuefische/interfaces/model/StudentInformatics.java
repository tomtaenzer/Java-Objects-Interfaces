package de.neuefische.interfaces.model;

public class StudentInformatics {

    private String Name;
    private int id;

    public StudentInformatics(String name, int id) {
        this.Name = name;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

package seminar2.core.personal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import seminar2.core.clients.owners.Owner;
import seminar2.core.clients.supports.Record;

public class Medpersonal {
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();

    protected int id; 
    protected String name; 
    protected LocalDate hireDate; 
    

    public Medpersonal() {
    }


    public Medpersonal(int id, String name,  LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }


    public String getCLASS_NAME() {
        return CLASS_NAME;
    }


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


    public LocalDate getHireDate() {
        return hireDate;
    }


    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    
   
}

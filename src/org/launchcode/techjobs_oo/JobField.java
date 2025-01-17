package org.launchcode.techjobs_oo;
import java.util.Objects;

public abstract class JobField {
    private int id;
    private int nextId = 1;
    public String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
    public JobField (String value){
        this();
        if((value.isEmpty()||value.isBlank())){
            this.value = value;
        }
    }
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        if(value==null){ return "Data not available"; }
        else { return value; }
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (!(value.isBlank()||value.isEmpty())){
            this.value = value;
        }
    }
}

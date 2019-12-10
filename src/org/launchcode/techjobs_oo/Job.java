package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
    id = nextId;
    nextId++;
    }

    public Job(String name, Employer employer, Location taterTot, PositionType cheese, CoreCompetency arrugala) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = taterTot;
        this.positionType = cheese;
        this.coreCompetency = arrugala;
    }

    @Override
    public String toString() {
        if (this.getName().contains(" ") || this.getEmployer().getValue().contains(" ") || this.getLocation().getValue().contains(" ")|| this.getPositionType().getValue().contains(" ") || this.getCoreCompetency().getValue().contains(" ")){
            System.out.println("Data not available");
        }
    return "\nID: " +this.getId()+ "\nName: " +this.getName()+ "\nEmployer: " +this.getEmployer().getValue()+ "\nLocation: " +this.getLocation().getValue()+ "\nPosition Type: " +this.getPositionType().getValue()+ "\nCore Competencies: " +this.getCoreCompetency().getValue()+ "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

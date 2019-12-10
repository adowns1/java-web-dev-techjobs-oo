package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job objectOne;
    Job objectTwo;
    Job objectThree;
    Job compareOne;
    Job compareTwo;
    Job withSpaces;
    Job emptyFieldObj;

    @Before
    public void function (){
        objectOne = new Job();
        objectTwo = new Job();
        objectThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        compareOne = new Job("baker", new Employer("Cookies"), new Location("here"), new PositionType("Lead Baker"), new CoreCompetency("Food Science"));
        compareTwo = new Job("baker", new Employer("Cookies"), new Location("here"), new PositionType("Lead Baker"), new CoreCompetency("Food Science"));
        withSpaces = new Job("baker", new Employer("Cookies"), new Location("here"), new PositionType("Lead Baker"), new CoreCompetency("Food Science \n"));
        emptyFieldObj = new Job(" ", new Employer("Cookies"), new Location("here"), new PositionType("Lead Baker"), new CoreCompetency("Food Science"));

    }

// tests that job IDs are not equal
    @Test
    public void testSettingJobId() {
        assertFalse(objectOne.getId() == objectTwo.getId());
    }

//tests that constructor correctly sets class and value of all fields
    @Test
    public void testJobConstructorSetsAllFields(){

    assertTrue(objectThree.getEmployer() instanceof Employer);
    assertTrue(objectThree.getLocation() instanceof Location);
    assertTrue(objectThree.getPositionType() instanceof PositionType);
    assertTrue(objectThree.getCoreCompetency() instanceof CoreCompetency);

    assertTrue(objectThree.getName() == "Product tester");
    assertTrue(objectThree.getEmployer().getValue() == "ACME");
    assertTrue(objectThree.getLocation().getValue() == "Desert");
    assertTrue(objectThree.getPositionType().getValue() == "Quality control");
    assertTrue(objectThree.getCoreCompetency().getValue() == "Persistence");

    }
    @Test
    public void testJobsForEquality () {
        assertFalse(compareOne.getId() == compareTwo.getId());
    }

    //tests blank line before and after job info
    @Test
    public void testToString () {
        String compareString = "\nID: " +compareOne.getId()+ "\nName: " +compareOne.getName()+ "\nEmployer: " +compareOne.getEmployer().getValue()+ "\nLocation: " +compareOne.getLocation().getValue()+ "\nPosition Type: " +compareOne.getPositionType().getValue()+ "\nCore Competencies: " +compareOne.getCoreCompetency().getValue()+ "\n";
        compareOne.toString().compareTo(compareString);
    }

    //tests each field has label and data on own line
    @Test
    public  void testOwnLineWithData () {
        String compareEmployer = compareOne.getEmployer().toString();
       compareEmployer.compareTo("\nEmployer: " +compareOne.getEmployer().getValue());
    }

    @Test
    public void testEmptyField () {
        String errorMessage = "Data not available";
        objectOne.toString().compareTo(errorMessage);
    }

}

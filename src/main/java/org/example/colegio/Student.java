package org.example.colegio;

public class Student {

    private String firstName;
    private String lastName;
    private String fileNumber;

    public Student( String firstName, String lastName, String fileNumber ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fileNumber = fileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber( String fileNumber ) {
        this.fileNumber = fileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fileNumber='" + fileNumber + '\'' +
                '}';
    }
}

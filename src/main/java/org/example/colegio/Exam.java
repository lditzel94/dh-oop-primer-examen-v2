package org.example.colegio;

public abstract class Exam {

    protected Student student;
    protected String description;
    protected String exercise;
    protected int mark;

    public Exam( Student student, String description, String exercise, int mark ) {
        this.student = student;
        this.description = description;
        this.exercise = exercise;
        this.mark = mark;
    }

    public abstract boolean isApproved();

    public Student getStudent() {
        return student;
    }

    public void setStudent( Student student ) {
        this.student = student;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise( String exercise ) {
        this.exercise = exercise;
    }

    public int getMark() {
        return mark;
    }

    public void setMark( int mark ) {
        this.mark = mark;
    }
}

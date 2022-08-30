package org.example.colegio;

public class FinalExam extends Exam implements Comparable {
    private int oralExamMark;
    private String oralExamDescription;

    public FinalExam( Student student, String description, String exercise, int mark, int oralExamMark, String oralExamDescription ) {
        super( student, description, exercise, mark );
        this.oralExamMark = oralExamMark;
        this.oralExamDescription = oralExamDescription;
    }

    private int calcAverage() {
        return ( mark + oralExamMark ) / 2;
    }

    @Override
    public boolean isApproved() {
        return ( mark >= 4 && oralExamMark >= 4 );
    }

    @Override
    public int compareTo( Object o ) {
        int thisAverage = calcAverage();
        int thatAverage = ( ( FinalExam ) o ).calcAverage();
        return thisAverage - thatAverage;
    }
}

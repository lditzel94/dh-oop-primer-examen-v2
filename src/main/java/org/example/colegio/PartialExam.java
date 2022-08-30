package org.example.colegio;

public class PartialExam extends Exam {
    private int studyUnit;
    private int retries;

    public PartialExam( Student student, String description, String exercise, int mark, int studyUnit, int retries ) {
        super( student, description, exercise, mark );
        this.studyUnit = studyUnit;
        this.retries = retries;
    }

    public boolean canRetry() {
        if ( retries <= 3 && studyUnit <= 3 ) return true;
        else if ( retries <= 2 && studyUnit > 3 ) return true;
        else return false;
    }

    @Override
    public boolean isApproved() {
        return mark >= 4;
    }
}

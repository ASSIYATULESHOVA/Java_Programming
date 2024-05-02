package day30_Inheritance.TypesOgInheritance;

import java.time.LocalDate;

public class President extends Person{

    private LocalDate electedDate;

    public LocalDate getElectedDat() {
        return electedDate;
    }

    public void setElectedDat(LocalDate electedDat) {
        this.electedDate = electedDat;
    }

    public void lie(){
        System.out.println(getName()+" is lying");
    }

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
       setElectedDat(electedDate);
    }
}

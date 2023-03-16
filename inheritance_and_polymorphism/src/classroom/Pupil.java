package classroom;

public abstract class Pupil {

    String nameOfPupil;

    Pupil(String nameOfPupil){

        this.nameOfPupil = nameOfPupil;
    }

    abstract void study();
    abstract void read();
    abstract void write();
    abstract void relax();

}

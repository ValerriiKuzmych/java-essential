package classroom;

public class BadPupil extends Pupil{


    BadPupil(String nameOfBadPupil){
        super(nameOfBadPupil);

    }

    @Override
    void study(){
        System.out.println("Pupil " +super.nameOfPupil+ " study: Bad");
    };

    @Override
    void read(){
        System.out.println("Pupil " +super.nameOfPupil+ " read: Bad");

    };

    @Override
    void write(){
        System.out.println("Pupil " +super.nameOfPupil+ " write: Bad");

    };

    @Override
    void relax(){
        System.out.println("Pupil " +super.nameOfPupil+ " relax: Bad");

    };


}

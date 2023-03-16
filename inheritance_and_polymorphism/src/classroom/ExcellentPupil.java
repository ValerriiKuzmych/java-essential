package classroom;

public class ExcellentPupil extends Pupil {


    ExcellentPupil(String nameOfExcellentPupil){
        super(nameOfExcellentPupil);
    }

    @Override
    void study(){
        System.out.println("Pupil " +super.nameOfPupil+ " study: Excellent");
    };

    @Override
    void read(){
        System.out.println("Pupil " +super.nameOfPupil+ " read: Excellent");

    };

    @Override
    void write(){
        System.out.println("Pupil " +super.nameOfPupil+ " write: Excellent");

    };

    @Override
    void relax(){
        System.out.println("Pupil " +super.nameOfPupil+ " relax: Excellent");

    };
}

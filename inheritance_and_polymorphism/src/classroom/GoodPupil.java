package classroom;

public class GoodPupil extends Pupil{

    GoodPupil(String nameOfGoodPupil){

        super(nameOfGoodPupil);
    }

     @Override
    void study(){
        System.out.println("Pupil " +super.nameOfPupil+ " study: Good");
    };

     @Override
    void read(){
        System.out.println("Pupil " +super.nameOfPupil+ " read: Good");

    };

     @Override
    void write(){
        System.out.println("Pupil " +super.nameOfPupil+ "  write: Good");

    };

     @Override
    void relax(){
        System.out.println("Pupil " +super.nameOfPupil+ " relax: Good");

    };
}

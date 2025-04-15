package exception;

public class SubStudent extends Student {
    @Override
    public void addCourse(){ // "throws FileNotFoundException" cannot override without exception
        //super.addCourse();
    }

    /*
    @Override
    public void deleteCourse() throws FileNotFoundException {
    // does not compile - overriden method does not throw exception
        super.deleteCourse();
    }*/
}

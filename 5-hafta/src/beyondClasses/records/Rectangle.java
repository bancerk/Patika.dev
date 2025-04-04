package beyondClasses.records;

public record Rectangle(int width, int height) {

    public int area(){
        return width*height;
    }

}

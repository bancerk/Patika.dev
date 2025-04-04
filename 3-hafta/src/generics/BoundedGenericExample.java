package generics;

public class BoundedGenericExample <T extends Animal> {

    private T content;

    // private static T content; static Generic ifadesi ekleyemeyiz

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

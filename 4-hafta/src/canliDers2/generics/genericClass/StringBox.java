package canliDers2.generics.genericClass;

public class StringBox {

    private String content;

    public StringBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private boolean isEmpty() {
        return content == null;
    }
}

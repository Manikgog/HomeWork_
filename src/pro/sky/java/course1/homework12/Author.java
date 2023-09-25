package pro.sky.java.course1.homework12;

public class Author {
    private String name_;
    private String lastName_;

    public Author(String name, String laseName) {
        name_ = name;
        lastName_ = laseName;
    }

    public String GetName(){
        return name_;
    }

    public String GetLastName(){
        return lastName_;
    }


}

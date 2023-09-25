package pro.sky.java.course1.homework12;

public class Book {
    private String title_;
    private Author author_;
    private int releaseYear_;

    public Book(String title, Author author, int releaseYear) {
        title_ = title;
        author_ = author;
        releaseYear_ = releaseYear;
    }

    public String GetTitle(){
        return title_;
    }

    public Author GetAuthor(){
        return author_;
    }

    public int GetReleaseYear(){
        return releaseYear_;
    }

    public void SetReleaseYear(int releaseYear){
        releaseYear_ = releaseYear;
    }

}

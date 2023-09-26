package pro.sky.java.course1.homework12;

public class Book {
    private String title;
    private Author author;
    private int releaseYear;

    public Book(String title, Author author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle(){
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

}

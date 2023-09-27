package pro.sky.java.course1.homework12;

import java.util.Objects;

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

    @Override
    public String toString(){
        return title + ", " + author.toString() + ", " + releaseYear;
    }


    public boolean equals(Book b){
        if(this == b){
            return true;
        }
        if(b == null || this.getClass() != b.getClass()){
            return false;
        }
        Book book = (Book) b;
        return this.author.equals(book.author)
                && this.title.equals(book.title)
                && (this.releaseYear == book.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, releaseYear);
    }
}

package pro.sky.java.course1.homework12;

public class HomeWork12 {
    public static void main(String[] args) {

        Author a1 = new Author("Bjarne", "Stroustrup");
        Book b1 = new Book("A Tour of C++", a1, 2020);
        System.out.println("----------------------------------------------------");
        System.out.println("Название книги: " + b1.getTitle());
        System.out.println("Автор: "+ b1.getAuthor().getName() + " " + b1.getAuthor().getLastName());
        System.out.println("Год публикации: " + b1.getReleaseYear());
        System.out.println("----------------------------------------------------");

        Author a2 = new Author("Эрик", "Фримен");
        Book b2 = new Book("Паттерны проектирования", a2, 2021);

        System.out.println("Название книги: " + b2.getTitle());
        System.out.println("Автор: "+ b2.getAuthor().getName() + " " + b2.getAuthor().getLastName());
        System.out.println("Год публикации: " + b2.getReleaseYear());
        System.out.println("----------------------------------------------------");

        Book b3 = new Book("Командная строка Linux", new Author("Уильям", "Шоттс"), 2022);

        System.out.println("Название книги: " + b3.getTitle());
        System.out.println("Автор: "+ b3.getAuthor().getName() + " " + b3.getAuthor().getLastName());
        System.out.println("Год публикации: " + b3.getReleaseYear());
        System.out.println("----------------------------------------------------");
        b1.setReleaseYear(2021);

        System.out.println("Название книги: " + b1.getTitle());
        System.out.println("Автор: "+ b1.getAuthor().getName() + " " + b1.getAuthor().getLastName());
        System.out.println("Год публикации: " + b1.getReleaseYear());
        System.out.println("----------------------------------------------------");
    }
}

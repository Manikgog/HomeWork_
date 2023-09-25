package pro.sky.java.course1.homework12;

public class HomeWork12 {
    public static void main(String[] args) {

        Author a1 = new Author("Bjarne", "Stroustrup");
        Book b1 = new Book("A Tour of C++", a1, 2020);
        System.out.println("----------------------------------------------------");
        System.out.println("Название книги: " + b1.GetTitle());
        System.out.println("Автор: "+ b1.GetAuthor().GetName() + " " + b1.GetAuthor().GetLastName());
        System.out.println("Год публикации: " + b1.GetReleaseYear());
        System.out.println("----------------------------------------------------");

        Author a2 = new Author("Эрик", "Фримен");
        Book b2 = new Book("Паттерны проектирования", a2, 2021);

        System.out.println("Название книги: " + b2.GetTitle());
        System.out.println("Автор: "+ b2.GetAuthor().GetName() + " " + b2.GetAuthor().GetLastName());
        System.out.println("Год публикации: " + b2.GetReleaseYear());
        System.out.println("----------------------------------------------------");

        Book b3 = new Book("Командная строка Linux", new Author("Уильям", "Шоттс"), 2022);

        System.out.println("Название книги: " + b3.GetTitle());
        System.out.println("Автор: "+ b3.GetAuthor().GetName() + " " + b3.GetAuthor().GetLastName());
        System.out.println("Год публикации: " + b3.GetReleaseYear());
        System.out.println("----------------------------------------------------");
        b1.SetReleaseYear(2021);

        System.out.println("Название книги: " + b1.GetTitle());
        System.out.println("Автор: "+ b1.GetAuthor().GetName() + " " + b1.GetAuthor().GetLastName());
        System.out.println("Год публикации: " + b1.GetReleaseYear());
        System.out.println("----------------------------------------------------");
    }
}

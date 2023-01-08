package lesson1;


import java.util.Objects;

public class Book {
        // Создали новый класс
       private String name;
        // Объявили свойство name (имя)
       private int age;
        // Объявили свойство age (возраст)
   private Author avtorName;

    public Book(String name, Author name2, int age) {
        this.name = name;
        this.avtorName = name2;
        this.age = age;

    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Книга - " +  name + ", год издания - " + age + ", " + avtorName;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public Author getAvtorName() {
        return avtorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(name, book.name) && Objects.equals(avtorName, book.avtorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avtorName);
    }
}


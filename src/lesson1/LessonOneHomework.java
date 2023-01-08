package lesson1;


import java.rmi.activation.ActivationGroup_Stub;

public class LessonOneHomework {
   // public Author(String name, String lastname) {
   public static void main(String[] args) {
       String fullName;
       Author books1 = new Author("Антон", "Чехов");
       Author books2 = new Author("Александр", "Пушкин");

       Book bookFull1 = new Book("война и мир", new Author("Лев", "Толстой"),  1980);
       Book bookFull2 = new Book("Руслан и Людмила", books2,  1990);

  System.out.println(bookFull2);
       System.out.println(books2);
       bookFull2.setAge(1888);
       System.out.println(bookFull2);
       System.out.println(bookFull2.getAge());
   }
}


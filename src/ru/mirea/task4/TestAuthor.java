package ru.mirea.task4;

public class TestAuthor {

    public static void main(String[] args) {
        Author authorTest = new Author("Bir", "dendimvar@tamam.ic", 'M');

        System.out.println("Author name is " + authorTest.getName());
        System.out.println("Author is changing his email... Previous email is " + authorTest.getEmail());

        authorTest.setEmail("icimdebid@deneye.ra");

        System.out.println("New author email is " + authorTest.getEmail());

        System.out.println("Author info now:");
        System.out.println(authorTest);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Haruki Murakami", "haruki.muraki@gmail.com", 'M');
        //System.out.println(author.ToString());

        Book book = new Book("Kafka on the shore", author, 31.99, 100);
        //System.out.println(book);

        Circle c1 = new Circle();
        Circle c2 = new Circle(45.2);
        Circle c3 = new Circle(23.1, "Blue");

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(43.5);
        Cylinder cylinder3 = new Cylinder(46.5,3);

        Rectangle rectangle = new Rectangle("Red", 14, 14);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle("Red", 14, 14);
        System.out.println(triangle.getArea());
    }
}
package com.mycompany;

import com.mycompany.hw1.Ball;
import com.mycompany.hw1.Container;

public class Main {
    public static void main(String[] args) {

//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle(10,15);
//        Employee employee = new Employee(1,"Alex","Ivanov", 1000);
//
//
//
//        System.out.println(circle.toString());
//        System.out.println(rectangle.toString());
//        System.out.println(employee.raiseSalary(12));
//        System.out.println(employee.getName());
//
//        int m = 2;
//        Author[] authors = new Author[m];
//        authors[0] = new Author("Alex","a@a.ru", 'm');
//        authors[1] = new Author("Masha","m@m.ru",'f');
//
//        Book book = new Book("Alisa", authors,500,3);
//
//        System.out.println(book.toString());
//
//          MyPoint myPoint = new MyPoint(4,5);
//          MyPoint anotherPoint = new MyPoint(1,5);
//
//
//        MyTriangle myTriangle = new MyTriangle(0,0,1,1,-1,-1);
//        System.out.println(myTriangle.getPerimeter());
//        System.out.println(myTriangle.getType());
//        System.out.println(myTriangle.toString());


//        MyComplex myComplex = new MyComplex(3,4);
//        MyComplex myComplex1 = new MyComplex(3,4);
//        System.out.println(myComplex.add(myComplex1));
//        System.out.println(myComplex.addNew(myComplex1));
//        System.out.println(myComplex.equals(myComplex1));
//        System.out.println(myComplex.magnitude());
//        System.out.println(myComplex.subtract(myComplex1));
//        System.out.println(myComplex.toString());

//        double[] array = new double[]{1.0,2.0,3.0,4.0,5.0};
//        double[] array1 = new double[]{1.0,2.0,3.0};
//        MyPolynomial myPolynomial = new MyPolynomial(array);
//        MyPolynomial myPolynomial1 = new MyPolynomial(array1);
//        System.out.println(myPolynomial.getDegree());
//        System.out.println(myPolynomial.toString());
//        System.out.println(myPolynomial.evaluate(2));
//        System.out.println(myPolynomial1.multiply(myPolynomial).toString());


        Ball ball = new Ball(2,2,1,2,-90);
        Container container = new Container(0,0,10,6);
        System.out.println(container.collides(ball));
        ball.move();
        System.out.println(container.collides(ball));
        ball.move();
        System.out.println(container.collides(ball));






    }
}

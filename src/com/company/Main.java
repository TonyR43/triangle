package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.sideA = 4;
        triangle.sideB = 3;
        triangle.sideC = 5;

        if (triangle.isEquilateral())
        {
            System.out.println("The Sides are " + triangle.sideA + " " + triangle.sideB + " " +triangle.sideC);
            System.out.println("The perimeter is " + triangle.getPerimeter());
            System.out.println("The triangle is equilateral.");
        }

        if (triangle.isIsosceles())
        {
            System.out.println("The Sides are " + triangle.sideA + " " + triangle.sideB + " " +triangle.sideC);
            System.out.println("The perimeter is " + triangle.getPerimeter());
            System.out.println("The triangle is isosceles.");
        }

        if (triangle.isScalene())
        {
            System.out.println("The Sides are " + triangle.sideA + " " + triangle.sideB + " " +triangle.sideC);
            System.out.println("The perimeter is " + triangle.getPerimeter());
            System.out.println("The triangle is scalene");

        }

        if (triangle.isRight())
        {
            System.out.println("The Sides are " + triangle.sideA + " " + triangle.sideB + " " +triangle.sideC);
            System.out.println("The perimeter is " + triangle.getPerimeter());
            System.out.println("It is a right triangle");
        }

        if (triangle.isAcute())
        {
            System.out.println("The Sides are " + triangle.sideA + " " + triangle.sideB + " " +triangle.sideC);
            System.out.println("The perimeter is " + triangle.getPerimeter());
            System.out.println("It is an acute triangle");
        }

        if (triangle.isObtuse())
        {
            System.out.println("The Sides are " + triangle.sideA + " " + triangle.sideB + " " +triangle.sideC);
            System.out.println("The perimeter is " + triangle.getPerimeter());
            System.out.println("The triangle is obtuse");
        }
    }
}

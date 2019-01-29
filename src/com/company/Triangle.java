package com.company;

public class Triangle
{
    int sideA;
    int sideB;
    int sideC;
    int sideA2 = sideA * sideA;
    int sideB2 = sideB * sideB;
    int sideC2 = sideC * sideC;

    public int getPerimeter()
    {
        int perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    public boolean isEquilateral()
    {
        boolean equilateral = false;
        if (sideA == sideB && sideB == sideC)
        {
            equilateral = true;
        }
        return  equilateral;
    }

    public boolean isIsosceles()
    {
        boolean isosceles = false;
        if (sideA == sideB || sideA == sideC || sideC == sideB)
        {
            isosceles = true;
        }
        return isosceles;
    }

    public boolean isScalene ()
    {
        boolean scalene = false;
        if (sideA != sideB && sideB != sideC && sideA != sideC)
        {
            scalene = true;
        }
        return scalene;
    }

    public boolean isRight()
    {
        boolean right = false;

        if (sideA2 + sideB2 == sideC2)
        {
            right = true;
        }
        return right;
    }

    public boolean isAcute()
    {
        boolean acute = false;

        if (sideA2 + sideB2 > sideC2) {
            acute = true;
        }
        return acute;
    }

    public boolean isObtuse()
    {
        boolean obtuse = false;

        if (sideA2 + sideB2 < sideC2)
        {
            obtuse = true;
        }

        return obtuse;
    }


}

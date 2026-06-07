package OverLoading;

class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int add(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

}

public class Calc {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
       int two =  cl.add(2, 20);
       
      int three =   cl.add(2, 20, 3);
      int four =   cl.add(2, 20, 3, 50);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}

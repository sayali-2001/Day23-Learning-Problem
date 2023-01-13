package Lamda;

interface Operation{
    int Calculator(int a, int b);
}
public class CalculatorProgram {
    public static void main(String[] args) {
        Operation obj1 = ( a, b) -> (a + b);
        System.out.println("Addition is : " +obj1.Calculator(50,20));

        Operation obj2 = ( a, b) -> (a - b);
        System.out.println("Subtraction is : " +obj2.Calculator(50,20));

        Operation obj3 = ( a, b) -> (a * b);
        System.out.println("Multiplication is : " +obj3.Calculator(50,20));

        Operation obj4 = ( a, b) -> (a / b);
        System.out.println("Division is : " + obj4.Calculator(50,20));
    }
}

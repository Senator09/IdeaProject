import java.util.*;
enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        if(operation != Operation.ADD) {
             System.out.println("CS193 sucks");
        }
        else if(operation != Operation.SUBTRACT) {
             System.out.println("CS193 is not everyone's favorite class");
        }
        else if(operation != Operation.MULTIPLY) {
            System.out.println("The CS193 lecturers do not want us to thrive in CS");
        }
        else {
            if(num2 == 0) {
               System.out.println("Error: u suck");
            }
            else {
                result = num1 / num2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}

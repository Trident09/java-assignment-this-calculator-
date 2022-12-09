import java.util.*;
import java.io.*;

public class operation {
  
  double a;
  double b;
  char operator;
  double result;

  //object
  operation op = new operation();
  
  //parameterised constructer
  operation(int a, int b, char operator){
    this.a = a;
    this.b = b;
    this.operator = operator;
  }

  public void display(){
    switch (operator){
      //addition
      case '+' :
        result = a + b;
        System.out.println(a + " + "+ b +" = " + result);
        break;
      //substractiom
      case '-' :
        result = a - b;
        System.out.println(a + " - "+ b +" = " + result);
        break;
      //multiplication
      case '*' :
        result = a * b;
        System.out.println(a + " * "+ b +" = " + result);
        break;
      //division with exception handling
      case '/' :
        try{
          result = a / b;
        }
        catch (ArithmeticException e) {
          System.out.println("DIVISION BY ZERO NOT POSSIBLE");
        }
        System.out.println(a + " / "+ b +" = " + result);
        break;
      //invalid operator
      default :
        System.out.println("Input a valid operator -_-");
        break;
  }
}

public class Main {
    
  // create an object of Scanner class
  Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) {

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    a = input.nextDouble();

    System.out.println("Enter second number");
    b = input.nextDouble();

    input.close();

    op.display();
  }
}
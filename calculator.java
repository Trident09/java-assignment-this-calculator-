import java.util.Scanner;

class calculator
{

  //member variable
  public double a;
  public double b;
  public char operator;
  public double result;

  //parameterised constructer
  calculator(double a, double b)
  {
    //use of this keyword
    this.a = a;
    this.b = b;
  }

  void addition()
  {
    result = (a + b);
    System.out.println("Ans = "+result);
  }
  void substraction()
  {
    result = (a - b);
    System.out.println("Ans = "+result);
  }
  void multiplication()
  {
    result = (a * b);
    System.out.println("Ans = "+result);
  }
  void division()
  {
    result = (a / b);
    System.out.println("Ans = "+result);
  }
  void modulo()
  {
    result = (a % b);
    System.out.println("Ans = "+result);
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers with operator in between ^-^");
    double a = input.nextDouble();
    char operator = input.next().charAt(0);
    double b = input.nextDouble();
    calculator op = new calculator(a,b);
    switch (operator)
      {
        case '+' :
          op.addition();
          break;

        case '-' :
          op.substraction();
          break;

        case '*' :
          op.multiplication();
          break;

        case '/' :
          op.division();
          break;

        case '%' :
          op.modulo();
          break;

        default :
          System.out.println("Enter valid operator -_-");
          break;
      }
  }
}

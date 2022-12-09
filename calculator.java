import java.util.Scanner;

class calculator
{

  public double a;
  public double b;
  public char operator;
  public double result;

  calculator(double a, double b)
  {
    this.a = a;
    this.b = b;
  }

  void addition()
  {
    result = (a + b);
    System.out.println("Ans = "+result+"/n");
  }
  void substraction()
  {
    result = (a - b);
    System.out.println("Ans = "+result+"/n");
  }
  void multiplication()
  {
    result = (a * b);
    System.out.println("Ans = "+result+"/n");
  }
  void division()
  {
    result = (a / b);
    System.out.println("Ans = "+result+"/n");
  }
  void modulo()
  {
    result = (a % b);
    System.out.println("Ans = "+result+"/n");
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

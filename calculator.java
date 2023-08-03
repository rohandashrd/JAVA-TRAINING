import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean calculate=true;

        while(calculate) {

            System.out.println("Do you want to: \n1. Enter\n2. Exit");
            int ch= sc.nextInt();

            if (ch==1){
                System.out.println("Please enter your choice: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo");
                int n = sc.nextInt();
                System.out.print("Enter first number: ");
                float num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                float num2 = sc.nextInt();

                switch (n) {
                    case 1:
                        float sum = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + sum);
                        break;

                    case 2:
                        float sub = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + sub);
                        break;
                    case 3:
                        float mul = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + mul);
                        break;
                    case 4:
                        float div = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + div);
                        break;
                    case 5:
                        float mod = num1 % num2;
                        System.out.println(num1 + " % " + num2 + " = " + mod);
                        break;
                    default:
                        System.out.println("Wrong Choice!!");
                }

            }
            else if(ch==2){
                calculate=false;
            }
            else{
                System.out.println("Wrong Choice!!");
                System.out.print("Please enter: 1 or 0");
            }


        }
        System.out.println("Thank You!!");

    }
}

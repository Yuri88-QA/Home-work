import java.util.Scanner;

public class HomeWork1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Press  1 to convert a shekels to dollars
        //Press  2 to convert a dollars to shekels
        //Press  3 to convert a euro to shekels
        //Press  4 to convert a shekels to euros
        //press 0 to exit

        double USD = 3.5260;
        double EUR = 3.6850;
        System.out.print("please choose number : ");
        double input = scanner.nextInt();
        while (input != 0) {
            if (input == 1) {

                System.out.println("Converted a shekels to dollar : " + scanner.nextInt() / USD);
            } if (input == 2) {
                System.out.println("Converted a dollar to shekel : " + scanner.nextInt() * USD);
            } if (input == 3) {
                System.out.println("Converted a euro to shekels : " + scanner.nextInt() * EUR);
            } if (input == 4) {

                System.out.println("Converted a shekels to euro : " + scanner.nextInt() / EUR);

            }else{
                input = scanner.nextInt();
                System.out.println("You selected the wrong number: ");
                System.out.println(("Good bay " + " /have a good day"));}



        }
        }


        }



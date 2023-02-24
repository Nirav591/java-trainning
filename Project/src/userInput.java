import java.util.Scanner;


public class userInput {
    public  static void main(String[] args){
        System.out.println("Taking Input From the User ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.println("The sum is :");
        int sum = a + b;
        System.out.println(sum);

        System.out.println("Enter Number 3");
        float c = sc.nextFloat();
        System.out.println("Enter Number 4");
        float d = sc.nextFloat();
        float FloatSum = c + d;
        System.out.println(FloatSum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();

        String strNext = sc.nextLine();
        System.out.println(strNext);
    }
}
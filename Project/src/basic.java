import java.util.Arrays;
import java.util.Scanner;

public class basic {
//  our first program
    public static void main(String[] args){
        System.out.println("Hello Java");
        byte age = 30;
        int phone = 1234567890;
        long phone2 = 12334455667L;
        float pi  = 3.12F;
        char letter = '@';

//        non-primitive types
        String name = "Nirav";
        System.out.println(name.length());

        String SubName = "Nirav and Lathiya";
        System.out.println(SubName.substring(5, 9));

//        array
        int subage = 30;
        int physics = 97;
        int chem = 90;
        int eng = 89;


        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 85;
        System.out.println(marks[2]);
        Arrays.sort(marks);

        int[] mainMarks = {97 , 89 , 78};
        int[][] finalMarks = {{90,98,67},{76,74,67}};
        System.out.println(finalMarks[1][1]);

        double price = 100.00;
        double finalPrice = price + 18;

        System.out.println(finalPrice);

        int p = 100;
        int fP = p + (int)18.99;
        System.out.println(fP);

        int mainAge = 30;
        age = 56;
        age = 54;

        final float PI = 3.14F;

        double a = 1;
        double b = 2;
        double div = a / b;
        System.out.println(div);

        int numb = 1;

        System.out.println(numb--);
        System.out.println(numb);


        System.out.println((int)(Math.random()*100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Age : ");

        int ageMain = sc.nextInt();
        System.out.println(ageMain);

        boolean isSunUp = true;

        if(isSunUp == true){
            System.out.println("Day");
        }
        else {
            System.out.println("Night");
        }

        int ageIf = 30;
        if(ageIf > 18){
            System.out.println("Can Vote");
        }
        else {
            System.out.println("Sorry you can not vote");
        }


        int x = 10;
        int y = 20;

        if(x < 50 && y<50 ){
            System.out.println("Both less than 50");
        }

        if(x < 50 || b < 50){
            System.out.println("at least one less than 50");
        }


        boolean isAdult = false;
        if(!isAdult)
            System.out.println("is Adult");
        else
            System.out.println("Not Adult");

        Scanner scMain = new Scanner(System.in);

        int cash = sc.nextInt();
        if(cash < 10){
            System.out.println("Cannot buy anything");
            System.out.println("Get more Cash");
        }
        else if(cash > 10 && cash < 50){
            System.out.println("can get both");
        }


        int day = 2;

        switch (day){
            case  1:
                System.out.println("Monday");
                break;
            case  2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("wed - sun");
        }

        for(int i = 1 ; i <=100; i = i + 1){
            System.out.println(i);
        }

        int j = 100;
        while (j >= 1){
            System.out.println(j);
            j=j-1;
        }

        int k = 100;
        do {
            System.out.println(k);
            k = k -1;
        }while (k>=1);


        Scanner newSc = new Scanner(System.in);
        int number = 0;

        do{
            System.out.println("Input a number");
            number = newSc.nextInt();
            System.out.println("here is your number");
            System.out.println(number);
        }
        while (number >= 0);

        System.out.println("THE END");


        int n = 0;
        while (true){
            if(n==3){
                n = n+1;
                continue;
            }
            System.out.println(n);
            n = n + 1;
            if(n>5){
                break;
            }
        }


        int[] markss = {97 , 98 , 95}
        try{
            System.out.println(markss[5]);
        }catch (Exception exception){

        }
        System.out.println("The name is Nirav");


    }
}

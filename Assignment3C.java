import java.util.Scanner;

public class Assignment3C {

    public static void main(String[] args) {
        float num;

        num = 0.09f;




        float myNumber;

        myNumber = -1f;

        Scanner sc = new Scanner(System.in);

        System.out.println("What mobile device do you have? ");

        String mobiledevice = sc.nextLine();




        if (mobiledevice.equalsIgnoreCase("apple") || mobiledevice.equalsIgnoreCase("android" )) {
            System.out.println("What version do you have?");



        }





       else if (mobiledevice.equalsIgnoreCase("windows phone")) {
            System.out.println("I’m sorry, our app does not support your device.");
        }

        num = sc.nextFloat();
        if (num < 11.9  && (mobiledevice.equalsIgnoreCase("apple"))) {
            System.out.println("Does your device support Bluetooth connections?");

        } else if (num > 11.9 && (mobiledevice.equalsIgnoreCase("apple"))) {
            System.out.println("Congratulations, you can run the app!");
        }
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations, you can run the app!");

        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("I’m sorry, our app does not support your device.");

        }




        if (  (mobiledevice.equalsIgnoreCase("android") && num < 10.9)) {

            System.out.println("Does your device support Augmented reality?");

        }
        if ( (mobiledevice.equalsIgnoreCase("android") && num > 10.9)) {

            System.out.println("Congratulations, you can run the app!");
        }

        String answer1 = sc.next();
        if (answer1.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations, you can run the app!");

        } else if (answer1.equalsIgnoreCase("no")) {
            System.out.println("I’m sorry, our app does not support your device.");

        }


    }

    }


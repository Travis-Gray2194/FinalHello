import java.util.Scanner;

public class finalHello {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String firstname = "firstname";
        System.out.println("First Name:");
        firstname = keyboard.nextLine();

        String lastname = "Last name";
        System.out.println("Last Name:");
        lastname = keyboard.nextLine();


        System.out.println(helloEnglish(firstname,lastname));



        System.out.println(helloFrench(firstname,lastname));


        System.out.println(helloTwi(firstname,lastname));


        System.out.println(helloAfaanoromo(firstname,lastname));


    }

    //Hello in English Method
    public static String helloEnglish(String firstname, String lastname) {

        return "Hello, " + firstname + " " + lastname + "!";

    }

    //Hello in Bonjour Method
    public static String helloFrench(String firstname, String lastname) {

        return "Bonjour, " + firstname + " " + lastname + "!";

    }

    //Hello in Twi Method
    public static String helloTwi(String firstname, String lastname) {

        return "Mahai, "+firstname+" "+lastname+ "!";

    }
    //Hello in Afaanoromo Method
    public static String helloAfaanoromo(String firstname, String lastname) {

        return "Akam, "+firstname+" "+lastname+"!";

    }
}



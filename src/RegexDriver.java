//import java.util.Scanner;
public class RegexDriver
{
    public static void main(String [] args)
    {
        //inside -- what goes into set
        RegEx check = new RegEx();
        //returns name if correct, and "incorrect format" if wrong

        System.out.println("-AudreyReinhard-");
        check.setName("AudreyReinhard");
        System.out.println(check.getName());

        System.out.println("-3Audrey Reinhard-");
        check.setName("3Audrey Reinhard");
        System.out.println(check.getName());

        System.out.println("-audrey reinhard-");
        check.setName("audrey reinhard");
        System.out.println(check.getName());

        System.out.println("-Audre5 Rei8nhard-");
        check.setName("Audre5 Rei8nhard");
        System.out.println(check.getName());

        System.out.println("-Audrey ReInhard-");
        check.setName("Audrey ReInhard");
        System.out.println(check.getName());

        System.out.println("-Audrey Reinhard-");
        check.setName("Audrey Reinhard");
        System.out.println(check.getName());

        //returns zipcode if correct, and "incorrect format" if wrong
        System.out.println("-1234-");
        check.setZipCode("1234");
        System.out.println(check.getZipCode());

        System.out.println("-123456-");
        check.setZipCode("123456");
        System.out.println(check.getZipCode());

        System.out.println("-1234#-");
        check.setZipCode("1234#");
        System.out.println(check.getZipCode());

        System.out.println("-!@#$%-");
        check.setZipCode("!@#$%");
        System.out.println(check.getZipCode());

        System.out.println("-12345-");
        check.setZipCode("12345");
        System.out.println(check.getZipCode());

        //returns email if correct, and "incorrect format" if wrong
        System.out.println("-91085566@mvusd-");
        check.setEmail("91085566@mvusd");
        System.out.println(check.getEmail());

        System.out.println("-91085566-");
        check.setEmail("91085566");
        System.out.println(check.getEmail());

        System.out.println("-91085566@mvusd.-");
        check.setEmail("91085566@mvusd.");
        System.out.println(check.getEmail());

        System.out.println("-91085566@mvusd.net-");
        check.setEmail("91085566@mvusd.net");
        System.out.println(check.getEmail());

        System.out.println("-91085566@gmail.io-");
        check.setEmail("91085566@gmail.io");
        System.out.println(check.getEmail());

        System.out.println("-audreyReinhard@mvusd.com-");
        check.setEmail("audreyReinhard@mvusd.com");
        System.out.println(check.getEmail());

        System.out.println("-audreyReinhard#!$^*_.&@mvusd.com-");
        check.setEmail("audreyReinhard#!$^*_.@mvusd.com");
        System.out.println(check.getEmail());


//        RegEx allCorrect = new RegEx("Audrey Reinhard","91085566@mvusd.net", "92557");


//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter zipcode...");
//        check.evaluateZipCode(input.nextLine());
//
//        System.out.println("Enter name...");
//        check.evaluateName(input.nextLine());
//
//        System.out.println(("Enter email..."));
//        check.evaluateEmail(input.nextLine());





    }
}

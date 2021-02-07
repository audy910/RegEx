import java.util.Scanner;

public class RegEx
{

    Scanner input = new Scanner(System.in);
    public String name;
    public String email;
    public String zipCode;

    public RegEx()
    {

    }

    public RegEx(String name, String email, String zipCode) {
        this.name = evaluateName(name);
        this.email = evaluateEmail(email);
        this.zipCode = evaluateZipCode(zipCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = evaluateName(name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = evaluateEmail(email);
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = evaluateZipCode(zipCode);
    }

    public String evaluateEmail(String email)
    {
        String output = email;
        if(!email.matches(".*@[a-z]*[.][a-z]{2,3}"))
        {
            output = "Incorrect Format";

        }
        return output;
    }

    public String evaluateZipCode(String zipCode)
    {
        String output = zipCode;
        if(!zipCode.matches("[0-9]{5}"))
        {
            output = "Incorrect Format";
        }
        return output;
    }

    public String evaluateName(String name)
    {
        String output = name;
        if(!name.matches("[A-Z][A-Za-z]* [A-Z][A-Za-z]*"))
        {
            output = "Incorrect Format";
        }
        return output;
    }

}

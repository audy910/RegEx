import java.util.Scanner;

public class RegEx
{

    Scanner input = new Scanner(System.in);
    public String name;
    public String email;
    public String zipCode;
    public String username;
    public String password;

    public String getPassword() {
        return evaluatePassword(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "RegEx{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public RegEx()
    {

    }

    public RegEx(String name, String email, String zipCode, String username, String password) {
        this.name = name;
        this.email = email;
        this.zipCode = zipCode;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return evaluateName(name);
    }

    public void setName(String name) {
        this.name = evaluateName(name);
    }

    public String getEmail() {
        return evaluateEmail(email);
    }

    public void setEmail(String email) {
        this.email = evaluateEmail(email);
    }

    public String getZipCode() {
        return evaluateZipCode(zipCode);
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

    public String suggestOther()
    {
        //would be used if username is already taken
        String output = getUsername();
        if(output.matches("[a-zA-Z]*"))
        {
            output = output + "123; "+output+ "!; " +"_"+ output +"_";
        }
        else if(output.matches("[a-zA-Z]*[0-9]*"))
        {
            output = output+ "!; " +"_"+ output +"_";
        }
        else if(output.matches("[a-zA-Z]*!") ||output.matches("[a-zA-Z]*[0-9]*!"))
        {
            output = "_"+ output +"_";
        }
        else
        {
            output = output + Math.random();
        }
        return output;
    }

    public String evaluatePassword(String password)
    {
        int count = 0;
        String firstName = "";
        String lastName ="";
        Boolean space = false;
        Boolean equalsFirstName = false;
        Boolean equalsLastName = false;
        while(!space)
        {
            firstName += getName().substring(count,count+1);
            count ++;
            if(getName().substring(count,count+1).equals(" "))
            {
                space = true;
            }

        }
        lastName = getName().substring(count+1);
        String output = password;
        int i = 0;
        while(!equalsFirstName && !equalsLastName && i < password.length())
        {

            if(password.substring(i, i+1).equalsIgnoreCase(firstName.substring(0,1)))
            {
                int countName = 0;
                for(int f = 0; f < firstName.length(); f++)
                {

                    if(firstName.substring(f, f+1).equalsIgnoreCase(password.substring(f+i, f+i+1)))
                    {
                        countName++;
                    }
                }
                if (countName == firstName.length())
                {
                    equalsFirstName = true;
                }
            }
            if(password.substring(i, i+1).equalsIgnoreCase(lastName.substring(0,1)))
            {
                int countName = 0;
                for(int f = 0; f < lastName.length()-2; f++)
                {
                    if(lastName.substring(f, f+1).equalsIgnoreCase(password.substring(f+i, f+i+1)))
                    {
                        countName++;
                    }
                }
                countName+=2;
                if (countName == lastName.length())
                {
                    equalsLastName = true;
                }
                output += "last name: "+ countName;
            }
            i++;
        }
        if(equalsFirstName ||equalsLastName)
        {
            output = "No Names in Password";
        }

        return output;
    }

}

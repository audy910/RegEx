import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RegExTest
{
    //constructor & toString check
    @Test
    void constructor()
    {
        RegEx constructor = new RegEx("Audrey Reinhard", "91085566@gmail.com", "12345", "audy910", "Reinhard910!");
        String expected = "RegEx{name='Audrey Reinhard', email='91085566@gmail.com', zipCode='12345', username='audy910', password='Reinhard910!'}";
        assertEquals(expected,constructor.toString());
    }

    //email tests
    @Test
    void workingEmailWithWeirdCharacter()
    {
        RegEx email = new RegEx( );
        email.setEmail("audreyReinhard#!$^*_.@mvusd.com");
        String expected = "audreyReinhard#!$^*_.@mvusd.com";
        assertEquals(expected,email.getEmail());
    }

    @Test
    void workingEmailAllLetters()
    {
        RegEx email = new RegEx( );
        email.setEmail("audreyReinhard@mvusd.com");
        String expected = "audreyReinhard@mvusd.com";
        assertEquals(expected,email.getEmail());
    }
    @Test
    void workingEmailAllNumbers()
    {
        RegEx email = new RegEx( );
        email.setEmail("91085566@mvusd.net");
        String expected = "91085566@mvusd.net";
        assertEquals(expected,email.getEmail());
    }
    @Test
    void workingEmailWithDotIO()
    {
        RegEx email = new RegEx( );
        email.setEmail("91085566@mvusd.io");
        String expected = "91085566@mvusd.io";
        assertEquals(expected,email.getEmail());
    }
    @Test
    void emailWithoutEnding()
    {
        RegEx email = new RegEx( );
        email.setEmail("91085566@mvusd.");
        String expected = "Incorrect Format";
        assertEquals(expected,email.getEmail());
    }
    @Test
    void emailJustName()
    {
        RegEx email = new RegEx( );
        email.setEmail("91085566");
        String expected = "Incorrect Format";
        assertEquals(expected,email.getEmail());
    }
    @Test
    void emailNoDot()
    {
        RegEx email = new RegEx( );
        email.setEmail("91085566@mvusd");
        String expected = "Incorrect Format";
        assertEquals(expected,email.getEmail());
    }
    @Test
    void emailNoAt()
    {
        RegEx email = new RegEx( );
        email.setEmail("91085566mvusd.com");
        String expected = "Incorrect Format";
        assertEquals(expected,email.getEmail());
    }
    //names
    @Test
    void nameNoSpace()
    {
        RegEx name = new RegEx( );
        name.setName("AudreyReinhard");
        String expected = "Incorrect Format";
        assertEquals(expected,name.getName());
    }
    @Test
    void nameBeginWithNumber()
    {
        RegEx name = new RegEx( );
        name.setName("3Audrey Reinhard");
        String expected = "Incorrect Format";
        assertEquals(expected,name.getName());
    }
    @Test
    void nameWithoutCapitols()
    {
        RegEx name = new RegEx( );
        name.setName("audrey reinhard");
        String expected = "Incorrect Format";
        assertEquals(expected,name.getName());
    }
    @Test
    void nameWithRandomNumbers()
    {
        RegEx name = new RegEx( );
        name.setName("Audre5 Rei8nhard");
        String expected = "Incorrect Format";
        assertEquals(expected,name.getName());
    }
    @Test
    void nameWithCapitolInMiddle()
    {
        RegEx name = new RegEx( );
        name.setName("Audrey ReInhard");
        String expected = "Audrey ReInhard";
        assertEquals(expected,name.getName());
    }
    @Test
    void nameRegularFormat()
    {
        RegEx name = new RegEx( );
        name.setName("Audrey Reinhard");
        String expected = "Audrey Reinhard";
        assertEquals(expected,name.getName());
    }
    //zip code tests
    @Test
    void zipcodeWithFour()
    {
        RegEx zipcode = new RegEx( );
        zipcode.setZipCode("1234");
        String expected = "Incorrect Format";
        assertEquals(expected,zipcode.getZipCode());
    }
    @Test
    void zipcodeWithSix()
    {
        RegEx zipcode = new RegEx( );
        zipcode.setZipCode("123456");
        String expected = "Incorrect Format";
        assertEquals(expected,zipcode.getZipCode());
    }
    @Test
    void zipcodeWithFourAndHashtag()
    {
        RegEx zipcode = new RegEx( );
        zipcode.setZipCode("1234#");
        String expected = "Incorrect Format";
        assertEquals(expected,zipcode.getZipCode());
    }
    @Test
    void zipcodeWithFiveWrongCharacters()
    {
        RegEx zipcode = new RegEx( );
        zipcode.setZipCode("!@#$%");
        String expected = "Incorrect Format";
        assertEquals(expected,zipcode.getZipCode());
    }
    @Test
    void zipcodeWithFive()
    {
        RegEx zipcode = new RegEx( );
        zipcode.setZipCode("12345");
        String expected = "12345";
        assertEquals(expected,zipcode.getZipCode());
    }

    //testing password validator
    @Test
    void lastNameInStartPassword()
    {
        RegEx password = new RegEx( );
        password.setName("Audrey Reinhard");
        password.setPassword("Reinhard910!");
        String expected = "No Names in Password";
        assertEquals(expected,password.getPassword());
    }
    @Test
    void lastNameInMiddlePassword()
    {
        RegEx password = new RegEx( );
        password.setName("Audrey Reinhard");
        password.setPassword("HeyyReinhard910!");
        String expected = "No Names in Password";
        assertEquals(expected,password.getPassword());
    }
    @Test
    void noName()
    {
        RegEx password = new RegEx( );
        password.setName("Audrey Reinhard");
        password.setPassword("audy910!");
        String expected = "audy910!";
        assertEquals(expected,password.getPassword());
    }
    @Test
    void FirstNameInStart()
    {
        RegEx password = new RegEx( );
        password.setName("Audrey Reinhard");
        password.setPassword("Audrey910!");
        String expected = "No Names in Password";
        assertEquals(expected,password.getPassword());
    }
    @Test
    void FirstNameInMiddle()
    {
        RegEx password = new RegEx( );
        password.setName("Audrey Reinhard");
        password.setPassword("HeyyyAudrey910!");
        String expected = "No Names in Password";
        assertEquals(expected,password.getPassword());
    }
    @Test
    void lowercaseName()
    {
        RegEx password = new RegEx( );
        password.setName("Audrey Reinhard");
        password.setPassword("audrey910!");
        String expected = "No Names in Password";
        assertEquals(expected,password.getPassword());
    }
    @Test
    void lowercaseLastName()
    {
        RegEx password = new RegEx( );
        password.setName("Audrey Reinhard");
        password.setPassword("reinhard910!");
        String expected = "No Names in Password";
        assertEquals(expected,password.getPassword());
    }

    //username tests
    @Test
    void Audrey()
    {
        RegEx username = new RegEx();
        username.setUsername("Audrey");
        String expected ="Audrey123; Audrey!; _Audrey_";
        assertEquals(expected, username.suggestOther());
    }
    @Test
    void John()
    {
        RegEx username = new RegEx();
        username.setUsername("John");
        String expected ="John123; John!; _John_";
        assertEquals(expected, username.suggestOther());
    }
    @Test
    void Audrey123()
    {
        RegEx username = new RegEx();
        username.setUsername("Audrey123");
        String expected ="Audrey123!; _Audrey123_";
        assertEquals(expected, username.suggestOther());
    }
    @Test
    void Audrey12345()
    {
        RegEx username = new RegEx();
        username.setUsername("Audrey12345");
        String expected ="Audrey12345!; _Audrey12345_";
        assertEquals(expected, username.suggestOther());
    }
    @Test
    void AudreyExclaim()
    {
        RegEx username = new RegEx();
        username.setUsername("Audrey!");
        String expected ="_Audrey!_";
        assertEquals(expected, username.suggestOther());
    }
    @Test
    void Audrey123Exclaim()
    {
        RegEx username = new RegEx();
        username.setUsername("Audrey123!");
        String expected ="_Audrey123!_";
        assertEquals(expected, username.suggestOther());
    }


}

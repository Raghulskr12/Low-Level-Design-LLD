import java.util.Scanner;

interface Validator{
    void validate(String input);
}


class StringValidator implements Validator{

    @Override
    public void validate(String input) {

        if (input.length() > 8) {
            System.out.println("The Input is a valid String");
        } else {
            System.out.println("The input is not a valid string");
        }
    }

}

class EmailValidator implements Validator{
    @Override
    public void validate(String input) {

        boolean conditionCheck = false;

        for(int i =0;i<input.length();i++)
        {
            if(input.charAt(i) == '@')
            {
                conditionCheck = true;
                break;
            }
        }

        if(conditionCheck)
        {
            System.out.println("The entered string is a valid email");
        }
        else
        {
            System.out.println("The entered string is not a valid email");
        }
    }
}


class PasswordValidator{
    public static void main() {
        Scanner s1 = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the option :");
            System.out.println("1.Check String ");
            System.out.println("2.Check email ");
            System.out.println("3. Exit");

            int option = s1.nextInt();
            s1.nextLine();

                if(option == 1)
                {
                    System.out.println("Enter the string :");
                    String input = s1.nextLine();

                    Validator v1 = new StringValidator();
                    v1.validate(input);
                }
                else if(option == 2)
                {
                    System.out.println("Enter the string :");
                    String input = s1.nextLine();

                    Validator v2 = new EmailValidator();
                    v2.validate(input);
                }
                else if(option == 3)
                {
                    System.out.println("Thanks for using the application");
                    break;
                }
                else {
                    System.out.println("Invalid Input");
                    continue;
                }


        }
    }
}
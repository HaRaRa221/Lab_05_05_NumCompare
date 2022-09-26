public class Main {
    public static void main(String[] args)
    {
        int stringNumber1;
        int stringNumber2;
        String notLetter;

        stringNumber1= ;
        stringNumber2= 0;
        

        if(stringNumber1>stringNumber2)
        {
            System.out.println(stringNumber1 + " is greater than " + stringNumber2);
        }
        else if (stringNumber1<stringNumber2)
        {
            System.out.println(stringNumber1 + " is less than " + stringNumber2);
        }
        else if (stringNumber1==stringNumber2)
        {
            System.out.println(stringNumber1 + " is tied with " + stringNumber2);
        }
        else
        {
            System.out.println("You didn't enter a number. Try again.");
        }
    }
}
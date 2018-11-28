import java.util.Scanner;

// one class needs to have a main() method
public class TidyNumbers
{
    // arguments are passed using the text field below this editor
    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);
        int dodo = reader.nextInt();
        for (int inp = 0; inp < dodo; inp++) {
            // GET input
            String readerStdodo = reader.next();
            System.out.println("CASE #"+ (inp+1) + ": " + RunFunction(readerStdodo));
        }
    }

    private static String RunFunction(String inputfull) {
        if (inputfull.length() == 1) return inputfull;
        for(int i = 1; i < inputfull.length(); i++) {
            if (inputfull.charAt(i) - '0' < inputfull.charAt(i-1) - '0') {
                inputfull = inputfull.substring(0,i-1)+(inputfull.charAt(i-1) - '0' - 1)+ printLeft(inputfull.length()-i);
                i = 0;
            }
        }

        if(inputfull.charAt(0) == '0') inputfull = inputfull.substring(1);
        return inputfull;
    }

    private static String printLeft(Integer input) {
        String inp = "";
        for (int a = input;a>0;a--) {
            inp += "9";
        }
        return inp;
    }
}
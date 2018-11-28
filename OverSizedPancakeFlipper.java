import java.util.Scanner;

// one class needs to have a main() method
public class OverSizedPancakeFlipper
{
    // arguments are passed using the text field below this editor
    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);
        int dodo = reader.nextInt();
        for (int inp = 0; inp < dodo; inp++) {
            // GET input
            String readerStdodo = reader.next();
            System.out.println("CASE #"+ (inp+1) + ": " + RunFunction(readerStdodo + " " + reader.next()));
        }
    }

    private static String RunFunction(String inputfull) {
        // SPLIT input
        String input = inputfull.split(" ")[0];
        int num = Integer.valueOf(inputfull.split(" ")[1]);

        // INIT var
        int limit = 100;
        int interator = 0;

        // Loop
        while(interator < limit) {
            // IF ALL DONE
            if(!input.contains("-")) {
                return ("" + interator);
            }
            // GET first index of -
            int where = input.indexOf("-");

            if(where + num > input.length()) {
                return "IMPOSSIBLE";
            }

            // FLIP
            for (int i = where; i < where+num; i++) {
                if (input.charAt(i) == '-') {
                    input = input.substring(0,i)+'+'+input.substring(i+1);
                }
                else if (input.charAt(i) == '+') {
                    input = input.substring(0,i)+'-'+input.substring(i+1);
                }
            }
            interator++;
        }
        return ("IMPOSSIBLE");
    }
}
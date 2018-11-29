import java.util.Scanner;

// one class needs to have a main() method
public class BathroomStall
{
    // arguments are passed using the text field below this editor
    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);
        int dodo = reader.nextInt();
        for (int inp = 0; inp < dodo; inp++) {
            // GET input
//            String readerStdodo = reader.next();
            long [] test = RunFunction(Long.parseLong(reader.next()), Long.parseLong(reader.next()));
            System.out.println("CASE #"+ (inp+1) + ": " + test[0] + " " + test[1]);
        }
    }

    private static long[] RunFunction(Long Room, Long Person){
        long[] maxMin=new long[2];
        // END recursive
        if (Person==1){
            if (Room%2==0) {//case Room even
                maxMin[0]=Room/2;
                maxMin[1]=(Room-1)/2;
            } else {// case Room odd the max and min is the same ?
                maxMin[0]=Room/2;
                maxMin[1]=Room/2;
            }
            return maxMin;
        }

        else if(Person>1) {
            if (Room%2==1&&Person%2==1)//both Room and Person are odd
            {
                return RunFunction((Room-1)/2,(Person-1)/2);
                //return RunFunction(Room/2,Person/2);
            }
            else if(Room%2==0&&Person%2==0)// both Room and Person are even
            {
                return RunFunction(Room/2,Person/2);
            }
            else if(Room%2==0&&Person%2==1)// Room is even, Person is odd
            {
                return RunFunction(Room/2-1, (Person-1)/2);
            }
            else if(Room%2==1&&Person%2==0)//Room is odd, Person is even
            {
                return RunFunction((Room-1)/2,Person/2);
            }
        }

        // return result of max and min
        return maxMin;
    }

}
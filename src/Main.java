import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Encoder e = new Encoder();
        Scanner input =new Scanner(System.in);
       // System.out.println("Enter a message to encode: ");
        String user = input.next();
        int[] a = e.encode("Secret message", 99);
        System.out.println("encoded message: " + Arrays.toString(a));


        Decoder d = new Decoder();
        String dmsg = d.decode(a,99);
        System.out.println("decoded message: " + dmsg);

    }
}





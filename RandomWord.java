import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String result = "";
        int i = 0;
        while (!StdIn.isEmpty()) {
            i++;
            String value = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / (double) i)) {
                result = value;
            }
        }
        StdOut.println(result);
    }
}

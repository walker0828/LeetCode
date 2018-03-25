import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* Given a 32-bit signed integer, reverse digits of an integer.
* */
public class ReverseInteger {
    int ans = 0;
    final static int MAX = 0x7fffffff;
    final static int MIN = 0x80000000;

    //Boundary: x< 2的31
    public int reverse(int x) {
        if (x > MAX || x < MIN) {
            return 0;
        }
        while (x != 0) {
            ans = ans * 10 + x % 10;
            if (ans > MAX || ans < MIN) {
                return 0;
            }
            x /= 10;
        }
        System.out.println(ans);
        return ans;
    }

    public class MainClass {
        public void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = in.readLine()) != null) {
                int x = Integer.parseInt(line);

                int ret = new ReverseInteger().reverse(x);

                String out = String.valueOf(ret);

                System.out.print(out);
            }
        }
    }
}
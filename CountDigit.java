import java.io.IOException;
// Count the number of digits in a given number.
public class CountDigit {

    int Count(int digit) {
        int count = 0;

        while (digit > 0) {
            int lastDi = digit % 10;
            digit = digit / 10;
            count += 1;
        }
        return count;
        
    }

    public static void main(String[] args) throws IOException {
        CountDigit obj = new CountDigit();
        System.out.println(obj.Count(999777));
    }

}

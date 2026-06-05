public class Reverse {

//    Avoid Zero while reversing a number.
    public static void main(String[] args) {
        int n = 10400;
        while (n > 0) {
            int lastDi = n % 10;
            if(lastDi != 0)
                System.out.print(lastDi);

            n /= 10;
        }
    }
}

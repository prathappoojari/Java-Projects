public class Rev {
    // Reverse a Number avoiding last digit zero
    public static void main(String[] args) {
        int n = 10400;
        int revNum = 0;
        while (n > 0) {
            int lastDi = n % 10;
            n /= 10;
            revNum = (revNum * 10) + lastDi;
        }
        System.out.println(revNum);
    }
}

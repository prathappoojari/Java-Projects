public class prime {
    public static void main(String[] args) {
        int num  =3;
        boolean isPrime = true;
        if(num < 0){
            isPrime = false;
        }

        for(int i = 2; i <= num; i++) {
            if(num % 2 == 0){
                isPrime = false;
                break;
            }
        }
        
        if(isPrime) {
            System.out.println("The number is prime");
        }else {
            System.out.println("not prime number");
        }
        

        // Listing prime numbers
        
        for(int n = 2; n<= 40; n++) {
            if(n <= 1){
                continue;
            }

            for(int i = 2; i <= n; i++){
                if(i % n == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(n);
            }
        }
        
    }
}

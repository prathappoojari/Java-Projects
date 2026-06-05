public class StringRev {
    public static void main(String[] args) {
        String str = "good morning";
        String rev = "";
        for(int i =0; i < str.length();i--){
            rev += i;
        }
        System.out.println(rev);
    }
}

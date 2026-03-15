public class asciiValue {
    public static void main(String[] args) {
        for(char c = 'a'; c <= 'z'; c++){
            int asciVal = (int)c;
            System.out.println("Character "+c+" ASCII value is "+asciVal);

        }

        for(int i = 97; i<= 122; i++){
            char ele = (char)i;
            System.out.println(i+" character is "+ele);
        }
    }
}

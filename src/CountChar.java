public class CountChar {
    public static void main(String[] args) {
        String str = "www.example.com";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'w') {
                count++;
            }
        }
        
        System.out.println("Numero de w: " + count);
    }
}
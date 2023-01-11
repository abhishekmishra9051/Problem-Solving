package in5Minutes;

public class ReverseCharacter {

    public static void main(String[] args){
        String str = "Abhishek";
        // Approach 1
        char[] ch = str.toCharArray();
        for(int i= ch.length-1; i>=0; i--)
            System.out.print(ch[i]);

        System.out.println("");
        // Approach 2
        for(int i= str.length()-1; i>=0; i--)
            System.out.print(str.charAt(i));

        System.out.println("");
        // Approach 3
        StringBuilder sBuilder = new StringBuilder(str);
        System.out.print(sBuilder.reverse());

        System.out.println("");
        // Approach 4
        StringBuffer sBuffer = new StringBuffer(str);
        System.out.println(sBuffer.reverse());
    }
}

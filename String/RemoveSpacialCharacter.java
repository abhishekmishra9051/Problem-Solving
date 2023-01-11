package in5Minutes;

public class RemoveSpacialCharacter {
    public static  void main(String[] args){
        String str = "A@b#h!i$s%h^e*K$%%&&";
        String text = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(text);
    }
}

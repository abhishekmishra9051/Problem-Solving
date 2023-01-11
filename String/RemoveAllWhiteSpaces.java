package in5Minutes;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args){
        String str = "A     b      h      i     s     h    e       k                       ";
        String text = str.replaceAll("\\s", "");
        System.out.println(text);
    }
}

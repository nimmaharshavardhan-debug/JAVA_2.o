package MutableStrings;

public class StringBufferDemo {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("  World");
        String greet = sb.toString();
        System.out.println(sb);
        System.out.println(greet);

    }
}

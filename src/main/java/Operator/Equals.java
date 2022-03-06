package Operator;

public class Equals {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println(str1.equals(str2));
    }
}

class Value {
    int i;
}
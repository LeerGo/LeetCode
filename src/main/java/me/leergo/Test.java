package me.leergo;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

        a = isXxx() ? a++ : 1;
        System.out.println(a);

        ++a;
        System.out.println(a);
    }

    public static boolean isXxx() {
        return true;
    }
}

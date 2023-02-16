package edu.ntnu.idatt2001.lectures.fp.generics;

import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {
        MyGeneric<String> reverse = str -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--)
                result.append(str.charAt(i));
            return result.toString();
        };

        MyGeneric<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        Consumer<String> out = System.out::println;

        out.accept(reverse.compute("Lambda Demo"));
        out.accept(factorial.compute(5).toString());
    }
}

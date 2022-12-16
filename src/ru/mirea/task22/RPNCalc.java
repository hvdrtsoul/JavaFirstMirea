package ru.mirea.task22;

import javax.swing.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class RPNCalc {
    public String calc(String exp) throws IllegalArgumentException, ArithmeticException {
        try {
            String[] expArr = exp.split(" ");
            Stack<Integer> st = new Stack<>();
            for (String s : expArr) {
                switch (s) {
                    case "+" -> {
                        Integer a = st.pop();

                        Integer b = st.pop();

                        st.push(a + b);

                    }
                    case "-" -> {

                        Integer a = st.pop();

                        Integer b = st.pop();

                        st.push(b - a);

                    }
                    case "*" -> {

                        Integer a = st.pop();

                        Integer b = st.pop();

                        st.push(a * b);

                    }
                    case "/" -> {

                        Integer a = st.pop();

                        Integer b = st.pop();

                        st.push(b / a);

                    }
                    default -> st.push(Integer.parseInt(s));
                }
            }

            return String.valueOf(st.peek());
        } catch (EmptyStackException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Expression is incorrect");
            return "";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Got unknown error: " + e.getMessage());
            return "";
        }
    }
}

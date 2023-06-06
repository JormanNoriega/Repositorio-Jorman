/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatosprueba;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Jorman
 */
public class EstructuraDeDatosprueba {
    
    private static int Prioridad(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static String convertirInfijaAPostfija(String infija) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infija.length(); i++) {
            char ch = infija.charAt(i);

            if (Character.isLetter(ch)) {
                postfix.append(ch);
            } else {
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop());
                    }
                    stack.pop(); // Remove '('
                } else {
                    while (!stack.isEmpty() && Prioridad(ch) <= Prioridad(stack.peek())) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INGRESE LA EXPRESION INFIJA: ");
        String infix = sc.nextLine();

        String postfix = convertirInfijaAPostfija(infix);
        System.out.println("SU EXPRESION POSTFIJA ES: " + postfix);
    }
}

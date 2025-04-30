package beecrowd1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


	public class Main {
	    public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String expressao;

	        // Lê até EOF
	        while ((expressao = in.readLine()) != null) {
	            expressao = expressao.trim();
	            Stack<Character> pilha = new Stack<>();
	            boolean balanceado = true;

	            for (char c : expressao.toCharArray()) {
	                if (c == '(') {
	                    pilha.push(c);
	                } else if (c == ')') {
	                    if (pilha.isEmpty()) {
	                        balanceado = false;
	                        break;
	                    }
	                    pilha.pop();
	                }
	            }

	            System.out.println((balanceado && pilha.isEmpty())
	                               ? "correct"
	                               : "incorrect");
	        }

	        
	        in.close();
	    }
	}

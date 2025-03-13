package beecrowd1244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // Validações básicas (exemplo do seu código):
        if (N < 0 || N > 50) {
     
            return;
        }
        if (N == 0) {
            
            return;
        }

        String linha;
        while ((linha = br.readLine()) != null && !linha.isEmpty()) {
            String linha1 = br.readLine();
            // 2) Separa em palavras
            String[] palavras = linha1.split(" ");

            // 3) Precisamos de uma lista para usar Collections.sort (estável)
            List<String> listaPalavras = new ArrayList<>(Arrays.asList(palavras));

            // 4) Ordena em ordem decrescente de tamanho; se o tamanho for igual, mantém a ordem
            Collections.sort(listaPalavras, (p1, p2) -> {
                int diff = p2.length() - p1.length();  // maior na frente
                // Se 'diff' for 0, nada é alterado — a estabilidade do sort
                // garante que a ordem original se mantenha para palavras de mesmo tamanho.
                return diff;
            });

            // 5) Exibe o resultado como uma linha única
            System.out.println(String.join(" ", listaPalavras));
        }
    }
}
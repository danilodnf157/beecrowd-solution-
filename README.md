 beecrowd Solutions Repository

Este repositório reúne todas as minhas submissões para problemas da plataforma beecrowd (antigo URI Online Judge), implementadas em Java.

Visão Geral

Cada problema resolvido possui sua própria pasta ou arquivo de código, seguindo o padrão de nomenclatura beecrowdXXXX, onde XXXX é o número do problema. O objetivo é organizar, versionar e documentar todas as minhas soluções para facilitar estudo, revisão e futuras manutenções.

Estrutura do Repositório

beecrowd-solutions/
├── beecrowd1068/        # Exemplo de problema: Balanceamento de Parênteses
│   └── src/Main.java    # Código-fonte Java
├── beecrowd1047/        # Exemplo de problema: Tempo de Jogo
│   └── src/Main.java
├── beecrowd1001/        # Exemplo de problema: Extremamente Básico
│   └── src/Main.java
└── README.md            # Este arquivo

Nota: substitua as pastas de exemplo pelos diretórios reais dos problemas que você resolveu.

Convenções de Código

Pacote e nome de classe: Todos os arquivos Java devem ter a classe principal chamada Main (sem pacote declarado) para compatibilidade com o beecrowd.

Leitura de entrada: Use BufferedReader + InputStreamReader ou Scanner, conforme necessidade de desempenho e parsing.

Saída: Apenas System.out.println, sem prompts ou mensagens extras.

Assinatura do método main:

public static void main(String[] args) throws IOException {
    // implementação...
}

Formatação: identação de 4 espaços, linhas de 100 caracteres no máximo.

Como Compilar e Executar

Navegue até a pasta do problema desejado:

cd beecrowdXXXX/src

Compile o código-fonte:

javac Main.java -d ../bin

Execute passando os dados de entrada (arquivo ou teclado):

java -cp ../bin Main < input.txt

Para testar diretamente pelo terminal, digite as entradas e finalize com Ctrl+D (Linux/macOS) ou Ctrl+Z + Enter (Windows).

Adicionando Novos Problemas

Crie uma nova pasta seguindo o padrão beecrowdNNNN.

Dentro dela, crie o subdiretório src e coloque o Main.java com sua solução.

Atualize este README.md adicionando a referência ao novo diretório.

Contribuições e Melhorias

Sinta-se à vontade para abrir issues ou pull requests sugerindo melhorias de código, padrões ou documentação.

Dê star se este repositório for útil para seus estudos.

Licença

Este projeto está licenciado sob a MIT License.


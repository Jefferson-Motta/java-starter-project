import java.util.Scanner;

    public class leitura {
        static void main() {
            Scanner leitura = new Scanner(System.in);

                System.out.println("Digite o seu filme favorito:\n");
                String filme = leitura.nextLine();

                System.out.println("Qual o ano de lançamento?\n");
                int anoDeLancamento = leitura.nextInt();

                System.out.println("Avalie o Filme!\n");
                double avaliacao = leitura.nextDouble();

                String mensagem = String.format
                ("""
                    Filme: %s
                    Ano: %d
                    Avaliação: %.1f
                """,filme,anoDeLancamento,avaliacao);

                System.out.println(mensagem);

    }
}

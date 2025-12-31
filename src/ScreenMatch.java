public class ScreenMatch  {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        // Média calculada por 3 pessoas.
        int classificacao = (int) (media /2);

                String sinopse = String.format("""
                         Esse é o Screen Match
                         
                          Filme: Top Gun: Maverick
                         Filme de aventura com galã dos anos 80.
                         Ano de lançamento: %d
                         Classificação: %d estrelas
                         """,anoDeLancamento,classificacao);
        System.out.println(sinopse);


    }
}
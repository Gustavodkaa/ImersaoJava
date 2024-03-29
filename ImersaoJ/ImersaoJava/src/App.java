import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        API api = API.IMDB_TOP_SERIES;

        String url = api.getUrl();
        ExtratorDeConteudo extrator = api.getExtrator();

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new StickerGenerator();

        for (int i = 0; i < 3; i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
            String nomeArquivo = conteudo.titulo();

            geradora.cria(inputStream, "C:\\Users\\Gustavodka\\Desktop\\ImersaoJ\\ImersaoJava\\src/assets" + nomeArquivo + ".png", nomeArquivo);


            System.out.println(conteudo.titulo());
            System.out.println();
        }
    }
}

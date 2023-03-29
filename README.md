# Imersão Java

૪ Repositório com projetos feitos durante uma semana de Imersão Java da Alura.

## Linha do tempo
Lição 1 - Consumindo uma API de filme com Java
<br>
Lição 2 - Gerando figurinhas para WhatsApp
<br>
Lição 3 - Conectando as extremidades, refatoração e orientação do objeto
<br>
Lição 4 - Criando nossa própria API com Spring
<br>
Lição 5 - Publicando nossa API na nuvem
<br>


### Aula 1 -> Consumindo uma API de filme com Java

Nesta classe, a API pública do site IMDB foi usada com o endpoint `top250movies`.
<br>
Com o pacote `java.net.http` foram realizados:
<br>
1. A conexão da API.
<br>
2. Solicitação de dados com uma turma específica disponibilizada em aula.
<br>
3. Serigrafia dos seguintes dados do sfilmes: título, imagem, partitura.
<br>
4. Com o desafio proposto pelos mentores, a partitura foi reformulada para ter um layout melhor com cores e emojis.
<br>

#### Imagem do resultado do projeto 1
![para me ler](https://user-images.githubusercontent.com/92932195/228085619-d1e59871-1349-43f6-b8e0-420cadc4e451.png)

### Aula 2 -> Gerando figurinhas para WhatsApp

No segundo dia, as imagens disponíveis nos dados do pedido (JSON) foram utilizadas para criar stickers. Com o auxílio dos pacotes java.awt, java.io e java.ImageIO, foi possível editar imagens e inserir textos.
<br>
Neste programa, usaremos a nota do filme como base para a frase que será gerada com sua figurinha.
<br>
1. Caso o filme tenha nota 8 ou superior, será impresso com a frase: "BRABO D+!".
<br>
2. Caso o filme tenha nota menor que 8 e maior que 4, o filme será impresso com a frase: "TEM MELHORES...".
<br>
3. Caso o filme tenha nota inferior a 4, o filme será impresso com a frase: "NÃO VALE A PENA".
<br>

#### Imagem do resultado do projeto 2
![teste1](https://user-images.githubusercontent.com/92932195/228356943-2634b062-991c-44ed-97ff-100ee7dd0736.png)


<img src="https://user-images.githubusercontent.com/92932195/228357045-b7207eff-9f78-4711-9923-503f21d57757.png" width="400" height="550"/> <img src="https://user-images.githubusercontent.com/92932195/228357094-6bf8ba82-a65e-40fe-ace1-766703fb175e.png" width="400" height="550"/>


### Aula 3 -> Conectando as pontas, refatoração e orientação a objetos

૪ Refatoração do App, transferindo parte do código para novas classes.
<br>
1. Criação de classes para: "Conteudo" e "ClienteHttp".
<br>
2. Criação de interface para as novas classes de extrator: "ExtratorDeConteudoDoIMDB" e "ExtratorDeConteudoDaNasa".
<br>
3. Modificado da Classe 2: Após a criação da classe HttpClient, alteramos todo o código que buscava dados em .json para um objeto do tipo HttpClient e o mesmo para ExtractorConteudo.
<br>
4. Criando uma lista de conteúdos.
<br>
5. No loop que gera as imagens, pegamos cada conteúdo da lista, chamando suas propriedades através dos métodos .getTitle() e .getUrlImage().
<br>
6. Algumas modificações do StickerGenerator.
<br>

#### Imagem do resultado do projeto 3
<img src="https://user-images.githubusercontent.com/92932195/228680810-a50bb4d6-25b4-4de7-800e-a76258466d3f.png" width="400" height="550"/> <img src="https://user-images.githubusercontent.com/92932195/228680817-0054bee8-60e6-47cd-a640-92fbc79aed1c.png" width="400" height="550"/>

# Imersão Java Alura

Repositório com os projetos dos 5 dias de imersão.

## Dia 1

No primeiro dia o desafio foi consumir dados da API de filmes do IMDB.
Nas primeiras horas de aula no ar a API começou a apresentar instabilidades e acabei substituindo por um [link alternativo](https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json) encontrado na página da aula.

Após acessar os dados dos filmes usei o [arquivo disponibilizado](/alura-stickers/src/JsonParser.java) para extrair os dados. Através dessa expressão regular o **JSON** foi _parseado_ e isolados para usar somente as partes desejadas.

### Desafios extras

Como desafios extras foram propostos:

- **`Usar Arquivos separados para as chaves da api.`** ✅<br>
Conforme disse anteriormente, devido as instabilidades em relação a API, optei por usar os links alternativos disponibilizados para fornecer os dados ao programa.\
Assim, a solução para completar esse desafio foi colocar os links dentro de um arquivo txt e usar o _Scanner_ para ler esse arquivo e fornecer o link com os dados.

- `Output colorido no terminal` ✅ <br>
Usando códigos ANSI foi possível personalizar as cores do texto tornando-o mais legível e elegante.

<p align= "center">
<img src="dia1/screenshot01.png" width="400" height="500">
</p>

- `Emoji recomendando ou não o filme baseado na nota` ✅ <br>
Uma pequena condicional foi implementada para recomendar ou não (usando um emoji 👍) baseado na nota do filme.


## Dia 2

Ciração de stickers de whatsapp baseados nos posters dos filmes.

  Foi criada uma classe para gerar figurinhas a partir da imagem do poster do filme contida na API. 
  Com a biblioteca padrão para inserir textos abaixo da imagem do poster baseado na nota do filme/série.


Catálogo de Produtos com Play Framework
Este projeto é um aplicativo web desenvolvido em Scala utilizando o Play Framework 2.4.11. Ele demonstra um catálogo de produtos com funcionalidades de listagem, visualização de detalhes (incluindo geração dinâmica de código de barras com a biblioteca barcode4j), criação de novos produtos por meio de formulários com validação e suporte à internacionalização (i18n).

Pré-requisitos
Java 8: Verifique com java -version se o Java 8 está instalado.
sbt 0.13.18: Necessário para compatibilidade com o Play Framework 2.4.11.
Git: Para clonar o repositório e fazer deploy no GitHub.

Instalação e Execução

Clone o Repositório:
git clone https://github.com/seu-usuario/cadastro-produtos.git
cd cadastro-produtos

Compile e Execute a Aplicação:
Na raiz do projeto, execute:
sbt run

O servidor iniciará na porta 9000. Abra http://localhost:9000 no navegador.

Testando as Funcionalidades:

Listagem de Produtos: http://localhost:9000/products
Novo Produto: http://localhost:9000/products/new
Detalhes do Produto: Por exemplo, http://localhost:9000/products/5010255079763
Código de Barras: Teste em http://localhost:9000/barcode/5010255079763
Configuração
Application.conf:
Configure a chave secreta e os idiomas suportados.

hocon
Copy
application.secret="sua-chave-secreta-aqui"
application.langs="en,es,fr,nl"
Mensagens:
Edite os arquivos conf/messages, conf/messages.es, etc., para definir as traduções utilizadas nos templates.

Rotas
No arquivo conf/routes temos:

routes
Copy
GET     /                   controllers.Application.index
GET     /products           controllers.Products.list
GET     /assets/*file       controllers.Assets.versioned(path="/public", file: Asset)
GET     /products/new       controllers.Products.newProduct
GET     /products/:ean      controllers.Products.show(ean: Long)
GET     /barcode/:ean       controllers.Barcodes.barcode(ean: Long)
POST    /products           controllers.Products.save
Detalhes:

A rota /products/new é definida antes de /products/:ean para evitar conflitos de interpretação.
Cada rota mapeia uma URL para uma ação específica do controlador.
Detalhes do Funcionamento
Modelo (Product.scala)
Representa cada produto com atributos: ean, name e description.
Possui métodos para buscar todos os produtos, encontrar um produto por EAN e adicionar um novo produto.
Controladores (Products.scala e Barcodes.scala)
Products.scala:
Gerencia a lógica de listagem, exibição de detalhes, criação e salvamento de produtos.
Barcodes.scala:
Gera imagens de código de barras usando a biblioteca barcode4j.
Nota: O padrão EAN-13 exige que o EAN seja um número válido (13 dígitos com check digit correto).
Views (Templates)
main.scala.html:
Define o layout principal da aplicação, incluindo o header com navbar, mensagens flash e rodapé.
list.scala.html:
Exibe a lista de produtos.
details.scala.html:
Mostra os detalhes de um produto e inclui a imagem do código de barras (através da “tag” barcode).
editProduct.scala.html:
Formulário para criação/edição de produtos.
tags/barcode.scala.html:
Um pequeno template reutilizável que gera a tag <img> para o código de barras.
Internacionalização
Os arquivos em conf/messages e suas variações permitem que a aplicação exiba textos de acordo com o idioma do usuário.
Contribuição
Contribuições são bem-vindas! Se você deseja melhorar ou expandir este projeto, siga estas orientações:

Faça um fork deste repositório.
Crie uma branch para sua feature ou correção.
Envie um pull request com uma descrição detalhada das mudanças.
Licença
Este projeto está licenciado sob a MIT License. Consulte o arquivo LICENSE para mais informações.

Deploy no GitHub
Para fazer o deploy deste projeto no GitHub:

Crie um repositório no GitHub (por exemplo, cadastro-produtos).
No terminal, dentro da raiz do projeto, adicione o repositório remoto:
bash
Copy
git remote add origin https://github.com/seu-usuario/cadastro-produtos.git
Faça commit e push do código:
bash
Copy
git add .
git commit -m "Initial commit: Catálogo de Produtos com Play Framework"
git push -u origin master
Considerações Finais
Este projeto é uma demonstração prática de como utilizar o Play Framework para construir aplicações web com Scala, abrangendo conceitos fundamentais como MVC, formulários com validação, internacionalização e integração com bibliotecas externas. Ele serve como base para projetos mais complexos e pode ser estendido com novas funcionalidades, como persistência em banco de dados, autenticação e testes automatizados.

Obrigado por utilizar este aplicativo como base para seu aprendizado e desenvolvimento. Se tiver dúvidas ou sugestões, sinta-se à vontade para abrir issues ou contribuir com melhorias.

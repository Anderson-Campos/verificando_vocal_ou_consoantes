<h1>Verificador de Vogal ou Consoante</h1>

<p>Este é um programa simples em Java que verifica se o caractere inserido pelo usuário é uma vogal ou consoante . O programa aceita a entrada de uma única letra e distingue entre vogais e consoantes, exibindo uma mensagem com base no que foi digitado.</p>

<h3>Funcionalidades</h3>
<ul>
  <li>Aceita a entrada de uma letra (maiúscula ou minúscula).</li>
  <li>Verifique se a letra digitada é uma vogal ( a, e, i, o, u).</li>
  <li>Caso a entrada não seja uma vogal, informa que não é uma vogal (mesmo se for uma consoante).</li>
  <li>Valida se a entrada contém exatamente uma letra . Se o usuário digitar mais de um caractere ou algo que não seja uma letra, o programa retornará uma mensagem de erro.</li>
</ul>

<h3>Requisitos</h3>
<ul>
  <li>Java Development Kit (JDK) versão 8 ou superior.</li>
  <li>Um ambiente de desenvolvimento Java (por exemplo, Eclipse , IntelliJ IDEA ou simplesmente o terminal com suporte para executar programas Java).</li>
</ul>

<h3>Estrutura do Código</h3>
<ul>
  <li>O programa utiliza uma classe Scannerpara receber a entrada do usuário.</li>
  <li>A entrada é convertida para minúsculas utilizando o método toLowerCase()para facilitar a verificação.</li>
  <li>A condição ifverifica se a entrada contém apenas uma letra e se é uma letra válida.</li>
  <li>Caso seja uma única letra, o programa verifica se ela é uma vogal .</li>
  <li>Se a entrada for inválida (mais de um caractere ou algo que não seja uma letra), uma mensagem de erro é exibida.</li>
</ul>

<h3>Mensagens de erro</h3>
<p>Se o usuário digitar mais de um caractere ou algo que não seja uma letra, o programa exibirá uma mensagem de Entrada Inválida , solicitando que o usuário tente novamente com apenas uma letra.</p>

<h3>Encerramento</h3>
<p>O programa encerra a execução automaticamente após verificar a letra digitada, fechando o objeto <strong>Scanner</strong> para liberar recursos.</p>

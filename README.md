Padrão de Projeto - Builder
Problema
Criar objetos com muitos atributos pode se tornar um problema quando há várias combinações possíveis. Isso pode gerar múltiplos construtores sobrecarregados, tornando o código difícil de entender e manter. Além disso, fica complicado adicionar novos atributos sem modificar todas as chamadas existentes.
Descrição da Solução
O padrão Builder resolve esse problema separando a lógica de construção do objeto da sua representação final. Ele permite criar objetos passo a passo, garantindo flexibilidade e um código mais organizado. Com isso, podemos gerar diferentes variações de um mesmo objeto sem precisar criar vários construtores.
Visão Geral
O Builder é muito usado quando precisamos criar objetos complexos de forma mais legível. Ele evita a bagunça de múltiplos construtores e melhora a manutenção do código, tornando mais simples a adição de novos atributos no futuro.

Consequências (Vantagens e Desvantagens)
Vantagens
Facilidade na criação de objetos complexos sem a necessidade de vários construtores.
Código mais legível e fácil de manter.
Permite criar diferentes variações do mesmo objeto sem duplicação de código.
Facilita a adição de novos atributos sem afetar implementações existentes.
Desvantagens
Adiciona complexidade extra ao código com a necessidade de criar classes auxiliares. 
Pode ser desnecessário para objetos simples com poucos atributos.

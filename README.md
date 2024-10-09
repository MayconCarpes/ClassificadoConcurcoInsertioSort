# InsertionSort CSV Classifier

Este projeto é uma prática em Estrutura de Dados, onde foi implementado o algoritmo **Insertion Sort** para classificar uma tabela CSV com base na **nota** dos indivíduos, da maior para a menor. A tabela contém as seguintes colunas:

- **Nome**
- **Nota**
- **ID**
- **Data de Nascimento**

O código recebe um arquivo CSV, lê os dados e realiza a ordenação dos indivíduos utilizando o algoritmo **Insertion Sort**, baseado na **nota** de cada um.

## Funcionalidades

- Leitura de um arquivo CSV com dados de pessoas (nome, nota, ID e data de nascimento).
- Implementação do algoritmo **Insertion Sort** para ordenar os dados.
- Classificação dos indivíduos da maior para a menor nota.
- Exportação dos dados classificados em um novo arquivo CSV.

## Estrutura do Projeto

O projeto contém os seguintes componentes:

- **`src/main/java/ordenacao/InsertionSort.java`**: Implementa o algoritmo de ordenação **Insertion Sort**.
- **`entrada.csv`**: Arquivo CSV com dados não ordenados.
- **`saida.csv`**: Arquivo CSV gerado contendo os dados ordenados por nota.

## Como o Insertion Sort Funciona

O **Insertion Sort** é um algoritmo simples de ordenação que percorre o array de dados e, a cada iteração, insere o elemento atual na posição correta em relação aos elementos já ordenados.

### Passos do algoritmo:
1. Percorre a lista de dados a partir do segundo elemento.
2. Compara o elemento atual com os anteriores, movendo-o para a posição correta.
3. Repete o processo até que todos os elementos estejam ordenados.

Esse algoritmo é eficiente para conjuntos pequenos de dados, mas tem uma complexidade de tempo de O(n²), tornando-o menos adequado para grandes volumes de dados.

## Exemplo de Uso

### Entrada (`entrada.csv`)

```csv
ID,Nome,Nota,Data de Nascimento
1,João,75,1990-02-15
2,Maria,85,1988-05-23
3,Carlos,90,1992-07-11
4,Ana,60,1991-09-01

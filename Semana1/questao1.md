O que é uma classe em Java e qual é a diferença entre uma classe e um
objeto? Dê exemplo mostrando-os em C++ e em Java. 

Em Java, uma classe é uma estrutura que serve como modelo para criar objetos. Ela define um conjunto de propriedades (atributos) e comportamentos (métodos) que os objetos criados a partir dessa classe terão. Em outras palavras, uma classe é uma representação abstrata de um conceito ou entidade no seu programa.

Diferença entre uma classe e um objeto:

Classe: Uma classe é uma estrutura que descreve um tipo de objeto. Ela define os atributos e métodos que os objetos daquela classe terão, mas não ocupa espaço na memória nem pode ser usada diretamente para realizar tarefas.

Objeto: Um objeto é uma instância de uma classe. Ele é uma entidade real que pode ocupar espaço na memória e pode ser utilizado para realizar tarefas. Cada objeto criado a partir de uma classe possui seus próprios valores para os atributos definidos na classe.


Exemplo 1: Definindo uma classe "Pessoa"

C++

#include <iostream>
using namespace std;

class Pessoa {
public:
    string nome;
    int idade;
};

int main() {
    Pessoa pessoa1;
    pessoa1.nome = "João";
    pessoa1.idade = 30;

    cout << "Nome: " << pessoa1.nome << ", Idade: " << pessoa1.idade << endl;

    return 0;
}

Java

public class Pessoa {
    public String nome;
    public int idade;
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 30;

        System.out.println("Nome: " + pessoa1.nome + ", Idade: " + pessoa1.idade);
    }
}

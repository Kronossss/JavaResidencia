Atividade 3

3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

Herança em Java:

A herança em Java é um conceito fundamental da programação orientada a objetos, permitindo que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse). 
A subclasse pode então estender ou modificar o comportamento da superclasse. Para criar uma subclasse em Java, utiliza-se a palavra-chave extends.

Sintaxe em Java:

class Superclasse {
    // Atributos e métodos da superclasse
}

class Subclasse extends Superclasse {
    // Atributos e métodos adicionais ou modificados pela subclasse
}

Exemplo em Java:

class Animal {
    void fazerSom() {
        System.out.println("Barulho genérico de animal");
    }
}

class Gato extends Animal {
    void fazerSom() {
        System.out.println("Miau");
    }
}

Herança em C++:

O conceito de herança em C++ é semelhante ao de Java. Para criar uma subclasse em C++, utiliza-se a palavra-chave : public após a declaração da classe base.

Sintaxe em C++:

class Superclasse {
    // Atributos e métodos da superclasse
};

class Subclasse : public Superclasse {
    // Atributos e métodos adicionais ou modificados pela subclasse
};


Exemplo em C++:

#include <iostream>
using namespace std;

class Animal {
public:
    void fazerSom() {
        cout << "Barulho genérico de animal" << endl;
    }
};

class Gato : public Animal {
public:
    void fazerSom() {
        cout << "Miau" << endl;
    }
};



Paralelo - 5 Exemplos:

Veículo:

Java:

class Veiculo {
    // Atributos e métodos relacionados a veículos
}

class Carro extends Veiculo {
    // Atributos e métodos específicos de carros
}
C++:

class Veiculo {
    // Atributos e métodos relacionados a veículos
};

class Carro : public Veiculo {
    // Atributos e métodos específicos de carros
};
Pessoa:

Java:

class Pessoa {
    // Atributos e métodos relacionados a pessoas
}

class Estudante extends Pessoa {
    // Atributos e métodos específicos de estudantes
}
C++:

class Pessoa {
    // Atributos e métodos relacionados a pessoas
};

class Estudante : public Pessoa {
    // Atributos e métodos específicos de estudantes
};
Forma Geométrica:

Java:

class Forma {
    // Atributos e métodos relacionados a formas geométricas
}

class Circulo extends Forma {
    // Atributos e métodos específicos de círculos
}
C++:

class Forma {
    // Atributos e métodos relacionados a formas geométricas
};

class Circulo : public Forma {
    // Atributos e métodos específicos de círculos
};
Conta Bancária:

Java:

class Conta {
    // Atributos e métodos relacionados a contas bancárias
}

class ContaCorrente extends Conta {
    // Atributos e métodos específicos de contas correntes
}
C++:

class Conta {
    // Atributos e métodos relacionados a contas bancárias
};

class ContaCorrente : public Conta {
    // Atributos e métodos específicos de contas correntes
};
Dispositivo Eletrônico:

Java:

class Dispositivo {
    // Atributos e métodos relacionados a dispositivos eletrônicos
}

class Smartphone extends Dispositivo {
    // Atributos e métodos específicos de smartphones
}
C++:

class Dispositivo {
    // Atributos e métodos relacionados a dispositivos eletrônicos
};

class Smartphone : public Dispositivo {
    // Atributos e métodos específicos de smartphones
};
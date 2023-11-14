Atividade 4

4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

A diferença básica é que em Java você mexe com referências a objetos, enquanto em C++ você mexe diretamente com objetos. Isso tem implicações para operações de memória, alocação, desalocação e comportamento semântico.
Em C++, se quiser usar a alocação dinâmica de memória, você também pode usar um ponteiro para um objeto. Em Java, a alocação e desalocação de memória são gerenciadas pelo coletor de lixo que de tempos em tempos verifica se a variável está sendo utilizada ou não e você não precisa se preocupar diretamente com ponteiros ou gerenciamento de memória.
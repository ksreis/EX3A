package aulas.kreis;

import kreis.aula.ArvoreC;

public class Main {
    public static void main(String[] args) {
        // a) Criação do vetor fixo com os valores {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'}
        char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};

        // b) Inicialização de uma Árvore de Busca Binária
        ArvoreC arvore = new ArvoreC();

        // c) Inserção dos dados do vetor na árvore
        for (char valor : vetor) {
            arvore.inserir(valor);
        }

        // d) Remoção dos valores 'F' e 'U'
        arvore.remover('F');
        arvore.remover('U');

        // e) Traversal pré-ordem, em-ordem e pós-ordem dos valores após a remoção
        System.out.println("Traversal pré-ordem:");
        arvore.traversalPreOrdem();

        System.out.println("\nTraversal em-ordem:");
        arvore.traversalEmOrdem();

        System.out.println("\nTraversal pós-ordem:");
        arvore.traversalPosOrdem();
    }
}
public class MainPilhaDinamica {
    public static void main(String[] args) {

        //Criação da pilha vazia
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        //Teste de empilhar os elementos na pilha
        pilhaDinamica.empilhar("Juliana");
        pilhaDinamica.empilhar("Isabela");
        pilhaDinamica.empilhar("Nicolas");
        pilhaDinamica.empilhar("Caio");
        pilhaDinamica.empilhar("Vitor");
        pilhaDinamica.empilhar("Leticia");
        pilhaDinamica.empilhar("Lucas");

        //Teste de exibir e desempilhar os elementos (último --> primeiro)
        //PS: deu certo prof sem usar os laços aninhados :D
        pilhaDinamica.exibirElementos();
        System.out.println("------------------");
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibirElementos();
        System.out.println("-------------------");
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();  //Resultado esperado = que não foi possível desempilhar por estar vazia
        pilhaDinamica.exibirElementos();
    }
}

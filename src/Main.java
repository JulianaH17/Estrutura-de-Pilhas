public class Main {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(5);

        //Teste de empilhar os elementos na pilha
        pilhaSimples.empilhar("Lucas");
        pilhaSimples.empilhar("Vitor");
        pilhaSimples.empilhar("Leticia");
        pilhaSimples.empilhar("Caio");
        pilhaSimples.empilhar("Nicolas");
        pilhaSimples.empilhar("Isabela");
        pilhaSimples.empilhar("Juliana");

        //Teste de exibir e desempilhar os elementos (último --> primeiro)
        pilhaSimples.exibirElementos();
        System.out.println("-------------------");
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.exibirElementos();
        System.out.println("------------------");
        pilhaSimples.desempilhar();
        pilhaSimples.exibirElementos();
        System.out.println("-------------------");
        pilhaSimples.desempilhar(); //tem q dar erro
        pilhaSimples.exibirElementos();
    }
}

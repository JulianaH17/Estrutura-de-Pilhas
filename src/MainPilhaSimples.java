public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(8);

        //Teste para inicar uma pilha com elementos null
        pilhaSimples.inicializa();
        pilhaSimples.exibirElementos();
        System.out.println("-----------------");

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
        pilhaSimples.empilhar("Sky");
        pilhaSimples.empilhar("Martin");
        pilhaSimples.empilhar("Yuki");
        pilhaSimples.exibirElementos();
        System.out.println("------------------");
        pilhaSimples.desempilhar();
        pilhaSimples.exibirElementos();
        System.out.println("-------------------");
        pilhaSimples.desempilhar(); //Resultado esperado = que não foi possível desempilhar por estar vazia
        pilhaSimples.exibirElementos();
    }
}

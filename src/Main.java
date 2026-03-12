public class Main {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(5);

        pilhaSimples.empilhar("Lucas");
        pilhaSimples.empilhar("Vitor");
        pilhaSimples.empilhar("Leticia");
        pilhaSimples.empilhar("Caio");
        pilhaSimples.empilhar("Nicolas");
        pilhaSimples.empilhar("Isabela");

        pilhaSimples.exibirElementos();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar(); //não tá retirando o penultimo elemento inserido, arrumar!
        System.out.println("-------------------------------");
        pilhaSimples.exibirElementos();
    }
}

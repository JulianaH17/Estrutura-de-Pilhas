public class Main {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(5);

        pilhaSimples.empilhar("Lucas");
        pilhaSimples.empilhar("Vitor");
        pilhaSimples.empilhar("Leticia");
        pilhaSimples.empilhar("Caio");
        pilhaSimples.empilhar("Nicolas");
        pilhaSimples.desempilhar(); //verificar pq o primeiro elemento da lista tá duplicado quando retira o último

        pilhaSimples.exibirElementos();
    }
}

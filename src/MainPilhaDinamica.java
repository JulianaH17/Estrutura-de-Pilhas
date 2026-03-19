public class MainPilhaDinamica {
    public static void main(String[] args) {

        PilhaDinamica pilhaDinamica = new PilhaDinamica();
        pilhaDinamica.empilhar("Juliana");
        pilhaDinamica.empilhar("Isabela");
        pilhaDinamica.empilhar("Nicolas");
        pilhaDinamica.empilhar("Caio");
        pilhaDinamica.empilhar("Vitor");
        pilhaDinamica.empilhar("Leticia");
        pilhaDinamica.empilhar("Lucas");

        pilhaDinamica.exibirElementos();
        System.out.println("------------------");
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();    //É pra dar erro nesse
        pilhaDinamica.exibirElementos();
    }
}

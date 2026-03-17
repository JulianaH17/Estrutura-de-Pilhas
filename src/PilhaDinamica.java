public class PilhaDinamica {
    No inicio;

    public PilhaDinamica() {
        this.inicio = new No(null);
        System.out.println("Pilha dinâmica criada com sucesso!");
    }

    public void empilhar(String elemento) {

        if (elemento == null || elemento.trim().isEmpty()) {
            System.out.println("Elemento inválido.");
            return;
        }

        if (inicioEstaVazio()) {
            this.inicio.setConteudo(elemento);
        } else {
            No aux = this.inicio;
            No novoNo = new No(elemento);
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }
    private boolean inicioEstaVazio() {
        if (this.inicio.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void exibir() {
        if (inicioEstaVazio()) {
            System.out.println("Não existem elementos na lista dinâmica.");
        } else {
            No aux = this.inicio;
//            while(aux != null && aux.getConteudo() != null) {
//                System.out.println(aux.getConteudo());
//                aux = aux.getProx();
//            }

            while (aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            //System.out.println(aux.getConteudo());
        }
    }

}

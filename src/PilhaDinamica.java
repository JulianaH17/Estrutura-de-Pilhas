public class PilhaDinamica {
    No topo;    //Vai ser o topo da nossa pilha (último elemento inserido)

    //Construtor que inicia a pilha dinâmica vazia, onde o topo aponta pro null
    public PilhaDinamica(){
        this.topo = null;
        System.out.println("Pilha dinâmica criada com sucesso!");
    }

    //Função que insere elementos na pilha
    public void empilhar(String elemento){
        //Se o elemento é nulo ou vazio, a gente exibe uma mensagem que o elemento é inválido
        if (elemento == null || elemento.trim().isEmpty()) {
            System.out.println("O elemento é inválido.");
            return;
        }
        //Vai funcionar tanto pra uma pilha vazia quanto uma pilha com elementos já inseridos, pq a gente mexe só no topo
        No aux = new No(elemento);  //Criando um novo nó auxiliar
        aux.setProx(this.topo);     //O novo nó vai apontar pro antigo topo
        this.topo = aux;        //Settamos o último elemento inserido como novo topo (atualiza)
    }

    public void desempilhar(){
        if (this.topo != null) {    //Se nossa pilha não estiver vazia
            String elementoRemovido = this.topo.getConteudo();      //Pega e guarda o elemento q será removido
            this.topo = this.topo.getProx();        //Muda o topo atual para o próximo elemento (novo topo)
            System.out.println("O elemento " + elementoRemovido + " foi removido com sucesso!");
        }
        else {
            System.out.println("A pilha se encontra vazia!");
        }
    }

}

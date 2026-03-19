public class PilhaSimples {
    String [] pilha;

    //Construtor para inicializar a pilha dependendo do tamanho informado pelo usuário
    public PilhaSimples(int tamanho){
        this.pilha = new String[tamanho];
        System.out.println("A pilha foi criada com sucesso! Existem " + tamanho + " espaços disponíveis.");
    }

    //Função que insere elementos na pilha
    public void empilhar(String elemento){
        if (!this.estaCheia()){
            this.pilha[encontrarPosicao()] = elemento;
            System.out.println("Elemento inserido com sucesso: " + elemento);
        }
        else{
            System.out.println("Não foi possivel inserir o elemento: " + elemento + ". A lista está cheia!");
        }
    }

    //Função que remove elementos da pilha (último --> primeiro)
    public void desempilhar(){
        for (int i = this.pilha.length-1; i >= 0; i--){
            if (this.pilha[i] != null){
                this.pilha[i] = null;
                return;
            }
        }
    }

    //Função que inicializa uma pilha vazia
    public void inicializa(){
        this.pilha = new String[this.pilha.length];
        for (int i = 0; i < this.pilha.length-1; i++){
            this.pilha[i] = null;
        }
    }

    //Função para verificar se a pilha tá cheia ou não
    public boolean estaCheia() {
        for (int i = 0; i < this.pilha.length; i++) {
            if(this.pilha[i] == null) {
                return false;
            }
        }
        return true;
    }

    //Função que encontra a posição do elemento na pilha
    private int encontrarPosicao() {
        int i;
        for (i = 0; i < this.pilha.length; i++) {
            if(this.pilha[i] == null) {
                break;
            }
        }
        return i;
    }

    //Função que exibe os elementos da pilha (último --> primeiro)
    public void exibirElementos() {
        for (int i = this.pilha.length-1; i >= 0; i--) {
            System.out.println("Pilha[" + i + "] = " + this.pilha[i]);
        }
    }

}

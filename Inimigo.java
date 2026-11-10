
package bomberman;

public abstract class Inimigo {
    private int velocidade;
    private int posicaoI;
    private int posicaoJ;

    public Inimigo(int velocidade, int posicaoI, int posicaoJ) {
        this.velocidade = velocidade;
        this.posicaoI = posicaoI;
        this.posicaoJ = posicaoJ;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public int getPosicaoI() {
        return posicaoI;
    }

    public int getPosicaoJ() {
        return posicaoJ;
    }

    public void alterarPosicao(int i, int j){
        this.posicaoI = i;
        this.posicaoJ = j;
    }
    
    public abstract void mover();
}

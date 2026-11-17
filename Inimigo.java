
package bomberman;

public abstract class Inimigo extends Posicao{
    private int velocidade;

    public Inimigo(int velocidade, int posicaoI, int posicaoJ) {
        this.velocidade = velocidade;
        this.posicaoI = posicaoI;
        this.posicaoJ = posicaoJ;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    
    public abstract void mover();
}

public abstract class Posicao{
  private int posicaoI;
  private int posicaoJ;
  
  public Posicao(int posicaoI, int posicaoJ){
    this.posicaoI = posicaoI;  
    this.posicaoJ = posicaoJ;
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
}

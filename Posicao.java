public abstract class Posicao{
  private int posicaoI;
  private int posicaoJ;
  
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

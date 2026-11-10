package bomberman;

public class InimigoSabotador extends Inimigo{

    public InimigoSabotador(int posicaoI, int posicaoJ) {
        super(1, posicaoI, posicaoJ);  //Inimigo Sabotador terá a mesma velocidade q o Inimigo comum para não ser mt OP
    }
    
    @Override
    public void mover() {
        //A ser implementado
    }
    
    public void sabotarBomba(){
        //A ser implementado
    }
}

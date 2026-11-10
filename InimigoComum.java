package bomberman;

public class InimigoComum extends Inimigo {

    public InimigoComum(int posicaoI, int posicaoJ) {
        super(1, posicaoI, posicaoJ);  //Inimigo comum tem velocidade 1 pois move-se lentamente
    }
    
    @Override
    public void mover() {
        //A ser implementado
    } 
}


package bomberman;

public class PersonagemPrincipal {
    private int vidas;
    private int qtdBombasSimultaneas;
    private int raioExplosao;

    public PersonagemPrincipal() {
        this.vidas = 3;
        this.qtdBombasSimultaneas = 1;
        this.raioExplosao = 1;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        if(vidas < 0){
            this.vidas = 0;          //Vida não pode ser < 0
        }else{
            this.vidas = vidas;
        }
    }

    public int getQtdBombasSimultaneas() {
        return qtdBombasSimultaneas;
    }

    public void setQtdBombasSimultaneas(int qtdBombasSimultaneas) {
        if(qtdBombasSimultaneas < 1){  
            this.qtdBombasSimultaneas = 1;  //Quantidade de bombas simultâneas não pode ser < 1
        }else{
            this.qtdBombasSimultaneas = qtdBombasSimultaneas;
        }
    }

    public int getRaioExplosao() {
        return raioExplosao;
    }

    public void setRaioExplosao(int raioExplosao) {
        if(raioExplosao < 1){
            this.raioExplosao = 1;   //Raio não pode ser < 1
        }
        else{
            this.raioExplosao = raioExplosao;
        }
    }
}

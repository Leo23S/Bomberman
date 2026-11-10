package bomberman;
import java.util.Random;

public class Bomberman {

    public static void main(String[] args) {
       int[][] mapa = new int[20][20];
       Random r = new Random();
       
       for (int i = 0; i < mapa.length; i++ ){
           for (int j = 0; j < mapa[i].length; j++ ){
               if ((j == 6 || j == 15) && (i > 6 && i < 15)){
                   mapa[i][j] = 8;
               }else if (((r.nextInt(100)+1)) > 40){
                   mapa[i][j] = 1;
               }else {
                   mapa[i][j] = 0;
               }
           }
       }
       for (int i = 0; i < mapa.length; i++ ){
           for (int j = 0; j < mapa[i].length; j++ ){
               System.out.print(mapa[i][j]);
           }
           System.out.println();
       }
    }
}

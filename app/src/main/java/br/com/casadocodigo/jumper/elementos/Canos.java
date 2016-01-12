package br.com.casadocodigo.jumper.elementos;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.List;

import br.com.casadocodigo.jumper.engine.Tela;

/**
 * Created by jonathan on 12/01/16.
 */
public class Canos {

    private static final int QUANTIDADE_DE_CANOS = 5;
    private static final int DISTANCIA_ENTRE_CANOS = 250;
    private final List<Cano> canos = new ArrayList<Cano>();

    public Canos(Tela tela){
        int posicao = 20;


        for (int i = 0 ; i < QUANTIDADE_DE_CANOS; i++ ){
            posicao += DISTANCIA_ENTRE_CANOS;
            this.canos.add(new Cano(tela,posicao));
        }
    }

    public void desenhaNo(Canvas canvas){

        for(Cano cano : canos){
            cano.desenhaNo(canvas);
        }
    }

    public void move(){
        for (Cano cano : canos){
            cano.move();
        }
    }
}

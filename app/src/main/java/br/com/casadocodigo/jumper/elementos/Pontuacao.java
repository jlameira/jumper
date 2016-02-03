package br.com.casadocodigo.jumper.elementos;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.casadocodigo.jumper.engine.Cores;
import br.com.casadocodigo.jumper.engine.Som;

/**
 * Created by jonathan on 15/01/16.
 */
public class Pontuacao {

    private static final Paint BRANCO = Cores.getCorDaPontuacao();

    private int pontos = 0;

    private Som som;

    public Pontuacao(Som som){
        this.som = som;
    }


    public void aumenta(){
        this.som.toca(Som.PONTUACAO);
        this.pontos ++;
    }

    public void desenhaNo(Canvas canvas) {
        canvas.drawText(String.valueOf(this.pontos),100,100,BRANCO);
    }
}

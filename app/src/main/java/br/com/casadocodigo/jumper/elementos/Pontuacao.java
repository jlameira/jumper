package br.com.casadocodigo.jumper.elementos;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.casadocodigo.jumper.engine.Cores;

/**
 * Created by jonathan on 15/01/16.
 */
public class Pontuacao {

    private static final Paint BRANCO = Cores.getCorDaPontuacao();

    private int pontos = 0;


    public void aumenta(){
        this.pontos ++;
    }

    public void desenhaNo(Canvas canvas) {
        canvas.drawText(String.valueOf(this.pontos),100,100,BRANCO);
    }
}

package br.com.casadocodigo.jumper.elementos;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import br.com.casadocodigo.jumper.engine.Cores;
import br.com.casadocodigo.jumper.engine.Tela;

/**
 * Created by jonathan on 15/01/16.
 */
public class GameOver {

    private static final Paint VERMELHO = Cores.getCorDoGameOver();
    private final Tela tela;

    public GameOver(Tela tela){
        this.tela = tela;
    }

    public void desenhaNo(Canvas canvas){
        String gameOver = "Game Over";
        int centroHorizontal = centralizaTexto(gameOver);
        canvas.drawText(gameOver,centroHorizontal,this.tela.getAltura()/2,VERMELHO);
    }

    private int centralizaTexto(String texto) {
        Rect limiteDoTexto = new Rect();
        VERMELHO.getTextBounds(texto,0,texto.length(),
                                    limiteDoTexto);
        int centroOrizontal = this.tela.getLargura()/2 -
                (limiteDoTexto.right - limiteDoTexto.left)/2;
        return centroOrizontal;
    }
}

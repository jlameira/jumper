package br.com.casadocodigo.jumper.elementos;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.casadocodigo.jumper.engine.Cores;
import br.com.casadocodigo.jumper.engine.Tela;

/**
 * Created by jonathan on 12/01/16.
 */
public class Cano {

    private static final int TAMANHO_DO_CANO = 250;
    private static final int LARGURA_DO_CANO = 100;
    private int alturaDoCanoInferior;
    private Tela tela ;
    private int posicao;
    private static final Paint VERDE = Cores.getCorDoCano();

    public Cano(Tela tela, int posicao){

        this.tela = tela;
        this.posicao = posicao;
        this.alturaDoCanoInferior = tela.getAltura() - TAMANHO_DO_CANO;
    }

    public void desenhaNo(Canvas canvas){
        desenhaCanoInferiorNo(canvas);
    }

    private void desenhaCanoInferiorNo(Canvas canvas) {
        canvas.drawRect(this.posicao,
                this.alturaDoCanoInferior,
                this.posicao + LARGURA_DO_CANO,
                this.tela.getAltura(),
                VERDE);
    }

    public void move() {

        this.posicao -= 5;
    }
}

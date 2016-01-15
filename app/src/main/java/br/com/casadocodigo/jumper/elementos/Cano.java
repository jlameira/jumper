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
    private Tela tela;
    private int posicao;
    private static final Paint VERDE = Cores.getCorDoCano();
    private int alturaDoCanoSuperior;

    public Cano(Tela tela, int posicao) {

        this.tela = tela;
        this.posicao = posicao;
        this.alturaDoCanoInferior = tela.getAltura() - TAMANHO_DO_CANO - valorAleatorio();
        this.alturaDoCanoSuperior = 0 + TAMANHO_DO_CANO + valorAleatorio();
    }

    public void desenhaNo(Canvas canvas) {
        desenhaCanoInferiorNo(canvas);
        desenhaCanoSuperiorNo(canvas);
    }

    private void desenhaCanoInferiorNo(Canvas canvas) {
        canvas.drawRect(this.posicao,
                this.alturaDoCanoInferior,
                this.posicao + LARGURA_DO_CANO,
                this.tela.getAltura(),
                VERDE);
    }

    private void desenhaCanoSuperiorNo(Canvas canvas) {
        canvas.drawRect(this.posicao,
                        0,
                        this.posicao + LARGURA_DO_CANO,
                        this.alturaDoCanoSuperior,
                        VERDE);
    }

    public void move() {

        this.posicao -= 5;
    }

    private int valorAleatorio() {
        return (int) (Math.random() * 150);
    }

    public boolean saiuDaTela(){
        return this.posicao + LARGURA_DO_CANO < 0;
    }

    public int getPosicao(){
        return this.posicao;
    }
}

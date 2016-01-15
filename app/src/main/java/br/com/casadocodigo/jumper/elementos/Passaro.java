package br.com.casadocodigo.jumper.elementos;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.casadocodigo.jumper.engine.Cores;
import br.com.casadocodigo.jumper.engine.Tela;

/**
 * Created by jonathan on 12/01/16.
 */
public class Passaro {
    public static final int X = 100;
    public static final int RAIO = 50;
    private static final Paint VERMELHO = Cores.getCorDoPassaro();


    private int altura;
    private Tela tela;

    public Passaro(Tela tela){
        this.tela = tela;
        this.altura = tela.getAltura()/2;
    }

    public void desenhaNo(Canvas canvas){
        canvas.drawCircle(X, this.altura, RAIO, VERMELHO);
    }

    public void cai(){
        boolean chegouNoChao = this.altura + RAIO > tela.getAltura();

        if (!chegouNoChao) {
            this.altura += 5;
        }
    }

    public void pula(){
        if(this.altura > RAIO) {
            this.altura -= 75;
        }
    }

    public int getAltura(){
        return this.altura;
    }
}

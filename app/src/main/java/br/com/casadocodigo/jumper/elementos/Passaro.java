package br.com.casadocodigo.jumper.elementos;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.casadocodigo.jumper.R;
import br.com.casadocodigo.jumper.engine.Cores;
import br.com.casadocodigo.jumper.engine.Som;
import br.com.casadocodigo.jumper.engine.Tela;
import br.com.casadocodigo.jumper.engine.Tempo;

/**
 * Created by jonathan on 12/01/16.
 */
public class Passaro {
    public static final int X = 100;
    public static final int RAIO = 50;
    private static final Paint VERMELHO = Cores.getCorDoPassaro();
    private final Bitmap passaro;
    private Som som;
    private Tempo tempo;
    private int altura;
    private Tela tela;
    private static final int DESLOCAMENTO_DO_PULO = 5;

    public Passaro(Context context,Tela tela, Som som, Tempo tempo){
        this.tela = tela;
        this.altura = tela.getAltura()/2;
        this.som = som;
        this.tempo = tempo;

        Bitmap bp = BitmapFactory.decodeResource(context.getResources(), R.drawable.passaro);
        this.passaro = Bitmap.createScaledBitmap(bp,RAIO*2,RAIO*2,false);
    }

    public void desenhaNo(Canvas canvas){
        canvas.drawBitmap(this.passaro,X - RAIO,this.altura - RAIO,null);
//        canvas.drawCircle(X, this.altura, RAIO, VERMELHO);
    }

    public void voa(){
        double tempo = this.tempo.atual();
        double novaAltura = - DESLOCAMENTO_DO_PULO + ((10 * (tempo * tempo)) / 2.0);
        boolean chegouNoChao = this.altura + RAIO > tela.getAltura();

        if (!chegouNoChao) {
            this.altura += novaAltura;
        }
    }

    public void pula(){
        if(this.altura > RAIO) {
            this.som.toca(Som.PULO);
            this.tempo.reinicia();
        }
    }

    public int getAltura(){
        return this.altura;
    }
}

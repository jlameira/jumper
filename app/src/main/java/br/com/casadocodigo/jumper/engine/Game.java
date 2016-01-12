package br.com.casadocodigo.jumper.engine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import br.com.casadocodigo.jumper.R;
import br.com.casadocodigo.jumper.elementos.Cano;
import br.com.casadocodigo.jumper.elementos.Canos;
import br.com.casadocodigo.jumper.elementos.Passaro;

/**
 * Created by jonathan on 12/01/16.
 */
public class Game extends SurfaceView implements Runnable,View.OnTouchListener{

    public boolean estaRodando = true;

    private final SurfaceHolder holder = getHolder();

    private Passaro passaro;

    private Bitmap background;

    private Tela tela;

    private Cano cano;

    private Canos canos;

    public Game(Context context){
        super(context);
        this.tela = new Tela(context);
        inicializaElementos();
        setOnTouchListener(this);
    }


    @Override
    public void run() {

        while (this.estaRodando){
            if(!holder.getSurface().isValid()) continue;

            Canvas canvas = this.holder.lockCanvas();

            canvas.drawBitmap(this.background,0,0,null);

            this.passaro.desenhaNo(canvas);
            this.passaro.cai();
            this.canos.desenhaNo(canvas);
            this.canos.move();

            this.holder.unlockCanvasAndPost(canvas);

        }

    }

    public void cancela(){
        this.estaRodando = false;
    }

    public void inicia(){
        this.estaRodando = true;
    }

    private void inicializaElementos(){
       Bitmap back = BitmapFactory.decodeResource(getResources(), R.drawable.background);
        this.background = Bitmap.createScaledBitmap(back, back.getWidth(), tela.getAltura(), false);
        this.passaro = new Passaro();
       this.canos = new Canos(this.tela);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        this.passaro.pula();
        return false;
    }
}

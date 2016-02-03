package br.com.casadocodigo.jumper.engine;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import br.com.casadocodigo.jumper.R;

/**
 * Created by jonathan on 03/02/16.
 */
public class Som {

    private SoundPool soundPool;
    public static int PULO;
    public static int PONTUACAO;
    public static int COLISAO;


    public Som(Context context){
        soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC,0);

        PULO = this.soundPool.load(context, R.raw.pulo,1);
        PONTUACAO = this.soundPool.load(context,R.raw.pontos,1);
        COLISAO = this.soundPool.load(context,R.raw.colisao,1);
    }

    public void toca(int som){
        this.soundPool.play(som,1,1,1,0,1);

    }
}

package br.com.casadocodigo.jumper.engine;

import android.graphics.Paint;

/**
 * Created by jonathan on 12/01/16.
 */
public class Cores {

    public static Paint getCorDoPassaro(){
        Paint vermelho = new Paint();
        vermelho.setColor(0xFFFF0000);

        return vermelho;
    }

    public static Paint getCorDoCano(){
        Paint verde = new Paint();
        verde.setColor(0xFF00FF00);

        return verde;
    }
}

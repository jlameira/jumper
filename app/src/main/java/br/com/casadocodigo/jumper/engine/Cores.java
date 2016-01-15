package br.com.casadocodigo.jumper.engine;

import android.graphics.Paint;
import android.graphics.Typeface;

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

    public static Paint getCorDaPontuacao() {
        Paint branco = new Paint();
        branco.setColor(0xFFFFFFFF);
        branco.setTextSize(80);
        branco.setTypeface(Typeface.DEFAULT_BOLD);
        branco.setShadowLayer(3,5,5,0XFF000000);
        return branco;
    }
}

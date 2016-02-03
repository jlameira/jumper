package br.com.casadocodigo.jumper.engine;

/**
 * Created by jonathan on 03/02/16.
 */
public class Tempo {
    private double atual;

    public void passa(){
        atual += 0.1;
    }

    public void reinicia(){
        atual = 0 ;
    }

    public double atual(){
        return atual;
    }
}

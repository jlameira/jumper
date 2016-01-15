package br.com.casadocodigo.jumper.engine;

import br.com.casadocodigo.jumper.elementos.Cano;
import br.com.casadocodigo.jumper.elementos.Canos;
import br.com.casadocodigo.jumper.elementos.Passaro;

/**
 * Created by jonathan on 15/01/16.
 */
public class VerificadorDeColisao {
    private final Passaro passaro;
    private final Canos canos;

    public VerificadorDeColisao(Passaro passaro, Canos canos) {
        this.passaro = passaro;
        this.canos = canos;
    }

    public boolean temColisao(){
        return canos.temColisaoCom(passaro);
    }
}

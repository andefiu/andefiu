package br.com.caelum.fj59.carangos.tasks;

import android.app.Notification;

import java.util.List;

import br.com.caelum.fj59.carangos.modelo.Publicacao;

/**
 * Created by android6489 on 01/08/16.
 */

public interface BuscaMaisPublicacoesDelegate {

    void lidaComRetorno(List<Publicacao> retorno);
    void lidaComErro(Exception e);
}

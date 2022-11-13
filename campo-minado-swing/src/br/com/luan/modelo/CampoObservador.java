package br.com.luan.modelo;

import org.w3c.dom.events.MouseEvent;

@FunctionalInterface
public interface CampoObservador {
	
	public void eventoOcorreu(Campo c, CampoEvento evento);


}

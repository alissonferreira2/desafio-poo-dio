package br.com.dio.desafio.dominio;

import java.util.List;
import java.util.ArrayList;

public class Forum {
	private List<Topico> topicos = new ArrayList<Topico>();
	
	public List<Topico> getTopicos() {
        return topicos;
    }

    public void setTopicos(List<Topico> topicosForum) {
        this.topicos = topicosForum;
    }
}

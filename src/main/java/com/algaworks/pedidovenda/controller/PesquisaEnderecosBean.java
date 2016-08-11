package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaEnderecosBean {

	private List<Integer> enderecosFiltrados;
	
	public PesquisaEnderecosBean() {
		enderecosFiltrados = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			enderecosFiltrados.add(i);
		}
	}

	public List<Integer> getEnderecosFiltrados() {
		return enderecosFiltrados;
	}
	
}
package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.Endereco;
import com.algaworks.pedidovenda.model.TipoPessoa;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private Endereco endereco;
	private List<Endereco> enderecos;
	private String tipoPessoa;
	private String mascaraTipoPessoa;
	private String nomeLabelTipoPessoa;

	public CadastroClienteBean() {
		cliente = new Cliente();
		endereco = new Endereco();
		enderecos = new ArrayList<>();
		tipoPessoa = "FISICA";
	}

	public void getMaskAndLabel() {
		if (this.tipoPessoa.equals("JURIDICA")) {
			this.mascaraTipoPessoa = "99.999.999/9999-99";
			this.nomeLabelTipoPessoa = "CNPJ";
			this.cliente.setTipo(TipoPessoa.JURIDICA);
		} else {
			this.mascaraTipoPessoa = "999.999.999-99";
			this.nomeLabelTipoPessoa = "CPF";
			this.cliente.setTipo(TipoPessoa.FISICA);
		}	
	}

	public String getNomeLabelTipoPessoa() {
		return nomeLabelTipoPessoa;
	}

	public void setNomeLabelTipoPessoa(String nomeLabelTipoPessoa) {
		this.nomeLabelTipoPessoa = nomeLabelTipoPessoa;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getMascaraTipoPessoa() {
		return mascaraTipoPessoa;
	}

	public void setMascaraTipoPessoa(String mascaraTipoPessoa) {
		this.mascaraTipoPessoa = mascaraTipoPessoa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void salvar() {
	}

	public void salvarEndereco() {
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

}
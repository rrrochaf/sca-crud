package com.puc.sca.crud.entity.insumo;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.puc.sca.crud.entity.BaseEntity;

@Entity
public class TipoInsumo extends BaseEntity {

	private static final long serialVersionUID = -8021543420393541704L;

	public TipoInsumo() {
	}

	public TipoInsumo(Long id) {
		setId(id);
	}

	@NotNull
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

package com.tcc.sisape.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UnidadeBasicaSaudeParametro {
	
	@EmbeddedId
	private UnidadeBasicaSaudeParametroId id;
	
	@Column(nullable = false)
	private boolean complexidadeAtencaoBasica;
	
	@Column(nullable = false)
	private boolean complexidadeMedia;
	
	@Column(nullable = false)
	private boolean complexidadeAlta;
	
	@Column(nullable = false)
	private boolean tipoServicoAdm;
	
	@Column(nullable = false)
	private boolean tipoServicoCurativo;
	
	@Column(nullable = false)
	private boolean tipoServicoDemanda;
	
	@Column(nullable = false)
	private boolean tipoServicoEscuta;
	
	@Column(nullable = false)
	private boolean tipoServicoExame;
	
	@Column(nullable = false)
	private boolean tipoServicoNebulizacao;
	
	@Column(nullable = false)
	private boolean tipoServicoOdontologia;
	
	@Column(nullable = false)
	private boolean tipoServicoProcedimento;
	
	@Column(nullable = false)
	private boolean tipoServicoVacina;
	
	@Column(nullable = false)	
	private boolean horarioMatutino;
	
	@Temporal(TemporalType.TIME)
	private Date horarioMatutinoInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horarioMatutinoFim;
	
	@Column(nullable = false)	
	private boolean horarioVespertino;
	
	@Temporal(TemporalType.TIME)
	private Date horarioVespertinoInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horarioVespertinoFim;
	
	@Column(nullable = false)	
	private boolean horarioNoturno;
	
	@Temporal(TemporalType.TIME)
	private Date horarioNoturnoInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horarioNoturnoFim;
	
	@Column(nullable = false)	
	private Long duracaoPadraoAtendimento;
		
	public UnidadeBasicaSaudeParametroId getId() {
		return this.id;
	}

	public void setId(UnidadeBasicaSaudeParametroId id) {
		this.id = id;
	}

	public boolean isComplexidadeAtencaoBasica() {
		return this.complexidadeAtencaoBasica;
	}

	public void setComplexidadeAtencaoBasica(boolean complexidadeAtencaoBasica) {
		this.complexidadeAtencaoBasica = complexidadeAtencaoBasica;
	}

	public boolean isComplexidadeMedia() {
		return this.complexidadeMedia;
	}

	public void setComplexidadeMedia(boolean complexidadeMedia) {
		this.complexidadeMedia = complexidadeMedia;
	}

	public boolean isComplexidadeAlta() {
		return this.complexidadeAlta;
	}

	public void setComplexidadeAlta(boolean complexidadeAlta) {
		this.complexidadeAlta = complexidadeAlta;
	}

	public boolean isTipoServicoAdm() {
		return this.tipoServicoAdm;
	}

	public void setTipoServicoAdm(boolean tipoServicoAdm) {
		this.tipoServicoAdm = tipoServicoAdm;
	}

	public boolean isTipoServicoCurativo() {
		return this.tipoServicoCurativo;
	}

	public void setTipoServicoCurativo(boolean tipoServicoCurativo) {
		this.tipoServicoCurativo = tipoServicoCurativo;
	}

	public boolean isTipoServicoDemanda() {
		return this.tipoServicoDemanda;
	}

	public void setTipoServicoDemanda(boolean tipoServicoDemanda) {
		this.tipoServicoDemanda = tipoServicoDemanda;
	}

	public boolean isTipoServicoEscuta() {
		return this.tipoServicoEscuta;
	}

	public void setTipoServicoEscuta(boolean tipoServicoEscuta) {
		this.tipoServicoEscuta = tipoServicoEscuta;
	}

	public boolean isTipoServicoExame() {
		return this.tipoServicoExame;
	}

	public void setTipoServicoExame(boolean tipoServicoExame) {
		this.tipoServicoExame = tipoServicoExame;
	}

	public boolean isTipoServicoNebulizacao() {
		return this.tipoServicoNebulizacao;
	}

	public void setTipoServicoNebulizacao(boolean tipoServicoNebulizacao) {
		this.tipoServicoNebulizacao = tipoServicoNebulizacao;
	}

	public boolean isTipoServicoOdontologia() {
		return this.tipoServicoOdontologia;
	}

	public void setTipoServicoOdontologia(boolean tipoServicoOdontologia) {
		this.tipoServicoOdontologia = tipoServicoOdontologia;
	}

	public boolean isTipoServicoProcedimento() {
		return this.tipoServicoProcedimento;
	}

	public void setTipoServicoProcedimento(boolean tipoServicoProcedimento) {
		this.tipoServicoProcedimento = tipoServicoProcedimento;
	}

	public boolean isTipoServicoVacina() {
		return this.tipoServicoVacina;
	}

	public void setTipoServicoVacina(boolean tipoServicoVacina) {
		this.tipoServicoVacina = tipoServicoVacina;
	}

	public boolean isHorarioMatutino() {
		return this.horarioMatutino;
	}

	public void setHorarioMatutino(boolean horarioMatutino) {
		this.horarioMatutino = horarioMatutino;
	}

	public Date getHorarioMatutinoInicio() {
		return this.horarioMatutinoInicio;
	}

	public void setHorarioMatutinoInicio(Date horarioMatutinoInicio) {
		this.horarioMatutinoInicio = horarioMatutinoInicio;
	}

	public Date getHorarioMatutinoFim() {
		return this.horarioMatutinoFim;
	}

	public void setHorarioMatutinoFim(Date horarioMatutinoFim) {
		this.horarioMatutinoFim = horarioMatutinoFim;
	}

	public boolean isHorarioVespertino() {
		return this.horarioVespertino;
	}

	public void setHorarioVespertino(boolean horarioVespertino) {
		this.horarioVespertino = horarioVespertino;
	}

	public Date getHorarioVespertinoInicio() {
		return this.horarioVespertinoInicio;
	}

	public void setHorarioVespertinoInicio(Date horarioVespertinoInicio) {
		this.horarioVespertinoInicio = horarioVespertinoInicio;
	}

	public Date getHorarioVespertinoFim() {
		return this.horarioVespertinoFim;
	}

	public void setHorarioVespertinoFim(Date horarioVespertinoFim) {
		this.horarioVespertinoFim = horarioVespertinoFim;
	}

	public boolean isHorarioNoturno() {
		return this.horarioNoturno;
	}

	public void setHorarioNoturno(boolean horarioNoturno) {
		this.horarioNoturno = horarioNoturno;
	}

	public Date getHorarioNoturnoInicio() {
		return this.horarioNoturnoInicio;
	}

	public void setHorarioNoturnoInicio(Date horarioNoturnoInicio) {
		this.horarioNoturnoInicio = horarioNoturnoInicio;
	}

	public Date getHorarioNoturnoFim() {
		return this.horarioNoturnoFim;
	}

	public void setHorarioNoturnoFim(Date horarioNoturnoFim) {
		this.horarioNoturnoFim = horarioNoturnoFim;
	}

	public Long getDuracaoPadraoAtendimento() {
		return this.duracaoPadraoAtendimento;
	}

	public void setDuracaoPadraoAtendimento(Long duracaoPadraoAtendimento) {
		this.duracaoPadraoAtendimento = duracaoPadraoAtendimento;
	}
}

package hospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hospital.Atendimento.TipoAtendimento;


public class Pessoa {
private String nome;
private String cpf;
private Date dataNascimento;
private String telefone;



public Pessoa(String nome, String cpf, Date dataNascimento, String telefone) {
	this.nome = nome;
	this.cpf = cpf;
	this.dataNascimento = dataNascimento;
	this.telefone = telefone;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public Date getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}



}


class Paciente extends Pessoa {
	private String historicoMedico;
	private Triagem triagemAtual;
	private List<Atendimento> atendimentos;
	
	public Paciente(String nome, String cpf, Date dataNascimento, String telefone) {
		super(nome, cpf, dataNascimento, telefone);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getHistoricoMedico() {
		return historicoMedico;
	}
	public void setHistoricoMedico(String historicoMedico) {
		this.historicoMedico = historicoMedico;
	}
	public Triagem getTriagemAtual() {
		return triagemAtual;
	}
	public void setTriagemAtual(Triagem triagemAtual) {
		this.triagemAtual = triagemAtual;
	}
	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}
	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
	
}

class Medico extends Pessoa {
	private String especialidade;
	private boolean emPlantao;
	
	public Medico(String nome, String cpf, Date dataNascimento, String telefone) {
		super(nome, cpf, dataNascimento, telefone);
		// TODO Auto-generated constructor stub
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public boolean isEmPlantao() {
		return emPlantao;
	}
	public void setEmPlantao(boolean emPlantao) {
		this.emPlantao = emPlantao;
	}
	
	
	
}

class Enfermeiro extends Pessoa {
	private String setorTrabalho;

	public Enfermeiro(String nome, String cpf, Date dataNascimento, String telefone) {
		super(nome, cpf, dataNascimento, telefone);
		// TODO Auto-generated constructor stub
	}

	public String getSetorTrabalho() {
		return setorTrabalho;
	}

	public void setSetorTrabalho(String setorTrabalho) {
		this.setorTrabalho = setorTrabalho;
	}
	
	
	
}

class Triagem {
	private Enfermeiro enfermeiroResponsavel;
	private Date dataTriagem;
	private Atendimento.TipoAtendimento tipoAtendimento;
	
	public Triagem(Enfermeiro enfermeiroResponsavel, Date dataTriagem, TipoAtendimento tipoAtendimento) {
		super();
		this.enfermeiroResponsavel = enfermeiroResponsavel;
		this.dataTriagem = dataTriagem;
		this.tipoAtendimento = tipoAtendimento;
	}
	
	public Enfermeiro getEnfermeiroResponsavel() {
		return enfermeiroResponsavel;
	}
	public void setEnfermeiroResponsavel(Enfermeiro enfermeiroResponsavel) {
		this.enfermeiroResponsavel = enfermeiroResponsavel;
	}
	public Date getDataTriagem() {
		return dataTriagem;
	}
	public void setDataTriagem(Date dataTriagem) {
		this.dataTriagem = dataTriagem;
	}
	public Atendimento.TipoAtendimento getTipoAtendimento() {
		return tipoAtendimento;
	}
	public void setTipoAtendimento(Atendimento.TipoAtendimento tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}
	
	
	
}

class Atendimento {
	private Medico medicoResponsavel;
	private Date dataAtendimento;
	private boolean urgencia;
	private List<Procedimento> procedimentosRealizados;
	
	public Atendimento(Medico medicoResponsavel, Date dataAtendimento, boolean urgencia,
			List<Procedimento> procedimentosRealizados) {
		super();
		this.medicoResponsavel = medicoResponsavel;
		this.dataAtendimento = dataAtendimento;
		this.urgencia = urgencia;
		this.procedimentosRealizados = procedimentosRealizados;
	}



	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}



	public void setMedicoResponsavel(Medico medicoResponsavel) {
		this.medicoResponsavel = medicoResponsavel;
	}



	public Date getDataAtendimento() {
		return dataAtendimento;
	}



	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}



	public boolean isUrgencia() {
		return urgencia;
	}



	public void setUrgencia(boolean urgencia) {
		this.urgencia = urgencia;
	}



	public List<Procedimento> getProcedimentosRealizados() {
		return procedimentosRealizados;
	}



	public void setProcedimentosRealizados(List<Procedimento> procedimentosRealizados) {
		this.procedimentosRealizados = procedimentosRealizados;
	}



	public enum TipoAtendimento {
		CLINICA,
		PEDIATRIA,
		PNEUMOLOGIA,
		OBSTETRICIA,
	}
}

class Procedimento {
	private List<Medico> equipeMedica;
	private List<Enfermeiro> equipeEnfermagem;
	private List<Procedimento> procedimentosRelacionados;
	private List<Medicamento> medicamentosUtilizados;
	private List<Insumo> insumosUtilizados;
	
	public Procedimento(List<Medico> equipeMedica, List<Enfermeiro> equipeEnfermagem,
			List<Procedimento> procedimentosRelacionados, List<Medicamento> medicamentosUtilizados,
			List<Insumo> insumosUtilizados) {
		super();
		this.equipeMedica = equipeMedica;
		this.equipeEnfermagem = equipeEnfermagem;
		this.procedimentosRelacionados = procedimentosRelacionados;
		this.medicamentosUtilizados = medicamentosUtilizados;
		this.insumosUtilizados = insumosUtilizados;
	}
	
	public List<Medico> getEquipeMedica() {
		return equipeMedica;
	}
	public void setEquipeMedica(List<Medico> equipeMedica) {
		this.equipeMedica = equipeMedica;
	}
	public List<Enfermeiro> getEquipeEnfermagem() {
		return equipeEnfermagem;
	}
	public void setEquipeEnfermagem(List<Enfermeiro> equipeEnfermagem) {
		this.equipeEnfermagem = equipeEnfermagem;
	}
	public List<Procedimento> getProcedimentosRelacionados() {
		return procedimentosRelacionados;
	}
	public void setProcedimentosRelacionados(List<Procedimento> procedimentosRelacionados) {
		this.procedimentosRelacionados = procedimentosRelacionados;
	}
	public List<Medicamento> getMedicamentosUtilizados() {
		return medicamentosUtilizados;
	}
	public void setMedicamentosUtilizados(List<Medicamento> medicamentosUtilizados) {
		this.medicamentosUtilizados = medicamentosUtilizados;
	}
	public List<Insumo> getInsumosUtilizados() {
		return insumosUtilizados;
	}
	public void setInsumosUtilizados(List<Insumo> insumosUtilizados) {
		this.insumosUtilizados = insumosUtilizados;
	}
	
	
}

class Medicamento {
	private String nome;
	private String descricao;
	private int quantidadeDisponivel;
	
	public Medicamento(String nome, String descricao, int quantidadeDisponivel) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	
}

class Insumo {
	private String nome;
	private String descricao;
	private int quantidadeDisponivel;

	public Insumo(String nome, String descricao, int quantidadeDisponivel) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	
}

class Hospital {
	private List<Paciente> pacientes;
	private List<Medico> medicos;
	private List<Enfermeiro> enfermeiros;
	private List<Medicamento> medicamentos;
	private List<Insumo> insumos;
	private List<Triagem> triagens;
	private List<Atendimento> atendimentos;
	private List<Procedimento> procedimentos;
	
	public Hospital(List<Paciente> pacientes, List<Medico> medicos, List<Enfermeiro> enfermeiros,
			List<Medicamento> medicamentos, List<Insumo> insumos, List<Triagem> triagens,
			List<Atendimento> atendimentos, List<Procedimento> procedimentos) {
		super();
		this.pacientes = pacientes;
		this.medicos = medicos;
		this.enfermeiros = enfermeiros;
		this.medicamentos = medicamentos;
		this.insumos = insumos;
		this.triagens = triagens;
		this.atendimentos = atendimentos;
		this.procedimentos = procedimentos;
	}

	public Hospital() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
        this.triagens = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
    }

    // a) Cadastros
    public void cadastrarMedicamento(Medicamento medicamento) {
        // Implementação do cadastro de medicamento
    }

    public void cadastrarInsumo(Insumo insumo) {
        // Implementação do cadastro de insumo
    }

    public void cadastrarProcedimento(Procedimento procedimento) {
        // Implementação do cadastro de procedimento
    }

    public void cadastrarMedico(Medico medico) {
        // Implementação do cadastro de médico
    }

    public void cadastrarEnfermeiro(Enfermeiro enfermeiro) {
        // Implementação do cadastro de enfermeiro
    }

    public void cadastrarPaciente(Paciente paciente) {
        // Implementação do cadastro de paciente
    }

    // b) Registros de triagens
    public void registrarTriagem(Triagem triagem) {
        // Implementação do registro de triagem
    }

    // c) Registros de atendimentos
    public void registrarAtendimento(Atendimento atendimento) {
        // Implementação do registro de atendimento
    }

    // d) Registro de procedimentos
    public void registrarProcedimento(Procedimento procedimento) {
        // Implementação do registro de procedimento
    }

    // e) Registro procedimento como parte de outro procedimento
    public void registrarProcedimentoParte(Procedimento parte, Procedimento principal) {
        // Implementação do registro de procedimento como parte de outro procedimento
    }

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

	public List<Enfermeiro> getEnfermeiros() {
		return enfermeiros;
	}

	public void setEnfermeiros(List<Enfermeiro> enfermeiros) {
		this.enfermeiros = enfermeiros;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public List<Insumo> getInsumos() {
		return insumos;
	}

	public void setInsumos(List<Insumo> insumos) {
		this.insumos = insumos;
	}

	public List<Triagem> getTriagens() {
		return triagens;
	}

	public void setTriagens(List<Triagem> triagens) {
		this.triagens = triagens;
	}

	public List<Atendimento> getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(List<Atendimento> atendimentos) {
		this.atendimentos = atendimentos;
	}

	public List<Procedimento> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(List<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}
    
    
	
}


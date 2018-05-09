package br.com.projformulario;




public class Formulario{

     
	int tipoPessoa; // 1 - fisica 2 juridica
	String cnpjCpf;
	String nome;
	String dataNasc;
	String end;
	String comp;
	String cidade;
	Estado estado;
	String cep;
	String email;
	String confEmail;
	String senha;
	


	public Formulario(int tipoPessoa, String cnpjCpf, String nome, String dataNasc, String end, String comp,
			String cidade, Estado estado, String cep, String email, String confEmail, String senha) {
		super();
		this.tipoPessoa = tipoPessoa;
		this.cnpjCpf = cnpjCpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.end = end;
		this.comp = comp;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.email = email;
		this.confEmail = confEmail;
		this.senha = senha;
	}


	public int getTipoPessoa() {
		return tipoPessoa;
	}
	

	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}


	public String getCnpjCpf() {
		return cnpjCpf;
	}


	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getComp() {
		return comp;
	}


	public void setComp(String comp) {
		this.comp = comp;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getConfEmail() {
		return confEmail;
	}


	public void setConfEmail(String confEmail) {
		this.confEmail = confEmail;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}





	public Formulario() {
        super();

    }



}

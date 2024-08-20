class Professor {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private String rg;
    private String endereco;
    private Dependente[] dependentes;

    public Professor(String nome, int idade, String sexo, String cpf, String rg, String endereco, Dependente[] dependentes) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dependentes = dependentes;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Dependente[] getDependentes() {
		return dependentes;
	}

	public void setDependentes(Dependente[] dependentes) {
		this.dependentes = dependentes;
	}

 
    
    


}



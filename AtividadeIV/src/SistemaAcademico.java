class SistemaAcademico {
    private Professor[] professores;
    private int quantidadeProfessores;
    private String[] logErros;
    private int quantidadeErros;

    public SistemaAcademico(int capacidade) {
        professores = new Professor[capacidade];
        quantidadeProfessores = 0;
        logErros = new String[10];
        quantidadeErros = 0;
    }

    public void incluirProfessor(Professor professor) throws SistemaAcademicoException {
        if (quantidadeProfessores >= 5) {
            registrarErro("Tentativa de incluir mais de 5 professores.");
            throw new SistemaAcademicoException("Não é possível incluir mais de 5 professores.");
        }

        for (int i = 0; i < quantidadeProfessores; i++) {
            if (professores[i].getCpf().equals(professor.getCpf())) {
                registrarErro("Tentativa de incluir um professor já existente no sistema.");
                throw new SistemaAcademicoException("Professor com CPF " + professor.getCpf() + " já está cadastrado.");
            }
        }

        professores[quantidadeProfessores++] = professor;
    }

    public void excluirProfessor(String cpf) throws SistemaAcademicoException {
        boolean encontrado = false;

        for (int i = 0; i < quantidadeProfessores; i++) {
            if (professores[i].getCpf().equals(cpf)) {
                professores[i] = professores[quantidadeProfessores - 1]; // Substitui o professor excluído pelo último da lista
                professores[quantidadeProfessores - 1] = null;
                quantidadeProfessores--;
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            registrarErro("Tentativa de excluir um professor inexistente no cadastro.");
            throw new SistemaAcademicoException("Professor com CPF " + cpf + " não encontrado no cadastro.");
        }
    }

    public Professor pesquisarProfessor(String cpf) throws SistemaAcademicoException {
        for (int i = 0; i < quantidadeProfessores; i++) {
            if (professores[i].getCpf().equals(cpf)) {
                return professores[i];
            }
        }
        registrarErro("Tentativa de pesquisar um professor inexistente no cadastro.");
        throw new SistemaAcademicoException("Professor com CPF " + cpf + " não encontrado.");
    }

    private void registrarErro(String mensagem) {
        if (quantidadeErros < logErros.length) {
            logErros[quantidadeErros++] = mensagem;
        }
    }

    public void exibirLogErros() {
        System.out.println("Log de Erros:");
        for (int i = 0; i < quantidadeErros; i++) {
            System.out.println(logErros[i]);
        }
    }
}


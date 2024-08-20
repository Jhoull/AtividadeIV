
public class SistemaAcademicoTest {
    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico(20);

        try {
            Dependente[] dependentesProfessor1 = {
                new Dependente("Lucas", 10, "Masculino"),
                new Dependente("Ana", 8, "Feminino")
            };

            Dependente[] dependentesProfessor2 = {
                new Dependente("João", 5, "Masculino")
            };

            Professor professor1 = new Professor("Carlos", 45, "Masculino", "12345678901", "11223344", "Rua A", dependentesProfessor1);
            Professor professor2 = new Professor("Maria", 40, "Feminino", "10987654321", "55667788", "Rua B", dependentesProfessor2);
            Professor professor3 = new Professor("José", 50, "Masculino", "11111111111", "99887766", "Rua C", null);


            sistema.incluirProfessor(professor1);
            sistema.incluirProfessor(professor2);
            sistema.incluirProfessor(professor3);
            sistema.incluirProfessor(professor1);

        } catch (SistemaAcademicoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            sistema.excluirProfessor("11111111111");

            sistema.excluirProfessor("22222222222");
        } catch (SistemaAcademicoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Professor encontrado = sistema.pesquisarProfessor("12345678901");
            System.out.println("Professor encontrado: " + encontrado.getNome());

            sistema.pesquisarProfessor("33333333333");
        } catch (SistemaAcademicoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sistema.exibirLogErros();
    }
}


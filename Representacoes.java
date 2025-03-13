public class Representacoes {


    public static class Computador {
        String processador;
        String memoriaRAM;
        String armazenamento;

        public Computador(String processador, String memoriaRAM, String armazenamento) {
            this.processador = processador;
            this.memoriaRAM = memoriaRAM;
            this.armazenamento = armazenamento;
        }

        public void processarDados() {
            System.out.println("O computador está processando dados...");
        }

        public void executarProgramas() {
            System.out.println("Executando programas no computador...");
        }

        public void armazenarInformacoes() {
            System.out.println("Armazenando informações no disco...");
        }
    }


    public static class Girafa {
        String altura;
        String cor;
        int idade;

        public Girafa(String altura, String cor, int idade) {
            this.altura = altura;
            this.cor = cor;
            this.idade = idade;
        }

        public void comerFolhas() {
            System.out.println("A girafa está comendo folhas no alto das árvores...");
        }

        public void correr() {
            System.out.println("A girafa está correndo rapidamente...");
        }

        public void dormir() {
            System.out.println("A girafa está dormindo em pé...");
        }
    }


    public static class Professor {
        String nome;
        String disciplina;
        int anosExperiencia;

        public Professor(String nome, String disciplina, int anosExperiencia) {
            this.nome = nome;
            this.disciplina = disciplina;
            this.anosExperiencia = anosExperiencia;
        }

        public void ensinar() {
            System.out.println(nome + " está ensinando " + disciplina + "...");
        }

        public void corrigirProvas() {
            System.out.println(nome + " está corrigindo provas...");
        }

        public void prepararAulas() {
            System.out.println(nome + " está preparando as aulas...");
        }
    }

    public static void main(String[] args) {

        Computador pc = new Computador("Intel i7", "16GB", "1TB SSD");
        pc.processarDados();
        pc.executarProgramas();
        pc.armazenarInformacoes();


        Girafa girafa = new Girafa("5 metros", "Amarela com manchas marrons", 10);
        girafa.comerFolhas();
        girafa.correr();
        girafa.dormir();

        Professor professor = new Professor("Carlos", "Matemática", 15);
        professor.ensinar();
        professor.corrigirProvas();
        professor.prepararAulas();
    }
}

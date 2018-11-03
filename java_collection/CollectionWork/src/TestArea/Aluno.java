package TestArea;

/**
 *
 * @author DHEYSON
 */
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String matricula;
    private int idade;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    
    @Override
    public int compareTo(Aluno o) {
        if(this.getNome().equals(o.getNome())){
        return 0;
        }
        if (this.getIdade() > o.getIdade()) {
            return 1;
        }
        return -1;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    @Override
    public String toString() {
        return "nome:" +getNome() + " | " + "Matricula:" +matricula + " | " + "Idade:" +getIdade() + " | ";
    }
}

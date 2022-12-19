import java.time.LocalDate;

public class Contrato {
    String id;
    String nome;
    String numero;
    LocalDate dataNascimento;
    int idade;


    public Contrato() {

    }

    public Contrato(String id, String nome, String numero, LocalDate dataNascimento, int idade) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + idade +
                '}';
    }


}



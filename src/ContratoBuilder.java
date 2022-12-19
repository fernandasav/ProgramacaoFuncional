import java.time.LocalDate;

public class ContratoBuilder {
    private String id;
    private String nome;
    private String numero;
    private LocalDate dataNascimento;
    private int idade;

     public ContratoBuilder id(String id) {
         this.id = id;
         return this;
     }
    public ContratoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }
    public ContratoBuilder numero(String numero) {
        this.numero = numero;
        return this;
    }
    public ContratoBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }
    public ContratoBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public Contrato build(){
        return new Contrato(id, nome, numero, dataNascimento, idade);
    }
}

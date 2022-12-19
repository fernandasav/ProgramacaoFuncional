import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ProgramacaoFuncional {

        public static void main(String[] args) throws IOException {

            OutputStream os = new FileOutputStream("file1.txt");
            Writer fs = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(fs);

            br.write("Teste para salvar projeto em txt");
            br.newLine();
            br.newLine();
            br.write("Testando");
            br.close();

        List<Contrato> contratoList = new ArrayList<>();
        Contrato um = new Contrato("123","Fernanda", "567", LocalDate.of(1995, 11, 25),27);
        Contrato dois = new Contrato("124","Fernando", "557", LocalDate.of(2000, 10, 25), 22);
        Contrato tres = new Contrato("125","Nanda", "577", LocalDate.of(1997, 12, 11),25);
        ContratoBuilder quatroBuilder = new ContratoBuilder()
                .id("567")
                .nome("Ana")
                .numero("555")
                .dataNascimento(LocalDate.of(1992, 01, 22))
                .idade(27);
            System.out.println(quatroBuilder);

        contratoList.add(um);
        contratoList.add(dois);
        contratoList.add(tres);

        Stream<Contrato> streamDeContrato = contratoList.stream();
        var soma = streamDeContrato.reduce(0, (subtotal, contrato) -> contrato.getIdade() + subtotal, Integer::sum);
        System.out.println(soma);

        System.out.println("________________________________\n");

        contratoList.stream()
                .filter(contrato -> {
                    boolean isYear = contrato.getDataNascimento().getYear() == 2000;
                    return isYear;
                }).forEach(System.out::print);

        System.out.println("\n________________________________\n");

        contratoList.stream()
                .filter(contrato -> {
                    boolean isNome = contrato.getNome().equals("Fernanda");
                    boolean isId = contrato.getId().equals("123");
                    return isNome || isId;
                }).forEach(System.out::print);

        System.out.println("\n________________________________\n");

        contratoList.stream()
                .sorted(Comparator.comparing(Contrato::getNome))
                .forEach(System.out::println);


        System.out.println("________________________________\n");}

        public static void maxeMinIdades (Stream < Contrato > max, Stream < Contrato > min){
            System.out.println("Pessoa mais velha: " + max
                    .max(Comparator.comparing(Contrato::getIdade)));

            System.out.println("Pessoa mais nova: " + min
                    .min(Comparator.comparing(Contrato::getIdade)));
            }
        }





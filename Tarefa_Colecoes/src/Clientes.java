import java.util.ArrayList;
import java.util.List;

public class Clientes {
    public static void main(String[] args) {
        Cliente();
    };

    private static void Cliente(){

        String Clientes = "carlos-M, Abreu-M, Julio-M, Fernanda-F, Thiago-M, julio-M, Julia-F";
    
        String[] cliente = Clientes.split(",");
        System.out.println(cliente);

        List<String> grupoFeminino = new ArrayList<>();
        List<String> grupoMasculino = new ArrayList<>();

        for (String teste: cliente ){
            if (teste.endsWith("-F")) {
                grupoFeminino.add(teste);
            } else if (teste.endsWith("-M")){
                grupoMasculino.add(teste);
            }
        }
    }
}

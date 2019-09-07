
public class ExemploString {

    public static void main(String[] args) {

        String texto = "Caza";

        //replace(o que deser substituido, pelo que sera substituido)
        //replace(anigo >>> novo)
        texto = texto.replace("z", "s");
      
        System.out.println(texto);

        String valor = "R$ 2.350,99";  // 2350.99

        valor = valor.replace("R$","");
        valor = valor.replace(".","");
        valor = valor.replace(",",".");
        valor = valor.replace(" ","");
        System.out.println(valor);

        valor = "R$ 2.350,99" .replace("R$","") .replace(".","") .replace(",",".") .replace(" ","");

        Double salario = Double.parseDouble(valor);
        System.out.println("salario; " + salario);



    }
}
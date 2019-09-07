/**
 * ExemoploString04
 */
public class ExemoploString04 {

    public static void main(String[] args) {
        
        String texto = "21/03/2019";

        String[] numeros = texto.split("/");
        //numeros [0] = "21"
        //numeros [1] = "03"
        //numeros [2] = "2019"

        int dia = Integer.parseInt(numeros[0]);
        int mes = Integer.parseInt(numeros[1]);
        int ano = Integer.parseInt(numeros[2]);
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);

    }
}
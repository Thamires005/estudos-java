package repeticaowhile;

public class NumeroPar {
    public static void main (String[]args){
        int num = 1;
        while(num <= 20){
            if(num %2 == 0){
               System.out.println(num); 
            }
            num++;
        }
    }
}
//laço while para encontrar e imprimir todos os números pares entre 1 e 20.

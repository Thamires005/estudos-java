package idiomasistema;

public class IdiomaSistema {
    public static void main(String[]args){
        String idioma = System.getProperty("user.language");// métadodo que obtem o idioma via propriedades do sitema.
        System.out.println("O idioma do sistema é ");
        System.out.println(idioma);
    }
}

public class Operadores {
   
    public static void main(String[] args){
       int numero1 = 1;
       int numero2 = 2;
        
       boolean SimNao = numero1 == numero2;

       if(numero1 < numero2) {
           System.out.println("a nossa condução é verdadeira");
       }

       System.out.println("numeroUm é igual a numeroDois?" + SimNao);

       SimNao = numero1 != numero2;

       System.out.println("numeroUm é diferente a numeroDois?" + SimNao);

       SimNao = numero1 > numero2;

    }

}
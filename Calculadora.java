package Repositorio_POO.atividade01;

public class Calculadora {
    
    int numA, numB;

    int somar(){
        return numA + numB;
    }
    int subtrair(){
        return numA - numB;
    }
    int multiplicar(){
        return numA * numB;
    }
    double dividir(){
        return (double) numA / numB;
    }

    boolean verificar_primo(int n){

        if(n <= 1){
            return false;
        }

        if (n != 2 && n % 2 == 0){
            return false;
        }

        return true;
    }






}

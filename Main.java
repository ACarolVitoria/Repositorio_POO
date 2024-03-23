package Repositorio_POO.atividade01;

public class Main {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        calc.numA = 2;
        calc.numB = 3;


        System.out.println("Soma:"+calc.somar());
        System.out.println("subtração:"+calc.subtrair());
        System.out.println("multiplicação:"+calc.multiplicar());
        System.out.println("dividir:"+calc.dividir());

        System.out.println("0:"+calc.verificar_primo(0));
        System.out.println("1:"+calc.verificar_primo(1));
        System.out.println("2:"+calc.verificar_primo(2));
        System.out.println("3:"+calc.verificar_primo(3));
        System.out.println("7:"+calc.verificar_primo(7));
        System.out.println("83:"+calc.verificar_primo(83));
        System.out.println("100:"+calc.verificar_primo(100));
        System.out.println("991:"+calc.verificar_primo(991));
        System.out.println("104729:"+calc.verificar_primo(104729));
        System.out.println("14348907:"+calc.verificar_primo(14348907));
    }
}

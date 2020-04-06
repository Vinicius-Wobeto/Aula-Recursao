import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Recursao recursao = new Recursao();
        int a [] = {1,2,3};
        //1
        System.out.println("Questão 1: "+recursao.fatorial(6));
        //2
        System.out.println("Questão 2: "+recursao.fibbonaci(5));
        //3
        System.out.println("Questão 3: "+recursao.somaInteiros(10));
        //4
        System.out.println("Questão 4: "+recursao.somaInteirosPares(10));
        //5
        System.out.println("Questão 5: "+recursao.somaArray(a,0));
        //6
        recursao.inverterArrayR(a);
        System.out.println("Questão 6: "+Arrays.toString(a));
        //7
        System.out.println("Questão 7: "+recursao.inverterString("Meu nome é Vinicius Wobeto Sperb"));

    }
}

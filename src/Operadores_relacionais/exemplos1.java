package Operadores_relacionais;

public class exemplos1 {
    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.60;
        char c1 = 'k';
        char c2 = 'y';
        String s1 = "fulano";
        String s2 = "fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 3997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 = " + (i1 == i2)); //false
        System.out.println("i1 != i2 = " + (i1 != i2)); //true
        System.out.println("i1 > i2 = " + (i1 > i2));  //false
        System.out.println("i1 <= i2 = " + (i1 <= i2)); //true

        System.out.println(" ");

        System.out.println("f1 == f2 = " + (f1 == f2)); //false
        System.out.println("f1 != f2 = " + (f1 != f2)); //true
        System.out.println("f1 >= f2 = " + (f1 >= f2)); //true
        System.out.println("f1 < f2 = " + (f1 < f2)); //false

        System.out.println(" ");

        System.out.println("c1 == c2 = " + (c1 == c2)); //false
        System.out.println("c1 != c2 = " + (c1 != c2)); //true
        System.out.println("c1 > c2 = " + (c1 > c2));  //false / pode comparar tamanho visto que na linguagem de baixo nivel char é um código
        System.out.println("c1 <= c2 = " + (c1 <= c2)); //true

        System.out.println(" ");

        //similaridade
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1 == s3 = " + (s1 == s3));
        System.out.println("s1 != s2 = " + (s1 != s2));
        //tamanho
        //System.out.println(s3 >= s2); não pode perguntar se letras sao maior ou menor apesar de que poderia ver se estão com capslock kkk
        //System.out.println(s3 < s2); na video aula nao da pra enxergar, de qualquer forma, não pode perguntar se letras sao maior ou menor

        System.out.println(" ");

        System.out.println("b1 == b2 = " + (b1 == b2));
        System.out.println("b1 != b2 = " + (b1 != b2));
        //System.out.println(b1 > b2); nao pode perguntar se verdadeiro e falso sao maior ou menor..
        //System.out.println(b1 <= b2); nao pode perguntar se verdadeiro e falso sao maior ou menor..

        System.out.println(" ");

        System.out.println("i2 > f1 = " + (i2 > f1));
        System.out.println("d1 == h1 = " + (d1 == h1)); // tipos de dados diferentes porém são númericos
       // System.out.println(s2 != c1); // são tipos de dados diferentes, logo nao pode ser feita.
       // System.out.println(s3 != i1); // tipos de dados diferentes.

        System.out.println(" ");

        System.out.println("l1 == i2 = " + (l1 == i2));
        System.out.println("l2 >= i1 = " + (l2 >= i1));
        System.out.println("y1 != h1 = " + (y1 != h1));

    }
}

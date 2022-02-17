package Operadores_logicos;

import jdk.swing.interop.SwingInterOpUtils;

public class exemplos2 {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("CONJUNÇÃO");
        System.out.println("b1 && b2 é: " + (b1 && b2));
        System.out.println("b1 && b3 é: " + (b1 && b3));

        System.out.println(" ");

        System.out.println("DISJUNÇÃO");
        System.out.println("b2 || b3 é: " + (b2 || b3));
        System.out.println("b2 || b4 é: " + (b2 || b4));

        System.out.println(" ");

        System.out.println("DISJUNÇÃO EXCLUSIVA");
        System.out.println("b1 ^ b3 é: " + (b1 ^ b3));
        System.out.println("b4 ^ b1 é: " + (b4 ^ b1));

        System.out.println(" ");

        System.out.println("NEGAÇÃO");
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1))&& true " + (((i1 + i2) < (f2 - f1))&& true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

    }
}

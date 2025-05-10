package maumau;

import java.util.Scanner;

public class MAUMAU {

    public static void main(String[] args) {

        Scanner signo = new Scanner(System.in);
        String nome;
        int sexo, dia, mesNasci;

        System.out.println("Informe o seu nome:");
        nome = signo.nextLine();

        while (nome.length() <= 8) {
            System.out.println("O nome deve ter mais de 8 caracteres. Tente novamente:");
            nome = signo.nextLine();
        }

        System.out.println("Informe o seu sexo ( 1 - FEMININO, 2 - MASCULINO) Qualquer outro numero sera masculino:");
        sexo = signo.nextInt();

        String genero;

        if (sexo == 1) {
            genero = "Feminino";
        } else {
            genero = "Masculino";
        }

        System.out.println("Informe o dia do seu nascimento:");
        dia = signo.nextInt();

        if (dia > 1 && dia < 31) {

            System.out.println("Informe seu mes de nascimento:");
            mesNasci = signo.nextInt();
            if (mesNasci > 1 && mesNasci < 12) {

                System.out.println("Informe seu ano de nascimento:");
                int anoNasci = signo.nextInt();

                if (anoNasci > 1900 && anoNasci <= 2025) {
                    int idade = 2025 - anoNasci;

                    String signos = null;

                    if ((dia >= 21 && mesNasci == 3) || (dia <= 20 && mesNasci == 4)) {
                        signos = "Áries";
                    }

                    if ((dia >= 21 && mesNasci == 4) || (dia <= 20 && mesNasci == 5)) {
                        signos = "Touro";
                    }

                    if ((dia >= 21 && mesNasci == 5) || (dia <= 20 && mesNasci == 6)) {
                        signos = "Gemeos";
                    }

                    if ((dia >= 21 && mesNasci == 6) || (dia <= 21 && mesNasci == 7)) {
                        signos = "Cancer";
                    }

                    if ((dia >= 22 && mesNasci == 7) || (dia <= 22 && mesNasci == 8)) {
                        signos = "Leão";
                    }

                    if ((dia >= 23 && mesNasci == 8) || (dia <= 22 && mesNasci == 9)) {
                        signos = "Virgem";
                    }

                    if ((dia >= 23 && mesNasci == 9) || (dia <= 22 && mesNasci == 10)) {
                        signos = "Libra";
                    }

                    if ((dia >= 23 && mesNasci == 10) || (dia <= 21 && mesNasci == 11)) {
                        signos = "Escorpião";
                    }

                    if ((dia >= 22 && mesNasci == 11) || (dia <= 21 && mesNasci == 12)) {
                        signos = "Sagitário";
                    }

                    if ((dia >= 22 && mesNasci == 12) || (dia <= 20 && mesNasci == 1)) {
                        signos = "Capricórnio";
                    }

                    if ((dia >= 21 && mesNasci == 1) || (dia <= 19 && mesNasci == 2)) {
                        signos = "Aquario";
                    }

                    if ((dia >= 20 && mesNasci == 2) || (dia <= 20 && mesNasci == 3)) {
                        signos = "Peixes";
                    }

                    int numeroSorte = 1 + (int) (Math.random() * 99);

                    int numCor = 1 + (int) (Math.random() * 5);
                    String cor = "azul";

                    if (numCor == 1) {
                        cor = "vermelho";
                    } else if (numCor == 2) {
                        cor = "verde";
                    } else if (numCor == 3) {
                        cor = "preto";
                    } else if (numCor == 4) {
                        cor = "branco";
                    }

                    System.out.println("Sr.(a) " + nome + " nascido(a) em " + dia + "/" + mesNasci + "/" + anoNasci + " é do signo de " + signos + " Você tem " + idade + " anos. Seu número da sorte é " + numeroSorte + " e sua cor é " + cor);
                    signo.close();

                }
            }

        }
    }
}

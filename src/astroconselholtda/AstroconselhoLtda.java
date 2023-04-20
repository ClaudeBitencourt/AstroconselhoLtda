package astroconselholtda;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class AstroconselhoLtda {

    public static void main(String[] args) {
        //Entradas
        String nome, signo = "", cor;
        boolean erro = true; //Flag
        int sexo, diaN, mesN, anoN, idade, diaA, mesA, anoA;
        Scanner ler = new Scanner(System.in);

        //Datas atuais
        Calendar hoje = Calendar.getInstance();
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH);
        anoA = hoje.get(Calendar.YEAR);

        System.out.println("Qual é o seu nome?");
        nome = ler.nextLine();

        if (nome.length() < 8) {
            System.out.println("Mais de 8 caractéres necessários");
        }

        System.out.println("Seu sexo é masculino(1) ou feminino(outro)?");
        sexo = ler.nextInt();
        System.out.println("Que dia você nasceu?");
        diaN = ler.nextInt();

        if (diaN < 1 || diaN > 31) {
            System.out.println("Apenas dias entre 1 e 31!");
        } else {

            System.out.println("Que mês(numeral) você nasceu?");
            mesN = ler.nextInt();

            if (mesN < 1 || mesN > 12) {
                System.out.println("Apenas meses entre 1 e 12!");
            } else {

                System.out.println("Que ano você nasceu?");
                anoN = ler.nextInt();

                    if (anoN < 1940 || anoN > anoA) {

                        System.out.println("Somente de 1940 até o atual!");
                    } else {

                        idade = ((anoA * 365 + mesA * 12 + diaA) - (anoN * 365 + mesN * 12 + diaN)) / 365;

                        if (diaN >= 22 && diaN <= 31 && mesN == 12 || diaN >= 1 && diaN <= 20 && mesN == 1) {

                            signo = "Capricórnio";
                            System.out.println("Mensagem do dia: Você terá um dia de sorte!");
                            erro = false; //Flag

                        } else if (diaN >= 21 && diaN <= 31 && mesN == 1 || diaN >= 1 && diaN <= 19
                                && mesN == 2) {

                            signo = "Aquário";
                            System.out.println("Mensagem do dia: Tenha cuidado em suas decisões profissionais!");
                            erro = false;

                        } else if (diaN >= 20 && diaN <= 29 && mesN == 2 && anoN
                                % 4 == 0 || diaN >= 20 && diaN <= 28
                                && mesN == 2 && anoN % 4 != 0 || diaN >= 1 && diaN <= 20 && mesN == 3) {

                            signo = "Peixes";
                            System.out.println("Mensagem do dia: Siga em frente, sem olhar para atrás!");
                            erro = false;

                        } else if (diaN >= 21 && diaN <= 31 && mesN == 3 || diaN >= 1 && diaN <= 20
                                && mesN == 4) {

                            signo = "Áries";
                            System.out.println("Mensagem do dia: Não deixe suas emoções te controlarem!");
                            erro = false;

                        } else if (diaN >= 21 && diaN <= 30 && mesN == 4 || diaN >= 1 && diaN <= 20
                                && mesN == 5) {

                            signo = "Touro";
                            System.out.println("Mensagem do dia: Você vive somente uma vez!");
                            erro = false;

                        } else if (diaN >= 21 && diaN <= 31 && mesN == 5 || diaN >= 1 && diaN <= 20
                                && mesN == 6) {

                            signo = "Gêmeos";
                            System.out.println("Mensagem do dia: Tenha confiança em si mesmo!");
                            erro = false;

                        } else if (diaN >= 21 && diaN <= 30 && mesN == 6 || diaN >= 1 && diaN <= 21
                                && mesN == 7) {

                            signo = "Câncer";
                            System.out.println("Mensagem do dia: O coração é mole mas a casca é dura!");
                            erro = false;

                        } else if (diaN >= 22 && diaN <= 31 && mesN == 7 || diaN >= 1 && diaN <= 22
                                && mesN == 8) {

                            signo = "Leão";
                            System.out.println("Mensagem do dia: Preserve seu orgulho, porém cuide de seus relacionamentos!");
                            erro = false;

                        } else if (diaN >= 23 && diaN <= 31 && mesN == 8 || diaN >= 1 && diaN <= 22
                                && mesN == 9) {

                            signo = "Virgem";
                            System.out.println("Mensagem do dia: Você vale a pena, não se diminua!");
                            erro = false;

                        } else if (diaN >= 23 && diaN <= 30 && mesN == 9 || diaN >= 1 && diaN <= 22
                                && mesN == 10) {

                            signo = "Libra";
                            System.out.println("Mensagem do dia: Tire o dia para fazer uma boa ação!");
                            erro = false;

                        } else if (diaN >= 23 && diaN <= 31 && mesN == 10 || diaN >= 1 && diaN <= 21
                                && mesN == 11) {

                            signo = "Escorpião";
                            System.out.println("Mensagem do dia: Faça um ato romântico, esse é o dia para isso!");
                            erro = false;

                        } else if (diaN >= 22 && diaN <= 30 && mesN == 11 || diaN >= 1 && diaN <= 21
                                && mesN == 12) {

                            signo = "Sagitário";
                            System.out.println("Mensagem do dia: Tome cuidado com suas companhias!");
                            erro = false;

                        } else {
                            System.out.println("Data inválida!");

                        }

                        int numeroAleatorio;

                        Random gerador = new Random();
                        numeroAleatorio = gerador.nextInt(99);

                        Random random = new Random();
                        int nA = random.nextInt(9);

                        String mensagem = "";
                        switch (nA) {
                            case 1:
                                cor = "Azul";
                                break;
                            case 2:
                                cor = "Vermelho";
                                break;
                            case 3:
                                cor = "Preto";
                                break;
                            case 4:
                                cor = "Verde";
                                break;
                            case 5:
                                cor = "Amarelo";
                                break;
                            case 6:
                                cor = "Laranja";
                                break;
                            case 7:
                                cor = "Rosa";
                                break;
                            case 8:
                                cor = "Roxo";
                                break;
                            case 9:
                                cor = "Branco";
                                break;
                            default:
                                cor = "Marrom";
                        }

                        if (!erro) {

                            if (sexo == 1) {
                                System.out.println("Sr. " + nome + " , nascido no dia " + diaN + "-" + mesN
                                        + "-" + anoN + " é do signo de " + signo + ", você tem " + idade
                                        + " anos, seu nº da sorte é " + numeroAleatorio + " e sua cor " + cor);
                            } else {
                                System.out.println("Sra." + nome + ", nascida no dia " + diaN + "-"
                                        + mesN + "-" + anoN + ", é do signo de " + signo + ", você tem " + idade + " anos, seu nº da sorte é "
                                        + numeroAleatorio + " e sua cor " + cor);
                            }
                        }
                    }
                }
            }
        }

    }


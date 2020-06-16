package trabalho.aed;

import java.util.Scanner;

public class GUT {

    private int[] MultGut;
    private String[] Descricao;

    public void setTask() {
        Scanner t = new Scanner(System.in);
        Scanner t1 = new Scanner(System.in);

        System.out.print("Informe o número de tárefas que serão tratadas: ");
        int N = t.nextInt();

        this.MultGut = new int[N];
        this.Descricao = new String[N];

        for (int x = 0; x < N; x++) {

            System.out.println("Informe a descrição da tarefa: ");
            Descricao[x] = t1.nextLine();
            System.out.println("Informe o nível Gravidade (1 a 5): ");
            int gravidade = t.nextInt();
            System.out.println("Informe o nível Urgência (1 a 5): ");
            int urgencia = t.nextInt();
            System.out.println("Informe o nível Tendência (1 a 5): ");
            int tendencia = t.nextInt();

            MultGut[x] = gravidade * urgencia * tendencia;

        }

    }

    public void Ordernar() {

        int temporaria;
        String descricaoTemporaria;

        for (int ax = 0; ax < MultGut.length - 1; ax++) {
            for (int x = 0; x < MultGut.length - 1; x++) {
                if (MultGut[x] < MultGut[x + 1]) {
                    temporaria = this.MultGut[x];
                    MultGut[x] = MultGut[x + 1];
                    MultGut[x + 1] = temporaria;
                    descricaoTemporaria = Descricao[x];
                    Descricao[x] = Descricao[x + 1];
                    Descricao[x + 1] = descricaoTemporaria;
                }
            }
        }

        for (int x = 0; x < Descricao.length; x++) {
            System.out.println(x+"º : " + Descricao[x]);

        }

    }

}

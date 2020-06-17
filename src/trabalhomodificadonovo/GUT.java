package trabalhomodificadonovo;

import java.util.Arrays;
import java.util.Scanner;

public class GUT {

    public int[] MultGut;
    public String[] Descricao;

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

        int[] w = new int[MultGut.length];
        String[] dw = new String[Descricao.length];

        mergeSort(Descricao, dw, 0, Descricao.length - 1, MultGut, w, 0, MultGut.length - 1);
        System.out.println(Arrays.toString(MultGut));
        System.out.println(Arrays.toString(Descricao));

    }

    public static void mergeSort(String[] d, String[] dw, int iniciod, int fimd, int[] v, int[] w, int inicio, int fim) {

        if (inicio < fim && iniciod < fimd) {
            int meio = (inicio + fim) / 2;
            int meiod = (iniciod + fimd) / 2;
            mergeSort(d, dw, iniciod, meiod, v, w, inicio, meio);
            mergeSort(d, dw, meiod + 1, fimd, v, w, meio + 1, fim);
            merge(d, dw, iniciod, meiod, fimd, v, w, inicio, meio, fim);
        }
    }

    private static void merge(String[] d, String[] dw, int iniciod, int meiod, int fimd, int[] v, int[] w, int inicio, int meio, int fim) {

        for (int k = inicio; k <= fim; k++) {
            w[k] = v[k];
            dw[k] = d[k];
        }

        int i = inicio;
        int j = meio + 1;

        int id = iniciod;
        int jd = meiod + 1;

        for (int k = iniciod; k <= fimd; k++) {
            if (id > meiod) {
                d[k] = dw[jd++];
            } else if (jd > fimd) {
                d[k] = dw[id++];
            } else if (w[id] < w[jd]) {
                d[k] = dw[id++];
            } else {
                d[k] = dw[jd++];
            }

        }

        for (int k = inicio; k <= fim; k++) {
            if (i > meio) {
                v[k] = w[j++];
            } else if (j > fim) {
                v[k] = w[i++];
            } else if (w[i] < w[j]) {
                v[k] = w[i++];
            } else {
                v[k] = w[j++];
            }

        }

    }

}

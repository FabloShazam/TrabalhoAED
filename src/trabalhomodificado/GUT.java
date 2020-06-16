package trabalhomodificado;

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

    
    //https://www.youtube.com/watch?v=5prE6Mz8Vh0 _ Favor assistir esse video para entender melhor essa parte
    public int[] MergeSort(int[] vet, int inicio, int fim) {
        if (fim - inicio > 1) {
            int medio = (inicio + fim) / 2;
            MergeSort(vet, inicio, medio);
            MergeSort(vet, medio + 1, fim);
            Merge(vet, inicio, medio, fim);
        }
        return (vet);
    }

    private void Merge(int[] vet, int baixo, int medio, int alto) {
        int[] left = new int[medio];
        int[] right = new int[medio];
        for (int i = baixo; i <= medio; i++) {
            left[i] = vet[i];
            right[i] = vet[i + medio];
        }
        int top_right = 0;
        int top_left = 0;
        for (int aux = baixo; aux <= alto; aux++) {
            if (top_left >= left.length) {
                vet[aux] = right[top_right];
                top_right++;

            } else {

                if (top_right >= right.length) {
                    vet[aux] = left[top_left];
                    top_left++;
                } else {

                    if (left[top_left] < right[top_right]) {
                        vet[aux] = left[top_left];
                        top_left++;

                    } else {
                        vet[aux] = right[top_right];
                        top_right++;

                    }
                }
            }
        }
    }
}

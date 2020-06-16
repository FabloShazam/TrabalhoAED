package trabalhomodificado;

public class Main {

    public static void main(String[] args) {

        GUT instancia = new GUT();
        int[] teste = new int[10];
        teste[1] = 234;
        teste[2] = 16531;
        teste[3] = 12132;
        teste[4] = 4312;
        teste[5] = 2514;
        teste[6] = 222;
        teste[7] = 1;
        teste[8] = 8051;
        teste[9] = 10100;


       
        instancia.MergeSort(teste,0,10);
    }
}

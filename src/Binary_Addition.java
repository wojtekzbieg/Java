public class Binary_Addition {
    public static void main(String[] args) {
        int a = 1110010111;
        int b = 101;
        int reszta = 0;
        String lista_koncowa = "";

        int[] lista1 = new int[20];
        int[] lista2 = new int[20];
        int[] lista3 = new int[20];

        for (int i=19; i>0; i--) {
            lista1[i] = a % 2;
            a /= 10;

            lista2[i] = b % 2;
            b /= 10;
        }

//        for (int i : lista1) {
//            System.out.print(i);
//        }
//        System.out.println();
//        for (int i : lista2) {
//            System.out.print(i);
//        }

        for (int i=19; i>0; i--) {
            lista3[i] = (lista1[i] + lista2[i] + reszta) % 2;
            reszta = (lista1[i] + lista2[i] + reszta) / 2;
        }

        for(int i : lista3) {
            lista_koncowa += Integer.toString(i);
        }
        lista_koncowa = lista_koncowa.replaceFirst ("^0*", "");
        System.out.println(lista_koncowa);
    }
}

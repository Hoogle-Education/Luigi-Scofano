public class App {
    
    public static void swap(int[] vetor, int i , int j){
        int aux = vetor[j];
        vetor[j] = vetor[i];
        vetor[i] = aux;
    }

    public static void print(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    public static void bubble(int[] vetor){
        boolean swaped = false;

        // do...while = faz - confere - ...
        // while = confere - ... - faz

        do {
            swaped = false;
            //i<vetor.length - 1, pois nao precisamos ir 
            // ate o final do vetor e isso daria problema de borda
            for(int i=0; i<vetor.length-1; i++){ 
                if (vetor[i] > vetor[i+1]){
                    swap(vetor, i, i+1);
                    swaped = true;
                }
            }

            print(vetor);
        } while(swaped);
    }

    public static void selection(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            int pos_menor = i;

            // descobre a posicao do menor elemento
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[pos_menor]) {
                   pos_menor = j;
                }
            }

            swap(vetor, i, pos_menor);
        }
    }

    public static void mergeSort(int[] vetor) {
        int size = vetor.length;

        if(size == 1) {
            return;
        }
        
        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size-mid];

        for(int i=0; i < mid; i++) {
            left[i] = vetor[i];
        }

        for(int i=mid; i < size; i++) {
            right[i - mid] = vetor[i];
        }

        mergeSort(right);
        mergeSort(left);

        merge(vetor, left, right);
    }

    public static void merge(int[] vetor, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int leftId = 0, rightId = 0, vetorId = 0;

        // operador ++ antes: ++a, primeiro aumenta 1 depois retorna a
        // operador ++ depos: a++, primeiro retorna a depois aumenta 1 

        while(leftId < leftSize && rightId < rightSize) {
            if(left[leftId] < right[rightId])
                vetor[vetorId++] = left[leftId++];
            else
                vetor[vetorId++] = right[rightId++];
        }

        while(leftId < leftSize) {
            vetor[vetorId++] = left[leftId++];
        }

        while(rightId < rightSize) {
            vetor[vetorId++] = right[rightId++];
        }
    }

    public static void main(String[] args) throws Exception {
       
       int[] vetor = {5,6,3,1,4,9,7};
       mergeSort(vetor);
       
       System.out.println("--------");
       print(vetor);
    }
}

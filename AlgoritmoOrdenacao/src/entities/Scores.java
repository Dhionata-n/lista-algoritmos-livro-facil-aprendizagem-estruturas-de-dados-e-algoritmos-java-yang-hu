package entities;

public class Scores {
    public static void sort(int [] arrays){ //Metodo para ordenar um vetor
        for (int i = 0; i < arrays.length-1; i++){ // laço pecorre o vetor até o ultimo valor valido
            boolean isSwap = false;
            for( int j = 0; j < arrays.length -i-1;j++){ //laço compara se o valor atual é maior que o proximo valor
                if(arrays[j]>arrays[j+1]){ // caso sim, é feito a troca
                    int temp = arrays[j]; // varial temporaria que recebe o valor atual
                    arrays[j] = arrays[j+1];// valor atual é sobrecrito com proximo valor
                    arrays[j+1] = temp;// proximo valor recebe o menor valor
                    isSwap = true; // laço continua
                }

            }
            if (!isSwap){ // negação de true laço continua, caso chegue aqui false negação de false é true laço para
                break;
            }

        }

    }
}

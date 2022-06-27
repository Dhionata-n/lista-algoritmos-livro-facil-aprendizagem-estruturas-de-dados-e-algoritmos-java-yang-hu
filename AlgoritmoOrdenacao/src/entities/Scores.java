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

    public static void sort2(int [] arrays){ //Segundo metodo para Ordenação
        for (int i = 0; i < arrays.length-1; i++){ // laço pecorre o vetor até o ultimo valor valido
            int minIdex = i; //Indice minimo
            for( int j = i+1; j < arrays.length;j++){ //laço sempre aponta para o proximo valor
                if(arrays[minIdex]>arrays[j]){ // laço compara se o valor atual é maior que os proximos valores
                    minIdex = j; // caso positivo minIdex recebe a posiçao do valor maior que o atual
                }

            }
            if (i!=minIdex){ // se for encontrado valor maior inicia a permuta
                int temp = arrays[i]; // varial temporaria que recebe o valor atual
                arrays[i] = arrays[minIdex];// valor atual é sobrecrito com valor maior
                arrays[minIdex] = temp;// proximo valor recebe o menor valor e repete o laço ate passar por todos os valores

            }

        }

    }
}

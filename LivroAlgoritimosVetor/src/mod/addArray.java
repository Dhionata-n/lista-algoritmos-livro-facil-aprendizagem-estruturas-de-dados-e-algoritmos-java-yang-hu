package mod;

public class addArray {
    // metodo para incluir um valor na ultima posição do vetor;
    public static int[] addEnd(int [] array, int valor){
        int[] tempArray = new int [array.length+1]; // criando um vetor temporario para receber os dados do vetor principal
        for (int i = 0; i<array.length;i++){
            tempArray[i]=array[i]; // copiando os dados do vetor principal para o temporario
        }
        tempArray[array.length]=valor; // adicionando o novo valor na ultima posição

        return tempArray; // retorno são os valores do vetor temporario
    }
    //metodo para incluir um valor na posição X do vetor
    public static int[] insert(int [] array, int valor, int insertIndex){
        int[] tempArray = new int [array.length+1]; // criando um vetor temporario para receber os dados do vetor principal
        for (int i = 0; i<array.length;i++){
            if(i<insertIndex){ // copiando os valores antes da posição que eu quero inserir o novo valor
            tempArray[i]=array[i];}
            else {
                tempArray[i+1]=array[i]; // copiando os valores restante
            }
            }
            tempArray[insertIndex] = valor; // inserindo o novo valor na posição desejada

        return tempArray;


    }

    public static int[] delete (int [] array,int insertIndex){
        int[] tempArray = new int [array.length-1]; // criando um vetor temporario menor que o vetor principal para receber os dados.
        for (int i = 0; i<array.length;i++){
            if(i<insertIndex){ // copiando os valores antes da posição que eu quero deletar
                tempArray[i]=array[i];}

            if(i>insertIndex){ // copiando os valores antes da posição que eu quero deletar
                tempArray[i-1]=array[i];}

        }
        return tempArray;
    }


}

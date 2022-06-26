import mod.addArray;

public class Main {
    public static void main(String[] args) {
      int [] array = {90, 70, 50, 80, 60, 85};
      array = addArray.addEnd(array,75);
        for(int i = 0; i< array.length;i++){
            System.out.print(array[i]+", ");

        }
        System.out.println();
        array = addArray.insert(array,120,6);

        for(int i = 0; i< array.length;i++){
            System.out.print(array[i]+", ");

        }
        System.out.println();
       array = addArray.delete(array,6);

        for(int i = 0; i< array.length;i++){
            System.out.print(array[i]+", ");

        }



    }
}
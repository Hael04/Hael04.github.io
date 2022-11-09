package parcial1.tarea4;

public class Cubica {
    public static void main(String args[]){

        double [] array = new double [21];

        int n = -10;
        int n1 = -10;

        for (int i = 0; i < array.length; i++){
            array [i] = n1;
            n1 ++;
        }

        System.out.println("---------------------");
        
        for (int i = 0; i < array.length; i++){
            array[i] = Math.pow(array[i], 3);
            System.out.println(n+" | "+array[i]);
            n++;
        }

        System.out.println("---------------------");
    }
}

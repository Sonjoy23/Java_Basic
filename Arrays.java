package JavaBasic;

public class Arrays {
    public static void main(String[] args) {
        // 1D array
        int [] array1D=new int[6];
        array1D[0]=5;
        array1D[1]=6;
        array1D[2]=7;
        array1D[3]=8;
        array1D[4]=9;
        array1D[5]=10;
        System.out.println("1D array");
        for(int i=0; i<6; i++){
            System.out.println(array1D[i]);
        }
        // 2D arrays
        System.out.println("2D array");
        int [][] array2D={{1,2,3,4,5}, {6,7,8,9,10}};
        for(int i=0; i<array2D.length; i++){
            for(int j=0; j<array2D[i].length; j++){
                System.out.print(" "+array2D[i][j]);

            }
            System.out.println();
        }



    }
}

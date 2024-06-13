package JavaBasic;

public class Loops {
    public static void main(String[] args) {
        // this is for loop
        System.out.println("For loop");
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        //this is  while loop
        System.out.println("While loop");
        int n=1;
        while (n<=10){
            System.out.println(n);
            n++;
        }
        //Do while loop
        System.out.println("Do while loop");
        int k=1;
        do{
            System.out.println(k);
            k++;
        }while (k<=10);

        //for-each loop
        System.out.println("This is for-each loop ");
        String[] array={"A","B","C","D","E"};
        for(String i:array){
            System.out.println(i);

        }

    }
}

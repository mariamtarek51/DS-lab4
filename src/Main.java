import java.util.Random;

public class Main {
    public static void main(String[] args ) {

        int[] S=new int[100];
        for (int i=0;i<100;i++) {
             S[i] = new Random().nextInt(50);
        }
        System.out.println("array : "+java.util.Arrays.toString(S) );

        // int S[] ={5,4,3,2,1,9,8,7,6};
     /*   Nsquaremethod n2=new Nsquaremethod(S);
        n2.hashtable();
        System.out.println("Re_building  O(n2): "+n2.getCollisions());
        n2.search(8);
        n2.search(15);
        n2.search(7);
        n2.search(6);
        n2.search(90);
        n2.search(200);
        System.out.println(n2.hashtablelength());*/
      Nmethod n1=new Nmethod(S);
        n1.FirstLevel();
        n1.search(9);
        n1.search(23);
    }
}

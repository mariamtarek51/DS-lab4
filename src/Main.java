public class Main {
    public static void main(String[] args ) {
        System.out.println("helllo");
        int S[] ={5,4,3,2,1,9,8,7,6};
        Nsquaremethod n2=new Nsquaremethod(S);
        n2.hashtable();
        System.out.println(n2.getCollisions());
        System.out.println(n2.search(8));
        System.out.println(n2.search(15));
        System.out.println(n2.search(7));
        System.out.println(n2.search(6));
        System.out.println(n2.search(90));
        System.out.println(n2.search(200));


    }
}

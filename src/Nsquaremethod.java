import java.util.Random;

public class Nsquaremethod {
    int collision = 0;
    Matrixmethod m ;
    int [][]finalh;
    int [] hashTable;

    int[]s;
    int b;
    int n;
    public Nsquaremethod(int []arr){
        this.s=arr;
        this.n=arr.length*arr.length;
        this.b=(int) Math.ceil(Math.log(s.length) / Math.log(2));  //hash length
         m=new Matrixmethod(n,b);


    }


    public void hashtable(){


        boolean Collision = true;

        while(Collision){

            hashTable=new int[n];
            int h[][]=m.createH();  //random h




            for (int i = 0; i < s.length; i++) {
                int x[]=m.createx(this.s[i]);

                int index= m.index(h,x) % hashTable.length;


                if(hashTable[index] == 0) { //no collision
                    hashTable[index] =this.s[i];
                    if (i == s.length - 1) {

                        Collision = false;
                        finalh=h;

                    }

                }
                else{

                    Collision = true;
                    collision++;

                    break;
                }
            }
        }




        }

        public boolean search(int key){

        int []x=m.createx(key);
        int index=m.index(finalh,x);
        if(hashTable[index % hashTable.length]==key){
            System.out.println(key+ " is found at index :"+index %hashTable.length);
            return true;
        }
            System.out.println(key+ " is not found ");

            return false;
        }

        public int getCollisions(){
        return this.collision;
        }










}

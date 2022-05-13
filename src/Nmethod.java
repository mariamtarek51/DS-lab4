import java.util.ArrayList;

public class Nmethod {
    Nsquaremethod NNmethod;
    int[] GivenArray;
    int[][] HArray;
    int[] XArray;
    int[][] SubhashTable;
    Nsquaremethod[] subTable;
    ArrayList<Integer> Chain;
    int b,n,sum=0;
    Matrixmethod GeneratedMatrixHX;


    public  Nmethod(int []Arr){
        this.subTable=new Nsquaremethod[Arr.length];
         this.GivenArray=Arr;
        this.n=Arr.length*Arr.length;
        this.b=(int) Math.ceil(Math.log(this.GivenArray.length) / Math.log(2));  //hash length
        GeneratedMatrixHX=new Matrixmethod(n,b);
    }
    public void FirstLevel(){
        ArrayList[] FirstHash=new ArrayList[this.GivenArray.length];
        HArray=this.GeneratedMatrixHX.createH();

        for(int i=0;i<this.GivenArray.length;i++){
            XArray=this.GeneratedMatrixHX.createx(this.GivenArray[i]);
            int value=this.GeneratedMatrixHX.index(HArray,XArray)%FirstHash.length;
            if(FirstHash[value]==null){
                FirstHash[value]=new ArrayList();
            }
            FirstHash[value].add(GivenArray[i]);
        }
        for (int i = 0; i < FirstHash.length; i++) {
            if (FirstHash[i] != null) {
                sum += (FirstHash[i].size() * FirstHash[i].size());
            }
        }
       secondLevel(FirstHash);
        System.out.println("Total spaces:"+ sum);
    }
    public void secondLevel(ArrayList[] firstHash){
        SubhashTable=new int[subTable.length][];
        for(int k=0;k<firstHash.length;k++) {
            System.out.println("Hash " +k+": "+ java.util.Arrays.toString(new ArrayList[]{firstHash[k]}));
        }
        //int k=0;
        ArrayList<int[]> HashTables=new ArrayList<>();
       for(int j=0;j< firstHash.length;j++){

           if (firstHash[j] != null && firstHash[j].size() != 0) {
               System.out.println("size of chain at index "+j+": "+firstHash[j].size());
                int[] chain=new int[firstHash[j].size()];

               for(int i=0;i<firstHash[j].size();i++){
                   chain[i]=(int)firstHash[j].get(i);
               }
               //HashTables.add(chain);
               NNmethod=new Nsquaremethod(chain);
               NNmethod.hashtable();
               System.out.println("Re_build times for hash "+j+":"+NNmethod.getCollisions());
               HashTables.add(NNmethod.hashTable);
               SubhashTable[j]=NNmethod.hashTable;
               subTable[j]=NNmethod;
              // System.out.println("Hashtable of each one: "+java.util.Arrays.toString(HashTables.get(k)) );
               //k++;
           }
       }
       //System.out.println("Counter :"+HashTables.size());
        }
    public boolean search(int key){

        int index=this.GeneratedMatrixHX.index(this.HArray,this.GeneratedMatrixHX.createx(key));
        if (this.subTable[index % this.subTable.length] != null) {

            return (this.subTable[index  % this.subTable.length].search( key));
        }
        return false;
    }

}

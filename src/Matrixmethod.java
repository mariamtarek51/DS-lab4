import java.util.Random;

public class Matrixmethod {
    int b;
    int n;

    public Matrixmethod(int tablelength,int b){
        this.n=tablelength;
        this.b=b;

    }


    public int[] createx(int elementvalue){
        int []x =new int[32];

        int i = 0;
        while (elementvalue > 0)
        {
            // storing remainder in binary array
            x[i] = elementvalue % 2;
            elementvalue = elementvalue / 2;
            i++;
        }


        return x;

    }
    public int[] hxmatrix(int h[][],int x[] ){
        int hxmatrix[]=new int[this.b];


        for (int i = 0; i < this.b; i++) {
            for (int j = 0; j < 32; j++) {
                if (h[i][j] * x[j] == 1) {
                    hxmatrix[i] = 1;
                    break;
                }


            }


        }

        return hxmatrix;
    }
    public int index(int [][]h,int []x){

        int[] result=hxmatrix(h,x);
        int index=0;
        for (int i = 0; i < this.b; i++) {
            index += result[i] * Math.pow(2, i);
        }

        return index;

    }
    public int [][] createH(){
        int [][]h=new int [this.b][32];
        Random r = new Random();
        for (int i = 0; i < this.b; i++) {
            for (int j = 0; j < 32; j++) {
                int x = r.nextInt(3);
                if (x % 2 == 0) h[i][j] = 0;
                else h[i][j] = 1;
            }
        }


        return h;

    }









}

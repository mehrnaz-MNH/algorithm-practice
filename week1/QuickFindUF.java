package week1;
import java.util.Arrays;

public class QuickFindUF {
    private int[] id;

    // set id of each object to itself
    public QuickFindUF(int N){
        id = new int[N];
        for(int i = 0 ; i < N ; i++){
            id[i] = i ;
        }
    }
    // check if p and q are in the same component
    public boolean connected(int p , int q){
        return id[p] == id[q];
    }

    // change all the entities with id[p] into id[q]

    public void union(int p , int q){

        int pid = id[p];
        int qid = id[q];
        for(int i = 0 ; i < id.length ; i++){
            if(id[i] == pid) id[i] = qid;
        }

    }

    public String toString(){
        return  Arrays.toString(id);
    }

    public static void main(String arg[]){

        QuickFindUF Uf = new QuickFindUF(5);

        Uf.union( 2 ,  3);

        System.out.println(Uf);




    }

}

package Recurtion;
public class TowerOfhanoi {

    public static void towerOfhanai(int n,String src, String helper,String dest){
if (n==1){
    System.out.println("trasfer dist "+n+" from "+src+" to "+dest);
    return;
}
        towerOfhanai(n-1,src,dest,helper);
        System.out.println("trasfer dist "+n+"from "+src+"to "+dest);
        towerOfhanai(n-1,helper,src,dest);
    }


    public static void main(String[] args) {
        int n =1;
        towerOfhanai(n,"s","h","D");
    }

}

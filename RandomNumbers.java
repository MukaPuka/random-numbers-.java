

public class RandomNumbers{
    public static void main (String[] args){
        int a = (int)(Math.random()*24);
        System.out.println("es ist "+a+" Uhr");
        int b=11, c = 18, d=23, e=4;
        if (a<b && a>=e){
            System.out.println("Guten Morgen");
        }else if(a>=b && a<c){
            System.out.println("Guten Tag");
        }else if (a>=c && a<d){
        System.out.println("GutenAbend");
        }else 
        System.out.println("Gute Nacht");
    }
}
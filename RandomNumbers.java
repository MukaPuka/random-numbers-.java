public class RandomNumbers{
    public static void main (String[] args){
        int a = (int)(Math.random()*24);
        System.out.println("es ist "+a+" Uhr");
        int b=18;
        if (a<b){
            System.out.println("Guten Morgen");
        }else
        System.out.println("GutenAbend");


    }
}
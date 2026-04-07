public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6+1);

        if (num>5){
            System.out.println("6");
        }
        else{
            System.out.println("5이하");
        }
    }
}

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        int score2 = switch(grade){
            case "A" -> 100;
            case "B" -> {
                yield 100 - 20;
            }
            default -> 60;
        };
        System.out.println(score2);
    }
}

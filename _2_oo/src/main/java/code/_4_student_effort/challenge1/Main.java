package code._4_student_effort.challenge1;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Doroftei", 100, 25);
        Fighter f2 = new Fighter("Rocky", 100, 25);
        BoxingMatch match = new BoxingMatch(f1, f2);

        System.out.println(match.fight());
    }
}

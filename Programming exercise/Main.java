import java.util.HashMap;

public class Main {

    public static StudentSubmission findWinner(HashMap<Integer,StudentSubmission> hashMap) {
            StudentSubmission winner = null;
            for(StudentSubmission sub : hashMap.values()) {
                if(winner == null || sub.getRating() > winner.getRating()) {
                    winner = sub;
                }
            }
            System.out.println("winner is " + winner.getName());
            return winner;
    }
    public static void main(String[] args) throws Exception {

        HashMap<Integer,StudentSubmission> hashmap = new HashMap<>();

        String s = Read.getFile("C:\\Users\\HP\\Desktop\\Aleeza OOPS VS CODE\\Definition Grading\\Programming exercise\\src\\definition.txt");
        String p = Read.getFile("C:\\Users\\HP\\Desktop\\Aleeza OOPS VS CODE\\Definition Grading\\Programming exercise\\src\\definition2.txt");

        StudentSubmission s1 = new StudentSubmission("aleeza",6015);
        StudentSubmission s2 = new StudentSubmission("john",6012);

        hashmap.put(s1.getRollNo(),s1);
        hashmap.put(s2.getRollNo(),s2);

        String[] a = s1.tokenize(s);
        String[] b = s2.tokenize(p);

        s1.countTerms(a);
        s2.countTerms(b);

        s1.calculateRating();
        s2.calculateRating();

        System.out.println(s1);
        System.out.println(s2);

        findWinner(hashmap);


        //System.out.println(s1.calculateCategory());
    }
}

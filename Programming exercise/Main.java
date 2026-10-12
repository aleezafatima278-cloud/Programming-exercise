public class Main {
    public static void main(String[] args) throws Exception {
        String s = Read.getFile("C:\\Users\\HP\\Desktop\\Aleeza OOPS VS CODE\\Definition Grading\\Programming exercise\\src\\definition.txt");
        

        StudentSubmission s1 = new StudentSubmission("aleeza");
        String[] a = s1.tokenize(s);
        System.out.println(s1.countTerms(a));
        s1.calculateRating();
        System.out.println(s1);
    }
}

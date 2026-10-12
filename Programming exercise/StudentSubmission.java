public class StudentSubmission extends ProgrammingLibrary {
    private String name;
    private double score;
    private int count;
    private double rated;

    public StudentSubmission(String name) {
        this.name = name;
        this.count = 0;
        this.score = 0;
        this.rated = 0;
    }

    public String[] tokenize(String txt) {
        String[] stringArray = txt.split("\\W+");
        return stringArray;
    }

    public double calculateRating() {
        if(this.count == 0) {
            return 0;
        }
        double a = (this.score / (this.count * 10.0)) * 10;
        this.rated = a;
        return this.rated;
    }

    public double getScore() {
        return this.score;
    }

    public int countTerms(String[] a) {
        this.count = 0;
        this.score = 0;
        boolean[] visited = new boolean[ProgrammingLibrary.predefined.length];
        for(int i=0;i<ProgrammingLibrary.predefined.length;i++) {
            String word = ProgrammingLibrary.predefined[i];
            for(int j= 0; j< a.length;j++) {
                if(word.equalsIgnoreCase(a[j]) && !visited[i]) {
                    visited[i] = true;
                    this.score += ProgrammingLibrary.rating[i];
                    this.count++;
                    break;
                }
            }

        } 
        return this.count;
    }

    public String toString() {
        String s = "" + this.name + " has used " + this.count + " Programming terms in their definition, Score:  " + this.score + " Rating: " + this.rated + " / 10";
        return s;
    }
}



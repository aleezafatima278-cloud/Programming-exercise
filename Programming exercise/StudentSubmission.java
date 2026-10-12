public class StudentSubmission extends ProgrammingLibrary {
    private String name;
    private double score;
    private int count;
    private double rated;
    private int rollNo;

    public StudentSubmission(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.count = 0;
        this.score = 0;
        this.rated = 0;
    }

    public int getRollNo() {
        return this.rollNo;
    }
    public int getCount() {
        return this.count;
    }
    public String getName() {
        return this.name;
    }
    public double getRating() {
        return this.rated;
    }

    public String[] tokenize(String txt) {
        String[] stringArray = txt.split("\\W+");
        return stringArray;
    }

    public double calculateRating() {
        this.rated = (this.score / ProgrammingLibrary.maxScore) * 10;
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
        String s = "" + this.name + " has used " + this.count + " Programming term/terms in their definition, Score:  " + this.score + " Rating: " + this.rated + " / 10";
        return s;
    }

    public String calculateCategory() {
        if(this.rated >= 7.0) {
            return "Category: Excellent";
        } else {
            if(this.rated >= 4.0 && this.rated < 7.0) {
                return "Category: Good";
            }
        }
        return "Category: Basic";

        
    }
}



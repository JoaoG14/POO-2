public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    
    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    
    public boolean isApproved() {
        return finalGrade() >= 60.0;
    }
    
    public double missingPoints() {
        if (isApproved()) {
            return 0.0;
        }
        return 60.0 - finalGrade();
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("NOTA FINAL = %.2f%n", finalGrade()));
        
        if (isApproved()) {
            result.append("PASS");
        } else {
            result.append("FAILED\n");
            result.append(String.format("FALTARAM %.2f PONTOS", missingPoints()));
        }
        
        return result.toString();
    }
} 
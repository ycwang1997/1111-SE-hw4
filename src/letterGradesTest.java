import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class letterGradesTest {
    @Test
    public void TestEquivalencePartitioning() {
        assertEquals('A', letterGrades.letterGrade(90));
        assertEquals('B', letterGrades.letterGrade(80));
        assertEquals('C', letterGrades.letterGrade(70));
        assertEquals('D', letterGrades.letterGrade(60));
        assertEquals('F', letterGrades.letterGrade(50));
        assertEquals('X', letterGrades.letterGrade(-1));
        assertEquals('X', letterGrades.letterGrade(101)); 
    }

    @Test
    public void TestBoundaryValueAnalysis(){
        assertEquals('A', letterGrades.letterGrade(100));
        assertEquals('A', letterGrades.letterGrade(90));
        assertEquals('B', letterGrades.letterGrade(89));
        assertEquals('B', letterGrades.letterGrade(80));
        assertEquals('C', letterGrades.letterGrade(79));
        assertEquals('C', letterGrades.letterGrade(70));
        assertEquals('D', letterGrades.letterGrade(69));
        assertEquals('D', letterGrades.letterGrade(60));
        assertEquals('F', letterGrades.letterGrade(59));
        assertEquals('F', letterGrades.letterGrade(0));
        assertEquals('X', letterGrades.letterGrade(-1));
        assertEquals('X', letterGrades.letterGrade(101)); 
    }
}
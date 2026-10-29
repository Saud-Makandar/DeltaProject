package OOPS_Practical;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int size;
        int[] mrks ;
        StudentData(int s){
            mrks = new int [s];
        }
    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(3);
        StudentData s2 = new StudentData(5);
        s1.mrks[0]=89;
        s1.mrks[1]=89;
        s1.mrks[2]=89;
    }
}

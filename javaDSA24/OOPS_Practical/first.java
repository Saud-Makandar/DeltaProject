package OOPS_Practical;

public class first {
    public static class Student{// here we are creating a new data type
        String name;
        int rno;
        double percentage;
    }
    public static void main(String[] args) {
     Student x = new Student();
     //we use dot operators to set the values
        x.name="Saud";
        x.rno=23;
        x.percentage=99.9;
        System.out.println("Student name is "+x.name+" and his roll no is "+x.rno+" and has scored "+x.percentage+" pointer in his third sem" );
    }
}

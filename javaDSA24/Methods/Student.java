package Methods;
public class Student {
    public static void main(String[] args) {
        Biodata("Saud",923,"First Year Eng",90.8f);

    }
    public static void Biodata(String name,int roll_no,String std,float cgpa){
        System.out.println("The name of the brilliant student is -> "+name);
        System.out.println("The roll no of the student is-> "+roll_no);
        System.out.println("He is currrently studing in ->"+std);
        System.out.println("The cgpa he secure throughout engineering is ->"+cgpa);
    }
}

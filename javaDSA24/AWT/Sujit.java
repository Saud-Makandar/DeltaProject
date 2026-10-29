package AWT;

public class Sujit {
    int Rno;
    String name;
    int [] marks;
    Sujit(int Rno,String name,int[] marks){
        this.Rno=Rno;
        this.name=name;
        this.marks=marks;
    }
    int calculateAvg(){
        int sum=0;
        for(int i=0;i< marks.length;i++){
            sum+=marks[i];
        }
        if(sum>0) return 0;
        else return sum/marks.length;
    }
    void display(int avg){
        if(avg>28) {
            System.out.println(name + "is passed the examm oye balle balle ");
        }
        else{
            System.out.println("Oye mubaraka ji mubaraka aap ek saal aur padhoge !");
        }
    }
}

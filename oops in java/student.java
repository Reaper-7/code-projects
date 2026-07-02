//static variable
class student{
    static String college ="ABC college";
    String name;
    student(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name+""+college);
    }
}
class main{
    public static void main(String args[]){
        student s1= new student("john");
        student s2=new student("lion");
        s1.display();
        s2.display();
    }
}
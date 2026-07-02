interface flybabe{
    void fly();

}
class Bird implements flybabe{
    public void fly(){
        System.out.println("flying");
    }
}
class main{
    public static void main(String args[]){
        Bird b = new Bird();
        b.fly();
    }
}

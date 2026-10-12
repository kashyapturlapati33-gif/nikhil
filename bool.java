public class bool {
    int id;
    boolean available;
    void issue(){
        if(available){
            available=false;
            System.out.println("issued"+id);
        }
        return;
    }
    void return1(){
        available=true;
         System.out.println("returned");
        return;
    }
    void display(){
        System.out.println(id);
         System.out.println(available);
    }
}
class demo{
    public static void main(String args[]){
        bool s1=new bool();
        s1.id=1;
        s1.available=true;
         bool s2=new bool();
        s2.id=2;
        s2.available=true;
         bool s3=new bool();
        s3.id=1;
        s3.available=true;
        bool s[]=new bool[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;
        s[0].issue();
        s[0].display();
    }
}

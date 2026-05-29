package OOPS;

class StudentDetails{
    private String name;
    private int age;
    private String College;
    private String rollNo;
    private String branch;

    public String  getName(){
        return name;

        
    }

    public void setName(String name){
        this.name=name;
    }


}

public class Encapsulation {
    public static void main(String [] args){
        StudentDetails obj = new StudentDetails();
        String set = obj.setName("Harsha Vardhan N");
        String Name = obj.getName();
        System.out.println(Name);

    }
    
}

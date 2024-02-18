
class Human {
    String name ;
    int age;
Human(String name,int age){
    this.name=name;//differentiates the local varivale(parameter variables) withinstance variables
  //this.age is a instance variable
    this.age=age;
}
void display(){
    System.out.println("name"+this.name+"age is"+age);
}    
}

 class Employee extends Human {
        double salary;
        Employee(String name,int age,double salary){
            super(name,age);
            this.salary=salary;
        }    
        void display(){
            super.display();
            System.out.println("and his salary is"+salary);
        }
}
class Manager extends Employee{
    Manager(String name,int age,double salary){
        super(name,age,salary);
    }
    void display(){
        super.display();
    }
}
class superclass {
    public static void main(String[] args) {
        Manager m=new Manager("suyog", 21,100000);
        m.display();
    }
}

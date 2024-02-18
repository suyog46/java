class Address {
    String zone, district, city;

    Address(String a, String b, String c) {
        zone = a;
        district = b;
        city = c;
    }

    void display() {
        System.out.println("zone =" + zone + " district =" + district + " city =" + city);
    }
}

class Person {
    String name;
    int age;

    Person(String a, int b) {
        name = a;
        age = b;
    }

    void display() {
        System.out.println("name:" + name + "\n age:" + age);
    }
}

class Employee extends Person {
    String department;
    Address address;//compositon which defines it as a has a relaioinship

    Employee(String a, int b, String c, Address d) {
        super(a, b);//passing parameters to the parent class constructor
        department = c;
        address = d;
    }

    void display() {
        super.display();
        address.display();
        System.out.println("department: " + department);
    }
}

class Test {

    public static void main(String[] args) {
        Address add = new Address("mechi", "jhapa", "dhulabari");
        Employee E = new Employee("suyog", 27, "it", add);//passing object as a atribute 
        //to employyee class constructor 
        E.display();
    }
}

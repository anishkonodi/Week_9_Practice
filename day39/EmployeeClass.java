//Write a Java class called Employee that has fields for the employee's name and salary. Write a custom Comparator implementation called SalaryComparator that sorts Employee objects in descending order based on their salary. Then, modify the Employee class to implement the Comparable interface, so that Employee objects are sorted in ascending order based on their name. Test your implementation by creating a list of Employee objects and sorting them using both the SalaryComparator and the Comparable implementation.


import java.util.*;
class Employee implements Comparable<Employee>{
 String name;
 double salary;
  Employee(String name,double salary){
    this.name=name;
    this.salary=salary;
  }
  public int compareTo(Employee e1){
    return name.compareTo(e1.name);
  }
}
class SalaryComparator implements Comparator<Employee>{
  public int compare(Employee e1,Employee e2){
    if(e1.salary>e2.salary){
      return 1;
    }
    else if(e1.salary<e2.salary){
      return -1;
    }
    else{
      return 0;
    }
  }
}
class EmployeeClass{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Employee> worker=new ArrayList<Employee>();
    for(int i=0;i<3;i++){
      worker.add(new Employee(s.next(),s.nextDouble()));
    }
   System.out.println("Sorted based on salary");
    Collections.sort(worker,new SalaryComparator());
    for(Employee e:worker){
      System.out.print(e.name+" "+e.salary);
      
    }
    System.out.println("Sorted based on name");
    Collections.sort(worker);
    for(Employee e:emp){
      System.out.print(e.name+" "+e.salary);
  }
}
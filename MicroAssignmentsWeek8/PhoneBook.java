/*
 * 4. Phonebook: Create a class called Phonebook that stores a collection of
 * phone numbers and names in an array. Implement a method that uses linear
 * search algorithm to search for a name based on the phone number and another
 * method that uses binary search algorithm to search for a phone number based
 * on the name.
 */
import java.util.*;
class PhoneBook {
    long phNumber;
    String name;
    int dataInside = 0;
    PhoneBook arr[] = new PhoneBook[5];
    Scanner sc=new Scanner(System.in);

    public void storeData(String name, long phNumber) {
        PhoneBook p = new PhoneBook();
        p.name = name;
        p.phNumber = phNumber;
        arr[dataInside] = p;
        dataInside++;
    }
    
    public void searchName(){
        System.out.println("Enter PHone Number :");
        long num=sc.nextLong();
        int count=0;
        for(int i=0;i<arr.length;i++){
            PhoneBook pb = (PhoneBook) arr[i];
            if(pb.phNumber==num){
                System.out.println("name : "+pb.name);
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("not found");
        }
    }
    
    public void searchNum(){
        System.out.println("Enter Name :");
        String nm=sc.nextLine();
        int count=0;
        for(int i=0;i<arr.length;i++){
            PhoneBook pb = (PhoneBook) arr[i];
            if(pb.name==nm){
                System.out.println("name : "+pb.name+" number : "+pb.phNumber);
                count++;
            }
        }
        if(count>0){
            System.out.println("not found");
        }
    }
    
    public void show() {
        for (int i = 0; i < dataInside; i++) {
            PhoneBook pb = (PhoneBook) arr[i];
            System.out.println(pb.name + " : " + pb.phNumber);
        }
    }

}

public class Assignment{
    public static void main(String[] args) {
        PhoneBook p = new PhoneBook();
        p.storeData("imad", 963258741);
        p.storeData("sab", 9658741);
        p.storeData("imad sab", 9632581);
        p.show();
    }
}
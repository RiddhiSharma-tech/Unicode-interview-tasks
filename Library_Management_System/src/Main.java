import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        int choice =0;

        while(choice !=3){

            System.out.println("Enter 1 - for section 1\nEnter 2 - for Section 2 : ");
            choice =obj.nextInt ();

            if (choice == 1){
                Section1 obj1=new Section1();
                System.out.println("Enter student's name : ");
                obj1.name=obj.nextLine();obj1.name=obj.nextLine();
                System.out.println("Enter Sap id : ");
                obj1.sap_id=obj.nextLine();
                System.out.println("Enter the User id : ");
                obj1.uid=obj.nextLine();
                System.out.println("Semester : ");
                obj1.sem=obj.nextInt();

                obj1.getData(obj1.name, obj1.uid, obj1.sap_id, obj1.sem);
                obj1.setData();
            }
            
            else if(choice ==2){
                Section2 obj2=new Section2();

                obj2.Physics();
                obj2.Mathematics();
                obj2.Chemistry();

            }
        }


    }

}

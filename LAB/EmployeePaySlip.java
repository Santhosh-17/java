
import java.util.Scanner;
class Employee
{
    Scanner scan = new Scanner(System.in);
    String Emp_name , address , mail;
    int id, mobile ;
    double Da,Hra,Pf,Fund,Gross,net;
    void  getdata()
    {
        System.out.println("Enter Employee Name and Employee id:");
        Emp_name = scan.next();
        id = scan.nextInt();
        System.out.println("Enter address and mail id: ");
        scan.nextLine();
        address = scan.nextLine();
        mail = scan.next();
      
    }
    void calc(double bp)
    {
        Da = 0.97 * bp;
        Hra = 0.1 * bp;
        Pf = 0.12 *bp ;
        Fund = (0.1/100)*bp;
        Gross = Da+Hra+bp;
        net = Gross -(Pf+Fund);
    }
    void print()
    {
        System.out.println("|-----------------------PAY SLIP--------------------------|");
        System.out.println("Name of the Employee      : "+Emp_name);
        System.out.println("Employee Id               : "+id);
        System.out.println("Address of the Employee   : "+address);
        System.out.println("Mail Id of an Employee    : "+mail);
        System.out.println("Gross pay of an Employee  : "+Gross );
        System.out.println("Net Salary of an Employee : "+net);
        System.out.println("|--------------------------------------------------------|");
    }
}
class Programmer extends Employee {
    double bp;
}
class Assistant extends Employee {
    double bp;
}
class Associate extends Employee {
    double bp;
}
class Professor extends Employee {
    double bp;
}
        
        

public class EmployeePaySlip {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt;
        while(true){
        System.out.println("Menu\n1.Programmer\n2.Assistant Professor\n3.Associate Professor\n4.Profeesor\n5.exit\nEnter your choice:");
        opt = scan.nextInt();
        switch(opt)
        {
            case 1 : Programmer P = new Programmer();
                     System.out.println("Enter Basic Salary of Programmer:");
                     P.bp = scan.nextDouble();
                     P.getdata();
                     System.out.println("Pay Slip of an Programmer :\n");
                     P.calc(P.bp);
                     P.print();
                     break;
            case 2 : Assistant A = new Assistant();
                     System.out.println("Enter Basic Salary of Assistant Professor:");
                     A.bp = scan.nextDouble();
                     A.getdata();
                     System.out.println("Pay Slip of an Assistant Professor :\n");
                     A.calc(A.bp);
                     A.print();
                     break;
            case 3 : Associate a  = new Associate();
                     System.out.println("Enter Basic Salary of Associate Professor:");
                     a.bp = scan.nextDouble();
                     a.getdata();
                     System.out.println("Pay Slip of an Associate Professor :\n");
                     a.calc(a.bp);
                     a.print();
                     break;
            case 4 :Professor p = new Professor();
                     System.out.println("Enter Basic Salary of Professor:");
                     p.bp = scan.nextDouble();
                     p.getdata();
                     System.out.println("Pay Slip of  Professor :\n");
                     p.calc(p.bp);
                     p.print();
                     break;
            case 5 :System.exit(0);break;
            default:System.out.println("Invalid Number!1");
            
        }
        }

    }
    
}

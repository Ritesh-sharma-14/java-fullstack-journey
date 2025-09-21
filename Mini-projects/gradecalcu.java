
import java.util.*;

public class gradecalcu {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int total=0;

        System.out.println("Enter subjects marks:");
        for(int i=1;i<5;i++){
            System.out.println("Subject"+i+":");
            int marks=sc.nextInt();
            total+=marks;;
        }
        double avg=total/5.0;
        char grade;

        if(avg>=90) grade='A';
        else if(avg>=75) grade='b';
        else if(avg>=50) grade='C';
        else grade='F';

        System.out.println("Total marks:"+total);
        System.out.println("Average marks:"+avg);
        System.out.println("Grade:"+grade);
    }
}

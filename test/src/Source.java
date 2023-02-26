import java.util.*;
public class Source {

    public static void main(String[] args) {

        int marks[];
        marks= new int[5];
        Scanner input= new Scanner(System.in);
        marks[0]=input.nextInt();
        marks[1]=input.nextInt();
        marks[2]=input.nextInt();
        marks[3]=input.nextInt();
        marks[4]=input.nextInt();
        int rollNo, output;
        rollNo=input.nextInt();
        output= marks[rollNo];

        System.out.println("The student with roll number"+rollNo +"has scored"+output+"marks");
    }
}

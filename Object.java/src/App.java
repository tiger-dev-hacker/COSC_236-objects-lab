import java.util.*; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in); 
       
        // Asking the user to create a new object
        Student Student1 = new Student(); 

        System.out.println("Enter the name of a student:");
        Student1.FirstName = input.nextLine(); 

        System.out.println("Enter the GPA of a student:");
        Student1.GPA = input.nextDouble(); 

        System.out.println("Enter the Student ID of a student:");
        Student1.studentID = input.nextInt(); 

        System.out.println(Student1.FirstName + " is currently a student at Towson University, their GPA is"+ Student1.GPA + ", their studentID is" + Student1.studentID + "." );

        //Asking for information of five students
        Student[] Students = new Student[5];
        
        Students[0]= Student1;

        for(int i = 1; i < Students.length  ; i++ )
        {
            Student student = new Student(); 

            System.out.println("Enter the name of the " + i + "student:");
            student.FirstName = input.next(); 
    
            System.out.println("Enter the GPA of the" + i + "student:");
            student.GPA = input.nextDouble(); 
    
            System.out.println("Enter the Student ID of a" + i +  "student:");
            student.studentID = input.nextInt(); 
        
            Students[i] = student; 
        }   
        
        //Printing out all the student information 
        for (int a = 0 ; a < Students.length; a++)
        {
            System.out.println(" Student Name :" + Students[a].FirstName);
            System.out.println(" Student GPA :" + Students[a].GPA);
            System.out.println(" Student ID :" + Students[a].studentID);
        }


        //Finding the highest GPA 
        double hstudentGPA = Students[0].GPA;
        String hstudentName = Students[0].FirstName; 
        for (int b = 0; b < Students.length; b++)
        {
            if (Students[b].GPA > Students[0].GPA)
            {
                hstudentGPA = Students[b].GPA;
                hstudentName= Students[b].FirstName; 
            }
        }
        System.out.println("The student with the highest GPA is" + hstudentName + "and their GPA is" + hstudentGPA + "." );
        
        // FInd the lowest GPA
        double lstudentGPA = Students[0].GPA;
        String lstudentName = Students[0].FirstName; 
        for (int c = 0; c < Students.length; c++)
        {
            if (Students[c].GPA < Students[0].GPA)
            {
                lstudentGPA = Students[c].GPA;
                lstudentName= Students[c].FirstName; 
            }
        }
        System.out.println("The student with the lowest GPA is" + lstudentName + "and their GPA is" + lstudentGPA + "." );
        

        //Finding the average of all GPAs
        double gSum = 0 ; 
        double counter = 0; 
        double AvgGpa = 0; 
        for (int d =0; d < Students.length; d++)
        {
            gSum= gSum + Students[d].GPA; 
            counter++; 
        }

        AvgGpa = gSum/ counter ; 

        System.out.println("The average GPA of students is" + AvgGpa + "."); 
}

}

public class gradeCalculation{

    public static void main(String[]args){
        int marks = 250;

        if(marks <= 100){
            
            if(marks >= 80){
                String text = "The grade is A";
                System.out.println(text);
                System.out.println("Congrats!");
            }
            else if(marks >= 70){
                System.out.println("The grade is B");
            }
            else if (marks >= 40){
                System.out.println("The grade is C");
            }

            else System.out.println("You have Failed in the exam.");
        }
        else{
            System.out.println("Invalid Input of Marks. Try something less than 100.");
        }
    }
}
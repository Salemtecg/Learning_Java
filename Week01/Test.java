package week_1;

public class Test{
//make a list of floats, cal the sum in another variable and print out the avr
    public static void main(String[] args){
       float[] numbers = {23.8f,45,67.7f};
       float sum = 0;
       for(int i=0;i<numbers.length;i++){
           sum += numbers[i];
           
        }
        
    System.out.println("The numbers are:");
       for(int i=0;i<numbers.length;i++){
         System.out.print(numbers[i]+ ", ");

       }
       System.out.print("\n");
       float avarage = sum/numbers.length;
        System.out.println("The sum is this " +sum);
        System.out.println("The avarage is this "+ avarage);

    }


}
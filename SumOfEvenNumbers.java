public class SumOfEvenNumbers {
    public static void main(String[] args){
    int num = 1;  
    int sum = 0;    

    while (num <= 100) {
        if (num % 2 == 0){
            sum += num;
        }
        num++;
    }        

        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
    }


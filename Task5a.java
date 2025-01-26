import java.util.Scanner;
class Task5a {
	public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number");
	int x=obj.nextInt(); //int x =4
	if(x%2 ==0){
	System.out.println("The number is even");
    }else{
        System.out.println("The number is Odd");
    }
	}
}
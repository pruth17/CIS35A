/*
 * Pruthvirajsinh Punwar
 * CIS 35A 63Z Online Section
 * LAB 1 Part 2
 * 1/20/19
 * 1/20/19
 */


import java.util.Scanner;

public class Loan 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // input scanner
		
		double loan_amount, interest_rate; // declaring the variables
		int years;
		
		System.out.printf("Enter the amount: ");
		loan_amount = input.nextDouble(); // gets the loan amount
		
		System.out.printf("Enter the number of years: ");
		years = input.nextInt(); // gets the year

		System.out.printf("Enter the interest rate: ");
		interest_rate = input.nextDouble(); // gets the interest
		
		double monthly_rate = interest_rate / 1200.0; // calculates monthly rate
        input.close();

		double monthlyPayment = loan_amount * monthly_rate / (1 - 1 / Math.pow(1 + monthly_rate, years * 12));
        // calculates monthly payment
		
		System.out.printf("\n");
		System.out.printf("Monthly Payment: ");
		System.out.printf("%.2f", monthlyPayment);

		double totalPayment = monthlyPayment * years * 12; // calculates total payment
		
		System.out.printf("\n");
		System.out.printf("Total Payment is: ");
		System.out.printf("%.2f", totalPayment);
		System.out.printf("\n");
		System.out.printf("\n");

		System.out.printf("Payment#    Interest    Principal    Balance");
		System.out.printf("\n");

		for (int i = 1; i <= years * 12; i++)  // loop to print the data
		{
			double interest = monthly_rate * loan_amount;
			double principal = monthlyPayment - interest;
			loan_amount -= principal;
			if (interest < 10) 
			{
				System.out.printf("%-14d %-9.2f %-13.2f %-8.2f\n", i, interest, principal, loan_amount);

			} 
			else
				System.out.printf("%-13d %-10.2f %-12.2f %-7.2f\n", i, interest, principal, loan_amount);
		}

	}

}

/* Test Run
 *  Enter the amount: 10000
Enter the number of years: 1
Enter the interest rate: 7

Monthly Payment: 865.27
Total Payment is: 10383.21

Payment#    Interest    Principal    Balance
1             58.33      806.93       9193.07
2             53.63      811.64       8381.42
3             48.89      816.38       7565.05
4             44.13      821.14       6743.91
5             39.34      825.93       5917.98
6             34.52      830.75       5087.24
7             29.68      835.59       4251.65
8             24.80      840.47       3411.18
9             19.90      845.37       2565.81
10            14.97      850.30       1715.51
11            10.01      855.26       860.25 
12             5.02      860.25        0.00    
**************************************************
Enter the amount: 20000
Enter the number of years: 3
Enter the interest rate: 12

Monthly Payment: 664.29
Total Payment is: 23914.30

Payment#    Interest    Principal    Balance
1             200.00     464.29       19535.71
2             195.36     468.93       19066.78
3             190.67     473.62       18593.17
4             185.93     478.35       18114.81
5             181.15     483.14       17631.67
6             176.32     487.97       17143.70
7             171.44     492.85       16650.86
8             166.51     497.78       16153.08
9             161.53     502.76       15650.32
10            156.50     507.78       15142.54
11            151.43     512.86       14629.68
12            146.30     517.99       14111.69
13            141.12     523.17       13588.52
14            135.89     528.40       13060.12
15            130.60     533.69       12526.43
16            125.26     539.02       11987.41
17            119.87     544.41       11443.00
18            114.43     549.86       10893.14
19            108.93     555.35       10337.79
20            103.38     560.91       9776.88
21            97.77      566.52       9210.36
22            92.10      572.18       8638.18
23            86.38      577.90       8060.28
24            80.60      583.68       7476.59
25            74.77      589.52       6887.07
26            68.87      595.42       6291.66
27            62.92      601.37       5690.29
28            56.90      607.38       5082.90
29            50.83      613.46       4469.45
30            44.69      619.59       3849.86
31            38.50      625.79       3224.07
32            32.24      632.05       2592.02
33            25.92      638.37       1953.66
34            19.54      644.75       1308.91
35            13.09      651.20       657.71 
36             6.58      657.71        0.00    
 ************************************************
Enter the amount: 200
Enter the number of years: 1
Enter the interest rate: 5

Monthly Payment: 17.12
Total Payment is: 205.46

Payment#    Interest    Principal    Balance
1              0.83      16.29         183.71  
2              0.77      16.36         167.36  
3              0.70      16.42         150.93  
4              0.63      16.49         134.44  
5              0.56      16.56         117.88  
6              0.49      16.63         101.25  
7              0.42      16.70         84.55   
8              0.35      16.77         67.78   
9              0.28      16.84         50.94   
10             0.21      16.91         34.03   
11             0.14      16.98         17.05   
12             0.07      17.05         -0.00   



*/


public class cgpa {
	
	double cgpa = calculateCGPA(3.4,3.5,3.6,3.5);
			
public double calculateCGPA(double a, double b, double c, double d) {
		
	double sum = a+b+c+d;
	double finalcgpa = sum / 4 ;
	return finalcgpa ;
	}

}

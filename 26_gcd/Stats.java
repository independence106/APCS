/*
Jason Zhou (Roster: Nina Jiang, John Gupta-she Duckies: Miss Alpaca, Tiggy, Po)
APCS
HW26: GCD Three Ways (added GCD in 3 ways)
2021/10/27
Time spent: 12 minutes

DISCO: ? operand and while = ew
Q: N/A
Algo: Our algorithm takes in two numbers, a and b, and first checks 
      if a is not b, is b is a multiple of a or if a is a multiple of b.
      Then, it sets assigns the values of a and b to variables olda and oldb
      to hold values. It reassigns a's value to the minimun of olda and oldb,
      and sets b to the absolute value of oldb minus olda. By doing this, the 
      algorithm can ignore order as inputs a, b and b, a. A will always be assigned
      the least of the two and etc. After conditions are satisfied, the minimum of a 
      and b is returned.
      
*/
public class Stats {

	public static int mean(int a, int b) {
		int mean = ((a + b)/2);
		return mean;
	}

	public static double mean(double a, double b) {
		double mean = ((a+b) * 1.0) /2.0;
		return mean;
	}

	public static int max(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static double max(double a, double b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			return a;
		} else {
			return b;
                }
	}

	public static int geoMean(int a, int b) {
        int num = a * b;
        int lowbound = max(a, b) - Math.abs(a - b);
        int ans = 0;
        while (lowbound * lowbound <= num) {
            ans = lowbound;
            lowbound++;
        }
        return ans;
		
	}

	public static double geoMean(double a, double b) {
		double geoMean = Math.pow((a*b), 1/2);
		return geoMean;
	}

	public static int max(int a, int b, int c) {
        return max(max(a, b), max(b, c));
	}

	public static double max(double a, double b, double c) {
        return max(max(a, b), max(b, c));
	}

	public static int geoMean(int a, int b, int c) {
        int num = a * b * c;
        int lowest = max(a, b, c) - max(Math.abs(a - b), Math.abs(a - c), Math.abs(b - c));
        int ans = 0;
        while (lowest * lowest * lowest <= num) {
            ans = lowest;
            lowest++;
        }
        return ans;
	}
	
	public static double geoMean(double a, double b, double c) {
        return Math.pow((a*b*c), 1/3);
	}
    public static int min(int a, int b) {
        //epic way
        return (a >= b) ? b: a;
        
        /* normal way
        if (a >= b) {
            return b;
        } 
        return a;
        */
    }
    public static int gcd(int a, int b) {
        //no epic way :(
        int counter = 1;
        int gcd = 1;
        while (counter < min(a, b)) {
            if (a % counter == 0 && b % counter == 0) {
                gcd = counter;
            }
            counter++;
        }
        return gcd;
        
    }
    public static int gcdER(int a, int b) {
        //epic way
        return (a == b) ? a: gcdER(min(a, b), Math.abs(b - a));
        
        /* normal way
        if (a == b) {
            return a;
        }
        return gcdER(min(a, b), Math.abs(b - a));
        */

    }
    public static int gcdEW(int a, int b) {
        //no epic way :(((
        int olda;
        int oldb;
        while (a != b || a % b != 0 || b % a != 0) {
            olda = a;
            oldb = b;
            a = min(olda, oldb);
            b = Math.abs(oldb - olda);
        }
        return min(a, b);
    }
	//main method for testing functionality
	public static void main( String[] args ) {
        System.out.println(geoMean(3, 7, 8));
	}

}


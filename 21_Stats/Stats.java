/*
Jason Zhou (Roster: Nina Jiang, John Gupta-she Duckies: Miss Alpaca, Tiggy, Po)
APCS
HW21: STAtisTically Speaking... (Wrote Stats.java)
2021/10/20

DISCO: N/A
Q: Is parsing allowed
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

	//main method for testing functionality
	public static void main( String[] args ) {
        System.out.println(geoMean(3, 7, 8));
	}

}//end class
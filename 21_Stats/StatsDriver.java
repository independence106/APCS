public class StatsDriver {
	public static void main(String [] args){
		
		
		System.out.println(Stats.mean(10, 20)); //15
		System.out.println(Stats.mean(10, -6)); //2
		System.out.println(Stats.mean(-10, -6)); //-8
		System.out.println(Stats.mean(3, 3)); // 3
		System.out.println(Stats.mean(0, 3)); // 1.5 will return 1
		System.out.println(Stats.mean(1, 1)); // 1
		
		
		System.out.println(Stats.mean(10.10, 20.20)); //15.15
		System.out.println(Stats.mean(-10.10, 20.20)); //5.05
		System.out.println(Stats.mean(-10.10, -20.20)); //-15.15
		System.out.println(Stats.mean(0, 0)); // 0.0
		System.out.println(Stats.mean(3.0, 0.0)); // 1.5
		System.out.println(Stats.mean(3.4, 3.4)); // 3.4
		
		System.out.println(Stats.max(40, 50)); //50
		System.out.println(Stats.max(40, -50)); //40
		System.out.println(Stats.max(40, 40)); //40
		System.out.println(Stats.max(0, 1)); //1
		
		
		System.out.println(Stats.max(40.40, 50.50)); //50.50
		System.out.println(Stats.max(40.40, -50.50)); //40.40
		System.out.println(Stats.max(-10.0, 0.0)); // 0.0
		System.out.println(Stats.max(1.0, 1.0)); // 1.0
		
		System.out.println(Stats.geoMean(9, 16)); //12
		System.out.println(Stats.geoMean(9, -16)); //12i however, error square root -1
		System.out.println(Stats.geoMean(21, 42)); //29.69848481 - will return 29
		System.out.println(Stats.geoMean(0, 0)); // 0
		System.out.println(Stats.geoMean(0, 4)); // 0
		System.out.println(Stats.geoMean(3, 3)); //3
		
		System.out.println(Stats.geoMean(21.21, 42.42)); //29.99546966
		System.out.println(Stats.geoMean(21.21, -42.42)); //error square root -1
		System.out.println(Stats.geoMean(0.0, 0.0)); // 0.0
		System.out.println(Stats.geoMean(0.0, 4.0)); // 0.0
		System.out.println(Stats.geoMean(3.0, 3.0)); // 3.0
	}
	
}
package cs207project;

public class Benchmark {
	public static long measureExecutionTime(Runnable algorithm) {
		long start = System.nanoTime();
		algorithm.run();
		long end = System.nanoTime();
		return end - start;
	}
	
}

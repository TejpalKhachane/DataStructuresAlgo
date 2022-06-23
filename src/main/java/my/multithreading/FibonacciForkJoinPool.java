package my.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

public class FibonacciForkJoinPool {
	
	// try dynamic programming with fork join pool, if possible
	public static void main(String[] args) throws InterruptedException, ExecutionException {		
		System.out.println(new FibonacciForkJoinPool().new Fibonacci(50).compute());
	}
	
	private class Fibonacci extends RecursiveTask<Integer> {
		private static final long serialVersionUID = 1L;
		final int n;

		Fibonacci(int n) {
			this.n = n;
		}
		
		@Override
		protected Integer compute() {
			if (n <= 1) {				
				return 1;
			}
			
			Fibonacci f1 = new Fibonacci(n - 1);
			f1.fork();

			Fibonacci f2 = new Fibonacci(n - 2);
			f2.fork();
			
			return f2.join() + f1.join();
		}
	}
}

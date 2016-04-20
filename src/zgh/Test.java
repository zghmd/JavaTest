package zgh;

import com.google.common.util.concurrent.RateLimiter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RateLimiter rateLimiter = RateLimiter.create(10);
		rateLimiter.acquire();
		
		System.out.println("hello");
	}

}

package day02.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// 부가 업무 (시간 측정)
		long start = System.currentTimeMillis();
		
		// 주업무 부르기 (invocation - 주업무)
		Object result = invocation.proceed();
		
		// 부가 업무 (시간 측정)
		long end = System.currentTimeMillis();
		
		long duration = end - start;
		
		String message = duration + "ms 걸렸습니다.";
		System.out.println(message);
				
		return result;
	}
	
}

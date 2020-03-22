# SpringBootAOP
ReadMe Notes:

To Start Application
	Navigate to com.company.zigatta.Application.java Right click on it and then Run As a Java Application. 
	
We used Spring APO concept called @Around.
We are printing Logger Statements before and after execution of given methods.


Please check sample logs below:

com.company.zigatta.aop.LoggingAspect    : Execution of DBServiceA.getData Starts

com.company.zigatta.aop.LoggingAspect    : Execution time of DBServiceA.getData Ends

com.company.zigatta.aop.LoggingAspect    : Execution time of DBServiceA.getData :: 12 ms

com.company.zigatta.aop.LoggingAspect    : Execution of HttpServiceB.sendMessage Starts

com.company.zigatta.aop.LoggingAspect    : Execution time of HttpServiceB.sendMessage Ends

com.company.zigatta.aop.LoggingAspect    : Execution time of HttpServiceB.sendMessage :: 7 ms

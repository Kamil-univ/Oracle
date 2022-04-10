package Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Date;

@Aspect
public class Logger {

    /**
     * If to be used, add @LogThis before intended method.
     * Logs method name, params, start time, end time and return type.
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(* *(..)) && @annotation(LogThis)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("~~~~~~~LOG~~~~~~~");
        System.out.println("[Invoked method] : "+methodName);

        String[] argNames = ((MethodSignature)joinPoint.getSignature()).getParameterNames();
        Object[] vals = joinPoint.getArgs();

        for(int i = 0 ; i < argNames.length ; i++){
            System.out.println("["+argNames[i]+"]"+vals[i].toString());
        }

        long startTimeStamp = new Date().getTime();

        System.out.println(startTimeStamp+"~~~~~~~~~METHOD EXECUTION>>");

        Object executionResult = joinPoint.proceed();

        long endTimeStamp = new Date().getTime();
        System.out.println(">>END OF EXECUTION~~~~~~~~"+endTimeStamp);
        if(executionResult!=null)
            System.out.println("[ReturnType]:"+executionResult.getClass().getSimpleName());
        else
            System.out.println("[METHOD HAS NO RETURN TYPE]");
        System.out.println("~~~~~~~~~~END OF LOG~~~~~~~~~");
        return executionResult;
    }

    /**
     * Wraps all methods in Oracle that returns a Service
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(oracle.Service+ oracle.Oracle.*(..))")
    public Object autoOracleLog(ProceedingJoinPoint joinPoint) throws Throwable {
        return log(joinPoint);
    }

}

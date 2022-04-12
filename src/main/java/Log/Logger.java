package Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;

import java.util.Date;

@Aspect
public class Logger {
    StringBuilder sb=new StringBuilder("Rapport : \n");

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
        sb.append(methodName+ "\n");
        System.out.println("~~~~~~~LOG~~~~~~~"+ "\n");
        sb.append("~~~~~~~LOG~~~~~~~"+ "\n");
        System.out.println("[Invoked method] : "+methodName);
        sb.append("[Invoked method] : "+methodName+ "\n");

        String[] argNames = ((MethodSignature)joinPoint.getSignature()).getParameterNames();
        sb.append(argNames+ "\n");
        Object[] vals = joinPoint.getArgs();

        for(int i = 0 ; i < argNames.length ; i++){
            System.out.println("["+argNames[i]+"]"+vals[i].toString());
            sb.append("["+argNames[i]+"]"+vals[i]+ "\n");
        }

        long startTimeStamp = new Date().getTime();

        System.out.println(startTimeStamp+"~~~~~~~~~METHOD EXECUTION>>");
        sb.append(startTimeStamp+"~~~~~~~~~METHOD EXECUTION>>"+ "\n");

        Object executionResult = joinPoint.proceed();

        long endTimeStamp = new Date().getTime();
        System.out.println(">>END OF EXECUTION~~~~~~~~"+endTimeStamp);
        sb.append(">>END OF EXECUTION~~~~~~~~"+endTimeStamp+ "\n");
        if(executionResult!=null){
            System.out.println("[ReturnType]:"+executionResult.getClass().getSimpleName());
            sb.append("[ReturnType]:"+executionResult.getClass().getSimpleName()+ "\n");
        }

        else{
            System.out.println("[METHOD HAS NO RETURN TYPE]");
            sb.append("[METHOD HAS NO RETURN TYPE]"+ "\n");
            System.out.println("~~~~~~~~~~END OF LOG~~~~~~~~~");
            sb.append("~~~~~~~~~~END OF LOG~~~~~~~~~"+ "\n");

        }


        PrintWriter printWriter = null;
        {
            try {
                printWriter = new PrintWriter("rapport.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Unable to locate the file .txt: " + e.getMessage());
            }
            Objects.requireNonNull(printWriter).println(sb);
            printWriter.close();
        }

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

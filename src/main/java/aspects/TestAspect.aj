package aspects;

public aspect TestAspect {
    void around(): call(void TestClass.testPrint()) {
        System.out.println("Log before...");
        proceed();
        System.out.println("After log...");
    }
}

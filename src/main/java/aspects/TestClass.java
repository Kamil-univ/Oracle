package aspects;

public class TestClass {
    public void testPrint(){
        System.out.println("Test message in a regular class");
    }


    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.testPrint();
    }
}

public class StaticCode {
    static String staticFiled = "World";

    static String staticMethod() {
        return "yay!";
    }

    String inFiled = "Hello";
    String inMenthod() {
        return inFiled + " " + staticFiled + " " + staticMethod();
    }


}

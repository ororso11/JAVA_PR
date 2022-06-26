public class FinalCode {
    static final String GREE_MES = "HELLO";
    static String stField = "Hello";

    static String stMethod() {
        return "yay!";
    }

    String insFiled = GREE_MES;

    String insMethod() {
        return insFiled + " " + stField + " " + stMethod();
    }


}

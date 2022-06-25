public class Main {
    public static void main(String[] args) {

        // 인스턴스 생성 제외 - 왜???
        // 자바 메모링 부분에서의 메소드 부분 적재
        System.out.println(StaticCode.staticFiled);
        System.out.println(StaticCode.staticMethod());

        StaticCode sc = new StaticCode();
        System.out.println(sc.inFiled);
        System.out.println(sc.inMenthod());

    }
}

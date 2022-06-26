import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 인스턴스 생성 제외 - 왜???
        // 자바 메모링 부분에서의 메소드 부분 적재
        //System.out.println(StaticCode.staticFiled);
        //System.out.println(StaticCode.staticMethod());

        //StaticCode sc = new StaticCode();
        //System.out.println(sc.inFiled);
        //System.out.println(sc.inMenthod());

        //System.out.println(FinalCode.GREE_MES);
        //System.out.println(FinalCode.stField);
        //System.out.println(FinalCode.stMethod());

        List<AbstractItem> list = new ArrayList();

        list.add(new FileItem("A"));
        list.add(new FileItem("B"));
        list.add(new FileItem("C"));

        DirectoryItem di = new DirectoryItem("n1",list);
        di.print("di");

        DirectoryItem di1 = new DirectoryItem("n2",list);
        di1.print("di1");

    }
}


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

        Foo foo = new DefaultFoo("Hello Foo!");
        System.out.println(foo.say());

        Object obj = new FooService("heloo");
        System.out.println(obj instanceof FooService);
        System.out.println(obj instanceof AbstractBaseServcie);
        System.out.println(obj instanceof BaseService);
        System.out.println(obj instanceof Integer);

        if(obj instanceof FooService) {
            FooService service = (FooService) obj;
            System.out.println(service.Say());
        }

        Integer a1 = 12345;
        Integer a2 = 12345;

        String a3 = "1";
        String a4 = "1";

        a1.equals(a2);
        a3.equals(a4);


        Task task = new Task(TaskType.PRIVATE, "buy milk");
        TaskType type = task.getType();

        switch (type) {
            case PRIVATE:
                System.out.println("Task[type = " + type + "]");
                break;
            case WORK:
                System.out.println("Task[type = " + type + "]");
        }



    }
}


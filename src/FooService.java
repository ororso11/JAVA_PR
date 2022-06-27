public class FooService extends AbstractBaseServcie{
    public FooService(String name) {
        super(name);
    }


    @Override
    public String Say() {
        return "Hello!!";
    }
}

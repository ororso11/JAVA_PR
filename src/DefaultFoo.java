public class DefaultFoo implements Foo{

    private String msg;

    public DefaultFoo(String mag) {
        this.msg = mag;
    }

    @Override
    public String say() {
        return msg;
    }
}

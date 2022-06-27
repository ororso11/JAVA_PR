public abstract class AbstractBaseServcie implements BaseService{
    // 인터페이스를 사용할대에 추상클래스에서 상속하라는 에러가 안나는 이유는
    // 추상클래스는 인터페이스의 자식이 아니기 때문이다.

    protected String name;

    public AbstractBaseServcie(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("1").append(1);
        return sb.toString();
    }

}

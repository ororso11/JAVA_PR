public class WrapperClassCode {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;

        System.out.println(max);

        int min = Integer.MIN_VALUE;

        System.out.println(min);

        // 기본형에서 래퍼 클래스로 변환할떄에 생성자를 통해 변환하는방법이있다.
        // valueOf메서드를 이용하는경우 -128~127의 범위라면 사전에 생성된 객체를 이용할 수 있기때문에 객체를 생성하지 않아 메모리 소비를 하지않는다.
        // HTTP를 통신으로 취득한 값이 int형일때에 0인지 초기값 0인지를 판별이 불가능하기 때문에 래퍼 클래스를 사용하는것이 좋다
        // 오토방식은 -128~127일때 자동적으로 오토방식이 일어나고 내부적으로는 valueOf()메소드가 실행이되어 정상적으로 사용이가능하나
        // 그외에 밖에 벗어나면 값이 틀려진다.
        // 이런식의 변수 선언은 싫지만 너무 졸립기 떄문에 일단 돌아가는지만 테스트 해보자



    }
}

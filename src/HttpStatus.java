public enum HttpStatus {
    OK(200), NOT_F(404), SERVER_ERO(500);

    private final int value;

    HttpStatus(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

}

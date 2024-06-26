package re;

public class Exception extends java.lang.Exception {
    private final int ERR_CODE;

    //에러 메세지(커스텀)
    public Exception(String message) {
        this(message,200);
    }

    // 에러 메세지(커스텀), 에러 코드(커스텀)
    public Exception(String message, int ERR_CODE) {
        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    // 에러코드 리턴
    public int getErrorCode() {
        return ERR_CODE;
    }
}

package api.mengkang.net;

public class Response {

    private int errorCode;
    private String errorMsg;
    private Object data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Response(int errorCode) {
        this.errorCode = errorCode;
        if (ErrorCode.ERROR_MESSAGE.containsKey(this.errorCode)) {
            this.errorMsg = ErrorCode.ERROR_MESSAGE.get(this.errorCode);
        }
    }

    public Response(Object data) {
        this.data = data;
    }

    public Response() {

    }
}

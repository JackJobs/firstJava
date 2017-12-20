package api.mengkang.net;

import java.util.HashMap;

public class ErrorCode {

    public static final int METHOD_CAN_NOT_BE_NULL = 1001;
    public static final int PARAMETER_CAN_NOT_BE_NULL = 1002;
    public static final int PARAMETER_INVALID = 1003;

    public static final HashMap<Integer, String> ERROR_MESSAGE = new HashMap<>();

    static {
        ERROR_MESSAGE.put(METHOD_CAN_NOT_BE_NULL, "method 不能为空");
        ERROR_MESSAGE.put(PARAMETER_CAN_NOT_BE_NULL, "参数不能为空");
        ERROR_MESSAGE.put(PARAMETER_INVALID, "参数无效");
    }
}

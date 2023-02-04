package 工厂模式;

/**
 * @author ruanxiangge
 * @date 2022/6/1 下午10:21
 * 支付方式枚举类
 */
public enum PayType {
    /**
     * 微信支付
     */
    WE_CHAT_PAY(1,"微信支付"),

    /**
     * 支付宝
     */
    AIL_PAY(2,"支付宝支付"),
    ;

    private final int code;
    private final String msg;

    PayType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

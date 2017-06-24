package cn.baoyi.enums;

/**
 * @Author:qijigui
 * @Description:
 * @Date: Created in 19:29 2017/6/28
 * @Modified By:
 */
public enum ResultEnum {

    SUCCESS(0, "成功"),
    UNKONW_ERROR(1, "未知错误"),
    SYSTEM_ERROR(2, "系统错误"),;


    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

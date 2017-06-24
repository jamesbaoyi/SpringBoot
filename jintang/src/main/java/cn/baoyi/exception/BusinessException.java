package cn.baoyi.exception;

import cn.baoyi.enums.ResultEnum;

/**
 * @Author:Administrator
 * @Description:
 * @Date: Created in 19:21 2017/6/28
 * @Modified By:
 */
public class BusinessException extends RuntimeException {

    private Integer code;

    public BusinessException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}

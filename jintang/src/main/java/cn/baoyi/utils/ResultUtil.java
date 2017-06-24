package cn.baoyi.utils;

import cn.baoyi.model.Result;

/**
 * @Author:Administrator
 * @Description:
 * @Date: Created in 19:35 2017/6/28
 * @Modified By:
 */
public class ResultUtil {

    /**
     * @Author: Administrator
     * @Date: 19:35 2017/6/28
     * @Method success
     * @Param object
     * @Return result
     * @Description: 成功了
     * @Modified By:
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * @Author: Administrator
     * @Date: 19:36 2017/6/28
     * @Method
     * @Param
     * @Return
     * @Description:
     * @Modified By:
     */
    public static Result success() {
        return success(null);
    }

    /**
     * @Author: Administrator
     * @Date: 19:36 2017/6/28
     * @Method
     * @Param
     * @Return
     * @Description:
     * @Modified By:
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}

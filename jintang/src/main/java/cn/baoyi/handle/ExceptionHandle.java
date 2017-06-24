package cn.baoyi.handle;

import cn.baoyi.enums.ResultEnum;
import cn.baoyi.exception.BusinessException;
import cn.baoyi.model.Result;
import cn.baoyi.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:qijigui
 * @Description:
 * @Date: Created in 19:02 2017/6/28
 * @Modified By:
 */
public class ExceptionHandle {


    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            return ResultUtil.error(businessException.getCode(), businessException.getMessage());
        } else {
            logger.error(ResultEnum.UNKONW_ERROR.getMsg(), e);
            return ResultUtil.error(ResultEnum.UNKONW_ERROR.getCode(), ResultEnum.UNKONW_ERROR.getMsg());
        }
    }
}

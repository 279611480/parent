package org.yun.common.util.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Result
 * @Description 结果返回
 * @Author 落笔丶
 * @Date 2020/11/8 10:50
 * @Tel 279611480@qq.com
 */
@SuppressWarnings({"ALL", "AlibabaLowerCamelCaseVariableNaming"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private Integer code;
    private String message;
    private Object data;


    /**
     * 请求成功的响应，不带查询数据（用于删除、修改、新增接口）
     *
     * @param code
     */
    private Result(ResultCode code) {
        this.code = code.code;
        this.message = code.message;
    }

    /**
     * 请求成功的响应，带有查询数据（用于数据查询接口）
     *
     * @param resCode
     * @param data
     */
    public Result(ResultCode resCode, Object data) {
        this.code = resCode.code;
        this.message = resCode.message;
        this.data = data;
    }


    public static Result success() {
        return new Result(ResultCode.SUCCESS);
    }

    public static Result error() {
        return new Result(ResultCode.SERVER_ERROR);
    }

    public static Result fail() {
        return new Result(ResultCode.FAIL);
    }

    public static Result fail_msg(ResultCode resCode, String msg) {
        return new Result(resCode, msg);
    }
}



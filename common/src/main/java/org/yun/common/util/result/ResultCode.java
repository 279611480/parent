package org.yun.common.util.result;


/**
 * @Author 落笔丶
 * @Description 返回码定义
 * @Date 2020/11/8 10:55
 * @Param * @param null
 * @return
 **/
public enum ResultCode {

    /**
     * SUCCESS:成功
     * FAIL：失败
     */
    SUCCESS(10000, "操作成功！"),
    //---系统错误返回码-----
    FAIL(10001, "操作失败"),
    UNAUTHENTICATED(10002, "您还未登录"),
    UNAUTHORISE(10003, "权限不足"),
    SERVER_ERROR(99999, "抱歉，系统繁忙，请稍后重试！");

    int code;
    String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

}


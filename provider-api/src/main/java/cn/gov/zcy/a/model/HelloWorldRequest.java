package cn.gov.zcy.a.model;

import java.io.Serializable;

/**
 * @author 水手
 * @since 2022/1/18 9:56 上午
 */
public class HelloWorldRequest implements Serializable {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

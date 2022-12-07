package cn.gov.zcy.a.model;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 水手
 * @since 2022/11/18 8:05 下午
 */
@NoArgsConstructor
@Getter
@Setter
public class HelloWorldResponse<T> implements Serializable {

    private String name;

    private String value;

    private T dto;
}

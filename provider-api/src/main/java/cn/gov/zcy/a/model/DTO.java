package cn.gov.zcy.a.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


/**
 * @author 水手
 * @since 2022/11/18 8:08 下午
 */
@Getter
@Setter
@NoArgsConstructor
public class DTO implements Serializable {

    private String dtoKey;
    private String dtoValue;
    private List<TO> list;
}

package cn.gov.zcy.a.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 水手
 * @since 2022/11/18 10:16 下午
 */
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class TO implements Serializable {


    private String t;

    private String value;
}

package cn.gov.zcy.a.service;

import cn.gov.zcy.a.model.HelloWorldRequest;
import cn.gov.zcy.a.model.HelloWorldResponse;
import cn.gov.zcy.a.model.Response;

import java.util.List;

/**
 * @author 水手
 * @since 2022/1/18 9:54 上午
 */
public interface HelloA {


    String helloWorld(HelloWorldRequest request);


    String helloWorld(String a, String b);


    Response<List<HelloWorldResponse>> helloWorld(Long a);

    String helloWorld(List<Long> b);
}

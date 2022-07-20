package com.msb.openfeignalibabaservice8888.feign;


import com.msb.cloudalibabacommons.entity.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("albaba-nacos-provider")
public interface OpenFeignClient {

    @RequestMapping("/get/{id}")
    public JsonResult getJson(@PathVariable("id") Long id);
}

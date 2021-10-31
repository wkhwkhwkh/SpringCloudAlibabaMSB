package com.tfb.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
//@Data：作用于类上，是以下注解的集合：
// @ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ApiModel("Person实体类")
public class Person {
    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty(value = "年龄",hidden = true)
    private int age;
}

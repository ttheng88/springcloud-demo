package com.liangsy.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liangsy
 * @desc
 * @date 2020/10/26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User",description = "用户实体")
public class User {

    @ApiModelProperty("用户ID")
    private int id;

    @ApiModelProperty("用户名称")
    private String useName;

    @ApiModelProperty("用户密码")
    private String password;

}

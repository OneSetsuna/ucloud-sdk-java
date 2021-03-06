package cn.ucloud.vpc.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取VPC信息 参数类
 * @author: codezhang
 * @date: 2018-09-21 14:15
 **/

public class DescribeVPCParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 业务组名称
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional VPCIds
     */
    private List<String> vpcIds;

    @UcloudParam("VPCIds")
    public List<Param> checkVpcIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (vpcIds != null) {
            int len = vpcIds.size();
            for (int i = 0; i < len; i++) {
                String id = vpcIds.get(i);
                if (id == null || id.length() <= 0){
                    throw new ValidationException("vpcIds["+i+"] can not be empty");
                }
                list.add(new Param("VPCIds."+i,id));
            }
        }
        return list;
    }

    public DescribeVPCParam( @NotEmpty(message = "region can not be empty") String region) {
        super("DescribeVPC");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<String> getVpcIds() {
        return vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }
}

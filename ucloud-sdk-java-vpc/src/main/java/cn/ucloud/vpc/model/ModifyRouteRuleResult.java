package cn.ucloud.vpc.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 19:38
 **/

public class ModifyRouteRuleResult extends BaseResponseResult {
    @Override
    public String toString() {
        return "ModifyRouteRuleResult{" +
                "retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

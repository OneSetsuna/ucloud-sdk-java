package cn.ucloud.unet.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @description: 更新防火墙 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/27 15:43
 */
public class UpdateFirewallResult extends BaseResponseResult {
    /**
     * 防火墙ID
     */
    @SerializedName("FWId")
    private String fwId;

    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }
}

package cn.ucloud.udisk.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 创建快照 结果类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/25 18:41
 */
public class CreateUDiskSnapshotResult extends BaseResponseResult {
    /**
     * 快照ID
     */
    @SerializedName("SnapshotId")
    private List<String> snapshotId;

    public List<String> getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(List<String> snapshotId) {
        this.snapshotId = snapshotId;
    }
}

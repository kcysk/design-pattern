package net.dp.fm.sfm;

/**
 * 发送服务接口
 * Created by shenke on 2017/2/27.
 */
public interface MsgSender {

    String SUCCESS = "1";
    String ERROR = "0";
    String FAIL = "2";

    String send(String msg);
}

package net.dp.fm.sfm;

/**
 * created by shenke 2017/2/27 12:42
 */
public class SmsSender implements MsgSender{
    public String send(String msg) {
        System.out.println("sms msg 已经发送");
        return SUCCESS;
    }
}

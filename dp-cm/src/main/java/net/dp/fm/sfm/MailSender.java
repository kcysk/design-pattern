package net.dp.fm.sfm;

/**
 * created by shenke 2017/2/27 12:40
 */
public class MailSender implements MsgSender{

    public String send(String msg) {
        System.out.println("msg 已经发送");
        return SUCCESS;
    }
}

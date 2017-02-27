package net.dp.fm.sfm;

/**
 * created by shenke 2017/2/27 12:44
 */
public class SendFactory {

    public MsgSender getSender(String type){
        switch (type){
            case "sms": return new SmsSender();
            case "mail": return new MailSender();
            default: return null;
        }
    }

    public static MsgSender getMailSender(){
        return new MailSender();
    }
}

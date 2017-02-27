package net.dp.fm.fmm;

import net.dp.fm.sfm.MailSender;
import net.dp.fm.sfm.MsgSender;

/**
 * created by shenke 2017/2/27 12:50
 */
public class MailSenderProvider implements Provider{

    @Override
    public MsgSender produce() {
        return new MailSender();
    }
}

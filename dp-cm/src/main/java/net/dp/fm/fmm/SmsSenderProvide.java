package net.dp.fm.fmm;

import net.dp.fm.sfm.MsgSender;
import net.dp.fm.sfm.SmsSender;

/**
 * created by shenke 2017/2/27 12:50
 */
public class SmsSenderProvide implements Provider {

    @Override
    public MsgSender produce() {
        return new SmsSender();
    }
}

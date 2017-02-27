package net.dp.fm.fmm;

import net.dp.fm.sfm.MsgSender;

/**
 * Created by shenke on 2017/2/27.
 */
public interface Provider {

    MsgSender produce();
}

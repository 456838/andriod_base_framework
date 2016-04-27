package com.salton123.base.views.dialog;

import android.app.Dialog;
import android.content.Context;

import com.salton123.base.R;

/**
 * User: 巫金生(newSalton@outlook.com)
 * Date: 2016/1/31 22:16
 * Time: 22:16
 * Description:
 */
public class DialogUtils extends Dialog {

    public DialogUtils(Context context) {
        super(context);
    }

    public DialogUtils(Context context, int theme) {
        super(context, R.style.white_dialog);
    }

    protected DialogUtils(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}

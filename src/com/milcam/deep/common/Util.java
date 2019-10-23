package com.milcam.deep.common;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    private static final Util ourInstance = new Util();

    static Util getInstance() {
        return ourInstance;
    }

    private Util() {
    }

    public static void showMessage(Context context, String msg) {
        Toast toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        View view = activity.getCurrentFocus();
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static String getUniqueValue() {
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddhhmmssSSS");
        return ft.format(new Date()) + (int) (Math.random()*10);
    }

    public static String size2String(Long filesize) {
        Integer unit = 1024;
        if (filesize < unit){
            return String.format("%d bytes", filesize);
        }
        int exp = (int) (Math.log(filesize) / Math.log(unit));

        return String.format("%.0f %sbytes", filesize / Math.pow(unit, exp), "KMGTPE".charAt(exp-1));
    }

    public static String getRootPath() {
        String sdPath;
        String ext1 = Environment.getExternalStorageState();
        if (ext1.equals(Environment.MEDIA_MOUNTED)) {
            sdPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            sdPath = Environment.MEDIA_UNMOUNTED;
        }
        return sdPath;
    }

}

package com.jc.rocoofixdemo;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import com.dodola.rocoofix.RocooFix;

import java.io.File;

/**
 * Created by solar on 2016/7/11.
 */
public class RocooApplication extends Application {
    private static final String APATCH_PATH = "/patch.jar";
    String patchFileString = Environment.getExternalStorageDirectory()
            .getAbsolutePath() + APATCH_PATH;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        RocooFix.init(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "patch.jar是否存在:"+new File(patchFileString).exists(), Toast.LENGTH_SHORT).show();
        RocooFix.applyPatch(this, patchFileString);
    }
}

package com.example.myappemptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);


       /* Toast toast = Toast.makeText(this,
                (String) checkCameraHardware(this), Toast.LENGTH_LONG);
        toast.show();*/


    }

    /**
     * Check if this device has a camera
     */
    /* comprobar si existe una cámara disponible en el tiempo de ejecución. */
    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }

    /**
     public static Camera2 getCameraInstance(){
     Camera c = null;
     try {
     c = Camera.open(); // attempt to get a Camera instance
     }s
     catch (Exception e){
     // Camera is not available (in use or does not exist)
     }
     return c; // returns null if camera is unavailable
     }*/
}
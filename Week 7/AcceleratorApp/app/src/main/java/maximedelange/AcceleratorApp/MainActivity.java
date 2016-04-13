package maximedelange.gps_locationmanager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener
{
    // Fields
    private Sensor accellerator;
    private SensorManager sensorManager;
    private TextView acceleration;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind the sensormanager tot the system service.
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        // Get the default sensor from the sensormanager and bind it to the accelerator sensor.
        accellerator = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        // Giving the sensor eventlistner, the sensor and the delay to the sensormanager listener
        sensorManager.registerListener(this, accellerator, sensorManager.SENSOR_DELAY_NORMAL);
        // Bind the textview text id to the textview variable.
        acceleration = (TextView)findViewById(R.id.acceleration);
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        // Sets the new text with the X, Y and Z axis. Get the axis per event. From that event the value is getting retrieved.
        acceleration.setText("X: " + event.values[0] + "\nY: " + event.values[1] + "\nZ: " + event.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {
        // Not needed
    }
}

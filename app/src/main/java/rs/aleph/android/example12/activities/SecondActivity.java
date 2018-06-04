package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.model.Jelo;
import rs.aleph.android.example12.activities.model.Kategorija;
import rs.aleph.android.example12.activities.model.Sastojak;

// Each activity extends Activity class
public class SecondActivity extends Activity {

    private int position = 0;

    Jelo cevapi = new Jelo("cevapi.jpg", "Cevapi", "Mleveno meso na rostilju", null, null, 300, 640);
    Jelo omlet = new Jelo("omlet.jpg", "Omlet", "Jaja sa slaninom", null, null, 240, 300);
    Jelo pica = new Jelo("pica.jbg", "Pica", "Testo sa sunkom, kecapom, kackavaljem", null, null, 320, 500);


    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Kategorija k1 = new Kategorija(0, "Rostilj", cevapi);
        Kategorija k2 = new Kategorija(1, "Omlet", omlet);
        Kategorija k3 = new Kategorija(2, "Pice", pica);

        Sastojak s1 = new Sastojak(0, "Mleveno meso", cevapi);
        Sastojak s2 = new Sastojak(1, "Luka", cevapi);
        Sastojak s3 = new Sastojak(2, "Jaja", omlet);
        Sastojak s4 = new Sastojak(3, "Slanina", omlet);
        Sastojak s5 = new Sastojak(4, "Testo", pica);
        Sastojak s6 = new Sastojak(5, "Sunka", pica);

        ArrayList<Sastojak>sastojciZaCevape = new ArrayList<>();
        ArrayList<Sastojak>sastojciZaOmlet = new ArrayList<>();
        ArrayList<Sastojak>sastojciZaPicu = new ArrayList<>();

        sastojciZaCevape.add(s1);
        sastojciZaCevape.add(s2);
        sastojciZaOmlet.add(s3);
        sastojciZaOmlet.add(s4);
        sastojciZaPicu.add(s5);
        sastojciZaPicu.add(s6);

        cevapi.getSastojci(sastojciZaCevape);
        omlet.getSastojci(sastojciZaOmlet);
        pica.getSastojci(sastojciZaPicu);

        cevapi.getKategorija(k1);
        omlet.getKategorija(k2);
        pica.getKategorija(k3);

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStart method is a lifecycle method called after onCreate (or after onRestart when the
    // activity had been stopped, but is now again being displayed to the user)
    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onRestart method is a lifecycle method called after onStop when the current activity is
    // being re-displayed to the user
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onResume method is a lifecycle method called after onRestoreInstanceState, onRestart, or
    // onPause, for your activity to start interacting with the user
    @Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onPause method is a lifecycle method called when an activity is going into the background,
    // but has not (yet) been killed
    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStop method is a lifecycle method called when the activity are no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }
}

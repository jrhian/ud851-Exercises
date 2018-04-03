package android.example.com.visualizerpreferences;

import android.preference.PreferenceFragment;

/**
 * Created by jscott on 4/2/18.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }

}

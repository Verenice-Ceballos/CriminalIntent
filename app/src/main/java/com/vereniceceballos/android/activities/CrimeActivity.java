package com.vereniceceballos.android.activities;

import androidx.fragment.app.Fragment;

import com.vereniceceballos.android.fragments.CrimeFragment;
import com.vereniceceballos.android.fragments.SingleFragmentActivity;

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}

package com.vereniceceballos.android.activities;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import com.vereniceceballos.android.fragments.CrimeFragment;
import com.vereniceceballos.android.fragments.SingleFragmentActivity;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {
    private static final String EXTRA_CRIME_ID =
            "com.vereniceceballos.android.criminalintent.crime_id";

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.getInstance(crimeId);
    }

    public static Intent newIntent(Context context, UUID crimeId)
    {
        Intent intent = new Intent(context, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

}

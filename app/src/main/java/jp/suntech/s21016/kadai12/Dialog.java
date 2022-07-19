package jp.suntech.s21016.kadai12;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class Dialog extends DialogFragment {

    public AlertDialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dt_title);
        builder.setMessage(R.string.dt_kakunin);
        builder.setPositiveButton(R.string.dt_akok,new DialogButtonClickListener());
        builder.setNegativeButton(R.string.dt_akng,new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which){
            String msg = "";

            switch (which){
                case DialogInterface.BUTTON_POSITIVE:
                    msg = getString(R.string.dt_ok);
                    break;

                case DialogInterface.BUTTON_NEGATIVE:
                    msg = getString(R.string.dt_ng);
                    break;
            }
            Toast.makeText(getActivity(), msg ,Toast.LENGTH_LONG).show();
        }
    }
}

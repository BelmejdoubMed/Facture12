package com.example.facture1;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class FactureList extends ArrayAdapter {
    public FactureList(Context context, List<FactureC> Factures){
        super(context, 0,Factures);

    }
}

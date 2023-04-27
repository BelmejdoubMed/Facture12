package com.example.facture1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView dateTextView;
    private EditText clientEditText;
    private EditText iceEditText;
    private EditText productsEditText;
    private EditText priceEditText;
    private EditText quantityEditText;
    private TextView mBillTextView;
    private Button save_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        dateTextView = findViewById(R.id.date_textview);
        clientEditText = findViewById(R.id.client_edittext);
        iceEditText = findViewById(R.id.ice_edittext);
        productsEditText = findViewById(R.id.products_edittext);
        priceEditText = findViewById(R.id.price_edittext);
        quantityEditText = findViewById(R.id.quantityEditText);
        mBillTextView = findViewById(R.id.mBillTextView);
        save_btn = findViewById(R.id.save_button);
        // Set the current date as the default value for the date field
        setDateText();
        // Set click listener for the "Generate Bill" button
        save_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                generateBill();
            }
        });
    }
    private void setDateText() {
        String currentDate = java.text.DateFormat.getDateInstance().format(new java.util.Date());
        dateTextView.setText(currentDate);
    }
    private double calculateTotalAmount() {
        double price = Double.parseDouble(priceEditText.getText().toString());
        double quantity = Double.parseDouble(quantityEditText.getText().toString());
        return price * quantity;
    }

    private void generateBill() {
        // Get the values from the fields
        String date = dateTextView.getText().toString();
        String client = clientEditText.getText().toString();
        int ice = Integer.parseInt(iceEditText.getText().toString());
        String products = productsEditText.getText().toString();
        double price = Double.parseDouble(priceEditText.getText().toString());
        double quantity = Double.parseDouble(quantityEditText.getText().toString());
        double totalAmount = calculateTotalAmount();
        // Construct the bill string
        String bill = "Date: " + date + "\n" +
                "Client: " + client + "\n" +
                "ICE: " + ice + "\n" +
                "Products: " + products + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "Total Amount: " + totalAmount;

        // Display the bill on the screen
        mBillTextView.setText(bill);
    }
}




    // Set the current date as the default value for the date field


    // Calculate the total amount based on the price and quantity fields


    // Generate the bill and display it on the screen
   /* private void generateBill() {
        // Get the values from the fields
        String date = dateTextView.getText().toString();
        String client = clientEditText.getText().toString();
        int ice = Integer.parseInt(iceEditText.getText().toString());
        String products = productsEditText.getText().toString();
        double price = Double.parseDouble(priceEditText.getText().toString());
        double quantity = Double.parseDouble(quantityEditText.getText().toString());
        double totalAmount = calculateTotalAmount();

        // Construct the bill string
        String bill = "Date: " + date + "\n" +
                "Client: " + client + "\n" +
                "ICE: " + ice + "\n" +

                private void generateBill() {
        // Get the values from the fields
        String date = mDateEditText.getText().toString();
        String client = mClientEditText.getText().toString();
        int ice = Integer.parseInt(mIceEditText.getText().toString());
        String products = mProductsEditText.getText().toString();
        double price = Double.parseDouble(mPriceEditText.getText().toString());
        double quantity = Double.parseDouble(mQuantityEditText.getText().toString());
        double totalAmount = price * quantity;

        // Construct the bill string
        String bill = "Date: " + date + "\n" +
                "Client: " + client + "\n" +
                "ICE: " + ice + "\n" +
                "Products: " + products + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "Total Amount: " + totalAmount;

        // Display the bill on the screen
        mBillTextView.setText(bill);
    }
}
                */


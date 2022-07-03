package com.example.barcodelookup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LookupActivity : AppCompatActivity() {

    var tvLUFileName : TextView? = null;
    var tvLUTest : TextView? = null;

    val lstBarscodes : MutableList<SkuDetails> = mutableListOf<SkuDetails>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lookup)
        tvLUFileName = findViewById(R.id.tvLUFileName);
        tvLUFileName?.text = "";
        val afileName =  intent.getStringExtra(MainActivity.FILE_NAME_ITEM);
        if(afileName != null) {
            tvLUFileName?.text = afileName;
        }

    }

    override fun onResume() {
        super.onResume()
        fillList()
    }


    fun fillList()
    {
        if(tvLUFileName!!.text.equals(""))
        {
            return;
        }
        var adetails : SkuDetails = SkuDetails("111111", "Camisa manga corta", "Linda camisa manga corta", "12345", "10.10")
        lstBarscodes.add(adetails);
        adetails = SkuDetails("222223", "Camisa manga larga", "Linda camisa manga larga", "23432", "30.00")
        lstBarscodes.add(adetails);
        adetails = SkuDetails("33333", "Camisa manga larga", "Linda camisa manga larga", "65434", "10.00")
        lstBarscodes.add(adetails);
        adetails = SkuDetails("4444444", "Filamon tortillo", "Tortolla de filamon", "876576", "1.50")
        lstBarscodes.add(adetails);
        adetails = SkuDetails("9999999", "Chorizo portugues", "Chorizo de Portugal","496576", "5.50")
        lstBarscodes.add(adetails);


    }

}
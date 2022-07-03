package com.example.barcodelookup

import android.R.id
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var btnStart : Button? = null;
    var btnNewFile : Button? = null;
    var tvFileName : TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById((R.id.btnStart));
        btnNewFile = findViewById(R.id.btnNewFile);
        tvFileName = findViewById(R.id.tvFilename);

        btnStart!!.setOnClickListener { startOnClick() }
        btnNewFile!!.setOnClickListener { newFileOnClick() }

    }

    fun newFileOnClick()
    {

    }

    fun startOnClick()
    {
        var afileName : String? =null;
        afileName = "pepeto.csv";
        val i = Intent(this, LookupActivity::class.java)
        i.putExtra (FILE_NAME_ITEM, afileName)
        startActivity(i)
    }

    fun getAll()
    {

    }

    fun saveAll()
    {

    }

    override fun onResume() {
        super.onResume()
        getAll()
    }

    override fun onPause() {
        super.onPause()
        saveAll()
    }


    companion object
    {
        const val FILE_NAME_ITEM = "FILENAME_ITEM"
    }

}
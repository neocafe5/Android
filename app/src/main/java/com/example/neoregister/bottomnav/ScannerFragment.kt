package com.example.neoregister.bottomnav

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.neoregister.R
import com.example.neoregister.databinding.FragmentScannerBinding
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult


class ScannerFragment : Fragment() {
    private lateinit var binding : FragmentScannerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_scanner, container, false)
//        btnScan = view.findViewById<View>(R.id.btn_frag_scan) as Button
//        tvResult = view.findViewById<View>(R.id.tv_frag_result) as TextView

        activity?.title = "QR code"
        //Important
        val integrator: IntentIntegrator = IntentIntegrator.forSupportFragment(this@ScannerFragment)
        integrator.setOrientationLocked(false)
        integrator.setPrompt("Scan QR code")
        integrator.setBeepEnabled(false)
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
        integrator.initiateScan()
        return view
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result: IntentResult =
            IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        Toast.makeText(context, "The code is: " + result.getContents(), Toast.LENGTH_LONG).show()
        //        if(result != null) {
//            if(result.getContents() == null) {
//                Toast.makeText(getContext(), "Cancelled", Toast.LENGTH_LONG).show();
//            } else {
//
//
//                tvResult.setText(result.getContents());
//
//
//            }
//        }
    }
}

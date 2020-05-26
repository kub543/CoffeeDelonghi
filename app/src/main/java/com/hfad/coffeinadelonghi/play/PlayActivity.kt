package com.hfad.coffeinadelonghi.play

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.hfad.coffeinadelonghi.R

class PlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val dialog = createInstructionsDialog()
        dialog.show()
    }

    private fun createInstructionsDialog(): Dialog {
        val builder = AlertDialog.Builder(this)
        builder.setIcon(R.drawable.android)
                .setTitle(R.string.instruction_title)
                .setMessage(R.string.introduction)
                .setPositiveButtonIcon(ContextCompat.getDrawable(this, android.R.drawable.ic_media_play))
        return builder.create()
    }
}


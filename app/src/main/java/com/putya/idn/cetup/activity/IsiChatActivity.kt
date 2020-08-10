package com.putya.idn.cetup.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.putya.idn.cetup.R
import com.putya.idn.cetup.model.ModelUser

class IsiChatActivity : AppCompatActivity() {
    var firebaseUser: FirebaseUser? = null
    var reference: DatabaseReference? = null
    var userIdVisit: String = ""
    var notify = false
    var mChatList: List<ModelUser>? = null
    lateinit var recyclerViewChat: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi_chat)
    }
}
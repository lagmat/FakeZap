package br.com.lagmat.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.orhanobut.hawk.Hawk

class MeuFirebaseInstanceidService : FirebaseInstanceIdService(){
    override fun onTokenRefresh() {
        super.onTokenRefresh()
     Hawk.put("TOKENFIREBASE", FirebaseInstanceId.getInstance().token)

    }



}
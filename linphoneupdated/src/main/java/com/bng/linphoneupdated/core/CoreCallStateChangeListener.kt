package com.bng.linphoneupdated.core


interface CoreCallStateChangeListener {
    fun callIdle(message: String)
    fun callOutgoingInit(message: String)
    fun callOutgoingRinging(message: String)
    fun callOutgoingEarlyMedia(message: String)
    fun callConnected(message: String)
    fun callPausing(message: String)
    fun callPaused(message: String)
    fun callResuming(message: String)
    fun callStreamsRunning(message: String)
    fun callError(message: String,reason:String)
    fun callReleased(message: String)
    fun callEnd(message: String)
    fun onMessageReceived(message: String)

}


package com.example.advancedlight.lollipop

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RemoteViews
import androidx.annotation.RequiresApi
import com.example.advancedlight.R
import com.example.advancedlight.databinding.ActivityNotificationTestBinding

const val CHANNEL_ONE = "channel_one"

class NotificationTestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationTestBinding
    private lateinit var notificationManager: NotificationManager

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityNotificationTestBinding.inflate(layoutInflater).also { binding = it }.root)
        notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        initViews()
    }

    @RequiresApi(Build.VERSION_CODES.S)
    private fun initViews() {
        // setImportance设置通知重要性
        val notificationChannel =
            NotificationChannel(CHANNEL_ONE, "channelName", NotificationManager.IMPORTANCE_HIGH)
        notificationManager.createNotificationChannel(notificationChannel)
        binding.btnCustom.setOnClickListener {
           showCustomNotification()
        }
        binding.btnFold.setOnClickListener {
            showFoldNotification()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("RemoteViewLayout")
    private fun showFoldNotification() {
        // remoteViews不能使用constraintLayout
        val remoteViews = RemoteViews(packageName, R.layout.layout_remote_view)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"))
        val pendingIntent = PendingIntent.getActivity(this,0, intent, PendingIntent.FLAG_IMMUTABLE)
        val builder = Notification.Builder(this, CHANNEL_ONE).apply {
            setContentIntent(pendingIntent)
            setSmallIcon(R.drawable.ic_launcher_foreground)
            setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.ic_launcher_foreground))
            setAutoCancel(false)
            setContentTitle("折叠通知")
            setCustomBigContentView(remoteViews)
        }
        notificationManager.notify(1, builder.build())
    }



    @RequiresApi(Build.VERSION_CODES.O)
    private fun showCustomNotification() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"))
        // pendingIntent的最后一个参数一定要是PendingIntent.FLAG_IMMUTABLE或者PendingIntent.FLAG_MUTABLE
        val pendingIntent = PendingIntent.getActivity(this,0, intent, PendingIntent.FLAG_IMMUTABLE)
        // AndroidO以上要指定channel
        val builder = Notification.Builder(this, CHANNEL_ONE).apply {
            setContentIntent(pendingIntent)
            setSmallIcon(R.drawable.ic_launcher_foreground)
            setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.ic_launcher_foreground))
            setAutoCancel(false)
            setContentTitle("普通通知")
        }
        notificationManager.notify(1, builder.build())
    }
}
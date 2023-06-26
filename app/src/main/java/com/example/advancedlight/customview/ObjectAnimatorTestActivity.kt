package com.example.advancedlight.customview

import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.core.LogisticsCenter
import com.alibaba.android.arouter.launcher.ARouter
import com.core.result.ActivityResultApi
import com.core.result.navigation
import com.example.advancedlight.databinding.ActivityObjectAnimatorTestBinding
import com.example.advancedlight.utils.navigation

class ObjectAnimatorTestActivity: AppCompatActivity() {

    companion object {
        private val TAG = ObjectAnimatorTestActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityObjectAnimatorTestBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityObjectAnimatorTestBinding.inflate(layoutInflater).also { binding = it }.root)
        initViews()
    }

    private fun initViews() {
//        val animator = ObjectAnimator.ofFloat(binding.ivJoker, "alpha", 1f, 0f, 1f)   // 代码方式 属性动画
//        animator.duration = 5000
//        animator.start()

//        val animator = AnimatorInflater.loadAnimator(this, R.animator.animator_alpha)   // xml方式 属性动画
//        animator.setTarget(binding.ivJoker)
//        animator.start()

//        val animator = ValueAnimator.ofFloat(0F, 1F)  // valueAnimator
//        animator.setTarget(binding.ivJoker)
//        animator.duration = 5000
//        animator.addUpdateListener {
//            val float = it.animatedValue as Float
//            Log.i(TAG, "currentFloat: $float")
//            binding.ivJoker.alpha = float
//        }
//        animator.start()

//        val alphaProper = PropertyValuesHolder.ofFloat("alpha", 0.5F, 1F)   // PropertyValuesHolder 方式
//        val scaleXProper = PropertyValuesHolder.ofFloat("scaleX", 0F, 1F)
//        val scaleYProper = PropertyValuesHolder.ofFloat("scaleY", 0F, 1F)
//        val translationXProper = PropertyValuesHolder.ofFloat("translationX", -100F, 100F)
//        val translationYProper = PropertyValuesHolder.ofFloat("translationY", -100F, 100F)
//        val rotationProper = PropertyValuesHolder.ofFloat("rotation", 0F, 360F)
//        val animator = ObjectAnimator.ofPropertyValuesHolder(binding.ivJoker, alphaProper, scaleXProper, scaleYProper, translationXProper, translationYProper, rotationProper)
//        animator.duration = 5000
//        animator.start()

//        val rotate = ObjectAnimator.ofFloat(binding.ivJoker, "rotation", 0F, 360F)    // AnimatorSet方式
//        val translationX = ObjectAnimator.ofFloat(binding.ivJoker, "translationX", -100F, 100F)
//        val translationY = ObjectAnimator.ofFloat(binding.ivJoker, "translationY", -100F, 100F)
//        val scaleX = ObjectAnimator.ofFloat(binding.ivJoker, "scaleX", 0F, 1F)
//        val scaleY = ObjectAnimator.ofFloat(binding.ivJoker, "scaleY", 0F, 1F)
//        val alpha = ObjectAnimator.ofFloat(binding.ivJoker, "alpha", 1f, 0f , 1f)
//        val animatorSet = AnimatorSet()
//        animatorSet.play(rotate)
//            .with(alpha)
//            .after(scaleX)
//            .before(translationX)
//            .after(1000)
//            .before(translationY)
//            .with(scaleY)
//        animatorSet.duration = 5000
//        animatorSet.start()

//        val animator = ObjectAnimator.ofFloat(binding.ivJoker, "alpha", 0F, 1F)  // 插值示例
//        animator.duration = 5000
//        animator.interpolator = AccelerateInterpolator(5F)
//        animator.start()


    }
}
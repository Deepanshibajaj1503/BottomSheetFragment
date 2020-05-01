package `in`.sportscafe.nostragamus.bottomsheetfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.RelativeLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var bottomSheetBehaviour: BottomSheetBehavior<RelativeLayout>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBottomSheet()
    }

    private fun setupBottomSheet() {
        bottomSheetBehaviour = BottomSheetBehavior.from(bottom_sheet_parent)
        bottomSheetBehaviour?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        //stage expanded show or hide items
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        //stage collapsed show or hide items
                    }
                }
            }
        })

        bottom_sheet_parent.setOnClickListener {
            bottomSheetBehaviour?.apply {
                state = if (state == BottomSheetBehavior.STATE_COLLAPSED)
                    BottomSheetBehavior.STATE_EXPANDED else BottomSheetBehavior.STATE_COLLAPSED
            }
        }
    }
}

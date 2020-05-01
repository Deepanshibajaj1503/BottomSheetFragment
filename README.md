# BottomSheetFragment
 Android Bottom Sheet is a component that slides up from the bottom of the screen having multiple options.
 
 Activity:
 
       private var bottomSheetBehaviour: BottomSheetBehavior<RelativeLayout>? = null
       
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
        
        
  XML :
  
    <?xml version="1.0" encoding="utf-8"?>
    <androidx.coordinatorlayout.widget.CoordinatorLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#eeeeee">
        
    <!-- Bottom sheet layout -->
    <RelativeLayout
            android:id="@+id/bottom_sheet_parent"
            android:layout_width="match_parent"
            android:layout_height="220dp"
            android:fitsSystemWindows="true"
            android:orientation="vertical"
            app:behavior_hideable="false"
            app:behavior_peekHeight="60dp"
            app:layout_behavior="com.google.android.material.bottomsheet.BottomSheetBehavior">

        <include layout="@layout/fragment_bottom_sheet"
                 android:layout_height="match_parent"
                 android:layout_width="match_parent"/>

    </RelativeLayout>

    </androidx.coordinatorlayout.widget.CoordinatorLayout>


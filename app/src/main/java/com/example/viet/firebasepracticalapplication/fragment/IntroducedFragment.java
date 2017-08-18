package com.example.viet.firebasepracticalapplication.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class IntroducedFragment extends Fragment {
    private int mLayout;

    @SuppressLint("ValidFragment")
    public IntroducedFragment(int mLayout) {
        this.mLayout = mLayout;
    }

    public IntroducedFragment() {

    }

    public static IntroducedFragment newInstance(int mLayout) {
        IntroducedFragment fragment = new IntroducedFragment(mLayout);
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //TODO:
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(mLayout, container, false);
//        view.setOnTouchListener(this);
//        view.setOnDragListener(this);
        return view;
    }

//    @Override
//    public boolean onTouch(final View view, MotionEvent motionEvent) {
//
//        switch (motionEvent.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                mIsTouched = true;
//                android.os.Handler handler = new android.os.Handler();
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        if (!mIsTouched) {
//                            return;
//                        }
//                        ClipData clipData = ClipData.newPlainText(" ", " ");
//                        View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
//                                view);
//                        view.setVisibility(View.INVISIBLE);
//                        view.startDrag(clipData, shadowBuilder, view, View.DRAG_FLAG_GLOBAL);
//                        mIsTouched = false;
//                    }
//                }, 1000);
//
//                return true;
//            case MotionEvent.ACTION_UP:
//                mIsTouched = false;
//                break;
//            default:
//        }
//        return false;
//    }
//
//    @Override
//    public boolean onDrag(View v, DragEvent dragEvent) {
//        Drawable enterShape = getResources().getDrawable(
//                R.drawable.shape_droptarget);
//        Drawable normalShape = getResources().getDrawable(R.drawable.shape);
//
//        switch (dragEvent.getAction()) {
//            case DragEvent.ACTION_DRAG_STARTED:
//                // do nothing
//                break;
//            case DragEvent.ACTION_DRAG_ENTERED:
////                v.setBackgroundDrawable(enterShape);
//                break;
//            case DragEvent.ACTION_DRAG_EXITED:
////                v.setBackgroundDrawable(normalShape);
//                break;
//            case DragEvent.ACTION_DROP:
//                // Dropped, reassign View to ViewGroup
//                View view = (View) dragEvent.getLocalState();
//                ViewGroup owner = (ViewGroup) view.getParent();
//                owner.removeView(view);
//                LinearLayout container = (LinearLayout) v;
//                container.addView(view);
//                view.setVisibility(View.VISIBLE);
//                break;
//            case DragEvent.ACTION_DRAG_ENDED:
////                v.setBackgroundDrawable(normalShape);
//            default:
//                break;
//        }
//        return true;
//
//    }
}

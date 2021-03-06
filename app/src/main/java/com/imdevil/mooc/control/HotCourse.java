package com.imdevil.mooc.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.imdevil.mooc.R;

/**
 * Created by imdevil on 2017/2/5 0005.
 */
public class HotCourse extends LinearLayout{


    private HotCourseButton hotCourseButton_1;
    private HotCourseButton hotCourseButton_2;
    private HotCourseButton hotCourseButton_3;
    private HotCourseButton hotCourseButton_4;
    private HotCourseButton hotCourseButton_5;
    private HotCourseButton hotCourseButton_6;
    private HotCourseButton hotCourseButton_7;
    private HotCourseButton hotCourseButton_8;


    public HotCourse(Context context) {
        super(context,null);
    }

    public HotCourse(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(getContext()).inflate(R.layout.course_hot,this,true);
        this.hotCourseButton_1 = (HotCourseButton) findViewById(R.id.hot_course_button_1);
        this.hotCourseButton_2 = (HotCourseButton) findViewById(R.id.hot_course_button_2);
        this.hotCourseButton_3 = (HotCourseButton) findViewById(R.id.hot_course_button_3);
        this.hotCourseButton_4 = (HotCourseButton) findViewById(R.id.hot_course_button_4);
        this.hotCourseButton_5 = (HotCourseButton) findViewById(R.id.hot_course_button_5);
        this.hotCourseButton_6 = (HotCourseButton) findViewById(R.id.hot_course_button_6);
        this.hotCourseButton_7 = (HotCourseButton) findViewById(R.id.hot_course_button_7);
        this.hotCourseButton_8 = (HotCourseButton) findViewById(R.id.hot_course_button_8);
    }

    public HotCourseButton getHotCourseButton_1() {
        return hotCourseButton_1;
    }

    public HotCourseButton getHotCourseButton_2() {
        return hotCourseButton_2;
    }

    public HotCourseButton getHotCourseButton_3() {
        return hotCourseButton_3;
    }

    public HotCourseButton getHotCourseButton_4() {
        return hotCourseButton_4;
    }

    public HotCourseButton getHotCourseButton_5() {
        return hotCourseButton_5;
    }

    public HotCourseButton getHotCourseButton_6() {
        return hotCourseButton_6;
    }

    public HotCourseButton getHotCourseButton_7() {
        return hotCourseButton_7;
    }

    public HotCourseButton getHotCourseButton_8() {
        return hotCourseButton_8;
    }

}

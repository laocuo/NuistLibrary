package com.nuist.library.destine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

import com.nuist.library.destine.utils.DestineUtils;
import com.nuist.library.destine.utils.ObjectType;
import com.nuist.library.utils.DensityUtil;

import java.util.ArrayList;


public class DeskLayout extends View {
    private final int MAX_W = 10;
    private final int MAX_H = 12;

    private final int FONT_SIZE = 16;

    private Context mContext;

    /*
    * GRID width, height
    * */
    private int w,h;

    /*
    * Current room name which selected
    * */
    private String mSelectedRoomName;

    private Paint mPaint;
    private int mHeightMax;
    private ArrayList<ObjectType> mList = null;

    public DeskLayout(Context context) {
        this(context,  null);
    }

    public DeskLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(DensityUtil.sp2px(mContext, FONT_SIZE));
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int w_mode = MeasureSpec.getMode(widthMeasureSpec);
        int w_size = MeasureSpec.getSize(widthMeasureSpec);
        if (w_mode == MeasureSpec.EXACTLY) {
            w = w_size;
        } else {
            w = DensityUtil.getScreenSize(mContext).x;
        }
        h = w;
        w = w / MAX_W;
        h = h / MAX_H;
        if (mHeightMax > 0) {
            setMeasuredDimension(w * MAX_W, h * mHeightMax);
        } else {
            setMeasuredDimension(w * MAX_W, h * MAX_H);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(mSelectedRoomName)) {
            drawRoomName(canvas);
        }
        if (mList != null && w > 0) {
            for(ObjectType o : mList) {
                switch (o.category) {
                    case ObjectType.DESKTOP:
                        drawDesktop(o, canvas);
                        break;
                    case ObjectType.BOOKCASE:
                        drawBookcase(o, canvas);
                        break;
                    case ObjectType.CORRIDOR:
                        drawCorridor(o, canvas);
                        break;
                    case ObjectType.DOOR:
                        drawDoor(o, canvas);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void drawRoomName(Canvas canvas) {
        mPaint.setColor(Color.BLACK);
        Rect bounds = new Rect();
        mPaint.getTextBounds(mSelectedRoomName, 0, mSelectedRoomName.length(), bounds);
        canvas.drawText(mSelectedRoomName,
                (w * MAX_W - bounds.width())/2,
                h - (h - bounds.height())/2,
                mPaint);
    }

    private void drawDesktop(ObjectType o, Canvas canvas) {
        String text = o.descripe;
        if (text != null) {
            Point s = new Point(o.start.x * w, o.start.y * h);
            Point e = new Point(o.end.x * w + w, o.end.y * h + h);
            mPaint.setColor(Color.GRAY);
            canvas.drawRect(new Rect(s.x, s.y, e.x, e.y), mPaint);
            mPaint.setColor(Color.BLACK);
            Rect bounds = new Rect();
            mPaint.getTextBounds(text, 0, text.length(), bounds);
            canvas.drawText(text,
                    (e.x - s.x - bounds.width())/2 + s.x,
                    e.y - (h - bounds.height())/2,
                    mPaint);
        }
    }

    private void drawBookcase(ObjectType o, Canvas canvas) {
        mPaint.setColor(Color.RED);
        Point s = new Point(o.start.x * w, o.start.y * h);
        Point e = new Point(o.end.x * w + w, o.end.y * h + h);
        canvas.drawRect(new Rect(s.x, s.y, e.x, e.y), mPaint);
    }

    private void drawCorridor(ObjectType o, Canvas canvas) {
        mPaint.setColor(Color.YELLOW);
        Point s = new Point(o.start.x * w, o.start.y * h);
        Point e = new Point(o.end.x * w + w, o.end.y * h + h);
        canvas.drawRect(new Rect(s.x, s.y, e.x, e.y), mPaint);
    }

    private void drawDoor(ObjectType o, Canvas canvas) {
        mPaint.setColor(Color.BLUE);
        Point s = new Point(o.start.x * w, o.start.y * h);
        Point e = new Point(o.end.x * w + w, o.end.y * h + h);
        canvas.drawRect(new Rect(s.x, s.y, e.x, e.y), mPaint);

        String text = o.descripe;
        if (text != null) {
            mPaint.setColor(Color.GRAY);
            Rect bounds = new Rect();
            mPaint.getTextBounds(text, 0, text.length(), bounds);
            canvas.drawText(text,
                    (e.x - s.x - bounds.width()) / 2 + s.x,
                    e.y - (e.y - s.y - bounds.height())/2,
                    mPaint);
        }
    }

    public void setSelectedRoomName(String selectedRoomName) {
        if (mSelectedRoomName == null || !mSelectedRoomName.equalsIgnoreCase(selectedRoomName)) {
            mSelectedRoomName = selectedRoomName;
            mList = DestineUtils.getLayout(selectedRoomName);
            mHeightMax = DestineUtils.getHeightMaxGrids(selectedRoomName);
            requestLayout();
            postInvalidate();
        }
    }
}

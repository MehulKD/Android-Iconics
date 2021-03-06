package com.mikepenz.iconics.internal;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;
import android.text.TextUtils;

import com.mikepenz.iconics.IconicsDrawable;

/**
 * @author pa.gulko zTrap (06.07.2017)
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
public class IconBundle {
    public String mIconString = null;
    public IconicsDrawable mIcon = null;
    @ColorInt
    public int mColor = 0;
    public int mSize = -1;
    public int mPadding = -1;
    @ColorInt
    public int mContourColor = 0;
    public int mContourWidth = -1;
    @ColorInt
    public int mBackgroundColor = 0;
    public int mCornerRadius = -1;
    
    //region create icon
    public boolean createIcon(Context context){
        return createIconFromBundle(this, context);
    }
    
    public static boolean createIconFromBundle(IconBundle bundle, Context ctx) {
        if (bundle.mIconString != null && !TextUtils.isEmpty(bundle.mIconString.trim())) {
            bundle.mIcon = new IconicsDrawable(ctx, bundle.mIconString);
        } else {
            return false;
        }
        if (bundle.mColor != 0) {
            bundle.mIcon.color(bundle.mColor);
        }
        if (bundle.mSize != -1) {
            bundle.mIcon.sizePx(bundle.mSize);
        }
        if (bundle.mPadding != -1) {
            bundle.mIcon.paddingPx(bundle.mPadding);
        }
        if (bundle.mContourColor != 0) {
            bundle.mIcon.contourColor(bundle.mContourColor);
        }
        if (bundle.mContourWidth != -1) {
            bundle.mIcon.contourWidthPx(bundle.mContourWidth);
        }
        if (bundle.mBackgroundColor != 0) {
            bundle.mIcon.backgroundColor(bundle.mBackgroundColor);
        }
        if (bundle.mCornerRadius != -1) {
            bundle.mIcon.roundedCornersPx(bundle.mCornerRadius);
        }
        return true;
    }
    //endregion
}
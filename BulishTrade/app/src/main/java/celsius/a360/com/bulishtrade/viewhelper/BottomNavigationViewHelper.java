package celsius.a360.com.bulishtrade.viewhelper;

import android.annotation.SuppressLint;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Field;

/**
 * Created by dennisshar on 27/01/2018.
 */

public class BottomNavigationViewHelper {


    private View badge;
    private ImageView dialerBUtton;




    @SuppressLint("RestrictedApi")
    public void removeShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                //noinspection RestrictedApi
                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                //noinspection RestrictedApi
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public View getBadge() {
        if(badge!=null)
            return badge;
        else
            return null;
    }

    public void setBadge(View badge) {
        this.badge = badge;
    }

    public ImageView getDialerBUtton() {
        if(dialerBUtton!=null)
            return dialerBUtton;
        else
            return null;
    }

    public void setDialerBUtton(ImageView dialerBUtton) {
        this.dialerBUtton = dialerBUtton;
    }

    public void setDialerImage(int imageID){
        dialerBUtton.setImageResource(imageID);
    }
}

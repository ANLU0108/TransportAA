package se.hkr.anlu0108.transportaa;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



/**
 * Created by fuckface on 2015-10-20.
 */

    public class CustomPagerAdapter extends FragmentPagerAdapter {

        protected Context mContext;

        public CustomPagerAdapter(FragmentManager fm, Context context) {
            super(fm);
            mContext = context;
        }



    @Override

        public Fragment getItem(int position) {

            Fragment routeFragment = new RouteView();
            Fragment googleFragment = new GoogleView();
            Fragment settingsFragment = new Settings();








            Bundle args = new Bundle();
            args.putInt("page_position", position + 1);

            // Set the arguments on the fragment
            // that will be fetched in DemoFragment@onCreateView

            if(position == 1) {
                return routeFragment;
            }else if (position == 2){
                return googleFragment;
            }else{
                return settingsFragment;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

    }


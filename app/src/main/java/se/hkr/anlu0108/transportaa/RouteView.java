package se.hkr.anlu0108.transportaa;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by fuckface on 2015-10-20.
 */
public class RouteView extends Fragment {
    ListView user;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.routeview, container, false);

        user = (ListView)rootView.findViewById(R.id.routeList);
        String[] names = {"anton", "donner", "slobodan"};
        String[] addresses = {"pussyMagnetStreet", "fjällvandringsvägen", "gamlegården"};
        String[] orderNum ={"pussy", "sovsäck","skottsäker väst"};
        customAdapter ca = new customAdapter(names,addresses,orderNum, getActivity());
        user.setAdapter(ca);

    return rootView;
    }

    class customAdapter extends BaseAdapter{
        Context ctxt;
        String[] names;
        String[] addresses;
        String[] orderNums;
        String displayOrder ="<b>"+"Order nummer: "+"</b>";
        String displayAdress ="<b>" +"Address: "+"</b> ";
        String displayName ="<b>"+ "Name: " +"</b> ";
        LayoutInflater  mInflater;
        public customAdapter(String [] names,String[] address,String[] orderNum, Context c){
            this.names = names;
            this.addresses = address;
            this.orderNums = orderNum;
            ctxt = c;
            mInflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView== null){

                convertView = mInflater.inflate(R.layout.list, parent,false);
                TextView name = (TextView)convertView.findViewById(R.id.name);
                TextView address = (TextView)convertView.findViewById(R.id.address);
                TextView orderNum = (TextView)convertView.findViewById(R.id.orderNum);
                name.setText(Html.fromHtml(displayName)+names[position]);
                address.setText(Html.fromHtml(displayAdress)+addresses[position]);
                orderNum.setText(Html.fromHtml(displayOrder)+orderNums[position]);
            }
            return convertView;
        }
    }
}


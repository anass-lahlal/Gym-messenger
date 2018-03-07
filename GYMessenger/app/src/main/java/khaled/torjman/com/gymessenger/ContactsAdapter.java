package khaled.torjman.com.gymessenger;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by lahra on 12/25/2017.
 */

public class ContactsAdapter extends BaseAdapter
{

     Activity mActivity;



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public CardView getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
            LayoutInflater inflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.contact_info,parent,false);
            TextView name = convertView.findViewById(R.id.name);
            TextView surname = convertView.findViewById(R.id.surname);



        return convertView;
    }
}

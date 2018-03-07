package khaled.torjman.com.gymessenger;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Contacts extends Fragment {
    View root;
    CardView mCardView;
    ListView mListView;

    String[] names = {"Name1","Name2","Name3"};
    String[] usernames = {"Username1","Username2","Username3"};



    public Contacts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_contacts,container,false);
        mListView = root.findViewById(R.id.lvContact);
        mCardView = root.findViewById(R.id.card);
        CustomAdapter customAdapter = new CustomAdapter();

        mListView.setAdapter(customAdapter);




        return root;
    }


    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.contact_info,null);
            TextView name = convertView.findViewById(R.id.name);
            TextView surname = convertView.findViewById(R.id.surname);

            name.setText(names[position]);
            surname.setText(usernames[position]);

            return convertView;
        }
    }




}

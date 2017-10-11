package Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.gohool.myrv.myrecyclerview.MainActivity;
import com.gohool.myrv.myrecyclerview.R;
import com.gohool.myrv.myrecyclerview.delete;

import java.util.ArrayList;
import java.util.List;

import Model.ListItem1;

import static com.gohool.myrv.myrecyclerview.R.id.parent;

/**
 * Created by ray on 10/11/2017.
 */

    public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.ViewHolder> {

        private Window mWindow;
        Intent intent;
        private Context context;
        private List<ListItem1> listItems;
        AppCompatActivity app = new AppCompatActivity();

        public MyAdapter1(Context context, List listItem1) {

            this.context = context;
            this.listItems = listItem1;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_row1, parent, false);

            return new MyAdapter1.ViewHolder(v, context, (ArrayList<ListItem1>) listItems);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            ListItem1 listItem = listItems.get(position);
            holder.name.setText(listItem.getName());
            holder.description.setText(listItem.getDescription());

        }

        @Override
        public int getItemCount() {
            return listItems.size();
        }


        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            public TextView name;
            public TextView description;

            public ViewHolder(View view, Context ctx, ArrayList<ListItem1> items) {
                super(view);
                listItems = items;
                //get the Activity Context
                context = ctx;

                view.setOnClickListener(this);

                name = (TextView) view.findViewById(R.id.title);
                description = (TextView) view.findViewById(R.id.description);

            }

            @Override
            public void onClick(View v) {
                //Get int position
                int position = getAdapterPosition();
                ListItem1 item = listItems.get(position);


                //Intent intent = new Intent(MainActivity.this, Go.class);
                // Toast.makeText(context, item.getName(), Toast.LENGTH_LONG).show();
                if (position == 1||position==2||position==3) {
                    //setContentView(R.layout.activity_justfor);
                   String positionn=String.valueOf(position);
                    Intent intent= new Intent(context,delete.class);
                    intent.putExtra("go",positionn);
                    context.startActivity(intent);
                    // Toast.makeText(context, item.getName(), Toast.LENGTH_LONG).show();


                }
            }


        }



}







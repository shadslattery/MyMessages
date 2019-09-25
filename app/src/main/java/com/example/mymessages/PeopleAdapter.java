package com.example.mymessages;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> {

    private List<Person> peopleList;

    public PeopleAdapter(List<Person> peopleList) {
        this.peopleList = peopleList;
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate( R.layout.messages_item,parent,
                false

        );

        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        Person person = peopleList.get(position);

        String Name = person.getName();
        holder.tvName.setText(Name);

        String Description = person.getDescription();
        holder.tvDescription.setText(Description);

        /*String Image = person.getImage();
        holder.tvImage.setText(Image);*/

        String Time = person.getTime();
        holder.tvTime.setText(Time);
    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvDescription, tvTime; /*tvImage*/


        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.Name);
            tvDescription = itemView.findViewById(R.id.Description);
            /*tvImage = itemView.findViewById(R.id.Image);*/
            tvTime = itemView.findViewById(R.id.Time);
        }


            }
        }


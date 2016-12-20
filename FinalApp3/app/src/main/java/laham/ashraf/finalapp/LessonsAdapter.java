package laham.ashraf.finalapp;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.res.Resources;

import java.util.List;
/**
 * Created by Ashraf on 12/16/2016.
 */

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.MyViewHolder> {

    List<Lesson> lessonsList;
    Context ctx;
    private int rowLayout;
    private ItemClickListener clickListener;

    /* --- Holder View --- */
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title, disc, lsnDate;
        ImageView img;

        public MyViewHolder(View view) {
            super(view);

            this.title = (TextView)view.findViewById(R.id.txtTitle);
            this.disc = (TextView)view.findViewById(R.id.txtDisc);
            this.lsnDate = (TextView)view.findViewById(R.id.txtLsnDate);
            this.img =(ImageView)view.findViewById(R.id.img);

            view.setTag(view);
            view.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (clickListener!=null)
                clickListener.onClick(v,getAdapterPosition());
        }
    }
    /* end Class Holder*/

    /* ******* Ctor ********/
    public LessonsAdapter(List<Lesson> LessonsList,int rowLayout,  Context ctx) {
        this.lessonsList = LessonsList;
        this.rowLayout = rowLayout;
        this.ctx=ctx;
    }

    /* ************************* */

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        //View itemView  = LayoutInflater.from(parent.getContext())
        //        .inflate(R.layout.lesson_list_row_2, parent, false);
        View itemView  = LayoutInflater.from(parent.getContext())
                .inflate(rowLayout, parent, false);
        return new MyViewHolder(itemView);
    }


    public void onBindViewHolder(MyViewHolder holder, int position) {
        Lesson lesson = lessonsList.get(position);

        holder.title.setText(lesson.getTitle());
        holder.disc.setText(lesson.getDisc());
        holder.lsnDate.setText(lesson.getlsnDate());

        int resID = ctx.getResources().getIdentifier(lesson.getImg(), "drawable", ctx.getPackageName());
        holder.img.setImageResource(resID);


        //holder.img.setImageResource(R.drawable.);
    }

    /* ************************* */

    public int getItemCount() {
        return lessonsList.size();
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

}

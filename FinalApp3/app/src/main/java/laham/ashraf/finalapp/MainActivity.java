package laham.ashraf.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.content.Context;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private List<Lesson> lessonList = new ArrayList<Lesson>();
    private RecyclerView recyclerView;
    private LessonsAdapter lAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rView);

        lAdapter = new LessonsAdapter(lessonList,R.layout.lesson_list_row_2, this);

        RecyclerView.LayoutManager lLayoutManager =
                new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(lLayoutManager);
        recyclerView.setAdapter(lAdapter);
        lAdapter.setClickListener( this);
        prepareLessons();

    }

    private void prepareLessons() {
        Lesson lsn;
        String details = "An activity is a single, focused thing that the user can do. Almost all activities interact with the user, so the Activity class takes care of creating a window for you in which you can place your UI with setContentView(View). While activities are often presented to the user as full-screen windows, they can also be used in other ways: as floating windows (via a theme with windowIsFloating set) or embedded inside of another activity (using ActivityGroup). There are two methods almost all subclasses of Activity will implement:" +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." +
                "Activities in the system are managed as an activity stack. When a new activity is started, it is placed on the top of the stack and becomes the running activity -- the previous activity always remains below it in the stack, and will not come to the foreground again until the new activity exits." ;

        lsn = new Lesson("Lesson 1", "Discription 1", "1/1/2016","a1");
        lsn.setDetails(details);
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 2", "Disciption 2","3/4/2016","a2");
        lsn.setDetails(details+" XX");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 3", "Disciption 3","3/4/2016","a3");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 4", "Disciption 4","3/4/2016","a4");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 6", "Disciption 5","3/4/2016","a5");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 6", "Disciption 6","3/4/2016","a1");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 7", "Disciption 7","3/4/2016","a2");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 8", "Disciption 8","3/4/2016","a3");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 9", "Disciption 9","3/4/2016","a4");
        lessonList.add(lsn);

        lsn = new Lesson("Lesson 10", "Disciption 10","3/4/2016","a5");
        lessonList.add(lsn);

        lAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view, int position) {
        //Lesson lsn = lessonList.get(position);
        //Toast.makeText(getApplicationContext(), lsn.getTitle(),
        //        Toast.LENGTH_LONG).show();

        Lesson lsn = lessonList.get(position);
        Intent i = new Intent(this, LessonViewDetails.class);
        i.putExtra("title", lsn.getTitle());
        i.putExtra("desc", lsn.getDisc());
        i.putExtra("lsnDate", lsn.getlsnDate());
        i.putExtra("details", lsn.getDetails());
        i.putExtra("image", lsn.getImg());
        //Log.i("hello", city.name);
        startActivity(i);
    }
}

package laham.ashraf.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonViewDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_view_details);

        TextView txtTitle =   (TextView ) findViewById(R.id.txtTitle2);
        TextView txtDesc =    (TextView ) findViewById(R.id.txtDisc2);
        TextView txtLsnDate = (TextView ) findViewById(R.id.txtLsnDate2);
        TextView txtDetails = (TextView ) findViewById(R.id.txtDetails);
        ImageView img = (ImageView) findViewById(R.id.img2);

        //txtDetails.setLines(4);
        txtDetails.setVerticalScrollBarEnabled(true);
        txtDetails.setMovementMethod(new ScrollingMovementMethod());


        Intent intent = getIntent();
        txtTitle.setText(intent.getStringExtra("title"));
        txtDesc.setText(intent.getStringExtra("desc"));
        txtLsnDate.setText(intent.getStringExtra("lsnDate"));
        txtDetails.setText(intent.getStringExtra("details"));


        int resID = getResources().getIdentifier(intent.getStringExtra("image"), "drawable", getPackageName());
        img.setImageResource(resID);
    }
}

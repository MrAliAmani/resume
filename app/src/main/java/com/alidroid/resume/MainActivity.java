package com.alidroid.resume;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton btn_education = findViewById(R.id.btn_education);
        AppCompatButton btn_skills = findViewById(R.id.btn_skills);
        AppCompatButton btn_career = findViewById(R.id.btn_career);
        AppCompatButton btn_projects = findViewById(R.id.btn_projects);
        AppCompatImageView img_linkedin = findViewById(R.id.img_linkedin);
        AppCompatImageView img_telegram = findViewById(R.id.img_telegram);
        AppCompatImageView img_github = findViewById(R.id.img_github);

        btn_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent educationIntent = new Intent(getApplicationContext(), EducationActivity.class);
                startActivity(educationIntent);

            }
        });

        btn_skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent skillsIntent = new Intent(getApplicationContext(), SkillsActivity.class);
                startActivity(skillsIntent);

            }
        });

        btn_career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent careerIntent = new Intent(getApplicationContext(), CareerActivity.class);
                startActivity(careerIntent);

            }
        });

        btn_projects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent projectsIntent = new Intent(getApplicationContext(), ProjectsActivity.class);
                startActivity(projectsIntent);

            }
        });

        img_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse(getResources().getString(R.string.linkedin_url)));
                startActivity(linkedinIntent);

            }
        });

        img_telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent telegramIntent = new Intent(Intent.ACTION_VIEW);
                telegramIntent.setData(Uri.parse(getResources().getString(R.string.telegram_url)));
                startActivity(telegramIntent);

            }
        });

        img_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent githubIntent = new Intent(Intent.ACTION_VIEW);
                githubIntent.setData(Uri.parse(getResources().getString(R.string.github_url)));
                startActivity(githubIntent);

            }
        });

    }

}
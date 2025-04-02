package com.classplus;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize RecyclerView
        RecyclerView coursesRecyclerView = findViewById(R.id.coursesRecyclerView);
        coursesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        // Create sample course data
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics 101", "Basic algebra concepts", 40));
        courses.add(new Course("Physics Fundamentals", "Introduction to mechanics", 25));
        courses.add(new Course("Chemistry Basics", "Atomic structure and bonding", 60));
        
        // Set adapter
        CourseAdapter adapter = new CourseAdapter(courses);
        coursesRecyclerView.setAdapter(adapter);

        // Setup FAB
        FloatingActionButton addCourseFab = findViewById(R.id.addCourseFab);
        addCourseFab.setOnClickListener(view -> {
            // TODO: Implement add course functionality
        });
    }
}
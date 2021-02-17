#BOTTOM NAVIGATION MENU BAR IN ANDROID STUDIO

**Hello , In this repository you will get to see how to create a NAVIGATION BAR in your app in android studio using Java**

STEP 1 : Add dependencies to `Gradle Script` -> `build.gradle` -> `Module:App-Name.app`
```
dependencies{
 implementation 'com.android.material:material:1.0.0'
}
```
Step 2 :``Gradle Sync ``

STEP 3 : Use ~~Constraint Layout~~ **Coordinator Layout** and Add `BOTTOM Navigation Menu` *in the text mode of the layout section*
Code as follows :
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/nav_view"
        android:layout_gravity="bottom"
        android:background="#FF5733"
        app:itemIconTint="@color/white"
        app:itemTextColor="@color/white"
        app:menu="@menu/menu_xml_file"
      />
</androidx.coordinatorlayout.widget.CoordinatorLayout>
```


Step 4 : Create `Menu Resource Directory` -> `menu.xml` and put the items according to your need code as follows

```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item android:title="Home"
        android:icon="@drawable/ic_baseline_home_24"
        android:id="@+id/home_menu"/>

    <item android:title="Dashboard"
        android:icon="@drawable/ic_baseline_dashboard_24"
        android:id="@+id/dashboard"/>

    <item android:title="Share"
        android:icon="@drawable/ic_baseline_share_24"
        android:id="@+id/share"/>

</menu>
```

Step 5: Add `menu_xml_file` to `activity_main.xml`

Step 6: Go to **MainActivity.java** and create instance using


>private BottomNavigationView bottomNavigationView;

and also assign it with id:
>bottomNavigationView = findViewById(R.id.nav_view);

 and then overall code :
 ```
 package com.aips.navigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.home_menu:
                        Toast.makeText(MainActivity.this, "You clicked Home icon", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.dashboard:
                        Toast.makeText(MainActivity.this, "You clicked  Dashboard icon", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.share:
                        Toast.makeText(MainActivity.this, "Your clicked Share icon", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }

            }
        });

    }
}
 ```


 ![Cool](https://tenor.com/view/mochi-peach-cat-cat-cute-happy-smile-gif-16624313.gif )

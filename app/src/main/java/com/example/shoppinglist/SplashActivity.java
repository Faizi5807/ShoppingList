package com.example.shoppinglist;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo = findViewById(R.id.logo);
        Animation translateAnim = AnimationUtils.loadAnimation(this, R.anim.translate);
        Animation scaleAnim = AnimationUtils.loadAnimation(this, R.anim.scale);

        logo.startAnimation(translateAnim);
        logo.startAnimation(scaleAnim);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            finish();
        }, 3000);
    }
}


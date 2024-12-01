package com.example.shoppinglist;

public class RegisterActivity {
    auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(task -> {
        if (task.isSuccessful()) {
            Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        } else {
            Toast.makeText(this, "Registration Failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
        }
    });

}

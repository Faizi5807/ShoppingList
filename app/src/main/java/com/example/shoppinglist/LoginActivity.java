package com.example.shoppinglist;

public class LoginActivity {
    Fire
    FirebaseAuth auth = FirebaseAuth.getInstance();
auth.signInWithEmailAndPassword(email, password)


    void addOnCompleteListener(task {
        if (task.isSuccessful()) {
            startActivity(new Intent(LoginActivity.this, ShoppingListActivity.class));
        } else {
            Toast.makeText(this, "Login Failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
        }
    });

}

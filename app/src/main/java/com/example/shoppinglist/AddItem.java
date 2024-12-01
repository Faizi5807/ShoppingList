package com.example.shoppinglist;

public class AddItem {
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("ShoppingItems");

    Map<String, Object> item = new HashMap<>();
item.put("itemName", itemName);
item.put("quantity", quantity);
item.put("price", price);

ref.push().setValue(item)
    .addOnCompleteListener(task -> {
        if (task.isSuccessful()) {
            Toast.makeText(this, "Item Added!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
        }
    });

}

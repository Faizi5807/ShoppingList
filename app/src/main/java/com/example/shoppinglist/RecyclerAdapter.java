package com.example.shoppinglist;

public class RecyclerAdapter {
    FirebaseRecyclerOptions<Item> options =
            new FirebaseRecyclerOptions.Builder<Item>()
                    .setQuery(FirebaseFirestore.getInstance().collection("ShoppingList"), Item.class)
                    .build();

    FirebaseRecyclerAdapter<Item, ItemViewHolder> adapter =
            new FirebaseRecyclerAdapter<Item, ItemViewHolder>(options) {
                @Override
                protected void onBindViewHolder(@NonNull ItemViewHolder holder, int position, @NonNull Item model) {
                    holder.itemName.setText(model.getItemName());
                    holder.quantity.setText(String.valueOf(model.getQuantity()));
                    holder.price.setText(String.valueOf(model.getPrice()));

                    holder.deleteButton.setOnClickListener(v -> {
                        getRef(position).removeValue();
                    });
                }

                @NonNull
                @Override
                public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
                    return new ItemViewHolder(view);
                }
            };

}

package com.example.listviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    private List<Book> mBookList;
   static class ViewHolder extends RecyclerView.ViewHolder
   {
       View bookView;
       TextView bookname;
        ImageView bookimage;
        TextView bookauthor;
        TextView bookintro;
       public ViewHolder( View view) {
           super(view);
           bookView=view;
           bookname=(TextView) view.findViewById(R.id.book_name);
           bookimage=(ImageView) view.findViewById(R.id.book_image);
           bookauthor=(TextView) view.findViewById(R.id.book_author);
           bookintro=(TextView) view.findViewById(R.id.intro);
       }
   }
   public BookAdapter(List<Book> bookList)
   {
       mBookList=bookList;
   }
    public BookAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item,parent,false);
        final ViewHolder vh=new ViewHolder(view);
        vh.bookView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=vh.getAdapterPosition();
                Book book=mBookList.get(i);
                Toast.makeText(v.getContext(), "a", Toast.LENGTH_SHORT).show();
            }
        });
        vh.bookimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=vh.getAdapterPosition();
                Book book=mBookList.get(i);
                Toast.makeText(v.getContext(), "b", Toast.LENGTH_SHORT).show();
            }
        });
        return vh;
    }
    public void onBindViewHolder(ViewHolder vh, int i)
    {
        Book book=mBookList.get(i);
        vh.bookimage.setImageResource(book.getImageId());
        vh.bookname.setText(book.getName());
        vh.bookauthor.setText(book.getAuthor());
        vh.bookintro.setText(book.getIntro());
    }
    public int getItemCount() {
        return mBookList.size();
    }
}

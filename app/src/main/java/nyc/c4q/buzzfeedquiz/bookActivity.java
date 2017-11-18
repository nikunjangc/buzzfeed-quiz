package nyc.c4q.buzzfeedquiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class bookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView bookrecyclerview = (RecyclerView)  findViewById(R.id.book_recyclerview);
        List<Book> books=new ArrayList<>();
        //  List<Book> books= new ArrayList<>();
        books.add(new Book(R.drawable.ic_launcher_background,"Two States","Chetan Bhagwat", "2009"));
        books.add(new Book(R.drawable.ic_launcher_background,"To Kill a Mockingbird","Harpe lee", "1960"));
        books.add(new Book(R.drawable.ic_launcher_background,"Muna Madan","Lakshmi Prashad Devkota", "1959"));
        books.add(new Book(R.drawable.ic_launcher_background,"The Cather In The Rye","J.D Salinger", "1965"));
        books.add(new Book(R.drawable.ic_launcher_background,"Three  Musketeers","Alexandre Dumas", "1844"));
        books.add(new Book(R.drawable.ic_launcher_background,"The Alchemist","Paulo Coelho ", "1988"));
        books.add(new Book(R.drawable.ic_launcher_background,"Animal Farm","George Orwell ", "1945"));
        books.add(new Book(R.drawable.ic_launcher_background,"Lord of the Flies","William Golding ", "1954"));
        books.add(new Book(R.drawable.ic_launcher_background,"1984","George Orwell ", "1949"));




        BookAdaptor bookAdaptor = new BookAdaptor(books);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        bookrecyclerview.setAdapter(bookAdaptor);
        bookrecyclerview.setLayoutManager(linearLayoutManager);
    }
}

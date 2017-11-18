package nyc.c4q.buzzfeedquiz;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nikunjan on 11/5/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {
    private ImageView bookImage;
    private TextView bookTitile;
    private TextView bookWriter;
    private TextView bookPublishedYear;


    public BookViewHolder(View itemView) {
        super(itemView);

        bookImage=(ImageView) itemView.findViewById(R.id.book_image);
        bookTitile=(TextView) itemView.findViewById(R.id.book_title_textview);
        bookWriter=(TextView) itemView.findViewById(R.id.book_writer_textview);
        bookPublishedYear=(TextView) itemView.findViewById(R.id.book_publishedYear_textview);
    }
    public void onBind(Book book){
        bookImage.setImageResource(book.getImage());
        bookTitile.setText(book.getTitle());
        bookWriter.setText(book.getWriter());
        bookPublishedYear.setText(book.getPublishedYear());
    }

}

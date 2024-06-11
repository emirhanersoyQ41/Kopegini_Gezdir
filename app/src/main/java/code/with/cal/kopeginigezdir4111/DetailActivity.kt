package code.with.cal.kopeginigezdir4111

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import code.with.cal.kopeginigezdir4111.databinding.ActivityDetailBinding
import code.with.cal.kopeginigezdir4111.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bookID=intent.getIntExtra(BOOK_ID_EXTRA, -1)
        val book=bookFromID(bookID)
        if(book != null)
        {
            binding.cover.setImageResource(book.cover)
            binding.title.text=book.title
            binding.description.text=book.description
            binding.author.text=book.author
        }

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun bookFromID(bookID: Int): Book?
    {
      for(book in bookList)
      {
          if(book.id==bookID)
              return book
      }
        return null
    }
}
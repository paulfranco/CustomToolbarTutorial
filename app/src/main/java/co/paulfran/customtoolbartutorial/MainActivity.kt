package co.paulfran.customtoolbartutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import co.paulfran.customtoolbartutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setSupportActionBar(binding.toolbar)

        binding.tvNumber.text = count.toString()

        binding.voteUp.setOnClickListener {
            increaseCount()
            Toast.makeText(this, "Count Increased: $count", Toast.LENGTH_SHORT).show()
        }
        binding.voteDown.setOnClickListener {
            decreaseCount()
            Toast.makeText(this, "Count Decreased: $count", Toast.LENGTH_SHORT).show()
        }

    }

    private fun increaseCount() {
        count++
        binding.tvNumber.text = count.toString()
    }

    private fun decreaseCount() {
        count--
        binding.tvNumber.text = count.toString()
    }
}
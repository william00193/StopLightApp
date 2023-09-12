package com.example.hw2exercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.ViewCompat.setBackground
import androidx.viewbinding.ViewBinding
import com.example.hw2exercise4.databinding.ActivityMainBinding





class MainActivity : AppCompatActivity() {


    //initializing variables for my counter which is set to o or stop
    private var clickedCount = 0


    //Initializing my ActivityMainBinding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


//Inflating the binding to pick up variables and setting content view
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//Onclick listener for the button
        binding.button.setOnClickListener {


//Incrementing count variable everything button is clicked
            clickedCount++


////Looping through each of the different images, with descriptions attached
//            when (clickedCount % 3) {
//                0 -> change(New(R.drawable.stop, "Stop!"))
//                1 -> change(New(R.drawable.go, "Go!"))
//                2 -> change(New(R.drawable.slow, "Wait.."))
//            }
//        }
//    }
            //Looping through each of the different images, with descriptions attached
            when (clickedCount % 3) {

            0 -> {
               change(New(R.drawable.stop, "Stop!"))
                binding.button.setBackgroundColor(getResources().getColor(R.color.MSU_Maroon))
                binding.button.setTextColor(getResources().getColor(R.color.white))
            }

            1 ->   {
               change(New(R.drawable.go, "Go!"))
                binding.button.setBackgroundColor(getResources().getColor(R.color.green))
                binding.button.setTextColor(getResources().getColor(R.color.black))
            }

            2 -> {
                 change(New(R.drawable.slow, "Wait.."))
                binding.button.setBackgroundColor(getResources().getColor(R.color.yellow))
                binding.button.setTextColor(getResources().getColor(R.color.black))
            }
            }
        }
    }




    //Setting button text equal to description
//allowing the image to change with the binding
    private fun change(new: New) {

        binding.button.text = new.description

        binding.image.setImageResource(new.image)

    }
}


//Setting the data class with both an image variable
//And String description variable
data class New(val image: Int, val description: String)




//        binding.button.setOnClickListener {
//
//            clickedCount++
//
//            if (clickedCount == 0) {
//                binding.setBackground(R.drawable.stop)
//                binding.button.setText("Stop!")
//
//
//            } else if (clickedCount == 1) {
//                binding.setBackground(R.drawable.go)
//                binding.button.setText("Go!")
//
//
//            } else {
//                binding.setBackground(R.drawable.slow)
//                binding.button.setText("Wait..")
//                clickedCount == 0
//
//            }
//
//        }

//    }

//    private fun ViewBinding.setBackground(go: Int) {
//        binding.image.setImageResource(new.image)
//    }










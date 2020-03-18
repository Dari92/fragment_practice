package com.kotlincourse.fragmentpractice.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.kotlincourse.fragmentpractice.R
import com.kotlincourse.fragmentpractice.mFragmentNumber
import kotlinx.android.synthetic.main.fragment_blank.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() { //Always that you're working with fragment you need an empty constructor()

    //this variable will help me to know in what fragment I'm
    private var counter = 0

    //Integer array of colors for my color resources
    private val myColors = arrayListOf(R.color.red_primary, R.color.red_ligth, R.color.red_dark,
        R.color.green_primary, R.color.green_primary, R.color.green_dark,
        R.color.blue_primary, R.color.blue_ligth, R.color.blue_dark)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        counter = arguments?.getInt(mFragmentNumber) ?: 0 //Basically  this line is a IfElse statment -
        // if this condition arguments?.getInt(mFragmentNumber) is true it'll be add to the variable
        //If the condition is false the 0 will be assigned to the variable.
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //here Im gonna set all my view changes, here is where Ill use after the On CreateView()

        view.setBackgroundColor(ContextCompat.getColor(view.context, myColors[counter]))//Context will gave me compatibility with the previus version of android.
        //Set te textview  that is created in the layout
        tvFragmentFirst.text = getString(R.string.fragment_number).plus(counter + 1)//Concatenation with plus() -  counter + 1 for increase the counter
        //
      //  tvFragmentFirst.text = getString(R.string.fragment_number).plus(counter + 1)


    }

    //In order to use this fragment multiple times in our manager we have to  set a new instance of this fragment each time we're doing it
    // for create a new instance of any kotlin object we need to set this as a companion object

    companion object{
        fun  newInstance(counter: Int?) : BlankFragment ? {
            val fragment = BlankFragment()
            val args = Bundle()   //when I need to sent information from activity to the fragment we use Bundle
            args.putInt(mFragmentNumber, counter!!)
            fragment.arguments = args
            return fragment


        }
    }



}

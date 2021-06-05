package com.example.pizzaorderapp_sohee.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorderapp_sohee.R
import com.example.pizzaorderapp_sohee.adapters.PizzaStoreAdapter
import com.example.pizzaorderapp_sohee.datas.Store
import kotlinx.android.synthetic.main.fragment_list_store_pizza.*

class PizzaStoreListFragment : Fragment() {

    val mPizzaStoreDataList = ArrayList<Store>()

    lateinit var mPizzaStoreAdapter : PizzaStoreAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list_store_pizza, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        동작 관련 코드

        mPizzaStoreDataList.add( Store("A 피자 가게", "1111-5555", "https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))
        mPizzaStoreDataList.add( Store("B 피자 가게", "2222-5555", "https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreDataList.add( Store("C 피자 가게", "3333-5555", "https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreDataList.add( Store("D 피자 가게", "4444-5555", "https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))

        mPizzaStoreAdapter = PizzaStoreAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreDataList)

        pizzaStoreListView.adapter = mPizzaStoreAdapter

    }
}
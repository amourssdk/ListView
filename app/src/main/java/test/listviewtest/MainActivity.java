package test.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple",
            "Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry",
    "Mango"};
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
//                MainActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView= (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listview= (ListView) findViewById(R.id.list_view);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit=fruitList.get(i);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for (int i = 0; i <2 ; i++) {
            Fruit apple=new Fruit(R.drawable.apple_pic,"apple");
            fruitList.add(apple);
            Fruit banana=new Fruit(R.drawable.banana_pic,"banana");
            fruitList.add(banana);
            Fruit cherry=new Fruit(R.drawable.cherry_pic,"cherry");
            fruitList.add(cherry);
            Fruit grape=new Fruit(R.drawable.grape_pic,"grape");
            fruitList.add(grape);
            Fruit mango=new Fruit(R.drawable.mango_pic,"mango");
            fruitList.add(mango);
            Fruit orange=new Fruit(R.drawable.orange_pic,"orange");
            fruitList.add(orange);
            Fruit o=new Fruit(R.drawable.pear_pic,"pear");
            fruitList.add(o);
            Fruit o1=new Fruit(R.drawable.pineapple_pic,"pineapple");
            fruitList.add(o1);
            Fruit o2=new Fruit(R.drawable.strawberry_pic,"strawberry");
            fruitList.add(o2);
            Fruit o3=new Fruit(R.drawable.watermelon_pic,"watermelon");
            fruitList.add(o3);
        }
    }
}

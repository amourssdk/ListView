package test.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by amours on 2017/3/28.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId =resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit=getItem(position);
//        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage= (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName= (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder= (ViewHolder) view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
//        ImageView imageView= (ImageView) view.findViewById(R.id.fruit_image);
//        TextView textView= (TextView) view.findViewById(R.id.fruit_name);
//        imageView.setImageResource(fruit.getImageId());
//        textView.setText(fruit.getName());
        return view;

    }
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}

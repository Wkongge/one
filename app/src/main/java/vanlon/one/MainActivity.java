package vanlon.one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String tag="MainActivity";
    LinearLayout testLinearLayout;
    private Button button;
    ListView listView;
    private ArrayAdapter<String> adapter;
    private String[] strings=new String[]{"ad","ad","adf","dsdfd","dfdsafd","dfdasfdsa","dfdsa","dsfd"
            ,"dsdfd","dfdsafd","dfdasfdsa","dfdsa","dsfdddd"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        testLinearLayout= (LinearLayout) findViewById(R.id.parent1);
//        button= (Button) findViewById(R.id.child1);
//        listView= (ListView) findViewById(R.id.listview);
//       adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strings);
//        listView.setAdapter(adapter);
    }

}

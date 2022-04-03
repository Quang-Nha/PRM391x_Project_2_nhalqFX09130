package org.funix.animal.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.funix.animal.R;
import org.funix.animal.fragment.DetailFragment;
import org.funix.animal.fragment.MenuFragment;
import org.funix.animal.model.Animal;

import java.util.List;

/**
 * activity chứa các fragment
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    /**
     * khởi tạo và hiển thị MenuFragment
     */
    private void initViews() {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ln_main, new MenuFragment(), null)
                .commit();

    }

    /**
     * chuyển sang DetailFragment
     *
     * @param listAnimals list các động vật cấp cho adapter của viewPager
     * @param position    vị trí trang viewPager cần hiển thị animal
     */
    public void showDetail(List<Animal> listAnimals, int position) {

        // khởi tạo DetailFragment và truyền các đối số cần thiết lấy từ tham số hàm này
        DetailFragment detailFragment = new DetailFragment(listAnimals, position);

        // thay fragment cũ bằng detailFragment và thêm phiên vào backStack
        getSupportFragmentManager().beginTransaction().replace(R.id.ln_main, detailFragment, null)
                .addToBackStack(null).commit();

    }
}
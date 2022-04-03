package org.funix.animal.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import org.funix.animal.R;
import org.funix.animal.adapter.DetailPagerAdapter;
import org.funix.animal.model.Animal;

import java.util.List;

/**
 * hiển thị chi tiết thông tin 1 animal
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {

    private final List<Animal> animals;
    private final int position;

    public DetailFragment(List<Animal> animals, int position) {
        this.animals = animals;
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        initViews(v);

        return v;
    }

    /**
     * khởi tạo các view
     *
     * @param v layout gốc
     */
    private void initViews(View v) {

        // bắt sự kiện nhấn nút back xóa fragment khỏi BackStack để trở lại fragment trước
        v.findViewById(R.id.iv_back).setOnClickListener(view -> requireActivity()
                .getSupportFragmentManager()
                .popBackStack()
        );

        // ẩn nút menu của layout action_bar
        v.findViewById(R.id.iv_menu).setVisibility(View.GONE);

        // lấy ViewPager từ xml
        ViewPager viewPager = v.findViewById(R.id.vp_detail);

        // lấy adapter và truyền list animals rồi gán cho ViewPager
        DetailPagerAdapter adapter = new DetailPagerAdapter(animals);
        viewPager.setAdapter(adapter);

        // set vị trí trang mà ViewPager cần hiển thị
        viewPager.setCurrentItem(position);
    }
}
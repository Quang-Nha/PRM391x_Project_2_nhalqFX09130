package org.funix.animal.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.funix.animal.R;
import org.funix.animal.model.Animal;

import java.util.List;

/**
 * apdapter của {@link androidx.viewpager.widget.ViewPager}
 */
public class DetailPagerAdapter extends PagerAdapter {
    private final List<Animal> animals;

    public DetailPagerAdapter(List<Animal> animals) {
        this.animals = animals;
    }

    /**
     * ánh xạ 1 item view từ thư mục layout vào trong chương trình
     * Sau đó đổ dữ liệu ứng với data tương ứng vào
     *
     * @param container view chứa các item view
     * @param position  vị trí trang tương ứng với phần tử trong list
     * @return item view cần lấy
     */
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        //Ánh xạ item view vào trong môi trường code
        View v = LayoutInflater.from(container.getContext()).inflate(R.layout.item_detail, container, false);

        //Ánh xạ các view ra từ itemView dựa vào id
        ImageView ivBg = v.findViewById(R.id.iv_bg);
        ImageView ivDetailFavorite = v.findViewById(R.id.iv_detail_favorite);
        TextView tvDetailName = v.findViewById(R.id.tv_detail_name);
        TextView tvDetail = v.findViewById(R.id.tv_detail);

        // lấy animal trong list với position tương ứng
        Animal animal = animals.get(position);

        // set các view của itemView dựa vào animal
        ivBg.setImageResource(animal.getPhotoBGID());
        tvDetailName.setText(animal.getName());
        tvDetail.setText(animal.getContent());

        // set icon tương ứng với trạng thái thích
        if (animal.isFav()) {
            ivDetailFavorite.setImageResource(R.drawable.ic_favorite);
        } else {
            ivDetailFavorite.setImageResource(R.drawable.ic_not_favorite);
        }

        // xử lý sự kiện click vào hình trạng thái like
        ivDetailFavorite.setOnClickListener(view -> {

            /* nếu đang thích thì chuyển sang không thích và ngược lại,
             set ảnh và thuộc tính like của animal lại tương ứng */
            if (animal.isFav()) {
                ivDetailFavorite.setImageResource(R.drawable.ic_not_favorite);
                animal.setIsFav(false);
            } else {
                ivDetailFavorite.setImageResource(R.drawable.ic_favorite);
                animal.setIsFav(true);
            }
        });

        // thêm layout item vào container để hiển thị
        container.addView(v);

        return v;
    }

    /**
     * khai báo số lượng item view (page) sẽ được sinh ra
     */
    @Override
    public int getCount() {

        if (animals != null) {
            return animals.size();
        }
        return 0;
    }

    /**
     * khi vuốt sang trái-phải để hiển thị page mới
     * Nếu vuốt chưa được 1 nửa và nhả tay ra, Page cũ sẽ được giữ lại hiển thị trên màn hình
     */
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object oldView) {
        return view.equals(oldView);
    }

    /**
     * Khi 1 Page không còn được hiển thị trên màn hình, nó sẽ bị container destroy
     */
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}

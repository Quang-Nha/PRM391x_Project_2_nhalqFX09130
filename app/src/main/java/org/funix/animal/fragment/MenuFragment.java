package org.funix.animal.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import org.funix.animal.R;
import org.funix.animal.activity.MainActivity;
import org.funix.animal.adapter.AnimalAdapter;
import org.funix.animal.application.ListAnimalApplication;
import org.funix.animal.interfaces.RvItemClicked;
import org.funix.animal.model.Animal;

import java.util.List;

/**
 * hiển thị danh sách các animal
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment {

    private Context mContext;
    private RecyclerView rvAnimal;
    private List<Animal> listAnimals;
    private DrawerLayout mDrawer;
    private String animalType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_menu, container, false);

        initViews(v);

        return v;
    }

    /**
     * khởi tạo các view
     *
     * @param v view gốc của fragment
     */
    private void initViews(View v) {

        mDrawer = v.findViewById(R.id.drawer);
        rvAnimal = v.findViewById(R.id.rv_animals);
        ImageView ivBack = v.findViewById(R.id.iv_back);

        // tạo animation mờ cho RecyclerView rvAnimal
        Animation alpha = AnimationUtils.loadAnimation(mContext, R.anim.alpha);
        rvAnimal.startAnimation(alpha);

        // không hiển thị nút back
        ivBack.setVisibility(View.GONE);

        //Xử lý mở menu trái khi click iv_menu
        v.findViewById(R.id.iv_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawer.openDrawer(GravityCompat.START);
            }
        });

        //Hiển thị list ảnh động vật biển khi click vào tbr_sea
        v.findViewById(R.id.tbr_sea).setOnClickListener(v1 -> {
            v.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));

            showAnimals(animalType = "sea");

        });

        //Hiển thị list ảnh động vật có vú
        v.findViewById(R.id.tbr_mammal).setOnClickListener(v1 -> {
            v.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));

            showAnimals(animalType = "mammal");
        });


        //Hiển thị list ảnh chim muông
        v.findViewById(R.id.tbr_bird).setOnClickListener(v1 -> {
            v.startAnimation(AnimationUtils.loadAnimation(mContext, androidx.appcompat.R.anim.abc_fade_in));

            showAnimals(animalType = "bird");
        });
    }

    /**
     * cài đặt dữ liệu cho rvAnimal và hiển thị các animals
     *
     * @param animalsType tên chủng loại animals
     */
    private void showAnimals(String animalsType) {

        // tạo danh sách các animal theo animalsType
        switch (animalsType) {
            case "sea":
                listAnimals = ListAnimalApplication.seas;
                break;
            case "mammal":
                listAnimals = ListAnimalApplication.mammals;
                break;
            case "bird":
                listAnimals = ListAnimalApplication.birds;
        }

        // khởi tạo adapter cho rvAnimal truyền list và interface RvItemClicked bằng lớp ẩn danh
        AnimalAdapter animalAdapter = new AnimalAdapter(listAnimals, new RvItemClicked() {
            @Override
            public void onRvItemClicked(int position) {

                 /* gọi hàm showDetail từ MainActivity/mContext để chuyển sang fragment detail
                  truyền list của frag này và position
                 từ đối số của hàm sẽ được lớp sử dụng hàm này là animalAdapter truyền vào */
                ((MainActivity) mContext).showDetail(listAnimals, position);
            }
        });

        //Hiển thị danh sách ảnh lên RecyclerView
        rvAnimal.setAdapter(animalAdapter);

        mDrawer.closeDrawers();
    }

    /**
     * tránh trang rỗng
     * khi back lại fragment này từ detail fragment sẽ load lại list animal theo biến nhớ animalType
     */
    @Override
    public void onResume() {
        super.onResume();
        if (animalType != null) {
            showAnimals(animalType);
        }
    }

    /**
     * lấy biến môi trường, activity chứa fragment này
     *
     * @param context activity chứa
     */
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

}
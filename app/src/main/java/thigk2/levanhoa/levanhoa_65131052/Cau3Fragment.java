package thigk2.levanhoa.levanhoa_65131052;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView danhnhanRvContainer;


    public Cau3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cau3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cau3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        danhnhanRvContainer = view.findViewById(R.id.danhnhan_rv_container);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        List<DanhNhan> datas = new ArrayList<>();
        datas.add(new DanhNhan(R.drawable.cropped_com_ga, "NguyenVanTroi", "Bình Định"));
        datas.add(new DanhNhan(R.drawable.cropped_com_muoi_e, "NguyenVanLinh", "Gia Lai"));
        datas.add(new DanhNhan(R.drawable.cropped_com_suon_bi_cha, "BillGate", "Gia Lai"));
        datas.add(new DanhNhan(R.drawable.cropped_com_vit, "HoQuangHieu", "Gia Lai"));
        datas.add(new DanhNhan(R.drawable.cropped_com_suon_trung, "Gill", "Gia Lai"));
        DanhNhanAdapter adapter = new DanhNhanAdapter(datas, getContext());
        danhnhanRvContainer.setAdapter(adapter);
        danhnhanRvContainer.setLayoutManager(layoutManager);
    }
}
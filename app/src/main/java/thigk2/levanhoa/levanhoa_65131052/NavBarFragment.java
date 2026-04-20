package thigk2.levanhoa.levanhoa_65131052;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NavBarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NavBarFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Fragment cau1Fragment, cau2Fragment, cau3Fragment, cau4Fragment, homeFragment;
    private BottomNavigationView navBar;
    private FragmentManager fragmentManager;
    public NavBarFragment() {
        cau1Fragment = new Cau1Fragment();
        cau2Fragment = new Cau2Fragment();
        cau3Fragment = new Cau3Fragment();
        cau4Fragment = new Cau4Fragment();
        homeFragment = new HomeFragment();
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NavBarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NavBarFragment newInstance(String param1, String param2) {
        NavBarFragment fragment = new NavBarFragment();
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
        return inflater.inflate(R.layout.fragment_nav_bar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentManager = getParentFragmentManager();
        navBar = view.findViewById(R.id.nav_bar);
        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                Fragment tmpFragment = null;
                if(id == R.id.cau_1){
                    tmpFragment = cau1Fragment;
                }else if(id == R.id.tab_home){
                    tmpFragment = homeFragment;
                } else if (id == R.id.cau_2) {
                    tmpFragment = cau2Fragment;
                } else if(id == R.id.cau_3){
                    tmpFragment = cau3Fragment;
                }else if(id == R.id.cau_4){
                    tmpFragment = cau4Fragment;
                }
                fragmentManager.beginTransaction()
                        .replace(R.id.content_container, tmpFragment)
                        .commit();
                return true;
            }
        });
        navBar.setSelectedItemId(R.id.tab_home);
    }
}
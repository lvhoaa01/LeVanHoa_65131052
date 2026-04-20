package thigk2.levanhoa.levanhoa_65131052;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DanhNhanAdapter extends RecyclerView.Adapter<DanhNhanAdapter.DanhNhanViewHolder>{
    private List<DanhNhan> datas = new ArrayList<>();
    private Context context;

    public DanhNhanAdapter(List<DanhNhan> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @NonNull
    @Override
    public DanhNhanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item3, parent, false);
        return new DanhNhanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DanhNhanViewHolder holder, int position) {
        holder.danhnhanTvName.setText(datas.get(position).getTen());
        holder.danhnhanTvQueQuan.setText(datas.get(position).getQuequan());
        holder.danhnhanAvatar.setImageResource(datas.get(position).getAvatar());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class DanhNhanViewHolder extends RecyclerView.ViewHolder{
        private TextView danhnhanTvName, danhnhanTvQueQuan;
        private ImageView danhnhanAvatar;

        public DanhNhanViewHolder(@NonNull View itemView) {
            super(itemView);
            this.danhnhanAvatar = itemView.findViewById(R.id.danhnhan_img_avatar);
            this.danhnhanTvName = itemView.findViewById(R.id.danhnhan_tv_name);
            this.danhnhanTvQueQuan = itemView.findViewById(R.id.danhnhan_tv_quequan);
        }

        public TextView getDanhnhanTvName() {
            return danhnhanTvName;
        }

        public void setDanhnhanTvName(TextView danhnhanTvName) {
            this.danhnhanTvName = danhnhanTvName;
        }

        public TextView getDanhnhanTvQueQuan() {
            return danhnhanTvQueQuan;
        }

        public void setDanhnhanTvQueQuan(TextView danhnhanTvQueQuan) {
            this.danhnhanTvQueQuan = danhnhanTvQueQuan;
        }

        public ImageView getDanhnhanAvatar() {
            return danhnhanAvatar;
        }

        public void setDanhnhanAvatar(ImageView danhnhanAvatar) {
            this.danhnhanAvatar = danhnhanAvatar;
        }
    }
}

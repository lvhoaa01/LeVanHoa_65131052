package thigk2.levanhoa.levanhoa_65131052;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CaKhucAdapter extends RecyclerView.Adapter<CaKhucAdapter.CaKhucViewHolder> {
    private List<CaKhuc> datas = new ArrayList<>();
    private Context context;

    public CaKhucAdapter(List<CaKhuc> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @NonNull
    @Override
    public CaKhucViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, parent, false);
        return new CaKhucViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CaKhucViewHolder holder, int position) {
        holder.cakhucTvName.setText(datas.get(position).getCakhucTvName());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public class CaKhucViewHolder extends RecyclerView.ViewHolder{
        private TextView cakhucTvName;

        public CaKhucViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cakhucTvName = itemView.findViewById(R.id.cakhuc_tv_name);
        }

        public TextView getCakhucTvName() {
            return cakhucTvName;
        }

        public void setCakhucTvName(TextView cakhucTvName) {
            this.cakhucTvName = cakhucTvName;
        }
    }
}

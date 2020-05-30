package com.alialfayed.tourguideapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.alialfayed.tourguideapp.util.Constant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;

public class OverviewMain extends AppCompatActivity {

    @BindView(R.id.img_ItemOverView)
    ImageView imgItemOverView;
    @BindView(R.id.titlePlace_ItemOverView)
    TextView titlePlaceItemOverView;
    @BindView(R.id.ratingBar_ItemOverView)
    RatingBar ratingBarItemOverView;
    @BindView(R.id.ratingtxt_ItemOverView)
    TextView ratingtxtItemOverView;
    @BindView(R.id.txtDescription_ItemOverView)
    TextView txtDescriptionItemOverView;
    @BindView(R.id.txtPlace_ItemOverView)
    TextView txtPlaceItemOverView;
    @BindView(R.id.txtTel_ItemOverView)
    TextView txtTelItemOverView;
    @BindView(R.id.layoutContent)
    ConstraintLayout layoutContent;
    @BindView(R.id.layoutNoContent)
    LinearLayout layoutNoContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_main);

        // ButterKnife Initialize
        ButterKnife.bind(this);

        InfoPlaceModel infoPlaceModel = (InfoPlaceModel) getIntent().getSerializableExtra(Constant.MOVE_INTENT);
        if (infoPlaceModel != null) {
            layoutContent.setVisibility(View.VISIBLE);

            // set Data Information
            imgItemOverView.setImageResource(infoPlaceModel.getImgPlace());
            titlePlaceItemOverView.setText(infoPlaceModel.getNamePlace());
            ratingBarItemOverView.setRating(infoPlaceModel.getRatePlace());
            ratingtxtItemOverView.setText(String.valueOf(infoPlaceModel.getRatePlace()));
            txtDescriptionItemOverView.setText(infoPlaceModel.getDescriptionPlace());
            txtPlaceItemOverView.setText(infoPlaceModel.getAddressPlace());
            txtTelItemOverView.setText(infoPlaceModel.getPhonePlace());

        } else {
            layoutNoContent.setVisibility(View.GONE);
        }

    }
}
package com.alorma.github.sdk.bean.dto.response;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

public class GollumPage extends ShaUrl {

  @SerializedName("page_name") public String name;
  public String title;
  public String summary;
  public String action;

}

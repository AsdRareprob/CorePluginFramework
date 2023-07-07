package com.rareprob.core_pulgin;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rareprob.core_pulgin.databinding.ActivityRefferalBindingImpl;
import com.rareprob.core_pulgin.databinding.EarnCoinFragmentBindingImpl;
import com.rareprob.core_pulgin.databinding.ViewProfileSectionBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYREFFERAL = 1;

  private static final int LAYOUT_EARNCOINFRAGMENT = 2;

  private static final int LAYOUT_VIEWPROFILESECTION = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rareprob.core_pulgin.R.layout.activity_refferal, LAYOUT_ACTIVITYREFFERAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rareprob.core_pulgin.R.layout.earn_coin_fragment, LAYOUT_EARNCOINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rareprob.core_pulgin.R.layout.view_profile_section, LAYOUT_VIEWPROFILESECTION);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYREFFERAL: {
          if ("layout/activity_refferal_0".equals(tag)) {
            return new ActivityRefferalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_refferal is invalid. Received: " + tag);
        }
        case  LAYOUT_EARNCOINFRAGMENT: {
          if ("layout/earn_coin_fragment_0".equals(tag)) {
            return new EarnCoinFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for earn_coin_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWPROFILESECTION: {
          if ("layout/view_profile_section_0".equals(tag)) {
            return new ViewProfileSectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_profile_section is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_refferal_0", com.rareprob.core_pulgin.R.layout.activity_refferal);
      sKeys.put("layout/earn_coin_fragment_0", com.rareprob.core_pulgin.R.layout.earn_coin_fragment);
      sKeys.put("layout/view_profile_section_0", com.rareprob.core_pulgin.R.layout.view_profile_section);
    }
  }
}

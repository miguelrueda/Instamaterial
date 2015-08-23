// Generated code from Butter Knife. Do not modify!
package com.example.instamaterial;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.example.instamaterial.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492945, "field 'toolbar'");
    target.toolbar = (android.support.v7.widget.Toolbar) view;
    view = finder.findRequiredView(source, 2131492947, "field 'recyclerView'");
    target.recyclerView = (android.support.v7.widget.RecyclerView) view;
  }

  public static void reset(com.example.instamaterial.MainActivity target) {
    target.toolbar = null;
    target.recyclerView = null;
  }
}
